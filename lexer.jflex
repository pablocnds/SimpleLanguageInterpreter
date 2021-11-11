package pl.practica;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}




Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

/* COMENTARIOS (#  Y  <!-- -->) */
Comment = {ComA} | {ComB}
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
ComA = "#" {InputCharacter}* {LineTerminator}
ComB = "<!--" ~"-->"

/* LITERALES */
Entero = [0-9]+
RNDecimal = [0-9]+ [.] [0-9]*
RNCientific = [1-9] [0-9]* [Ee] ['-''+']? [0-9]+
RealNumber = {RNDecimal} | {RNCientific}
HexNumber = [0] [xX] [0-9A-Fa-f]+
Booleano = {LTrue} | {LFalse}
Caracter = ['] [^] [']

/* VARIABLES */
Ident = [a-zA-Z_] [a-zA-Z0-9_]*

/* PALABRAS RESERVADAS */
LTrue = [Tt][Rr][Uu][Ee]
LFalse = [Ff][Aa][Ll][Ss][Ee]
LAnd = [Aa][Nn][Dd] | "&"
LOr  = [Oo][Rr]     | "|"
LNot = [Nn][Oo][Tt] | "!"

DeclEntero = [Ee][Nn][Tt][Ee][Rr][Oo]
DeclReal = [Rr][Ee][Aa][Ll]
DeclBool = [Bb][Oo][Oo][Ll][Ee][Aa][Nn][Oo]
DeclChar = [Cc][Aa][Rr][Aa][Cc][Tt][Ee][Rr]
DeclStruct = [Ss][Tt][Rr][Uu][Cc][Tt]

FWhile = [Mm][Ii][Ee][Nn][Tt][Rr][Aa][Ss]
FWhileEnd = [Ff][Ii][Nn][Mm][Ii][Ee][Nn][Tt][Rr][Aa][Ss]
FIf = [Ss][Ii]
FThen = [Ee][Nn][Tt][Oo][Nn][Cc][Ee][Ss]
FElse = [Ss][Ii][Nn][Oo]
FEndif = [Ff][Ii][Nn][Ss][Ii]
FFunc = [Ff][Uu][Nn][Cc][Ii][Oo][Nn]
FRetorno = [Rr][Ee][Tt][Uu][Rr][Nn]




%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  




<YYINITIAL> {

  {Whitespace}  {								}
  {Comment}	    {								}
  
  
  ";"           { return symbolFactory.newSymbol("SEMI", SEMI);			}
  ":="			{ return symbolFactory.newSymbol("ASSIGN", ASSIGN); 	}
  "."			{ return symbolFactory.newSymbol("DOT", DOT);			}
  ","			{ return symbolFactory.newSymbol("COMA", COMA);			}
  
  
  "+"           { return symbolFactory.newSymbol("PLUS", PLUS);			}
  "-"           { return symbolFactory.newSymbol("MINUS", MINUS);		}
  "*"           { return symbolFactory.newSymbol("MULT", MULT);			}
  "/"           { return symbolFactory.newSymbol("DIV", DIV);			}
  
  
  "=="			{ return symbolFactory.newSymbol("EQUALTO", EQUALTO);		}
  "<"			{ return symbolFactory.newSymbol("LESSER", LESSER);			}
  "<="			{ return symbolFactory.newSymbol("LESSEREQ", LESSEREQ);		}
  ">"			{ return symbolFactory.newSymbol("GREATER", GREATER);		}
  ">="			{ return symbolFactory.newSymbol("GREATEREQ", GREATEREQ);	}
  
  
  {LAnd}		{ return symbolFactory.newSymbol("AND", AND);			}
  {LOr}			{ return symbolFactory.newSymbol("OR", OR);				}
  {LNot}		{ return symbolFactory.newSymbol("NOT", NOT);			}
  
  
  "("			{ return symbolFactory.newSymbol("IZQPAREN", IZQPAREN);	}
  ")"			{ return symbolFactory.newSymbol("DERPAREN", DERPAREN);	}
  "{"			{ return symbolFactory.newSymbol("IZQLLAVE", IZQLLAVE);	}
  "}"			{ return symbolFactory.newSymbol("DERLLAVE", DERLLAVE);	}
  {FRetorno}	{ return symbolFactory.newSymbol("RETORNO", RETORNO);	}
  
  
  {Entero}		{ return symbolFactory.newSymbol( "ENTERO", ENTERO, Integer.parseInt(yytext()) );		}
  {RealNumber}  { return symbolFactory.newSymbol( "FP", FP, Float.parseFloat(yytext()) );  				}
  {HexNumber}   { return symbolFactory.newSymbol( "ENTERO", ENTERO, Integer.decode(yytext()) );			}
  {Booleano}	{ return symbolFactory.newSymbol( "BOOLEAN", BOOLEAN, Boolean.parseBoolean(yytext()) );	}
  {Caracter}	{ return symbolFactory.newSymbol( "CHAR", CHAR, (char)yytext().charAt(1) );				}
  
  
  {DeclEntero}	{ return symbolFactory.newSymbol("DCLENTERO", DCLENTERO);	}
  {DeclReal}	{ return symbolFactory.newSymbol("DCLREAL", DCLREAL);		}
  {DeclBool}	{ return symbolFactory.newSymbol("DCLBOOL", DCLBOOL);		}
  {DeclChar}	{ return symbolFactory.newSymbol("DCLCHAR", DCLCHAR);		}
  {DeclStruct}	{ return symbolFactory.newSymbol("DCLSTRUCT", DCLSTRUCT);	}
  
  
  {FWhile}		{ return symbolFactory.newSymbol("WHILE", WHILE);			}
  {FWhileEnd}	{ return symbolFactory.newSymbol("ENDWHILE", ENDWHILE);		}
  {FIf}			{ return symbolFactory.newSymbol("IF", IF);					}
  {FThen}		{ return symbolFactory.newSymbol("THEN", THEN);				}
  {FElse}		{ return symbolFactory.newSymbol("ELSE", ELSE);				}
  {FEndif}		{ return symbolFactory.newSymbol("ENDIF", ENDIF);			}
  {FFunc}		{ return symbolFactory.newSymbol("FUNC", FUNC);				}
  {FRetorno}	{ return symbolFactory.newSymbol("RETORNO", RETORNO);		}
  

  {Ident}       { return symbolFactory.newSymbol("IDENT", IDENT, yytext());		}

}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }

