package com.mediasol.loadtransactions.gpc.Process;


import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.*;

@Component
public class GPCParserZpravaProPrijemce1 {


		public ZpravaProPrijemce1 setterZpravaProPrijemce1(String lineZpravaProPrijemce1)
		{
			int poziceLine = 0;
			
			ZpravaProPrijemce1 zpravaProPrijemce1 = new ZpravaProPrijemce1();
			
			try
			{
				zpravaProPrijemce1.setPrvniCastZpravy(lineZpravaProPrijemce1.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava1PrvniCastZpravy));
			poziceLine = poziceLine + GPCProperties.lenZprava1PrvniCastZpravy;
			
			System.out.println("PrvniCastZpravy:" + zpravaProPrijemce1.getPrvniCastZpravy());

			zpravaProPrijemce1.setDruhaCastZpravy(lineZpravaProPrijemce1.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava1DruhaCastZpravy));
			poziceLine = poziceLine + GPCProperties.lenZprava1DruhaCastZpravy;
			
			System.out.println("DruhaCastZpravy:" + zpravaProPrijemce1.getDruhaCastZpravy());
			
			zpravaProPrijemce1.setInformaciPuvodniCastceTransakce(lineZpravaProPrijemce1.substring(poziceLine, 
					poziceLine + GPCProperties.lenZprava1InformaciPuvodniCastceTransakce));
			poziceLine = poziceLine + GPCProperties.lenZprava1InformaciPuvodniCastceTransakce;
			
			System.out.println("InformaciPuvodniCastceTransakce:" + zpravaProPrijemce1.getInformaciPuvodniCastceTransakce());
			
			return zpravaProPrijemce1;
			}		
			catch (Exception e) {
				System.out.println("ERROR: Caught Exception: " + e.getMessage());
				return null;
			} 

		}
}
