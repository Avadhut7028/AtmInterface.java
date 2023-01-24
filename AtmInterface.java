import java.util.Scanner;

public class AtmInterface
{
	public static void main(String[] args) 
	{

		int choice, pin=7028;
		int amount=0;
		Scanner s = new Scanner(System.in);
		char trasction = 'y';
		int ID=962395;
		int transaction[] = new int[10];
		int i=0;
		 do{
		 	System.out.println("ENTER CUSTOMER ID : ");
			ID = s.nextInt();
		

			System.out.println("ENTER CUSTOMER PIN : ");
			pin = s.nextInt();
			

			if(ID != 962395 || pin!=7028)
				System.out.println("PLEASE ENTER VALID CREDENTIALS");
		 }while(ID != 962395 && pin!=7028);
		do
		{
			System.out.println("\n------ATM SERVICE-----\n");
			System.out.println("1. Trasaction History");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Quit");
			System.out.println("\nEnter Choice : ");
			 choice = s.nextInt();

			switch(choice)
			{
				
				
				case 1:
					System.out.println("***Transaction history***\n");
					for(int j=0;j<i;j++)
					{
						System.out.println(transaction[j]);
					}
					break;

				case 2:

					System.out.println("\nEnter the amount to Deposit: ");
					int c = s.nextInt();
					amount = amount + c;
					System.out.println("Your balance: "+amount);
					transaction[i]=amount;
						i++;
					break;
					

				case 3:
					System.out.println("\nEnter Withdraw Ammount: ");
					int b = s.nextInt();

					if(b % 100 != 0)
					{
						System.out.println("\nPlease Enter the amount in multiple of 100 ");
					}
					else if(b > (amount - 500))
					{
						System.out.println("\nInsufficent Balance");
					}
					else
					{
						amount = amount - b;
						System.out.println("\n\nPlease receive cash");
						System.out.println("Your current balance: "+amount);

						transaction[i]=amount;
						i++;
					}
					break;

				case 4:
					System.out.println("-------------------Transfer-------------------------");
					{
						Scanner sc = new Scanner(System.in);
		                System.out.print("\nEnter Receipent's Name : ");
		                String receipent = sc.nextLine();
		                System.out.print("\nEnter amount you wish to transfer : ");
		                Float amount1 = sc.nextFloat();
		
		try {
			if ( amount >= amount1 ) {
				if ( amount1 <= 50000f ) {
					trasction++;
					amount -= amount1;
					System.out.println("\nSuccessfully Transfered to " + receipent);
					String str = amount1 + " Rs transfered to " + receipent + "\n";

					transaction[i]=amount;
						i++;
					
				}
				else {
					System.out.println("\ninvalid transfer..Limit is 50000.00 only");
				}
			}
			else {
				System.out.println("\nInsufficient Balance");
			}
		}
		catch ( Exception e) {
		}
					}

				case 5:
					System.out.println("Thank you for using our service");
					break;

				default:
					System.out.println("Invalid choice");

			}

			
		}while(choice!=5);
	}
}