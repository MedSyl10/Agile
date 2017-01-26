package com.tpju.classes;

import java.util.LinkedList;
import java.util.List;

import com.tpju.classes.Joueur;

/**
 * Write a description of class Manager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manager
{
    // instance variables - replace the example below with your own
    //private Joueur joueur;
    private List<Joueur> listeJoueurs;

    /**
     * Constructor for objects of class Manager
     */
    public Manager()
    {
        // initialise instance variables
    	listeJoueurs = new LinkedList<Joueur>();
        //joueur = new Joueur();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addJoueur(Joueur _joueur){
        //joueur = _joueur;
    	listeJoueurs.add(_joueur);   
    }
    
    public String getJoueur(){
    	String liste = "Je suis l'agent de : ";
    	for(Joueur _joueur: listeJoueurs){
    		liste+=_joueur.getPrenom() + " " + _joueur.getNom() + " ";
    	}
    	return liste;
    }
    
}
