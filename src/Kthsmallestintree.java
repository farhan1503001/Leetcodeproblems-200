
public class Kthsmallestintree {
	private int answer=Integer.MIN_VALUE;
	private int k=0;
	public int kthsmallest(Treenode root, int k ) {
		this.k=k;
		/*
		 * Here we will use inorder traversal to find the elements
		 */
		inorder(root);
		return answer;
		
	}
	public void inorder(Treenode root) {
		if(root==null)
		{
			return;
		}
		/*
		 * Traversing the left side first
		 */
		inorder(root.left);
		/*
		 * Now work will be in middle we will decrease k value
		 */
		this.k--;
		if(this.k==0)
		{
			this.answer=root.val;
			return;
		}
		//Traversing the right side of the node
		inorder(root.right);
	}
	
}
