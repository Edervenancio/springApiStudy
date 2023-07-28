package com.example.projetoapi.languagesCrud.dao;

import com.example.projetoapi.languagesCrud.Entity.Language;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;


@Repository
public class LanguageDAOImpl implements LanguageDAO{


    private EntityManager entityManager;

    public LanguageDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public Language saveLanguage(Language theLanguage) {
        Language dbLanguage = entityManager.merge(theLanguage);
        return dbLanguage;
    }
}
