package com.tpju.classes;

/**
 * Write a description of class Joueur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Joueur
{
    // instance variables - replace the example below with your own
    private String nom;
    private String prenom;
    private Manager manager;
    
    
    /**
     * Constructor for objects of class Joueur
     */
    public Joueur()
    {
        // initialise instance variables
        
    } 
    
    public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    
    
    
    
    
}
