package com.architecture.model;

import java.util.Objects;

public class Building {

	private int id;
	private String name;
	private int owner;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public Building(int id, String name, int owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
	}
	public Building() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + owner;
//		return result;
		return Objects.hash(id,name,owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (owner != other.owner)
//			return false;
//		return true;
		return id == other.id && Objects.equals(name,other.name) && owner == other.owner; 
	}
	
}
