package it.polito.tdp.bar.model;


import java.util.PriorityQueue;

public class Simulator {

	private PriorityQueue<Event> queue = new PriorityQueue<Event>();
	
	// PARAMETRI DI SIMULAZIONE
	private int NT ;
	
	//MODELLO DEL MONDO
	private int nTavoli = 15;
	
	//VALORI DA CALCOLARE
	private int soddisfatti;
	private int insoddisfatti;
	private int numerototaleclienti;
	

	
	
	//METODI PER IMPOSTARE I PARAMETRI
	public void setnTavoli(int nTavoli) {
			this.nTavoli = nTavoli;
		}
	
	//METODI PER RESTITUITE I RISULTATI
		public int getSoddisfatti() {
		return soddisfatti;
		}
	 
		public int getInsoddisfatti() {
			return insoddisfatti;
		}
		public int getNumerototaleclienti() {
			return numerototaleclienti;
		}
	//SIMULAZIONE
	public void run() {
		this.insoddisfatti=0;
		this.soddisfatti=0;
		this.numerototaleclienti=0;
		this.nTavoli = this.NT;
		
		this.queue.clear();
	}
	
}
