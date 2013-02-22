package test;

import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.IntSet;
import classes.IntTab;


public class TestIntTab
{
	private IntSet is;
	
	@Before
	public void setUp() throws Exception
	{
		is = new IntTab();
	}

	
	@Test
	public void testAdd()
	{
		is.add(2);
		is.add(2);
		assertTrue("is != 1",is.size()==1);
		is.add(234);
		is.remove(2);
		assertTrue("is != 1",is.size()==1);
	}

	@Test
	public void testContains()
	{
		is.add(1);
		is.add(2);
		is.add(2);
		is.remove(2);
		assertTrue("is contient toujours 2",!is.contains(2));
	}

	@Test
	public void testRemove()
	{
		is.add(2);
		is.add(1);
		assertTrue("is ne contient pas  1",is.contains(1));
		is.remove(1);
		assertTrue("is contient pas  1",!is.contains(1));
	}

	@Test
	public void testSize()
	{
		is.add(1);
		is.add(1);
		is.add(1);
		assertTrue("is != 1",is.size()==1);
		is.add(2);
		is.add(5);
		is.remove(1);
		assertTrue("is != 2 ",is.size()==2);
	}

}
