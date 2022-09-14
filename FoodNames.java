class FoodNames
{
	public static void main(String [] args)
	{
		String Item1="Pizza";
		String Item2="Pasta";
		String  Item3="noodels";
		String Item4="Gobi";
		String Item5="Sandwich";
		String Item6="Icecream";
		String Item7="Panipuri";
		String Item8="upma";
		String Item9="Biryani";
		String Item10="Dosa";
		String Item11="Idli";
		String Item12="Pongal";
		String Item13="bisibele bath";
	String[]Foodname={Item1,Item2,Item3,Item4,Item5,Item6,Item7,Item8,Item9,Item10,Item11,Item12,Item13};
	System.out.println("No of Fooditems is :"+Foodname.length);
		for(int Food=1;Food<Foodname.length;Food++)
		{
			Foodname[3]="Pulav";
			Foodname[7]="Apple";
			System.out.println("No of Foodname is :"+Foodname[Food]);
		}
		
	}
}
