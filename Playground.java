package testPackage;

public class Playground {

    public static int nodesCreated = 0;

    public static Node createRedNode() {
        final int CHILDREN = 5;
        RedNode node = new RedNode(++nodesCreated);
        for (int i=0; i < CHILDREN; ++i) {
            node.addChild(createGreenNode());
        }
        return node;
    }

    public static Node createGreenNode() {
        GreenNode node = new GreenNode(++nodesCreated);
        node.setLeft(createBlueNode());
        node.setMiddle(createBlueNode());
        node.setRight(createBlueNode());
        return node;
    }

    public static Node createBlueNode() {
        return new BlueNode(++nodesCreated);
    }

    public static Node buildTree() {
        return createRedNode();
    }

    public void play() {
        Node tree = buildTree();
        PrintVisitor printVisitor = new PrintVisitor();
        //Traversals.preOrder(tree, printVisitor);
        Traversals.levelOrder(tree, printVisitor);
        System.out.print("\n");
        Traversals.preOrder(tree, printVisitor);
        System.out.print("\n");
        Traversals.postOrder(tree, printVisitor);
    }
}
