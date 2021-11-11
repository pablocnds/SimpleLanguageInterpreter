package interpreter;

import java.util.*;

enum Type {
	INT, FLOAT, BOOL, CHAR, STRUCT, FUNC, ERROR
}


public class TypeList {
	
	// Variables
	private Hashtable<String, Variable> varTable = new Hashtable<String, Variable>();
	// Functions
	// TODO añadir tipo de return de funcion y argumentos
	private ArrayList<String> funcTable = new ArrayList<String>();
	// Structures
	private Hashtable<String, StructClass> strucTable = new Hashtable<String, StructClass>();
	
	
	TypeList() {	}
	
	// Comprueba si el identificador indicado ya existe en las tablas de símbolos
	public boolean exists(String ident)
	{
		return varExists(ident) || funcExists(ident) || structExists(ident);
	}
	
	public boolean varExists(String ident)
	{
		Variable v = varTable.get(ident);
		if (v != null) return true;
		
		return false;
	}
	
	public boolean funcExists(String ident)
	{
		return funcTable.contains(ident);
	}
	
	public boolean structExists(String ident)
	{
		if (strucTable.get(ident) != null) return true;
		
		return false;
	}
	
	
	// Devuelve el tipo de la variable con el identificador indicado
	public Type getType(String ident)
	{
		Variable v = varTable.get(ident);
		if (v != null) return v.type;
		
		StructClass s = strucTable.get(ident);
		if (s != null) return Type.STRUCT;

		if (funcTable.contains(ident)) return Type.FUNC;
		
		return Type.ERROR;
	}
	
	// Devuelve el valor en formato Number de la variable con el identificador indicado
	public Number getValue(String ident)
	{
		Variable var = varTable.get(ident);
		
		return var.value;
	}
	
	// Devuelve la variable con el identificador indicado
	public Variable getVariable(String ident)
	{
		return varTable.get(ident);
	}
	
	
	// Guarda una nueva variable en la tabla, si esta aún no existe.
	// Devuelve true si se ha inserado correctamente, o false si ya existe o en caso de error.
	public boolean newVar(String ident, Type type, Number value)
	{
		if (exists(ident)) return false;
		
		if ( type == Type.INT || type == Type.FLOAT || type == Type.BOOL || type == Type.CHAR ) {
			varTable.put(ident, new Variable(type, value));
		}
		else {
			System.out.println("Internal error 1");
			return false;
		}
		
		return true;
	}
	
	public boolean newVar(String ident, Variable var)
	{
		if (exists(ident)) return false;
		
		varTable.put(ident, var);
		return true;
	}
	
	// Guarda un nuevo identificador de struct en la tabla, si este aún no existe.
	// Devuelve true si se ha inserado correctamente, o false si ya existe o en caso de error.
	public boolean newStruct(String ident)
	{
		if (exists(ident)) return false;
		
		strucTable.put(ident, new StructClass());
		
		return true;
	}
	
	// Define una nueva subvariable para la estructura. Devuelve false si ya existe dentro de la estructura o si la estructura no existe.
	public boolean addSubIdentifier(String structID, String subID)
	{
		StructClass struc = strucTable.get(structID);
		
		if (struc == null) return false;
		
		if (!struc.subIdExists(subID)) return false;
		
		struc.addSubId(subID);
		
		return true;
	}
	
	// Guarda un nuevo identificador de funcion en la tabla, si este aún no existe.
	// Devuelve true si se ha inserado correctamente, o false si ya existe o en caso de error.
	public boolean newFunc(String ident)
	{
		if (exists(ident)) return false;
		
		funcTable.add(ident);
		
		return true;
	}
	
	
	// Actualiza el valor de la variable con el identificador indicado
	// Devuelve false si la variable no existe
	public boolean updateVar(String ident, Number value)
	{
		Variable var = varTable.get(ident);
		
		if (var == null) {
			return false;
		}
		
		varTable.put(ident, new Variable(var.type, value));
		
		return true;
	}
	
	
	// Imprime la lista de variables con su valor
	public void printVarList()
	{
		Enumeration<String> ids = varTable.keys();
		
		System.out.println("\nVARIABLES:");
		String id;
		while (ids.hasMoreElements()) {
			id = ids.nextElement();
			System.out.println("  " + id + " = " + varTable.get(id));
		}
	}
	
	
	public final static boolean conversionTable[][] = 
			/*	INT		FLOAT	BOOL	CHAR	*/
/*INT  */	{{	true,	true,	false,	false	},
/*FLOAT*/	 {	false,	true,	false,	false	},
/*BOOL */	 {	false,	false,	true,	false	},
/*CHAR */	 {	true,	false,	true,	true 	}};
	
	public static boolean checkConversion(Type from, Type to)
	{
		int indF, indT;
		
		switch (from)
		{
		case INT:
			indF = 0;
			break;
		case FLOAT:
			indF = 1;
			break;
		case BOOL:
			indF = 2;
			break;
		case CHAR:
			indF = 3;
			break;
		default:
			System.out.println("Internal Error 3");
			return false;
		}
		
		switch (to)
		{
		case INT:
			indT = 0;
			break;
		case FLOAT:
			indT = 1;
			break;
		case BOOL:
			indT = 2;
			break;
		case CHAR:
			indT = 3;
			break;
		default:
			System.out.println("Internal Error 3");
			return false;
		}
		
		//System.out.println(indT + " " + indF + " " + conversionTable[indF][indT]);
		return conversionTable[indF][indT];
	}
	
}
