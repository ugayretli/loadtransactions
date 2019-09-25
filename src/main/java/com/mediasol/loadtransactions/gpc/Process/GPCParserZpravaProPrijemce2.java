package com.mediasol.loadtransactions.gpc.Process;

import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.*;

@Component
public class GPCParserZpravaProPrijemce2 {


		public ZpravaProPrijemce2 setterZpravaProPrijemce2(String lineZpravaProPrijemce2)
		{
			int poziceLine = 0;
			
			ZpravaProPrijemce2 zpravaProPrijemce2 = new ZpravaProPrijemce2();
			
			try
			{
				zpravaProPrijemce2.setTretiCastZpravy(lineZpravaProPrijemce2.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava2TretiCastZpravy));
			poziceLine = poziceLine + GPCProperties.lenZprava2TretiCastZpravy;
			
			System.out.println("TretiCastZpravy:" + zpravaProPrijemce2.getTretiCastZpravy());

			zpravaProPrijemce2.setCtvrtaCastZpravy(lineZpravaProPrijemce2.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava2CtvrtaCastZpravy));
			poziceLine = poziceLine + GPCProperties.lenZprava2CtvrtaCastZpravy;
			
			System.out.println("CtvrtaCastZpravy:" + zpravaProPrijemce2.getCtvrtaCastZpravy());
			
			zpravaProPrijemce2.setInformaciPuvodniCastceTransakce(lineZpravaProPrijemce2.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava2InformaciPuvodniCastceTransakce));
			poziceLine = poziceLine + GPCProperties.lenZprava2InformaciPuvodniCastceTransakce;
			
			System.out.println("InformaciPuvodniCastceTransakce:" + zpravaProPrijemce2.getInformaciPuvodniCastceTransakce());

			zpravaProPrijemce2.setTretiCastZpravyKorporatniKlienty(lineZpravaProPrijemce2.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava2TretiCastZpravyKorporatniKlienty));
			poziceLine = poziceLine + GPCProperties.lenZprava2TretiCastZpravyKorporatniKlienty;
			
			System.out.println("TretiCastZpravyKorporatniKlienty:" + zpravaProPrijemce2.getTretiCastZpravyKorporatniKlienty());			
			
			return zpravaProPrijemce2;
			}		
			catch (Exception e) {
				System.out.println("ERROR: Caught Exception: " + e.getMessage());
				return null;
			} 

		}
}
