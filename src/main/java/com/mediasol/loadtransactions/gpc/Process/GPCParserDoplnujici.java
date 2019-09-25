package com.mediasol.loadtransactions.gpc.Process;

import java.text.ParseException;


import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.*;

@Component
public class GPCParserDoplnujici {


		public DoplnujiciInformace setterDoplnujici(String lineDoplnujici)
		{
			int poziceLine = 0;
			
			DoplnujiciInformace doplnujiciInformace = new DoplnujiciInformace();
			
			try
			{
				doplnujiciInformace.setIdentifikaceTransakce(lineDoplnujici.substring(poziceLine, 
					poziceLine + GPCProperties.lenDoplnujiciIdentifikaceTransakce));
			poziceLine = poziceLine + GPCProperties.lenDoplnujiciIdentifikaceTransakce;
			
			System.out.println("identifikaceTransakce:" + doplnujiciInformace.getIdentifikaceTransakce());

			doplnujiciInformace.setDatumOdepsani(lineDoplnujici.substring(poziceLine, 
					poziceLine + GPCProperties.lenDoplnujiciDatumOdepsani));
			poziceLine = poziceLine + GPCProperties.lenDoplnujiciDatumOdepsani;
			
			System.out.println("DatumOdepsani:" + doplnujiciInformace.getDatumOdepsani());
			
			doplnujiciInformace.setNazevProtistrany(lineDoplnujici.substring(poziceLine, 
					poziceLine + GPCProperties.lenDoplnujiciNazevProtistrany));
			poziceLine = poziceLine + GPCProperties.lenDoplnujiciNazevProtistrany;
			
			System.out.println("NazevProtistrany:" + doplnujiciInformace.getNazevProtistrany());

			
			return doplnujiciInformace;
			}		
			catch (ParseException e) {
				System.out.println("ERROR: Caught Parse Exception: " + e.getMessage());
				return null;
			} 

		}
}
