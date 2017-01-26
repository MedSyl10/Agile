package com.tpju.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tpju.classes.Manager;
import com.tpju.classes.Joueur;

/**
 * The test class JoueurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JoueurTest extends junit.framework.TestCase
{
    private Joueur joueur1;
    private Joueur joueur2;
    private Manager manager1;

    /**
     * Default constructor for test class JoueurTest
     */
    public JoueurTest()
    {
    	
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        joueur1 = new Joueur();
        joueur2 = new Joueur();
        manager1 = new Manager();
        
        joueur1.setNom("messi");
        joueur1.setPrenom("lionel");
        
        joueur2.setNom("ronaldo");
        joueur2.setPrenom("cristiano");
        
        manager1.addJoueur(joueur1);
        manager1.addJoueur(joueur2);

        manager1.getJoueur();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testNom()
    {
        assertEquals("messi", joueur1.getNom());
    }

    @Test
    public void testPrenom()
    {
        assertEquals("lionel", joueur1.getPrenom());
    }

    @Test
    public void testManager()
    {
        testXXX();
    }

	public void testXXX() {
		assertEquals("messi", joueur1.getNom());
        assertEquals("lionel", joueur1.getPrenom());
        assertEquals("Je suis l'agent de : lionel messi cristiano ronaldo ", manager1.getJoueur());
	}
}



