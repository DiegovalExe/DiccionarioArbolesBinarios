package model;

//Arbol extraido de Chat gpt4, modificado para su correcto funcionamiento en este programa

public class BinarySearchTree<E extends Comparable<? super E>>{
    private Node<E> root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void makeEmpty() {
        root = null;
    }

    public void insert(E x) {
        root = insert(x, root);
    }

    public void remove(E x) {
        root = remove(x, root);
    }

    public E findMin() {
        if (isEmpty())
            return null;
        return findMin(root).element;
    }

    public E findMax() {
        if (isEmpty())
            return null;
        return findMax(root).element;
    }

    public boolean contains(E x) {
        return contains(x, root);
    }

    public E search(E x) {
        return search(x, root);
    }

    private Node<E> insert(E x, Node<E> t) {
        if (t == null)
            return new Node<>(x);
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = insert(x, t.left);
        else if (compareResult > 0)
            t.right = insert(x, t.right);
        else
            ; // duplicate, do nothing
        return t;
    }

    private Node<E> remove(E x, Node<E> t) {
        if (t == null)
            return t;
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            t.left = remove(x, t.left);
        else if (compareResult > 0)
            t.right = remove(x, t.right);
        else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else
            t = (t.left != null) ? t.left : t.right;
        return t;
    }

    private Node<E> findMin(Node<E> t) {
        if (t == null)
            return null;
        else if (t.left == null)
            return t;
        return findMin(t.left);
    }

    private Node<E> findMax(Node<E> t) {
        if (t != null)
            while (t.right != null)
                t = t.right;
        return t;
    }

    private boolean contains(E x, Node<E> t) {
        if (t == null)
            return false;
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            return contains(x, t.left);
        else if (compareResult > 0)
            return contains(x, t.right);
        else
            return true;
    }

    private E search(E x, Node<E> t) {
        if (t == null)
            return null;
        int compareResult = x.compareTo(t.element);
        if (compareResult < 0)
            return search(x, t.left);
        else if (compareResult > 0)
            return search(x, t.right);
        else
            return t.element; // match
    }

    private void printTreeInOrder(Node<E> node) {
        if (node != null) {
            printTreeInOrder(node.getLeft());
            System.out.println(node.getElement().toString());
            printTreeInOrder(node.getRight());
        }
    }
    public void printTree() {
        printTreeInOrder(root);
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }
}
