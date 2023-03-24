import java.awt.*;
import java.util.ArrayList;

public class BinaryTree<E extends Comparable<E>>{
    private Node<E> root;

    public void insert(Association<String,Palabra> association) {
        Node newNode = new Node(association);
        if (root == null) {
            root = newNode;
        } else {
            insertRecursive(root, newNode);
        }
    }

    private void insertRecursive(Node<E> currentNode, Node<E> newNode) {
        if (newNode.getKey().compareTo(currentNode.getKey()) < 0) {
            if (currentNode.getLeftChild() == null) {
                currentNode.setLeftChild(newNode);
            } else {
                insertRecursive(currentNode.getLeftChild(), newNode);
            }
        } else {
            if (currentNode.getRightChild() == null) {
                currentNode.setRightChild(newNode);
            } else {
                insertRecursive(currentNode.getRightChild(), newNode);
            }
        }
    }

    public Node<E> search(E key) {
        return searchRecursive(root, key);
    }

    private Node<E> searchRecursive(Node<E> currentNode, E key) {
        if (currentNode == null || currentNode.getKey().equals(key)) {
            return currentNode;
        } else if (key.compareTo(currentNode.getKey()) < 0) {
            return searchRecursive(currentNode.getLeftChild(), key);
        } else {
            return searchRecursive(currentNode.getRightChild(), key);
        }
    }

    public ArrayList<Association<E, ?>> inOrder() {
        ArrayList<Association<E, ?>> associations = new ArrayList<>();
        inOrderRecursive(root, associations);
        return associations;
    }

    private void inOrderRecursive(Node<E> currentNode, List<Association<E, ?>> associations) {
        if (currentNode != null) {
            inOrderRecursive(currentNode.getLeftChild(), associations);
            associations.add(currentNode.getAssociation());
            inOrderRecursive(currentNode.getRightChild(), associations);
        }
    }

    private static class Node<E extends Comparable<E>> {
        private final Association<E, ?> association;
        private Node<E> leftChild;
        private Node<E> rightChild;

        public Node(Association<E, ?> association) {
            this.association = association;
        }

        public E getKey() {
            return association.getKey();
        }

        public Node<E> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<E> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<E> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<E> rightChild) {
            this.rightChild = rightChild;
        }

        public Association<E, ?> getAssociation() {
            return association;
        }
    }

}
