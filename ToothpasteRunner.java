class ToothpasteRunner
{
	public static void main(String[] paste)
	{
		System.out.println("Main start aytu");
		
		
		Toothpaste.setBrand("colgate");
		Toothpaste.setColor("White");
		Toothpaste.setGram(200d);
		Toothpaste.setPrice(40);
		Toothpaste.setExpiryDate("31-12-2022");
		Toothpaste.setFlavor("Salt");
		Toothpaste.setMolecularFormula(C12H7Cl3FNaO2);
		Toothpaste.setSize("Medium");
		Toothpaste.setManufacturedDate("01-12-2021");
		Toothpaste.setPurpose("Oral Hygine");
		Toothpaste.setbBatchNo(B60);
		Toothpaste.setMolecularWeight(331.5f);
		
		
		String ref=Toothpaste.getBrand();
		System.out.println(ref);
		
		String ref1=Toothpaste.getColor();
		System.out.println(ref1);
		
		double ref2=Toothpaste.getGram();
		System.out.println(ref2);
		
		int ref3=Toothpaste.getPrice();
		System.out.println(ref3);
		
		String ref4=Toothpaste.getExpiryDate();
		System.out.println(ref4);
		
		int ref5=Toothpaste.getFlavor();
		System.out.println(ref5);
		
		String ref6=Toothpaste.getMolecularFormula();
		System.out.println(ref6);
		
		int ref7=Toothpaste.getSize();
		System.out.println(ref7);
		
		String ref8=Toothpaste.getManufacturedDate();
		System.out.println(ref8);
		
		int ref9=Toothpaste.getPurpose();
		System.out.println(ref9);
		
		String ref10=Toothpaste.getBatchNo();
		System.out.println(ref10);
		
		int ref11=Toothpaste.getMolecularWeight();
		System.out.println(ref11);
		
		System.out.println("Close main ");
	}
	
}