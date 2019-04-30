package com.example.pokedex.pokeapi;

import com.example.pokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon/")
    Call<PokemonRespuesta> obtenerListaPokemon();
}
