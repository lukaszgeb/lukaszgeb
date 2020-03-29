package com.akademiakodu.countriesdocker.service;

import com.akademiakodu.countriesdocker.model.CountryLanguage;
import com.akademiakodu.countriesdocker.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

//    @Autowired
//    private CountryLanguageRepository countryLanguageRepository;

    private CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguage> getCountryLanguages(String code){
        return countryLanguageRepository.findByCountryCode(code);
    }


}
