import java.util.Scanner;

public class BiscuitsFactory 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		int ourBiscuits = Integer.parseInt(sc.nextLine());	
		int workers = Integer.parseInt(sc.nextLine());
		int otherBiscuits = Integer.parseInt(sc.nextLine());
		
		double ourBiscPerMonth = 20*ourBiscuits*workers + Math.floor(ourBiscuits*workers*0.75)*10;
		//double ourBiscPerMonth = 20*ourBiscuits*workers + Math.floor((10*ourBiscuits*workers)*0.75); - WRONG
		 
		double percentage = (ourBiscPerMonth/otherBiscuits)*100;
		
		//System.out.println("You have produced " + ourBiscPerMonth + " biscuits for the past month.");
		System.out.printf("You have produced %.0f biscuits for the past month.%n", ourBiscPerMonth);
		
		if(percentage > 100){
			System.out.printf("You produce %.2f percent more biscuits.", percentage - 100.0);	
		}else{
			System.out.printf("You produce %.2f percent less biscuits.",100.0 - percentage);
		}
    }
}