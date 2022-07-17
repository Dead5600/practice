package practice;
import java.util.Scanner;

public class Store {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(".......Welcome to snack centre........");
		boolean run = true;
		
		int ch,quantity, teaQun = 0,GTqun = 0, samosaqun = 0, Sandqun = 0;
		
		do {	System.out.println("\n\n1. Tea(10RS)");
				System.out.println("2. Green Tea (15 RS)");
				System.out.println("3. Samosa (20 RS)");
				System.out.println("4. Sandwitch (50RS)");
				System.out.println("5. Generate bill and exit");
				
				System.out.print("\nEnter your choice : ");
					ch = sc.nextInt();
				
				if (ch>0 && ch<5)
				{
					System.out.print("Enter quantity : ");
						quantity = sc.nextInt();
						
					switch(ch)
					{
					case 1 : teaQun = teaQun + quantity;
								break;
					case 2 : GTqun = GTqun + quantity;
								break;
					case 3 : samosaqun = samosaqun + quantity;
								break;
					case 4 : Sandqun = Sandqun + quantity;
								break;
					}
				}
				else if(ch ==5)
				{
					System.out.println(".................BIll...................");
					int teaTot = teaQun * 10;
					if (teaQun > 0) 
						
						System.out.println("\n Tea		"+teaQun +"		 "+teaTot);
					
					int GTtot = GTqun * 15;
					if(GTqun > 0) 
						
						System.out.println("\n Green Tea		"+GTqun +"		 "+GTtot);
					
					int samosatot = samosaqun * 20;
					if (samosaqun >0) 
						
						System.out.println("\n Samosa		"+samosaqun +"		 "+samosatot);
					
					int sandtot = Sandqun * 50;
					if (Sandqun>0)
					
						System.out.println("\n Sandwitch		"+Sandqun +" 		"+sandtot);
					
					System.out.println("----------------------------------------");
					System.out.println("Total =                          "+(teaTot + GTtot + samosatot + sandtot));
					return;
				}
		}while(run);
		
		}

}


