package main;

import composite.AbstractNode;
import composite.Leaf;
import composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("root");

        Node e1 = new Node("E1");
        root.appendChild(e1);

        Node e2 = new Node("E2");
        root.appendChild(e2);

        Node e2_1= new Node("E2_1");
        e1.appendChild(e2_1);

        Leaf e2_2= new Leaf("E2_2");
        e1.appendChild(e2_2);

        Node e2_3= new Node("E2_3");
        e2.appendChild(e2_3);

        Leaf e2_4= new Leaf("E2_4");
        e2.appendChild(e2_4);

        travers(root);

    }

    private static void travers(AbstractNode knoten) {
        System.out.println(knoten);
        for(AbstractNode child: knoten.getChildren()) {
            travers(child);
        }
    }
}