package section11_abstraction.abstract_class;

public class Node extends ListItem {

    public Node(Object object) {
        super(object);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem value) {
        if (value != null) {
            if (this.value instanceof Comparable && value.getValue() instanceof Comparable) {
                Comparable currentValue = (Comparable) this.getValue();
                Comparable otherValue = (Comparable) value.getValue();
                return currentValue.compareTo(otherValue);
            }
        }
        return -1;
    }
}