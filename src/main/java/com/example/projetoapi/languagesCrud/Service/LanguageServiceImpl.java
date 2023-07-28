package com.example.projetoapi.languagesCrud.Service;

import com.example.projetoapi.languagesCrud.Entity.Language;
import com.example.projetoapi.languagesCrud.dao.LanguageDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LanguageServiceImpl implements LanguageService{

    private LanguageDAO languageDAO;

    public LanguageServiceImpl(LanguageDAO languageDAO) {
        this.languageDAO = languageDAO;
    }

    @Transactional
    @Override
    public Language save(Language theLanguage){
        return languageDAO.saveLanguage(theLanguage);
    }
}
