package test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import classes.*;


public class TestIntSet
{
    
    IntSet intset ; 
    
    @Before
    public void setUp() 
    {
        intset = new IntTab();

        int[] tableauTest = {2,5,6,9,7,10,64,91};

        for (int i = 0 ; i < tableauTest.length; i ++)
            intset.add(tableauTest[i]);
    }
    
    
    @Test
    public void testAdd()
    {
        
        intset.add(2);
        assertTrue("Ajout Fail sur tableauTestAjout", intset.size()==8 );
    }

    @Test
    public void testContains()
    {
        assertTrue(" Ne contient pas 91 ", intset.contains(91));
    }

    @Test
    public void testRemove()
    {
        intset.remove(1);
        assertTrue("L'element 1 n'a pas été remove()", intset.contains(2));
    }

    @Test
    public void testSize()
    {
        assertTrue("Taille fail", intset.size()==8);
    }

}
