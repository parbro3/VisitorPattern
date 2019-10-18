package testPackage;


public class BlueNode extends Node {

    public BlueNode(int idValue) {
        super(idValue);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBlueNode(this);
    }
}
