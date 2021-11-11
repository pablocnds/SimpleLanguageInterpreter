package interpreter;

import interpreter.Parser.OpType;

public class Variable {
	
	public Number value;
	public Type type;
	
	Variable (Type varType, Number value) {
		this.value = value;
		type = varType;
	}
	
	public byte getAsByte() {
		return value.byteValue();
	}
	
	public boolean getAsBoolean() {
		return ( value.intValue() == 1 );
	}
	
	public String toString() {
		String str = "[" ;
		if (type == Type.INT) {
			str += "ENTERO: " + value.intValue();
		}
		else if (type == Type.FLOAT) {
			str += "REAL: " + value.floatValue();
		}
		else if (type == Type.CHAR) {
			str += "CARACTER: " + (char)value.byteValue();
		}
		else if (type == Type.BOOL) {
			str += "BOOLEANO: ";
			if (value.intValue() == 1) str += "true";
			else str += "false";
		}
		return str + "]";
	}
	
	
	
	
	// Chapuza
	public static Variable operate (Variable v1, Variable v2, Type type, OpType operand)
	{
		Variable result = new Variable(type, 0);
		switch (operand)
		{
		case ADD:
			if (type == Type.INT) {
				result.value = v1.value.intValue() + v2.value.intValue();
			}else if (type == Type.FLOAT) {
				result.value = v1.value.floatValue() + v2.value.floatValue();
			}else if (type == Type.CHAR) {
				result.value = v1.value.byteValue() + v2.value.byteValue();
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case SUB:
			if (type == Type.INT) {
				result.value = v1.value.intValue() - v2.value.intValue();
			}else if (type == Type.FLOAT) {
				result.value = v1.value.floatValue() - v2.value.floatValue();
			}else if (type == Type.CHAR) {
				result.value = v1.value.byteValue() - v2.value.byteValue();
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case MUL:
			if (type == Type.INT) {
				result.value = v1.value.intValue() * v2.value.intValue();
			}else if (type == Type.FLOAT) {
				result.value = v1.value.floatValue() * v2.value.floatValue();
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case DIV:
			if (type == Type.INT) {
				result.value = v1.value.intValue() / v2.value.intValue();
			}else if (type == Type.FLOAT) {
				result.value = v1.value.floatValue() / v2.value.floatValue();
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
		
		case EQ:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() == v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() == v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() == v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.BOOL) {
				if (v1.getAsBoolean() == v2.getAsBoolean()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case NEQ:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() != v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() != v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() != v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.BOOL) {
				if (v1.getAsBoolean() != v2.getAsBoolean()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case GT:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() > v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() > v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() > v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case GE:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() >= v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() >= v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() >= v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
		
		case LT:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() < v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() < v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() < v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case LE:
			if (v1.type == Type.INT) {
				if (v1.value.intValue() <= v2.value.intValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.FLOAT) {
				if (v1.value.floatValue() <= v2.value.floatValue()) result.value = 1;
				else result.value = 0;
			}else if (v1.type == Type.CHAR) {
				if (v1.value.byteValue() <= v2.value.byteValue()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case OR:
			if (v1.type == Type.BOOL) {
				if (v1.getAsBoolean() || v2.getAsBoolean()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		case AND:
			if (v1.type == Type.BOOL) {
				if (v1.getAsBoolean() && v2.getAsBoolean()) result.value = 1;
				else result.value = 0;
			}else {
				System.out.println("Internal error 5");
				return null;
			}
			break;
			
		default:
			System.out.println("Internal error 6 - " + operand);
		}
		
		return result;
	}
	
}
