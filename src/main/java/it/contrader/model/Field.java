package it.contrader.model;
/**
 * 
 * @author Depy
 *

 */
public class Field {


	private int id;

	private String name;
	
	private String type;
	
	private String entity;

	public Field() {//construttore vuoto
		
	}

	public Field (String name, String type, String entity) {//construttore PIENO
		this.name = name;
		this.type = type;
		this.entity = entity;
		
	}

	public Field (int id, String name, String type, String entity) {//construttore PIENO con ID
		this.id = id;
		this.name = name;
		this.type = type;
		this.entity = entity;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	//Trasforma un oggetto in una stringa
	@Override
	public String toString() {
		return  id + "\t"  + name +"\t\t" +   type+"\t\t" +   entity ;
	}

	//confronto degli oggetti
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (id != other.id)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		
		if (entity == null) {
			if (other.entity != null)
				return false;
		} else if (!entity.equals(other.entity))
			return false;
		
		return true;
	}

	
}
