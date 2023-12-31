/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Operaciones {

    private ArrayList<String> frases = new ArrayList();
    private String intermedio;
    private String frase;

    Operaciones() {
        frases.add("a tal punto");
        frases.add("Por mi parte ");
        frases.add("Según las fuentes");
        frases.add("a continuación ");
        frases.add("a ese respecto");
        frases.add("a la caza de");
        frases.add("a la vez que");
        frases.add("a lo largo");
        frases.add("a lo que");
        frases.add("a medida que");
        frases.add("a nadie le gusta");
        frases.add("a nuestro gusto");
        frases.add("a punto de");
        frases.add("a tal efecto");
        frases.add("a tal efecto en el que");
        frases.add("a tan solo");
        frases.add("afectados por");
        frases.add("al hacer esto");
        frases.add("al parecer");
        frases.add("alguien más");
        frases.add("alguno de esos");
        frases.add("apoyado en su artillería de largo");
        frases.add("argumentalmente hablando");
        frases.add("aún más");
        frases.add("cada uno de estos");
        frases.add("capaz de cualquier cosa");
        frases.add("como debería ser");
        frases.add("como era de esperar");
        frases.add("como tal");
        frases.add("como ya sabéis");
        frases.add("con mayor frecuencia");
        frases.add("correr el riesgo");

    }

    public void iniciarJuego() {
        obtenerFrase(fraseAleatoria());
        convertirGuion();
    }

    public void convertirGuion() {
        intermedio = frase.replaceAll("[^ -_¿?]", "_");
    }

    public int fraseAleatoria() {
        return (int) (Math.random() * frases.size());
    }

    public void obtenerFrase(int i) {
        frase = frases.get(i);

    }

    /* public void convertirGuion(){
         String originalString = "Tu cadena de texto aquí,?";
        String modifiedString = originalString.replaceAll("[^-_¿? ;]", "_");
        this.intermedio=modifiedString;
     }*/
    public String getMostrarGuion() {
        String[] words = intermedio.split("");
        String modifiedString = String.join(" ", words);
        return modifiedString;
    }

    public String getStringNumeros() {
        String originalString = intermedio;
        for (int i = 1; i < intermedio.length(); i++) {
            originalString = originalString.replaceFirst("_", String.valueOf(i)+" ");
        }
        return originalString;
        //System.out.println(originalString);
    }

    public boolean comprobarString(String str) {
        if (str.equals(frase)) {
            return true;
        } else {
            return false;
        }
    }

    public String getFrase() {
        return frase;
    }

    public int comprobarCaracterJava(int lugar, char c) {
        int puntuacion=0;
        try {
            String str = "";
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == c && intermedio.charAt(i)=='_') {
                    str = str + c;
                    puntuacion++;
                } else {
                    str = str + intermedio.charAt(i);
                }
            }
            intermedio = str;
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return puntuacion;
    }

    public String getIntermedio() {
        return intermedio;
    }

    public void setIntermedio(String intermedio) {
        this.intermedio = intermedio;
    }

    public ArrayList<String> getFrases() {
        return frases;
    }

}
