package com.training.exampe;

public class Main {

    public static void main(String[] args) {
        Magasin magasin = new Magasin();
        magasin.augmenterBilan(200f);
        magasin.ajouterProduit("truc", 20f, 30f);
        magasin.acheterProduit(0, 10);
        magasin.vendreProduit(0, 8);
        System.out.println(magasin.getStock());
        System.out.println(magasin.getBilan());
    }
}
