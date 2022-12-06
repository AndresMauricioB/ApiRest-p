package com.example.apirest.Utils;

import com.example.apirest.Model.Persona;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PersonaService {
   /* @Headers({"application-type: application/json",
    "Content-Type: application/json"})*/
    @GET("episode/10,28")
    Call<List<Persona>> getPersonas();


}
