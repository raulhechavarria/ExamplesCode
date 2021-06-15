package amazon;

public class ValidateBinarySearchTree {

	public Integer  integer = Integer.MAX_VALUE;
	
	public static boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        return validBSTRecursive(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public static boolean validBSTRecursive(TreeNode root, long minValue, long maxValue) {
        if(root == null) {
            return true;
        } else if(root.val >= maxValue || root.val <= minValue) {
            return false;
        } else {
            return validBSTRecursive(root.left, minValue, root.val) && validBSTRecursive(root.right, root.val, maxValue);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Long.MAX_VALUE);
		System.out.print(Long.MIN_VALUE);
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		node.right = new TreeNode(3);
		System.out.print(isValidBST(node));
		}

}
