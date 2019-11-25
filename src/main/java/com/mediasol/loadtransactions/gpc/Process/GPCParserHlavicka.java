package com.mediasol.loadtransactions.gpc.Process;

import java.text.ParseException;

import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.HlavickaVypisu;

@Component
public class GPCParserHlavicka {



	public HlavickaVypisu setterHlavicka(String lineHlavicka)
	{
		int poziceLine = 0;
		HlavickaVypisu hlavickaVypisu = HlavickaVypisu.getInstance();
		
		try
		{
		hlavickaVypisu.setCisloUctu(lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaCisloUctu));
		poziceLine = poziceLine + GPCProperties.lenHlavickaCisloUctu;
		
		//System.out.println("CisloUctu:" + hlavickaVypisu.getCisloUctu());
		//Sadece 3 digit basiyor
		hlavickaVypisu.setMajitelUctu(lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaMajitelUctu));
		poziceLine = poziceLine + GPCProperties.lenHlavickaMajitelUctu;
		
		//System.out.println("MajitelUctu:" + hlavickaVypisu.getMajitelUctu());
		
		hlavickaVypisu.setDatumPocatecnihoZuztatku(lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaDatumPocatecnihoZuztatku));
		poziceLine = poziceLine + GPCProperties.lenHlavickaDatumPocatecnihoZuztatku;
		
		//System.out.println("DatumPocatecnihoZuztatku:" + hlavickaVypisu.getDatumPocatecnihoZuztatku());

		hlavickaVypisu.setPocatecniZustatek(lineHlavicka.substring(poziceLine, 
				(poziceLine 
						+ GPCProperties.lenHlavickaPocatecniZustatek 
						+ GPCProperties.lenHlavickaZnamenkopocatecnihoZustatku)));
		poziceLine = poziceLine + GPCProperties.lenHlavickaPocatecniZustatek + GPCProperties.lenHlavickaZnamenkopocatecnihoZustatku;
		
		//System.out.println("PocatecniZustatek:" + hlavickaVypisu.getPocatecniZustatek());
		
		hlavickaVypisu.setKoncovyZustatek(lineHlavicka.substring(poziceLine, 
				(poziceLine 
						+ GPCProperties.lenHlavickaKoncovyZustatek 
						+ GPCProperties.lenHlavickaZnamenkokoncovehoZustatku)));
		poziceLine = poziceLine + GPCProperties.lenHlavickaKoncovyZustatek + GPCProperties.lenHlavickaZnamenkokoncovehoZustatku;
		
		//System.out.println("KoncovyZustatek:" + hlavickaVypisu.getKoncovyZustatek());
		
		hlavickaVypisu.setSumaDebetnichPolozek(lineHlavicka.substring(poziceLine, 
				(poziceLine + GPCProperties.lenHlavickaSumaDebetnichPolozek)));
		poziceLine = poziceLine + GPCProperties.lenHlavickaSumaDebetnichPolozek;
		
		//System.out.println("sumaDebetnichPolozek:" + hlavickaVypisu.getSumaDebetnichPolozek());

		
		hlavickaVypisu.setZnamenkoDebetniObraty((lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaZnamenkoDebetniObraty)).charAt(0));
		poziceLine = poziceLine + GPCProperties.lenHlavickaZnamenkoDebetniObraty;
		
		//System.out.println("ZnamenkoDebetniObraty:" + hlavickaVypisu.getZnamenkoDebetniObraty());
		
		hlavickaVypisu.setSumaKreditnichPolozek(lineHlavicka.substring(poziceLine, 
				(poziceLine + GPCProperties.lenHlavickaSumaKreditnichPolozek)));
		poziceLine = poziceLine + GPCProperties.lenHlavickaSumaKreditnichPolozek;
		
		//System.out.println("sumaKreditnichPolozek:" + hlavickaVypisu.getSumaKreditnichPolozek());
	
		hlavickaVypisu.setZnamenkoKreditniObraty((lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaZnamenkoKreditniObraty)).charAt(0));
		poziceLine = poziceLine + GPCProperties.lenHlavickaZnamenkoKreditniObraty;
		
		//System.out.println("ZnamenkoKreditniObraty:" + hlavickaVypisu.getZnamenkoKreditniObraty());	
		
		hlavickaVypisu.setPoradoveCisloVypisu(lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaPoradoveCisloVypisu));
		poziceLine = poziceLine + GPCProperties.lenHlavickaPoradoveCisloVypisu;
		
		//System.out.println("PoradoveCisloVypisu:" + hlavickaVypisu.getPoradoveCisloVypisu());

		hlavickaVypisu.setDatumVypisu(lineHlavicka.substring(poziceLine, 
				poziceLine + GPCProperties.lenHlavickaDatumVypisu));
		poziceLine = poziceLine + GPCProperties.lenHlavickaDatumVypisu;
		
		//System.out.println("DatumVypisu:" + hlavickaVypisu.getDatumVypisu());
		
		return hlavickaVypisu;
		}		
		catch (ParseException e) {
			System.out.println("ERROR: Caught ParseException: " + e.getMessage());
			return null;
		} 

	}
}
