
public class Maximumpathsum {
	private int answer=Integer.MIN_VALUE;
	public int  maxPathSum(Treenode root) {
		int __=find_max_path(root);
		return this.answer;
	}
	public int find_max_path(Treenode root) {
		/*
		 * if node is null path length =0
		 * then compare length of the left to length of the right
		 * if bigger than answer then change otherwise keep it as it is
		 */
		if(root==null)
		{
			return 0;
		}
		//find right and left
		int left=find_max_path(root.left);
		int right=find_max_path(root.right);
		//now first compare
		int max_slide=Math.max(root.val,Math.max(left,right)+root.val);
		int top_max=Math.max(max_slide,left+right+root.val);
		this.answer=Math.max(this.answer, top_max);
		return top_max;
	}

}
