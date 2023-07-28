package com.example.projetoapi.languagesCrud.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="language")
@Setter
@Getter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLanguage")
    private int idLanguage;


    @Column(name="languagename")
    private String languageName;


    @Column(name="languagehelloworld")
    private String languageHelloWorld;


}
