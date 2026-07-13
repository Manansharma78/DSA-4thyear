package day3;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class IterativePostorderTraversal {

    static Scanner sc = new Scanner(System.in);

    static TreeNode buildTree() {
        int data = sc.nextInt();
        if (data == -1) return null;

        TreeNode root = new TreeNode(data);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            int left = sc.nextInt();
            if (left != -1) {
                curr.left = new TreeNode(left);
                q.offer(curr.left);
            }

            int right = sc.nextInt();
            if (right != -1) {
                curr.right = new TreeNode(right);
                q.offer(curr.right);
            }
        }
        return root;
    }

   
    static List<Integer> postorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            ans.add(node.val);

            if (node.left != null) st.push(node.left);
            if (node.right != null) st.push(node.right);
        }

        Collections.reverse(ans);
        return ans;
    }
}