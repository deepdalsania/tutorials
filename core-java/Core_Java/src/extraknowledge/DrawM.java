package extraknowledge;

public class DrawM {

	
	public static void main(String args[])
	{
	int i,j;
	for(i=1;i<=5;i++)
	{
	for(j=1;j<=5;j++)
	{
	 
	if(j==1 || j==5)
	System.out.print("*");
	else if(i==2 && (j==2 || j==4))
	System.out.print("*");
	else if(i==3 && j==3)
	System.out.print("*");
	else 
	System.out.print(" ");
	}
	System.out.println();
	}
	}
	}

