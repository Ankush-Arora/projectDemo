class Node{
int data;
Node left;
Node right;
}

class Bst
{

public Node insert(Node node ,int val)
	{
	if(node == null)
	{
	return createNode(val);
	}
	if(val<node.data)
	{
	node.left=insert(node.left,val);
	}
	else if(val > node.data)
	{
	node.right=insert(node.right,val);
	}
return node;
}

public Node createNode(int k)
	{
	Node a=new Node();
	a.data=k;
	a.left=null;
	a.right=null;
	return a;
	}

void inOrd(Node node)
{
if(node == null)
return;
inOrd(node.left);
System.out.print(node.data+ " ");
inOrd(node.right);
}

}

public class Bst1
{
public static void main(String[] args)
{
Bst x=new Bst();
Node root=null;
root=x.insert(root,8);
root=x.insert(root,3);
root=x.insert(root,6);
root=x.insert(root,10);
root=x.insert(root,4);
x.inOrd(root);
}


}