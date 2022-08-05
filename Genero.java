package com.mycompany.musica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AlmaPeuser
 */
public class Genero {
  private String tipo;
  private int cod;
  
  public Genero(String tipo, int cod){
      this.tipo=tipo;
      this.cod=cod;
      
  }
  //contrustores
  
  public Genero () {
      this.tipo="";
      this.cod=0;
  }
  
  //geters y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
  
  public String ToString(){
        return "su cod es:" + cod+ 
                "|el tipo es:" + tipo;
  }
}

