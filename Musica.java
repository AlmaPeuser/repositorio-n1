/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.musica;

/**
 *
 * @author AlmaPeuser
 */
public class Musica {

   private Genero genero;
   private String nombre;
   private Artista artista;
   private String tiempoDuracion;
   private int codigo;
  
public Musica(){
    
       this.genero=new Genero();
       this.nombre="";
       this.artista=new Artista();
       this.tiempoDuracion="";
       this.codigo=0;
   
}
    public Musica(String nombre, String artista, String tiempoDuracion, int codigo, int cod,String tipo){
   
   this.genero= new Genero(tipo, cod);
   this.nombre= nombre;
   this.artista= new Artista(nombre,cod);
   this.tiempoDuracion= tiempoDuracion;
   this.codigo= codigo;
    
    }
    //getters y setters

    public String getGenero() {
        return genero.getTipo();
    }

    public void setGenero(String genero) {
        this.genero.setTipo(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista.getNombre();
    }

    public void setArtista(String artista) {
        this.artista.setNombre(artista);
    }

    public String getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(String tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
   public String toString() {
       return "genero de la musica: " + genero+ "| nombre de la cancion: " + nombre+ "| el artista es: " + artista
             + "| tiempo de duracion: " + tiempoDuracion+ "| codigo: " + codigo;
   } 
}
