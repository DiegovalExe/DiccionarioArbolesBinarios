package model;

//Codigo Extraido de: https://github.com/malonso-uvg/uvg2023ed10/blob/main/10_ABB/src/ITraversal.java
public interface ITraversal<K, V> {

    void visit(TreeNode<K, V> actualNode);

}