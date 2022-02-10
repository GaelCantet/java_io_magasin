package com.training.exampe;

public class Livre extends Produit{
    private String auteur;
    private String editeur;

    public Livre(String nom, float prixAchat, float prixVente, String auteur, String editeur) {
        super(nom, prixAchat, prixVente);
        this.auteur = auteur;
        this.editeur = editeur;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }
}
