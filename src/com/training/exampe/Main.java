package com.training.exampe;

public class Main {

    public static void main(String[] args) {
        Magasin magasin = new Magasin();
        magasin.augmenterBilan(200f);
        magasin.ajouterProduit("truc", 20f, 30f);
        magasin.acheterProduit(0, 10);
        magasin.vendreProduit(0, 8);
        magasin.ajouterLivre("hello world", 10f, 15f, "machin", "bidule");
        magasin.ajouterCd("A night at the opera", 8f, 12f, "Queen", "Mercury");
        magasin.displayStock();
        System.out.println(magasin.getBilan());
    }
}
