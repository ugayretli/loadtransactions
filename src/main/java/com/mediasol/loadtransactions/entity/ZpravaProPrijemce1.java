package com.mediasol.loadtransactions.entity;

import org.springframework.stereotype.Component;

@Component
public class ZpravaProPrijemce1 {
	String prvniCastZpravy;
	String druhaCastZpravy;
	String informaciPuvodniCastceTransakce;
	
	public String getPrvniCastZpravy() {
		return prvniCastZpravy;
	}
	public void setPrvniCastZpravy(String prvniCastZpravy) {
		this.prvniCastZpravy = prvniCastZpravy;
	}
	public String getDruhaCastZpravy() {
		return druhaCastZpravy;
	}
	public void setDruhaCastZpravy(String druhaCastZpravy) {
		this.druhaCastZpravy = druhaCastZpravy;
	}
	public String getInformaciPuvodniCastceTransakce() {
		return informaciPuvodniCastceTransakce;
	}
	public void setInformaciPuvodniCastceTransakce(String informaciPuvodniCastceTransakce) {
		this.informaciPuvodniCastceTransakce = informaciPuvodniCastceTransakce;
	}
	
	
}
