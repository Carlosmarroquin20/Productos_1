package com.example.demo.Entidades;

public class Productos {
	private Long ID;
	private String Name;
	private String Merge;
	private String Description;
	private String Price;
	
	public Productos(Long iD, String name, String merge, String description, String price) {
		super();
		ID = iD;
		Name = name;
		Merge = merge;
		Description = description;
		Price = price;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMerge() {
		return Merge;
	}

	public void setMerge(String merge) {
		Merge = merge;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}
	

}
