package BST;

public class Node {

	private Node right;
	private Node left;
	private int data;
	
	Node()
	{
		right=left=null;
		data=0;
	}
	
	public void SetLeft(Node left)
	{
		this.left=left;
	}
	public void SetRight(Node right)
	{
		this.right=right;
	}
	public Node GetRight()
	{
		return this.right;
	}
	public Node GetLeft()
	{
		return this.left;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return this.data;
	}
	
}
