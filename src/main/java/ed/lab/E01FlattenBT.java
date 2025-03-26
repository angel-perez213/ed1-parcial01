package ed.lab;

public class E01FlattenBT {

    private TreeNode<Integer> prev = null;

    public void flatten(TreeNode<Integer> root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
