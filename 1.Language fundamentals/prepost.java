class PrePost 
{
	public static void main(String[] args) 
	{
		int k = 5;
		int r = ++k + ++k - k-- + k++ + k--; 
		System.out.println(r);
		System.out.println(k);
	}
}
