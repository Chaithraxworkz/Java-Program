class GroceryStoreRunner
{
	public static void main(String [] args)
	{
		System.out.println("Entering the Main");
		
		GroceryStore.setShoapName("Shankar Stores");
		GroceryStore.setLocation("Arasikere");
		GroceryStore.setItem("Rice");
		GroceryStore.setPrice(50);
		GroceryStore.setType("Provision");
		GroceryStore.setSize(25d);
		GroceryStore.setHomeDelivery(true);
		GroceryStore.setSelfService(true);
		GroceryStore.setNoOfStaff(2);
		GroceryStore.setRent(10000D);
		GroceryStore.setBilling(5d);
		
		
		
		String ref=GroceryStore.getShoapName();
		System.out.println(ref);
		
		String ref1=GroceryStore.getLocation();
		System.out.println(ref1);
		
		String ref2=GroceryStore.getItem();
		System.out.println(ref2);
		
		int ref3=GroceryStore.getPrice();
		System.out.println(ref3);
		
		String ref4=GroceryStore.getType();
		System.out.println(ref4);
		
		double ref5=GroceryStore.getSize();
		System.out.println(ref5);
		
		boolean ref6=GroceryStore.getHomeDelivery();
		System.out.println(ref6);
		
		boolean ref7=GroceryStore.getSelfService();
		System.out.println(ref7);
		
		int ref8=GroceryStore.getNoOfStaff();
		System.out.println(ref8);
		
		double ref9=GroceryStore.getRent();
		System.out.println(ref9);
		
		double ref10=GroceryStore.getBilling();
		System.out.println(ref10);
		
	
	System.out.println("Ending the Main");
	}
}