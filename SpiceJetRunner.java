class SpiceJetRunner
{
	public static void main(String[] args)
	{
		System.out.println("Main start");
		
		String[] flightNos={"AIC101","AIC102","AIC104","AI672","AI268","AI822","AI768","AI687","AI903","AI541"};
		
		SpiceJet.flightNos(flightNos);
		
		System.out.println("Main end");
	}
}