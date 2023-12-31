/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author usuario
 */
public class Pruebas {
    public static void main(String[] args) {
        String originalString = "Tu cadena de texto aquí,?";
        String modifiedString = originalString.replaceAll("[^-_¿? ;]", "_");
        String[] words = modifiedString.split("");
        modifiedString = String.join(" ", words);
        System.out.println(modifiedString);
        System.out.println(modifiedString);
    }
}
