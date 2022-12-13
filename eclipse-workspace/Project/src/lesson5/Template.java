package lesson5;

import java.util.ArrayList;

public class Template {
	
	/**
	 * Sa atribute ka nje klase?
	 * -0, 1, ... Shume.
	 * Si mund te ruhen shume atribute?
	 * */
	
	private ArrayList<Attribut> attributs;   //per te ruajtur shume atribute
	
	public Template() {                      
		attributs = new ArrayList<Attribut>();
	}
	
	public void addAttribut(String name) {
		addAttribut(name, null);
	}

	public void addAttribut(String name, 
							Object value) {
		if(name == null) {
			return;
		}
		name = name.toLowerCase();
		if(!exists(name)) {
			attributs.add(new Attribut(name, value));
		}
	}
	
	public void setAttributValue(String name, 
								 Object value) {
		for(Attribut a : attributs) {
			if(name.equals(a.getName())) {
				a.setValue(value);
				return;
			}
		}
	}
	
	public Object getAttributValue(String name) {
		for(Attribut a : attributs) {
			if(name.equals(a.getName())) { 
				return a.getValue();
			}
		}
		return null;
	}

	private boolean exists(String name) { 
		for(Attribut a : attributs) {
			if(name.equals(a.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributs == null) ? 0 : attributs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Template)) {
			return false;
		}
		Template other = (Template) obj;
		if (attributs == null) {
			if (other.attributs != null) {
				return false;
			}
		} else if (!attributs.equals(other.attributs)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String str = "";
		for(Attribut a : attributs) {
			str += a.getName() + "=" + 
				   a.getValue() + ", ";
		}
		if(!str.isEmpty()) {
			str = str.substring(0, str.length() - 2);
		}
		return "lesson5.Template [" + str + "]";
	} 

}
