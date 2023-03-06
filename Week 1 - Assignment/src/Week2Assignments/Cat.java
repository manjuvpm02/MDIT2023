package Week2Assignments;

class Cat {
	
	int moodIndex=50;
	int hungerIndex=50;
	int energyIndex=50;
	
	
	
	public void sleep() 
	{
		
		energyIndex=energyIndex+10;
		
	}
	
	public void play() 
	{
		
		moodIndex=moodIndex+10;
		hungerIndex=hungerIndex+5;
		energyIndex=energyIndex-20;
		
	}
	
	public void eat() 
	{
		
		energyIndex=energyIndex+20;
		
	}
	
	public void digest() 
	{
		
		moodIndex=moodIndex+5;
		
	}
	
	public void CurrentData()
	{
		System.out.println("Cats current Energy index is - "+energyIndex);
		System.out.println("Cats current Mood index is - "+moodIndex);
		System.out.println("Cats current Hunger index is - "+hungerIndex);
	}
	
	

}
