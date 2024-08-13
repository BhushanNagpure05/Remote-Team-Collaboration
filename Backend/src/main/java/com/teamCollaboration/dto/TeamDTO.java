package com.teamCollaboration.dto;

public class TeamDTO {
	 	private Long id;
	    private String name;
	    private String description;
	    
	    public TeamDTO() {
			// TODO Auto-generated constructor stub
		}

		public TeamDTO(Long id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	    
		
}