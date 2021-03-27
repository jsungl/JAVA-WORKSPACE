package com.kh.test.fruit;

import java.util.Objects;


public class Fruit {
	
	private String name;
	private String flavor;
	
	public Fruit() {
		
	}

	public Fruit(String name, String flavor) {
		super();
		this.name = name;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", flavor=" + flavor + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o)
			return true;
		
		if (o == null)
			return false;
		
		if(!(o instanceof Fruit)) //Student타입이 아니라면
			return false;
		
		Fruit other = (Fruit)o;
		
		if (name == null) {
			if (other.name != null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		}else if(!flavor.equals(other.flavor))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, flavor);
	}
	

}
