class GroceryStoreRunner
{
	public static void main(String [] args)
	{
		System.out.println("Entering the Main");
		
		GroceryStore.setShoapName("Shankar Stores");
		GroceryStore.setLocation("Arasikere");
		GroceryStore.setItem("Rice");
		GroceryStore.setPrice(1050L);
		GroceryStore.setType("Provision");
		GroceryStore.setSize("25kg");
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
		
		String ref3=GroceryStore.getPrice();
		System.out.println(ref3);
		
		String ref4=GroceryStore.getType();
		System.out.println(ref4);
		
		String ref5=GroceryStore.getSize();
		System.out.println(ref5);
		
		String ref6=GroceryStore.getHomeDelivery();
		System.out.println(ref6);
		
		String ref7=GroceryStore.getSelfService();
		System.out.println(ref7);
		
		String ref8=GroceryStore.getNoOfStaff();
		System.out.println(ref8);
		
		String ref9=GroceryStore.getRent();
		System.out.println(ref9);
		
		String ref10=GroceryStore.getBilling();
		System.out.println(ref10);
		
	
	System.out.println("Ending the Main");
	}
}