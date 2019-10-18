package testPackage;

public class PrintVisitor implements Visitor {

    public PrintVisitor() {
    }

    public void visitRedNode(RedNode node) {
        System.out.println("Red(" + node.getId() + ")");
    }

    public void visitGreenNode(GreenNode node) {
        System.out.println("Green(" + node.getId() + ")");
    }

    public void visitBlueNode(BlueNode node) {
        System.out.println("Blue(" + node.getId() + ")");
    }
}