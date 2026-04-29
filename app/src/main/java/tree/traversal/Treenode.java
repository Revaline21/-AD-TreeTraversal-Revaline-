package tree.traversal;
import java.util.*;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children = new ArrayList<>();

    TreeNode(T data) {
        this.data = data;
    }
}

class SimpleTree<T> {
    TreeNode<T> root;

    void printLeaves() {
        dfs(root);
    }

    private void dfs(TreeNode<T> node) {
        if (node == null) return;

        if (node.children.isEmpty()) {
            System.out.print(node.data + " ");
        } else {
            for (TreeNode<T> child : node.children) {
                dfs(child);
            }
        }
    }
}