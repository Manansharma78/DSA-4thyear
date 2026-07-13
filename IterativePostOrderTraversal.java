import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class IterativePostOrderTraversal {
    static Scanner sc = new Scanner(System.in);
    @SuppressWarnings("unused")
    static TreeNode buildTree() {
        System.out.print("Enter root value (-1 for no node): ");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        TreeNode root = new TreeNode(data);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            System.out.print("Enter left child of " + current.val + " (-1 if none): ");
            int left = sc.nextInt();

            if (left != -1) {
                current.left = new TreeNode(left);
                queue.offer(current.left);
            }

            System.out.print("Enter right child of " + current.val + " (-1 if none): ");
            int right = sc.nextInt();

            if (right != -1) {
                current.right = new TreeNode(right);
                queue.offer(current.right);
            }
        }

        return root;
    }



}