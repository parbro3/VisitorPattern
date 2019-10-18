package testPackage;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

    public static void preOrder(Node root, Visitor visitor) {
        root.accept(visitor);

        for (int i=0; i < root.getChildCount(); ++i) {
            preOrder(root.getChild(i), visitor);
        }
    }

    public static void postOrder(Node root, Visitor visitor) {
        for (int i=0; i < root.getChildCount(); ++i) {
            postOrder(root.getChild(i), visitor);
        }

        root.accept(visitor);
    }

    public static void levelOrder(Node root, Visitor visitor) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            node.accept(visitor);
            for (int i=0; i < node.getChildCount(); ++i) {
                queue.offer(node.getChild(i));
            }
        }
    }
}