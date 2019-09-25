package com.mediasol.loadtransactions.output;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.mediasol.loadtransactions.dao.HlavickaVypisuRepository;
import com.mediasol.loadtransactions.entity.*;

@Component
public class OutputHlavickaATransakceToMongoDB {
	

	@Autowired
	private HlavickaVypisuRepository transactionsRepository;

	public void writeHlavickaATransakce(HlavickaVypisu hlavickaVypisu) {

		//transactionsRepository.deleteAll();
		
		transactionsRepository.save(hlavickaVypisu);
		
	}
}

