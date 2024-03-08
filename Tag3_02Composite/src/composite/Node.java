package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node extends AbstractNode{

    private List<AbstractNode> children = new ArrayList<>();

    public Node(final String label) {
        super(label);
    }

    @Override
    public List<AbstractNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(AbstractNode child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractNode child) {
        child.setParent(null);
        children.remove(child);
    }
}
