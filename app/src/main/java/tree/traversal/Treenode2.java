package tree.traversal;
import java.util.*;

public class Treenode2<T> {
    T data;
    List<Treenode2<T>> children = new ArrayList<>();

    Treenode2(T data) {
        this.data = data;
    }
}

class SimpleTree<T> {
    TreeNode<T> root;

    void printAtDepth(int n) {
        dfs(root, 0, n);
    }

    private void dfs(TreeNode<T> node, int depth, int target) {
        if (node == null) return;

        if (depth == target) {
            System.out.print(node.data + " ");
            return;
        }
        for (TreeNode<T> child : node.children) {
            dfs(child, depth + 1, target);
        }
    }
}