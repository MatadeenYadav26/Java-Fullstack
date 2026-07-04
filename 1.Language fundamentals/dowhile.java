class doWhileloop 
{
	public static void main(String[] args) 
	{
		//int i = 1;
		//do{
		//	System.out.println("Hello World");
		//	i++;
		//}while(i<=5);
		
		int choice= 2;
		do{
			System.out.println("1. Add");
			System.out.println("2. View");
			System.out.println("3. Exit");
			
			System.out.println("selected choice: "+choice);
		}while(choice<1 || choice>3);
		
	}
}
