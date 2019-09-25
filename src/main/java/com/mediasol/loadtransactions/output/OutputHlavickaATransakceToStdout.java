package com.mediasol.loadtransactions.output;


import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.entity.*;

@Component
public class OutputHlavickaATransakceToStdout {
	
	public static int countOfAccounts = 0;
	
	public void PrintHlavickaATransakce(HlavickaVypisu hlavickaVypisu) {


		if (hlavickaVypisu != null) {
			
			
			countOfAccounts++;
			System.out.println("/*********************************************************/");
			System.out.println("Hlavicka CISLO: " + countOfAccounts);
			System.out.println("/*********************************************************/");
			System.out.println("HlavickaVypisu.cisloUctu: " + hlavickaVypisu.getCisloUctu());
			System.out.println("HlavickaVypisu.majitelUctu: " + hlavickaVypisu.getMajitelUctu());
			System.out.println("HlavickaVypisu.DatumPocatecnihoZuztatku: " + hlavickaVypisu.getDatumPocatecnihoZuztatku());
			System.out.println("HlavickaVypisu.PocatecniZustatek: " + hlavickaVypisu.getPocatecniZustatek());
			System.out.println("HlavickaVypisu.koncovyZustatek: " + hlavickaVypisu.getKoncovyZustatek());
			System.out.println("HlavickaVypisu.sumaDebetnichPolozek: " + hlavickaVypisu.getSumaDebetnichPolozek());
			System.out.println("HlavickaVypisu.znamenkoDebetniObraty: " + hlavickaVypisu.getZnamenkoDebetniObraty());
			System.out.println("HlavickaVypisu.sumaKreditnichPolozek: " + hlavickaVypisu.getSumaKreditnichPolozek());
			System.out.println("HlavickaVypisu.znamenkoKreditniObraty: " + hlavickaVypisu.getZnamenkoKreditniObraty());
			System.out.println("HlavickaVypisu.poradoveCisloVypisu: " + hlavickaVypisu.getPoradoveCisloVypisu());
			System.out.println("HlavickaVypisu.datumVypisu: " + hlavickaVypisu.getDatumVypisu());


			for (int i = 0; i < hlavickaVypisu.getTransakce().size(); i++) {

				Transakce transakce = hlavickaVypisu.getTransakce().get(i);
				if (transakce != null) {
					System.out.println("Transaction No: " + i);
					DetailTransakce detailTransakce = transakce.getDetailTransakce();
					if (detailTransakce != null) {
						System.out.println("DetailTransakce.CisloUctu: " + detailTransakce.getCisloUctu());
						System.out.println(
								"DetailTransakce.CisloUctuProtistrany: " + detailTransakce.getCisloUctuProtistrany());
						System.out.println(
								"DetailTransakce.IdentifikatorTransakce: " + detailTransakce.getIdentifikatorTransakce());
						System.out.println(
								"DetailTransakce.castkaZauctovaneTransakce: " + detailTransakce.getCastkaZauctovaneTransakce());
						System.out.println(
								"DetailTransakce.kodUctovani: " + detailTransakce.getKodUctovani());
						System.out.println(
								"DetailTransakce.variabilniSymbol: " + detailTransakce.getVariabilniSymbol());						
						System.out.println(
								"DetailTransakce.oddelovac: " + detailTransakce.getOddelovac());							
						System.out.println(
								"DetailTransakce.kodBankyProtistrany: " + detailTransakce.getKodBankyProtistrany());	
						System.out.println(
								"DetailTransakce.konstantniSymbol: " + detailTransakce.getKonstantniSymbol());	
						System.out.println(
								"DetailTransakce.specifickySymbol: " + detailTransakce.getSpecifickySymbol());							
						System.out.println(
								"DetailTransakce.datumValuty: " + detailTransakce.getDatumValuty());	
						System.out.println(
								"DetailTransakce.nazevProtistrany: " + detailTransakce.getNazevProtistrany());
						System.out.println(
								"DetailTransakce.ciselnyKodMeny: " + detailTransakce.getCiselnyKodMeny());
						System.out.println(
								"DetailTransakce.datumZauctovani: " + detailTransakce.getDatumZauctovani());

					}
					DoplnujiciInformace doplnujiciInformace = transakce.getDoplnujiciInformace();
					if (doplnujiciInformace != null) {
						System.out.println("DoplnujiciInformace.IdentifikaceTransakce"
								+ doplnujiciInformace.getIdentifikaceTransakce());
						System.out
								.println("DoplnujiciInformace.DatumOdepsani" + doplnujiciInformace.getDatumOdepsani());
						System.out.println(
								"DoplnujiciInformace.NazevProtistrany" + doplnujiciInformace.getNazevProtistrany());
					}

					ZpravaProPrijemce1 zpravaProPrijemce1 = transakce.getZpravaProPrijemce1();
					if (zpravaProPrijemce1 != null) {
						System.out.println(
								"ZpravaProPrijemce1.PrvniCastZpravy" + zpravaProPrijemce1.getPrvniCastZpravy());
						System.out.println(
								"ZpravaProPrijemce1.DruhaCastZpravy" + zpravaProPrijemce1.getDruhaCastZpravy());
						System.out.println("ZpravaProPrijemce1.InformaciPuvodniCastceTransakce"
								+ zpravaProPrijemce1.getInformaciPuvodniCastceTransakce());
					}
					ZpravaProPrijemce2 zpravaProPrijemce2 = transakce.getZpravaProPrijemce2();
					if (zpravaProPrijemce2 != null) {
						System.out.println(
								"ZpravaProPrijemce2.TretiCastZpravy" + zpravaProPrijemce2.getTretiCastZpravy());
						System.out.println(
								"ZpravaProPrijemce2.CtvrtaCastZpravy" + zpravaProPrijemce2.getCtvrtaCastZpravy());
						System.out.println("ZpravaProPrijemce2.InformaciPuvodniCastceTransakce"
								+ zpravaProPrijemce2.getInformaciPuvodniCastceTransakce());
						System.out.println("ZpravaProPrijemce2.TretiCastZpravyKorporatniKlienty"
								+ zpravaProPrijemce2.getTretiCastZpravyKorporatniKlienty());
					}
				}
			}
		}
	}
}
