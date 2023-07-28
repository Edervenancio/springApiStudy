package com.example.projetoapi.languagesCrud.Rest;

import com.example.projetoapi.languagesCrud.Entity.Language;
import com.example.projetoapi.languagesCrud.Service.LanguageService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class RestLanguageController {



    private LanguageService languageService;

    public RestLanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/language")
    public Language addLanguage(@RequestBody Language theLanguage){

        theLanguage.setIdLanguage(0);

        Language addLanguage = languageService.save(theLanguage);

        return addLanguage;

    }

    @GetMapping("/teste")
    public String teste(){
        return "teste";
    }


}
