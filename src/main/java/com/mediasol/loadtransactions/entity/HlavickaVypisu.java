package com.mediasol.loadtransactions.entity;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HlavickaVypisu {
	
	String cisloUctu;
	String majitelUctu;
	LocalDateTime datumPocatecnihoZuztatku;
	double pocatecniZustatek;
	double koncovyZustatek;
	double sumaDebetnichPolozek;
	char znamenkoDebetniObraty;
	double sumaKreditnichPolozek;
	char znamenkoKreditniObraty;
	int poradoveCisloVypisu;
	LocalDateTime datumVypisu;
	List<Transakce> transakce;

	
	public HlavickaVypisu() {
		super();
		this.transakce = new ArrayList<Transakce>();
	}
	
	
	
	
	public void destroyHlavickaVypisu() {
		this.cisloUctu = null;
		this.majitelUctu = null;
		this.datumPocatecnihoZuztatku = null;
		this.pocatecniZustatek = 0;
		this.koncovyZustatek = 0;
		this.sumaDebetnichPolozek = 0;
		this.znamenkoDebetniObraty = 0;
		this.sumaKreditnichPolozek = 0;
		this.znamenkoKreditniObraty = 0;
		this.poradoveCisloVypisu = 0;
		this.datumVypisu = null;
		this.transakce.clear();
	}

	public void addentrytoTransakcelistHlavickaVypisu(Transakce transakce) {
		this.transakce.add(transakce);
	}


	public String getCisloUctu() {
		return cisloUctu;
	}
	public void setCisloUctu(String cisloUctu) {
		this.cisloUctu = cisloUctu;
	}
	public String getMajitelUctu() {
		return majitelUctu;
	}
	public void setMajitelUctu(String majitelUctu) {
		this.majitelUctu = majitelUctu;
	}
	public LocalDateTime getDatumPocatecnihoZuztatku() {
		
		return datumPocatecnihoZuztatku;
	}
	public void setDatumPocatecnihoZuztatku(String sdatumPocatecnihoZuztatku) throws ParseException {
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
	    LocalDateTime datumPocatecnihoZuztatku = LocalDateTime.parse(sdatumPocatecnihoZuztatku + "000000", formatter);
		this.datumVypisu = datumPocatecnihoZuztatku;

	}
	public double getPocatecniZustatek() {
		return pocatecniZustatek;
	}
	public void setPocatecniZustatek(String pocatecniZustatek) {
		this.pocatecniZustatek = Double.parseDouble(pocatecniZustatek.substring(14,15) + pocatecniZustatek.substring(0,12).replaceFirst("^0+", "") + 
				                                    "." + 
				                                    pocatecniZustatek.substring(12,14));
	}
	public double getKoncovyZustatek() {
		return koncovyZustatek;
	}
	public void setKoncovyZustatek(String koncovyZustatek) {
		this.koncovyZustatek = Double.parseDouble(koncovyZustatek.substring(14,15) + koncovyZustatek.substring(0,12).replaceFirst("^0+", "") + 
                "." + 
                koncovyZustatek.substring(12,14));
	}	
	public double getSumaDebetnichPolozek() {
		return sumaDebetnichPolozek;
	}
	public void setSumaDebetnichPolozek(String sumaDebetnichPolozek) {
		this.sumaDebetnichPolozek = Double.parseDouble(sumaDebetnichPolozek.substring(0,12).replaceFirst("^0+", "") + 
                "." + 
                sumaDebetnichPolozek.substring(12,14));
	}
	
	public double getSumaKreditnichPolozek() {
		return sumaKreditnichPolozek;
	}
	public void setSumaKreditnichPolozek(String sumaKreditnichPolozek) {
		this.sumaKreditnichPolozek = Double.parseDouble(sumaKreditnichPolozek.substring(0,12).replaceFirst("^0+", "") + 
                "." + 
                sumaKreditnichPolozek.substring(12,14));
	}

	public int getPoradoveCisloVypisu() {
		return poradoveCisloVypisu;
	}
	public void setPoradoveCisloVypisu(String poradoveCisloVypisu) {
		this.poradoveCisloVypisu = Integer.parseInt(poradoveCisloVypisu);
	}
	public LocalDateTime getDatumVypisu() {
		return datumVypisu;
	}
	public void setDatumVypisu(String sdatumVypisu) throws ParseException {
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
			    LocalDateTime datumVypisu = LocalDateTime.parse(sdatumVypisu + "000000", formatter);
				this.datumVypisu = datumVypisu;
	}
	
	
	
	public char getZnamenkoDebetniObraty() {
		return znamenkoDebetniObraty;
	}
	public void setZnamenkoDebetniObraty(char znamenkoDebetniObraty) {
		this.znamenkoDebetniObraty = znamenkoDebetniObraty;
	}
	public char getZnamenkoKreditniObraty() {
		return znamenkoKreditniObraty;
	}
	public void setZnamenkoKreditniObraty(char znamenkoKreditniObraty) {
		this.znamenkoKreditniObraty = znamenkoKreditniObraty;
	}
	public List<Transakce> getTransakce() {
		return transakce;
	}
	public void setTransakce(List<Transakce> transakce) {
		this.transakce = transakce;
	}


}
