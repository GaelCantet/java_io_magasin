package com.training.exampe;

public class Produit {
    private String nom;
    private String description = "Pas de description";
    private int quantite = 0;
    private float prixAchat;
    private float prixVente;

    public Produit(String nom, float prixAchat, float prixVente) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    @Override
    public String toString() {
        return this.getNom() + ",  " + this.getDescription() + ", prix d'achat: " + this.getPrixAchat() + ", prix de vente: " + this.getPrixVente() + ", quantité: " + this.getQuantite();
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

    public void augmenterQuantite(int value) {
        this.quantite += value;
    }

    public void diminuerQuantite(int value) {
        this.quantite -= value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
