package ProblemAtRunTime;

public class E2 {
/*public static void main(String[] args) throws InterruptedException {
	for(int i=0;i<=3;i++)
	{
		System.out.println("I hate my country");
		Thread.sleep(3000);
	}*/
	
	public static void main(String[] args)  {
		for(int i=0;i<=3;i++)
		{
			System.out.println("I hate my country");
			try {
			Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println();
//				print
			}
		}
	
	} 
}
