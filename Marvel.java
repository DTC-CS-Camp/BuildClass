class Marvel
{
	//It's time to once again assemble the Avengers!
	//private instance variables:
	private static String avengerName = "";
	private static int numInfinityStone = 6; //Keeps track of # stones Thanos has
	private static int hoursTillEnd = (int) (Math.random() * 100); 
  //Keeps track of how long the Avengers have left to save the world
	//hopefully they'll save it in time.....
	/*public Marvel(String name, Double hourEnd) 
	{
		avengerName = name; //avenger
		numInfinityStone = 6; //initial number of infinity stones
		hoursTillEnd = hourEnd; //the avengers have 24 hours to save the world
	}
	*/
	//Once again, Thanos has somehow acquired all 6 infinity stones!!!! In order to save the world, that number of infinity stones has to reduce to 0 before the time is up, otherwise the world will end!!!!!!
	public static void run() 
	{
		System.out.println("It's time to once again assemble the Avengers!");
		System.out.println("Once again, Thanos has somehow acquired all 6 infinity stones!!! In order to save the world, the number of infinity stones has to reduce to 0 before the time is up, otherwise the world will end!!!!");
		System.out.println("First, enter an avenger name in the setName() method. Then enter an int value for how much of a change you want in the # of hours the avengers have left to save the world in setHour().");
	}
	public static void setName(String name) 
	{
		avengerName += name;
	}
	public static void setHour(int change) //allows the user to change the # of hours till worldEnd
	{
		if(change < 101) 
		{
			hoursTillEnd += change;
		}
		else 
		{
			hoursTillEnd -= change;
		}
	}
	public static void changeNumStone() 
	{
		int count = 0;
		while(numInfinityStone == 6) 
		{
			if(hoursTillEnd % 2 == 0) 
			{
				hoursTillEnd --;
				if(count > 10) 
				{
					numInfinityStone = 5;
				}
				
			}
			else 
			{
				hoursTillEnd--;
				if(count > 10) 
				{
					numInfinityStone = 0;
				}
			}
			count++;
		}
	}
	public static boolean end() 
	{
		if(numInfinityStone == 0) 
		{
			System.out.println("Congratulations! " + avengerName + " saved the world in time!!!!!");
      //System.out.println(hoursTillEnd);
			return true;
		}
		else 
		{
			System.out.println("Oh no! " + avengerName + " failed to save the world in time, and Thanos won. :(");
      //System.out.println(hoursTillEnd);
			return false;
		}
	}
}