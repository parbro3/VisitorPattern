package testPackage;

public class GreenNode extends Node{

    private static final int CHILD_COUNT = 3;

    //has a left and a right blue node
    private Node left;
    private Node right;
    private Node middle;

    public GreenNode(int id){
        super(id);
        setLeft(null);
        setRight(null);
        setMiddle(null);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getMiddle() {
        return middle;
    }

    public void setMiddle(Node middle) {
        this.middle = middle;
    }

    @Override
    public int getChildCount() {
        return CHILD_COUNT;
    }

    @Override
    public Node getChild(int index) {
        Node childNode;

        switch(index) {
            case 0:
                childNode = getLeft();
                break;
            case 1:
                childNode = getMiddle();
                break;
            case 2:
                childNode = getRight();
                break;
            default:
                throw new ArrayIndexOutOfBoundsException();
        }

        return childNode;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGreenNode(this);
    }
}
