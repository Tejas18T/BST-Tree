package BST;

public class BSTImp {

	private Node root;
	BSTImp()
	{
		root=null;
	}
	public Node CreateNewNode(int data)
	{
		Node newNode=new Node();
		newNode.setData(data);
		return newNode;
	}
	
	public Node GetRoot()
	{
		return root;
	}
	public void AddNode(int val)
	{
		Node newNode=CreateNewNode(val);
		Node temp=root;
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			while(true)
			{
				if(temp.getData()>newNode.getData())
				{
					if(temp.GetLeft()==null)
					{
						temp.SetLeft(newNode);
						break;
					}
					else
					{
						temp=temp.GetLeft();
						continue;
					}
				}
				else if(temp.getData()<newNode.getData())
				{
					if(temp.GetRight()==null)
					{
						temp.SetRight(newNode);
						break;
					}
					else
					{
						temp=temp.GetRight();
						continue;
					}
				}
				else
				{
					System.out.println("Dulicates Value!!");
				}
			}
		}
	}
	public void BSTPreOrder(Node temp)
	{
		if(temp!=null)
		{
			System.out.print(temp.getData()+" ,");
			BSTPreOrder(temp.GetLeft());
			BSTPreOrder(temp.GetRight());
		}
		
		
	}
	public void BSTInOrder(Node temp)
	{
		if(temp!=null)
		{
			BSTInOrder(temp.GetLeft());
			System.out.print(temp.getData()+" ,");
			BSTInOrder(temp.GetRight());
		}	
	}
	public void BSTPostOrder(Node temp)
	{
		if(temp!=null)
		{
			BSTPostOrder(temp.GetLeft());
			BSTPostOrder(temp.GetRight());
			System.out.print(temp.getData()+" ,");
			
		}	
	}
}
