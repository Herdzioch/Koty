package kobiety;

import java.util.Date;

import javax.swing.JFrame;

public class Kot {
public static void main(String[] args) {
		
		Kot kot = new Kot();
		kot.setImie("Filek");
		kot.setdataUrodzenia("12.03.2018");
		kot.setWaga(6f);
		kot.setImieOpiekuna("Herdzioch"); 
		
}

	private String imie;
	private String dataUrodzenia ;
	private Float waga ;
	private String imieOpiekuna ;
	
	public String przedstawSie() {
		return "Cze��, nazywam si� " + imie + ", urodzi�em si� " + dataUrodzenia + ". Wa�� " + waga + ". M�j opiekuna ma na imi� " + imieOpiekuna;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie (String imie) {
		this.imie = imie;
	}
	
	public String getdataUrodzenia(){
		return dataUrodzenia;
	}
	public void setdataUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	
	public Float getWaga() {
		return waga;
	}
	
	public void setWaga (Float waga) {
		this.waga = waga;
	}
	
	public String getImieOpiekuna() {
		return imieOpiekuna;
	}
	public void setImieOpiekuna (String imieOpiekuna) {
		this.imieOpiekuna = imieOpiekuna;
	}
	

	}
	


