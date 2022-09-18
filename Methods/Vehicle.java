class Vehicle
{
	static double Transport(String source , String destination)
	{
		System.out.println("entered transport source , destination");
		if(source=="Mandy"&& destination=="Hassan")
		{
			return 350d;
		}
		return 0;
	}

		static double Transport(String source , String destination , float ontime)
		{
			if(ontime==4.50f)
			{
				return 450d;
			}
		return 0;
	}
	
	static boolean Transport(String destination)
	{
		if(destination=="Shivamogga")
		{
			return false;
		}
		return false;
	}
	
	static boolean Transport(String destination , float ontime)
	{
		if(ontime==8.00f)
		{
			return true;
		}
		return false;
	}
	
	static boolean Transport(float ontime)
	{
		if(ontime==11.20f)
		{
			return false;
		}
		return false;
	}
}
