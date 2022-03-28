package it.polito.tdp.corsi.db;

public class Divisione implements Comparable<Divisione>{
	private String CDS;
	private Integer n;
	
	public Divisione(String cDS, Integer n) {
		super();
		CDS = cDS;
		this.n = n;
	}

	public String getCDS() {
		return CDS;
	}

	public Integer getN() {
		return n;
	}

	@Override
	public String toString() {
		return "Divisione [CDS=" + CDS + ", n=" + n + "]";
	}

	@Override
	public int compareTo(Divisione o) {
		return o.getCDS().compareTo(this.CDS);
	}
	
	
}
