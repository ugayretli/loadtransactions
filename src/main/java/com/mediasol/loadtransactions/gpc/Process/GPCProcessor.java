package com.mediasol.loadtransactions.gpc.Process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.config.AccountStatus;
import com.mediasol.loadtransactions.config.GPCProperties;
import com.mediasol.loadtransactions.entity.*;
import com.mediasol.loadtransactions.output.OutputHlavickaATransakceToMongoDB;
import com.mediasol.loadtransactions.output.OutputHlavickaATransakceToStdout;

@Component
public class GPCProcessor {

	//public static boolean firstAccount = true;

	
	
	@Autowired
	GPCParserHlavicka gpcParserHlavicka;
	@Autowired
	GPCParserDetail gpcParserDetail;
	@Autowired
	GPCParserDoplnujici gpcParserDoplnujici;
	@Autowired
	GPCParserZpravaProPrijemce1 gpcParserZpravaProPrijemce1;
	@Autowired
	GPCParserZpravaProPrijemce2 gpcParserZpravaProPrijemce2;
	@Autowired	
	OutputHlavickaATransakceToStdout gpcOutputHlavickaATransakce;
	@Autowired	
	OutputHlavickaATransakceToMongoDB outputHlavickaATransakceToMongoDB;

	static Transakce transakce;


	public boolean parseGPCTransaction(String line, HlavickaVypisu hlavickaVypisu) {

		if (line.length() != GPCProperties.LEN_RADA) {

			System.out.println("Invalid line length!!! length: " + line.length());
			return false;
		}
		String typZaznamu = line.substring(0, 3);
		//System.out.println(typZaznamu);
		
		if (typZaznamu.equals(GPCProperties.HLAVICKA_VYPISU)) {
					
			if ( !AccountStatus.getInstance().firstAccount )
			{
				gpcOutputHlavickaATransakce.PrintHlavickaATransakce(hlavickaVypisu);
				outputHlavickaATransakceToMongoDB.writeHlavickaATransakce(hlavickaVypisu);
			}
			hlavickaVypisu.destroyHlavickaVypisu();
			hlavickaVypisu = gpcParserHlavicka.setterHlavicka(line.substring(3));
			
			if (hlavickaVypisu == null ) {
				System.out.println("Can not set header !!!");
				return false;
			}

		} else if (typZaznamu.equals(GPCProperties.DETAIL_TRANSAKCE)) {
			
			AccountStatus.getInstance().firstAccount = false;
			transakce = new Transakce();
			hlavickaVypisu.addentrytoTransakcelistHlavickaVypisu(transakce);
			
			DetailTransakce detailTransakce = gpcParserDetail.setterDetail(line.substring(3));
			
			
			if (detailTransakce == null) {
				System.out.println("Can not set Transaction detail !!!");
				return false;
			}
			else
			{
				transakce.setDetailTransakce(detailTransakce);
			}

		} else if (typZaznamu.equals(GPCProperties.DOPLNUJICI_INFORMACE)) {
			
			DoplnujiciInformace doplnujiciInformace = gpcParserDoplnujici.setterDoplnujici(line.substring(3));		
			
			if ( doplnujiciInformace == null ) {
				System.out.println("Can not set doplnujiciInformace !!!");
				return false;
			}
			else
				transakce.setDoplnujiciInformace(doplnujiciInformace);

		} else if (typZaznamu.equals(GPCProperties.ZPRAVA_PRO_PRIJEMCE_1)) {
			
			ZpravaProPrijemce1 zpravaProPrijemce1 = gpcParserZpravaProPrijemce1.setterZpravaProPrijemce1(line.substring(3));
			if (zpravaProPrijemce1 == null ) {
				System.out.println("Can not set zpravaProPrijemce1!!!");
				return false;
			}
			else
				transakce.setZpravaProPrijemce1(zpravaProPrijemce1);

		} else if (typZaznamu.equals(GPCProperties.ZPRAVA_PRO_PRIJEMCE_2)) {
			
			ZpravaProPrijemce2 zpravaProPrijemce2 = gpcParserZpravaProPrijemce2.setterZpravaProPrijemce2(line.substring(3));
			if ( zpravaProPrijemce2 == null ) {
				System.out.println("Can not set zpravaProPrijemce2!!!");
				return false;
			}
			else
				transakce.setZpravaProPrijemce2(zpravaProPrijemce2);

		} else
			return false;

			return true;
	}

}
