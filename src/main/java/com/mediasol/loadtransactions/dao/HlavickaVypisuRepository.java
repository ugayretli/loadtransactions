package com.mediasol.loadtransactions.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.mediasol.loadtransactions.entity.HlavickaVypisu;

@Component
public interface HlavickaVypisuRepository extends MongoRepository<HlavickaVypisu, Long> {

    //public HlavickaVypisu findByCisloUctuName(String cisloUctu);

}
