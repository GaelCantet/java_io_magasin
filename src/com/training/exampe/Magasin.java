package com.training.exampe;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private List<Produit> stock = new ArrayList<Produit>();
    private float bilan = 0f;

    public float getBilan() {
        return bilan;
    }

    public void augmenterBilan(float value) {
        this.bilan += value;
    }

    public void diminuerBilan(float value) {
        this.bilan -= value;
    }

    public List<Produit> getStock() {
        return stock;
    }

    public void setStock(Produit produit) {
        this.stock.add(produit);
    }

    public void ajouterProduit(String nom, float prixAchat, float prixVente) {
        Produit produit = new Produit(nom, prixAchat, prixVente);
        this.setStock(produit);
    }

    public void acheterProduit(int referenceProduit, int quantiteProduit) {
        try {
            Produit produit = this.stock.get(referenceProduit);
            float prix = produit.getPrixAchat() * quantiteProduit;
            if (this.getBilan() < prix) {
                System.out.println("Le bilan ne permet d'acheter ce produit en cette quantité");
            } else {
                produit.augmenterQuantite(quantiteProduit);
                this.diminuerBilan(prix);
            }
        } catch (NullPointerException e) {
            System.out.println("Aucun produit enregistré à cette référence");
        }
    }

    public void vendreProduit(int referenceProduit, int quantiteProduit) {
        try {
            Produit produit = this.stock.get(referenceProduit);
            float prix = produit.getPrixVente() * quantiteProduit;
            if (produit.getQuantite() < quantiteProduit) {
                System.out.println("Pas assez de produit pour cette quantité");
            } else {
                produit.diminuerQuantite(quantiteProduit);
                this.augmenterBilan(prix);
            }
        } catch (NullPointerException e) {
            System.out.println("Aucun produit enregistré à cette référence");
        }
    }
}
