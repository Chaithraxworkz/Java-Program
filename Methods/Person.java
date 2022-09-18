class Person{


	static void workforOffice(String company ,double salary)

	{
		System.out.println("entered workforOffice company and salary");
		if(company=="Wipro"&& salary==500000d)
		{
			return 500000d;
			System.out.println("Company name is :"+company+" Salary is :"+salary);
		}

	}
	static void workforOffice(String company ,double salary,String designation)
	{
		System.out.println(" Entered workforOffice Company Salary and Designation");
		{
			System.out.println("Company is :"+company+"  Salary is :"+salary+"  designation is  :"+designation);
		}
	}
}
