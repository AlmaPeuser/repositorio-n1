/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musica;

import java.util.Scanner;

/**
 *
 * @author AlmaPeuser
 */
public class Ejecutable {
    
    public static void main(String [] args){
        String nombregenero;
        Scanner  input = new Scanner (System.in);
        System.out.print("Ingrese el genero");
        nombregenero = input.nextLine();
  
        String nombre;
        System.out.print("ingrese el nombre");
        nombre = input.nextLine();
        
        
        String artista;
        System.out.print("ingrese el nombre del artista");
        artista = input.nextLine();
        
        String tiempodeDuracion;
        System.out.print("ingrese el tiempo de duracion");
        tiempodeDuracion = input.nextLine();
        
        int codigo;
        Scanner input1 = new Scanner (System.in);
        System.out.print("ingrese el codigo");
        codigo = input1.nextInt();
        
        Musica m1 = new Musica();
        
        m1.setGenero(nombregenero);
        m1.setNombre(nombre);
        m1.setArtista(artista);
        m1.setTiempoDuracion(tiempodeDuracion);
        m1.setCodigo(codigo);
        
        System.out.print("Ingrese otro genero");
        nombregenero = input.nextLine();
        
        System.out.print("ingrese otro nombre");
        nombre = input.nextLine();
        
        System.out.print("ingrese otro nombre del artista");
        artista = input.nextLine();
        
         System.out.print("ingrese otro tiempo de duracion");
        tiempodeDuracion = input.nextLine();
        
         System.out.print("ingrese otro codigo");
        codigo = input1.nextInt();
        
      Musica m2 = new Musica(nombre, artista, tiempodeDuracion, codigo,1, nombregenero);
                
        
        System.out.println("musica: " + m1.toString());
        System.out.println("musica: " + m2.toString());
    }
}
        