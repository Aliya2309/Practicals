class TOperator
{
	public static void main(String args[])
	{
		int max, n1, n2, n3;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		n3=Integer.parseInt(args[2]);
		max=n1>n2?n1>n3?n1:n3:n2>n2?n2:n3;
		System.out.println("The max no is  " + max);
	}
}