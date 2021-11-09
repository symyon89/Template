package com.company;

public class Main {

    public static void main(String[] args) {
	ListaEchipamente listaEchipamente = new ListaEchipamente();
    listaEchipamente.adaugaEchipamente();
    listaEchipamente.afisareEchipamente();
    System.out.println();
    listaEchipamente.afisareDupaTip();
    System.out.println();
    listaEchipamente.afisareDupaNume();
    }
}
