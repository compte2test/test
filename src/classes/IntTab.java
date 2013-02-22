package classes;

import java.util.Vector;



public class IntTab implements IntSet
{
	//le type interger correspond au type primitif int
	// il y a donc une conversion implicite par le compilateur
	
	private Vector<Integer> tab;
	
	public IntTab()
	{
		tab = new Vector<Integer>();
		Vector<Character> car = new Vector<Character>();
		car.add('a');
	}
	
	@Override
	public void add(int n)
	{
		if(!tab.contains(n))
			tab.add(n);
	}

	@Override
	public boolean contains(int n)
	{
		return tab.contains(n);
	}

	@Override
	public void remove(int n)
	{
		tab.removeElement(n);
		//tab.remove(n);
	}

	@Override
	public int size()
	{
		return tab.size();
	}

}
