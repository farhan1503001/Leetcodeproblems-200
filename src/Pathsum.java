class Treenode{
	int val;
	Treenode left=null;
	Treenode right=null;
	public Treenode(int val,Treenode left,Treenode right) {
		// TODO Auto-generated constructor stub
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
}
public class Pathsum {
	public boolean hassum(Treenode root,int target_sum,int curr_val) {
		/*
		 * will check left and right of the tree using or if any part condition is fulfilled then return
		 */
		if(root==null)
		{
			return false;
		}
		curr_val+=root.val;
		if(curr_val==target_sum && (root.left==null && root.right==null))
			return true;
		return(
				hassum(root.left,target_sum,curr_val) || hassum(root.right, target_sum, curr_val)
	);
	}
	 public boolean hasPathSum(Treenode root, int targetSum) {
		   return hassum(root,targetSum,0);     
	    }
	 
	 public static void main(String[] args) {
		 
	 }

}
