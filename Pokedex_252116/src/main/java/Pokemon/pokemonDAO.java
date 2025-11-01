/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

import DataSource.DataSource;
import java.util.List;

/**
 *
 * @author PC Gamer
 */
public class pokemonDAO {
    
    public List<pokemonDTO> obtenerListaPokemones(){
        return DataSource.getInstancia().getListaPokemones();
    }
    
    
    public pokemonDTO añadirPokemon (pokemonDTO pokemon){
        
        String errores = "";
        
        if (pokemon.getNumero() < 0 || pokemon.getNumero() > 1025 ) {
            errores += "Numero no registrado en la pokedex...";
        }
        
        if (pokemon.getNombre() == null || pokemon.getNombre().length() < 2) {
            errores += "Nombre muy Corto o Vacio...";
        }
        
        if (pokemon.getTipo() == null) {
            errores += "Seleccione el tipo del pokemon...";
        }
        
        if (pokemon.getUrlImagen().isEmpty() || pokemon.getUrlImagen() == null) {
            errores += "url no encontrada";
        }
        
        if (errores.isEmpty()) {
            return null; //pendiente esto es de cale para pasarlo despues al servlet
        }else{
            
        
        
        DataSource.getInstancia().getListaPokemones().add(pokemon);
        return pokemon;
        }
    }
    
    
    
    
    
    
    
}
