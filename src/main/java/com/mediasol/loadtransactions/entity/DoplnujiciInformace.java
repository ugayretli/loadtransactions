package com.mediasol.loadtransactions.entity;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DoplnujiciInformace {
	String identifikaceTransakce;
	LocalDateTime datumOdepsani;
	String nazevProtistrany;
	
	public String getIdentifikaceTransakce() {
		return identifikaceTransakce;
	}
	public void setIdentifikaceTransakce(String identifikaceTransakce) {
		this.identifikaceTransakce = identifikaceTransakce;
	}
	public LocalDateTime getDatumOdepsani() {
		return datumOdepsani;
	}
	public void setDatumOdepsani(String sdatumOdepsani) throws ParseException {
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
	    LocalDateTime datumOdepsani = LocalDateTime.parse(sdatumOdepsani + "000000", formatter);
		this.datumOdepsani = datumOdepsani;
	}
	public String getNazevProtistrany() {
		return nazevProtistrany;
	}
	public void setNazevProtistrany(String nazevProtistrany) {
		this.nazevProtistrany = nazevProtistrany;
	}
	
	
	
}
