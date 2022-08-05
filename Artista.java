/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musica;

/**
 *
 * @author AlmaPeuser
 */
public class Artista {
    
  private String nombre;
  private int cod;
  
  public Artista(String nombre, int cod){
      this.nombre=nombre;
      this.cod=cod;
      
  }
  //contrustores
  
  public Artista () {
      this.nombre="";
      this.cod=0;
  }
  //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
  public String ToString(){
        return "su cod es:" + cod+ 
                "|el nombre es:" + nombre;
}
}
