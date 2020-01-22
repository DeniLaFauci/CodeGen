package it.contrader.dto;
/*
 * 
 * @author Selenia, Brunco 
 *
 */


public class EntityDTO {

	

		private int id;

		private String name;
		
		

		
		public EntityDTO() {
			
		}

		public EntityDTO (String name) {
			this.name = name;
			
		}

		public EntityDTO (int id, String name) {
			this.id = id;
			this.name = name;
			
		}

		
		public int getId() {
			return this.id;
		}
		public void setId(int id) {
			this.id = id;
		}

		

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		
		@Override
		public String toString() {
			return  id + "\t"  + name ;
		}

}
