package it.polito.tdp.bar.model;

import java.time.LocalTime;

public class Event implements Comparable<Event> {
	
	public enum EventType  {
		ARRIVO_GRUPPO_CLIENTI , TAVOLO_LIBERATO 
	}
	
	private LocalTime time;
	private EventType type;
	private int numpersone;  
	private int durata;
	private Tavolo tavolo; 
	private float tolleranza;
	
	
	
	
	public Event(LocalTime time, EventType type, int numpersone, int durata, float tolleranza) {
		super();
		this.time = time;
		this.type = type;
		this.numpersone = numpersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
	}


	


	public LocalTime getTime() {
		return time;
	}





	public void setTime(LocalTime time) {
		this.time = time;
	}





	public EventType getType() {
		return type;
	}





	public void setType(EventType type) {
		this.type = type;
	}





	public int getNumpersone() {
		return numpersone;
	}





	public void setNumpersone(int numpersone) {
		this.numpersone = numpersone;
	}





	public int getDurata() {
		return durata;
	}





	public void setDurata(int durata) {
		this.durata = durata;
	}





	public float getTolleranza() {
		return tolleranza;
	}





	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}





	@Override
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}

}
