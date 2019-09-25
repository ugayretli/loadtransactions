package com.mediasol.loadtransactions.entity;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DetailTransakce {

	String cisloUctu;
	String cisloUctuProtistrany;
	String identifikatorTransakce;
	double castkaZauctovaneTransakce;
	int kodUctovani; 
	String variabilniSymbol;
	String oddelovac;
	String kodBankyProtistrany;
	String konstantniSymbol;
	String specifickySymbol;
	LocalDateTime datumValuty;
	String nazevProtistrany;
	String ciselnyKodMeny;
	LocalDateTime datumZauctovani;
	
	public String getCisloUctu() {
		return cisloUctu;
	}
	public void setCisloUctu(String cisloUctu) {
		this.cisloUctu = cisloUctu;
	}
	public String getCisloUctuProtistrany() {
		return cisloUctuProtistrany;
	}
	public void setCisloUctuProtistrany(String cisloUctuProtistrany) {
		this.cisloUctuProtistrany = cisloUctuProtistrany;
	}
	public String getIdentifikatorTransakce() {
		return identifikatorTransakce;
	}
	public void setIdentifikatorTransakce(String identifikatorTransakce) {
		this.identifikatorTransakce = identifikatorTransakce;
	}
	public double getCastkaZauctovaneTransakce() {
		return castkaZauctovaneTransakce;
	}
	public void setCastkaZauctovaneTransakce(String castkaZauctovaneTransakce) {
		this.castkaZauctovaneTransakce = Double.parseDouble(castkaZauctovaneTransakce.substring(0,10).replaceFirst("^0+", "") + 
                "." + 
                castkaZauctovaneTransakce.substring(10,12));
	}
	

	public int getKodUctovani() {
		return kodUctovani;
	}
	public void setKodUctovani(String kodUctovani) {
		this.kodUctovani = Integer.parseInt(kodUctovani);
	}
	
	public String getVariabilniSymbol() {
		return variabilniSymbol;
	}
	public void setVariabilniSymbol(String variabilniSymbol) {
		this.variabilniSymbol = variabilniSymbol;
	}
	public String getOddelovac() {
		return oddelovac;
	}
	public void setOddelovac(String oddelovac) {
		this.oddelovac = oddelovac;
	}
	public String getKodBankyProtistrany() {
		return kodBankyProtistrany;
	}
	public void setKodBankyProtistrany(String kodBankyProtistrany) {
		this.kodBankyProtistrany = kodBankyProtistrany;
	}
	public String getKonstantniSymbol() {
		return konstantniSymbol;
	}
	public void setKonstantniSymbol(String konstantniSymbol) {
		this.konstantniSymbol = konstantniSymbol;
	}
	public String getSpecifickySymbol() {
		return specifickySymbol;
	}
	public void setSpecifickySymbol(String specifickySymbol) {
		this.specifickySymbol = specifickySymbol;
	}
	public LocalDateTime getDatumValuty() {
		return datumValuty;
	}
	public void setDatumValuty(String sdatumValuty) throws ParseException {
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
	    LocalDateTime datumValuty = LocalDateTime.parse(sdatumValuty + "000000", formatter);
		this.datumValuty = datumValuty;
	}
	
	
	public String getNazevProtistrany() {
		return nazevProtistrany;
	}
	public void setNazevProtistrany(String nazevProtistrany) {
		this.nazevProtistrany = nazevProtistrany;
	}
	public String getCiselnyKodMeny() {
		return ciselnyKodMeny;
	}
	public void setCiselnyKodMeny(String ciselnyKodMeny) {
		this.ciselnyKodMeny = ciselnyKodMeny;
	}
	public LocalDateTime getDatumZauctovani() {
		return datumZauctovani;
	}
	public void setDatumZauctovani(String sdatumZauctovani) throws ParseException {
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
	    LocalDateTime datumZauctovani = LocalDateTime.parse(sdatumZauctovani + "000000", formatter);
		this.datumZauctovani = datumZauctovani;
	}
	
	
}
