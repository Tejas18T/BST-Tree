package BST;

import java.util.Scanner;

public class BSTapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BSTImp B1=new BSTImp();
		System.out.println("BST Operations");
  		System.out.println("1.Start");
  		int val=sc.nextInt();
  		if(val==1)
  		{
				int no=0;
				do
			  	{
					
			  		System.out.println("\n\n1.Add NOde Opration");
			  		System.out.println("2.Pre-Order");
			  		System.out.println("3.In_Order");
			  		System.out.println("4.Post_Order");
			  		System.out.println("0. Exit !!");
			  		
			  		no=sc.nextInt();
			  		switch (no)
			  		{
				  		case 1:
				  			  System.out.println("Enter Node:");
				  			  int v=sc.nextInt();
				  			  B1.AddNode(v);
				  			  break;
				  			  
				  		case 2:
				  			System.out.println("Pre-Order:");
				  			B1.BSTPreOrder(B1.GetRoot());
				  			break;
				  			
				  		case 3:
				  			System.out.println("In-Order:");
				  			B1.BSTInOrder(B1.GetRoot());
				  			break;
				  			
				  		case 4:
				  			System.out.println("In-Order:");
				  			B1.BSTPostOrder(B1.GetRoot());
				  			break;
				  			
			  			  
			  			  
			  		}
			  		
			  	}while(no!=0);
  		}
  		else
  		{
  			System.exit(0);
  		}
		
	}

}
