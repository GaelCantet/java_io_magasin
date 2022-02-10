package com.training.exampe;

public class Cd extends Produit{
    String auteur;
    String interprete;

    public Cd(String nom, float prixAchat, float prixVente, String auteur, String interprete) {
        super(nom, prixAchat, prixVente);
        this.auteur = auteur;
        this.interprete = interprete;
    }
}
