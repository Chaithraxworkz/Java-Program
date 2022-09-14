class StringReverse
{
	
	public static void main(String[]  args)
	{
		String[] originalArray={"Pen","Phone","Watch","Bag","Bottle","Price"};
		System.out.println("original array elements");
		for(int i=0; i<originalArray.length;i++)
		{
			String ref=originalArray[i];
			System.out.println(ref);
		}
					System.out.println("\n\n");
					System.out.println("reverse order array elements");
					for(int  j=originalArray.length-1;j>=0;j--)
					{						
						String rev=originalArray[j];
						System.out.println(rev);
					}
						
	}
}