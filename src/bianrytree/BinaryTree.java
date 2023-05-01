package bianrytree;

public class BinaryTree<M extends Comparable<M>> {

    private BinaryNode<M> root;

    public void add(M key) {
        this.root = this.addRootRecursively(root, key);
    }

    private BinaryNode<M> addRootRecursively(BinaryNode<M> current, M key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0) {
            current.left = addRootRecursively(current.left, key);
        } else {
            current.right = addRootRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<M> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + getSizeRecursive(current.right);
    }

    public boolean search(M key) {
        return this.searchTree(key);
    }

    private boolean searchTree(M key) {
        BinaryNode<M> searchElement = root;
        while (searchElement != null) {
            if (key.compareTo(searchElement.left.key) == 0)
                return true;
            searchElement = root.left;
        }
        while (searchElement != null) {
            if (key.compareTo(searchElement.right.key) == 0)
                return true;
            searchElement = root.right;
        }
        return false;
    }

}
