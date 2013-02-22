package classes;

public class test 
{
	public static void main(String[] args)
	{
		int p;
		int n = 10;
		
		int[] T  = new int[n];
		for(int k=1;k < n;k++)
			T[k] = 1;
		for(int k=2;k < Math.sqrt(n);k++)
		{
			if(T[k]==1)
			{
				p=2;
				//en algo le boucle commence par indice = 1
				// donc mettre p*k <= n
				while(p*k < n)
				{
					T[p*k] = 0;
					p += 1;
				}
			}
		}
		
		for (int k=2 ; k < n ; k++)
		{
			if(T[k]==1)
				System.out.println(k);
		}
		System.out.println(Math.sqrt(4));
	}
}
