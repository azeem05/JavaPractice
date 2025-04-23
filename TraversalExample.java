
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// Definition of TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    // Constructor
    TreeNode(int value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }
}
public class TraversalExample {

    // Depth-First Search (DFS) - Pre-order traversal
    public static void dfs(TreeNode root){
        // Implement recursive tree traversal
        if(root!=null) {
            System.out.print(" "+root.val);
            dfs(root.left);
            dfs(root.right);
        }



    }
    // Breadth-First Search (BFS) - Level-order traversal
    public static void bfs(TreeNode node) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode != null) {
                System.out.print(currentNode.val + " ");
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }

    }
    public static void main(String[] args) {
        // Construct a binary tree
        //      1
        //     /
        //    2   3
        //   /
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // Perform DFS (Pre-order traversal)
        System.out.println("DFS (Pre-order):");
        dfs(root);
        // Output: 1 2 4 5 3
        // Perform BFS (Level-order traversal)
        System.out.println("\nBFS:");
        bfs(root);
        // Output: 1 2 3 4 5
    }
}
