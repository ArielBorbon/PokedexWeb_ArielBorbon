/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

/**
 *
 * @author PC Gamer
 */
public class pokemonDTO {
   private String nombre;
   private int numero;
   private Tipos_Pokemon tipo;
   private String urlImagen;

    public pokemonDTO() {
    }

    public pokemonDTO(String nombre, int numero, Tipos_Pokemon tipo, String urlImagen) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Tipos_Pokemon getTipo() {
        return tipo;
    }

    public void setTipo(Tipos_Pokemon tipo) {
        this.tipo = tipo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
   
   
   
}
