package testPackage;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    private int id;
    private List<Node> children = new ArrayList<>();

    protected Node(int idValue){
        id = idValue;
    }

    public int getId() {
        return id;
    }

    public int getChildCount(){
        return children.size();
    }

    public void addChild(Node node){
        children.add(node);
    }

    public Node getChild(int index) {
        return children.get(index);
    }

    //implemented by children
    public abstract void accept(Visitor visitor);
}
