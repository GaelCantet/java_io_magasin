package com.training.exampe;

public class Produit {
    private String nom;
    private String description = "Pas de description";
    private int quantite = 0;
    private float prixAchat;
    private float prixVente;

    public void Produit(String nom, float prixAchat, float prixVente) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public String getNom() {
        return nom;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
