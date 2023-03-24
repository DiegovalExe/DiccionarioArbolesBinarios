package model;

//Codigo extraido de https://github.com/malonso-uvg/uvg2023ed10/blob/main/10_ABB/src/TreeNode.java
public class TreeNode{

    String english;
    String spanish;
    String french;
    TreeNode left;
    TreeNode right;

    public TreeNode(String english, String spanish, String french) {
        this.english = english;
        this.spanish = spanish;
        this.french = french;
        this.left = null;
        this.right = null;
    }

}