package interpreter;

import java.util.*;

public class StructClass {
	
	private ArrayList<String> subIdentifiers = new ArrayList<String>();
	
	
	StructClass() {		}
	
	public void addSubId (String ident)
	{	
		subIdentifiers.add(ident);
	}
	
	public boolean subIdExists (String ident)
	{
		return subIdentifiers.contains(ident);
	}
	
}
