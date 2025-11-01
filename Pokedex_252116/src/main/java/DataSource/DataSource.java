/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSource;

import Pokemon.Tipos_Pokemon;
import Pokemon.pokemonDTO;
import java.util.List;

/**
 *
 * @author PC Gamer
 */
public class DataSource {
    
    
    private static DataSource instancia = new DataSource();
    private List<pokemonDTO> listaPokemones;

    private DataSource() {
        añadirPokemonesDePrueba();
    }

    public static DataSource getInstancia() {
        return instancia;
    }

    public List<pokemonDTO> getListaPokemones() {
        return listaPokemones;
    }
    
    
    
    
    
    private void añadirPokemonesDePrueba(){
        listaPokemones.add(new pokemonDTO("Charmander" , 4 , Tipos_Pokemon.Fuego , "charmander.png"));
        listaPokemones.add(new pokemonDTO("Squirtle" , 7 , Tipos_Pokemon.Agua , "squirtle.png"));
        listaPokemones.add(new pokemonDTO("Bulbasour" , 1 , Tipos_Pokemon.Planta , "bulbasour.png"));
        listaPokemones.add(new pokemonDTO("Pikachu" , 25 , Tipos_Pokemon.Electrico , "pikachu.png"));
        listaPokemones.add(new pokemonDTO("Geodude" , 74 , Tipos_Pokemon.Roca , "geodude.png"));
        listaPokemones.add(new pokemonDTO("Darkrai" , 491 , Tipos_Pokemon.Siniestro , "darkrai.png"));
    }
    
    
    
    
    
    
}
