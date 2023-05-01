package bianrytree;

public class BinaryNode<M extends Comparable<M>> {
    M key;
    BinaryNode<M> left;
    BinaryNode<M> right;

    public BinaryNode(M key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

}
