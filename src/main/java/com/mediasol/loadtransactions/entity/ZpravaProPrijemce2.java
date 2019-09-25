package com.mediasol.loadtransactions.entity;

import org.springframework.stereotype.Component;

@Component
public class ZpravaProPrijemce2 {
	String tretiCastZpravy;
	String ctvrtaCastZpravy;
	String informaciPuvodniCastceTransakce;
	String tretiCastZpravyKorporatniKlienty;
	
	public String getTretiCastZpravy() {
		return tretiCastZpravy;
	}
	public void setTretiCastZpravy(String tretiCastZpravy) {
		this.tretiCastZpravy = tretiCastZpravy;
	}
	public String getCtvrtaCastZpravy() {
		return ctvrtaCastZpravy;
	}
	public void setCtvrtaCastZpravy(String ctvrtaCastZpravy) {
		this.ctvrtaCastZpravy = ctvrtaCastZpravy;
	}
	public String getInformaciPuvodniCastceTransakce() {
		return informaciPuvodniCastceTransakce;
	}
	public void setInformaciPuvodniCastceTransakce(String informaciPuvodniCastceTransakce) {
		this.informaciPuvodniCastceTransakce = informaciPuvodniCastceTransakce;
	}
	public String getTretiCastZpravyKorporatniKlienty() {
		return tretiCastZpravyKorporatniKlienty;
	}
	public void setTretiCastZpravyKorporatniKlienty(String tretiCastZpravyKorporatniKlienty) {
		this.tretiCastZpravyKorporatniKlienty = tretiCastZpravyKorporatniKlienty;
	}
	
}
