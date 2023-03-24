package model;

public class Dictionary {
    private TreeNode root;

    public Dictionary() {
        this.root = null;
    }

    public void insert(String english, String spanish, String french) {
        root = insertRec(root, english, spanish, french);
    }
    private TreeNode insertRec(TreeNode root, String english, String spanish, String french) {
        if (root == null) {
            root = new TreeNode(english, spanish, french);
            return root;
        }
        if (english.compareTo(root.english) < 0) {
            root.left = insertRec(root.left, english, spanish, french);
        } else if (english.compareTo(root.english) > 0) {
            root.right = insertRec(root.right, english, spanish, french);
        }
        return root;
    }
    public TreeNode search(String english) {
        return searchRec(root, english);
    }
    private TreeNode searchRec(TreeNode root, String english) {
        if (root == null || root.english.equals(english)) {
            return root;
        }
        if (english.compareTo(root.english) < 0) {
            return searchRec(root.left, english);
        }
        return searchRec(root.right, english);
    }
}
