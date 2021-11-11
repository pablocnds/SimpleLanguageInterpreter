# SimpleLanguageInterpreter
Functional interpreted language processor using the lexer JFlex and the parser CUP as a Look-Ahead LR parser (LALR). This work was originally part of a university assignment for a course in Language Processors and its syntax is in Spanish.

The language is defined in the files 'lexer.jflex' and 'parser.cup'.

## How to run code
Simply put the code you want to run in the file 'input.txt' and execute the java class 'src/Driver.java'. This has been tested to work with the Eclipse IDE with Java 8.

## Language functionality
This language is similar to C. It supports structs but not OOP. See the 'input.txt' file or tests folder for examples.

* Variables. `real var := 4e-3;`
* Arithmetic operations. `var3 := var1 + var2;`
* Logical operations. `var2 := NOT (var1 >= 'a') & 1;`
* Structures. `STRUCT structure { booleano s1; real s2; }`
* Functions. `FUNCION f(real var) RETURN real { var+1; }`

Loops and if/else blocks are implemented and processed by the parser, but no logic is implemented for them, meaning that this language is not Turing-complete.
