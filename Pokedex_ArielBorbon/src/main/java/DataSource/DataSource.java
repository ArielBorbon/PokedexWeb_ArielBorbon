/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSource;

import Pokemon.Tipos_Pokemon;
import Pokemon.pokemonDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC Gamer
 */
public class DataSource {

    private static DataSource instancia = new DataSource();
    private List<pokemonDTO> listaPokemones = new ArrayList<>();

    private DataSource() {
        añadirPokemonesDePrueba();
    }

    public static DataSource getInstancia() {
        return instancia;
    }

    public List<pokemonDTO> getListaPokemones() {
        return listaPokemones;
    }

    private void añadirPokemonesDePrueba() {
        listaPokemones.add(new pokemonDTO("Charmander", 4, Tipos_Pokemon.Fuego, "imgs/charmander.png"));
        listaPokemones.add(new pokemonDTO("Squirtle", 7, Tipos_Pokemon.Agua, "imgs/squirtle.png"));
        listaPokemones.add(new pokemonDTO("Bulbasaur", 1, Tipos_Pokemon.Planta, "imgs/bulbasaur.png"));
        listaPokemones.add(new pokemonDTO("Pikachu", 25, Tipos_Pokemon.Electrico, "imgs/pikachu.png"));
        listaPokemones.add(new pokemonDTO("Geodude", 74, Tipos_Pokemon.Roca, "imgs/geodude.png"));
        listaPokemones.add(new pokemonDTO("Darkrai", 491, Tipos_Pokemon.Siniestro, "imgs/darkrai.png"));
    }

}
