package br.com.handson.library.enums;

public enum StatusBookEnum {
	PUBLISHED("PUBLISHED"), DRAFT("DRAFT");
	private String description; 
	
	private StatusBookEnum(String description) {
		this.description = description ;
	}
	@Override
	public String toString() {
		
		return description;
	}

}
