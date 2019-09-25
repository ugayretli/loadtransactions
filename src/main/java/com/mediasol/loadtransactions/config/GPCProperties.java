package com.mediasol.loadtransactions.config;



public class GPCProperties {
	public static final int LEN_RADA = 128;
	public static final String HLAVICKA_VYPISU = "074";
	public static final String DETAIL_TRANSAKCE = "075";
	public static final String DOPLNUJICI_INFORMACE = "076";
	public static final String ZPRAVA_PRO_PRIJEMCE_1 = "078";
	public static final String ZPRAVA_PRO_PRIJEMCE_2 = "079";
	

	
	public static final int lenHlavickaCisloUctu = 16;
	public static final int lenHlavickaMajitelUctu = 20;
	public static final int lenHlavickaDatumPocatecnihoZuztatku = 6;
	public static final int lenHlavickaPocatecniZustatek = 14;
	public static final int lenHlavickaZnamenkopocatecnihoZustatku = 1;
	public static final int lenHlavickaKoncovyZustatek = 14;
	public static final int lenHlavickaZnamenkokoncovehoZustatku = 1;
	public static final int lenHlavickaSumaDebetnichPolozek = 14;
	public static final int lenHlavickaZnamenkoDebetniObraty = 1;
	public static final int lenHlavickaSumaKreditnichPolozek = 14;
	public static final int lenHlavickaZnamenkoKreditniObraty = 1;
	public static final int lenHlavickaPoradoveCisloVypisu = 3;
	public static final int lenHlavickaDatumVypisu = 6;
	
	
	public static final int lenDetailCisloUctu = 16;
	public static final int lenDetailCisloUctuProtistrany = 16;
	public static final int lenDetailIdentifikatorTransakce = 13;
	public static final int lenDetailCastkaZauctovaneTransakce = 12;
	public static final int lenDetailKodUctovani = 1; 
	public static final int lenDetailVariabilniSymbol = 10;
	public static final int lenDetailOddelovac = 2;
	public static final int lenDetailKodBankyProtistrany = 4;
	public static final int lenDetailKonstantniSymbol = 4;
	public static final int lenDetailSpecifickySymbol = 10;
	public static final int lenDetailDatumValuty = 6;
	public static final int lenDetailNazevProtistrany = 20;
	public static final int lenDetailCiselnyKodMeny = 5;
	public static final int lenDetailDatumZauctovani = 6;	
	
	public static final int lenDoplnujiciIdentifikaceTransakce = 26;
	public static final int lenDoplnujiciDatumOdepsani = 6;
	public static final int lenDoplnujiciNazevProtistrany = 92;
	
	
	public static final int lenZprava1PrvniCastZpravy = 35;
	public static final int lenZprava1DruhaCastZpravy = 35;
	public static final int lenZprava1InformaciPuvodniCastceTransakce = 35;
	
	
	public static final int lenZprava2TretiCastZpravy = 35;
	public static final int lenZprava2CtvrtaCastZpravy = 35;
	public static final int lenZprava2InformaciPuvodniCastceTransakce = 35;
	public static final int lenZprava2TretiCastZpravyKorporatniKlienty = 18;
	
}
