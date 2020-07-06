package it.polito.tdp.bar.model;

public class Tavolo {
	
	int id ;
	int numeroposti;
	boolean occupato;
	
	public Tavolo(int id, int numeroposti, boolean occupato) {
		super();
		this.id = id;
		this.numeroposti = numeroposti;
		this.occupato = occupato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroposti() {
		return numeroposti;
	}

	public void setNumeroposti(int numeroposti) {
		this.numeroposti = numeroposti;
	}

	public boolean isOccupato() {
		return occupato;
	}

	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
	

}
