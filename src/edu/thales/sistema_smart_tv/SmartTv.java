package edu.thales.sistema_smart_tv;

public class SmartTv {
    Boolean ligada = false;
    Integer canal = 1;
    Integer volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println(" Diminuindo volume para: " + volume);
    }
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;

    }

    public void mudarCanal( int novoCanal) {
        canal = novoCanal;
    }
}
