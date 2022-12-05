package com.example.apirest.Utils;

public class Apis {

    public static final String URL_001="https://dog.ceo/api/breeds/image/";

    public static PersonaService getPersonaService(){
        return  Cliente.getClient(URL_001).create(PersonaService.class);
    }
}
