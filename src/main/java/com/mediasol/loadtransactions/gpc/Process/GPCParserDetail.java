package com.mediasol.loadtransactions.gpc.Process;


import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.*;

@Component
public class GPCParserDetail {


		public DetailTransakce setterDetail(String lineDetail)
		{
			int poziceLine = 0;
			
			DetailTransakce detailTransakce = new DetailTransakce();
			
			try
			{
				detailTransakce.setCisloUctu(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailCisloUctu));
			poziceLine = poziceLine + GPCProperties.lenDetailCisloUctu;
			
			//System.out.println("CisloUctu:" + detailTransakce.getCisloUctu());

			detailTransakce.setCisloUctuProtistrany(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailCisloUctuProtistrany));
			poziceLine = poziceLine + GPCProperties.lenDetailCisloUctuProtistrany;
			
			//System.out.println("CisloUctuProtistrany:" + detailTransakce.getCisloUctuProtistrany());
			
			detailTransakce.setIdentifikatorTransakce(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailIdentifikatorTransakce));
			poziceLine = poziceLine + GPCProperties.lenDetailIdentifikatorTransakce;
			
			//System.out.println("IdentifikatorTransakce:" + detailTransakce.getIdentifikatorTransakce());

			detailTransakce.setCastkaZauctovaneTransakce(lineDetail.substring(poziceLine, 
					(poziceLine + GPCProperties.lenDetailCastkaZauctovaneTransakce)));
			poziceLine = poziceLine + GPCProperties.lenDetailCastkaZauctovaneTransakce;

		
			detailTransakce.setKodUctovani(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailKodUctovani));
			poziceLine = poziceLine + GPCProperties.lenDetailKodUctovani;

			detailTransakce.setVariabilniSymbol(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailVariabilniSymbol));
			poziceLine = poziceLine + GPCProperties.lenDetailVariabilniSymbol;
			
			detailTransakce.setOddelovac(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailOddelovac));
			poziceLine = poziceLine + GPCProperties.lenDetailOddelovac;			
				
			detailTransakce.setKodBankyProtistrany(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailKodBankyProtistrany));
			poziceLine = poziceLine + GPCProperties.lenDetailKodBankyProtistrany;		
			
			detailTransakce.setKonstantniSymbol(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailKonstantniSymbol));
			poziceLine = poziceLine + GPCProperties.lenDetailKonstantniSymbol;	
			
			detailTransakce.setSpecifickySymbol(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailSpecifickySymbol));
			poziceLine = poziceLine + GPCProperties.lenDetailSpecifickySymbol;	

			detailTransakce.setDatumValuty(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailDatumValuty));
			poziceLine = poziceLine + GPCProperties.lenDetailDatumValuty;	
			
			detailTransakce.setNazevProtistrany(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailNazevProtistrany));
			poziceLine = poziceLine + GPCProperties.lenDetailNazevProtistrany;	

			detailTransakce.setCiselnyKodMeny(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailCiselnyKodMeny));
			poziceLine = poziceLine + GPCProperties.lenDetailCiselnyKodMeny;	
			
			detailTransakce.setDatumZauctovani(lineDetail.substring(poziceLine, 
					poziceLine + GPCProperties.lenDetailDatumZauctovani));
			poziceLine = poziceLine + GPCProperties.lenDetailDatumZauctovani;	
			
			return detailTransakce;
			}		
			catch (Exception e) {
				System.out.println("ERROR: Caught Exception: " + e.getMessage());
				return null;
			} 

		}
	
}
