package testPackage;

public interface Visitor {
    //passing in the node allows the visitor to do what
    //it would like with it... whether that's counting something... etc.
    void visitRedNode(RedNode redNode);
    void visitGreenNode(GreenNode greenNode);
    void visitBlueNode(BlueNode blueNode);
}