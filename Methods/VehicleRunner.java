class VehicleRunner
{
	public static void main(String[] args)
	{
		double ref=Vehicle.Transport( "Mandya","Hassan");
		System.out.println(ref);
	
		double ref1=Vehicle.Transport("Mandya","Hassan", 4.50f);
		System.out.println(ref1);
	
		boolean ref2=Vehicle.Transport("Shivamogga");
		System.out.println(ref2);
		
		boolean ref3=Vehicle.Transport("Shivamogga", 8.00f);
		System.out.println(ref3);
		
		boolean ref4=Vehicle.Transport(11.20f);
		System.out.println(ref4);
		
	}
	
}