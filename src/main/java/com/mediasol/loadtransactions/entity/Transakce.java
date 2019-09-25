package com.mediasol.loadtransactions.entity;

import org.springframework.stereotype.Component;

@Component
public class Transakce {	
	DetailTransakce detailTransakce;
	DoplnujiciInformace doplnujiciInformace;
	ZpravaProPrijemce1 zpravaProPrijemce1;
	ZpravaProPrijemce2 zpravaProPrijemce2;
	
	
	public Transakce() {
		super();
		this.detailTransakce = null;
		this.doplnujiciInformace = null;
		this.zpravaProPrijemce1 = null;
		this.zpravaProPrijemce2 = null;
	}
	
	public DetailTransakce getDetailTransakce() {
		return detailTransakce;
	}
	public void setDetailTransakce(DetailTransakce detailTransakce) {
		this.detailTransakce = detailTransakce;
	}
	public DoplnujiciInformace getDoplnujiciInformace() {
		return doplnujiciInformace;
	}
	public void setDoplnujiciInformace(DoplnujiciInformace doplnujiciInformace) {
		this.doplnujiciInformace = doplnujiciInformace;
	}
	public ZpravaProPrijemce1 getZpravaProPrijemce1() {
		return zpravaProPrijemce1;
	}
	public void setZpravaProPrijemce1(ZpravaProPrijemce1 zpravaProPrijemce1) {
		this.zpravaProPrijemce1 = zpravaProPrijemce1;
	}
	public ZpravaProPrijemce2 getZpravaProPrijemce2() {
		return zpravaProPrijemce2;
	}
	public void setZpravaProPrijemce2(ZpravaProPrijemce2 zpravaProPrijemce2) {
		this.zpravaProPrijemce2 = zpravaProPrijemce2;
	}	
	
}
