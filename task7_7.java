package com.assignment;

public class task7_7 {



	public static void main(String[] args)
	{
		String str = "abC";
		int n = str.length();
		task7_7 permutation = new task7_7();
		permutation.permute(str, 0, n - 1);                                  //abc,0,3
	}

	private void permute(String str, int L, int R)
	{
		if (L == R)
		{
			//System.out.print(L +" " + R);
			System.out.print(str +" ");
		
		}
		else {
			for (int i = L; i <= R; i++)
			{     
				str = swap(str, L, i);                      
				
				permute(str, L + 1, R);                   // permute(abc,1,3)          acb
   				str = swap(str, L, i);					// 
			}
		}
	}

	public String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}


//This code is contributed by Mihir Joshi

