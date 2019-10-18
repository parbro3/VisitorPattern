package testPackage;

public class RedNode extends Node {

    public RedNode(int id) {
        super(id);
    }

    public void accept(Visitor visitor) {
        visitor.visitRedNode(this);
    }
}