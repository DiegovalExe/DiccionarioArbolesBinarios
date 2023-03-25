package model;

//Codigo extraido de https://github.com/malonso-uvg/uvg2023ed10/blob/main/10_ABB/src/TreeNode.java
public class Node<E> {

    E element;
    Node<E> left;
    Node<E> right;

    public Node(E element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

}