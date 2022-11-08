package com.example.foodfact;

import java.io.IOException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import components.RecupFichier;
import entities.Produit;

public class FoodFactApplication {

	public static void main(String[] args) throws IOException {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("open-food");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction transaction = em.getTransaction();
		
		RecupFichier recupFichier = new RecupFichier();
		recupFichier.getInstance();
	
		
		
		
        Produit produit = new Produit();
        
        
        produit =(Produit) em.find(Produit.class, 4);
			System.out.println(produit.getNom()+", "+produit.getMarque().getNom()+", "+produit.getCategorie().getLibelle());
			}		
	}
