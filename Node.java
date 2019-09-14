/**
 * @author Wagner Bonfim
 */
public class Node {
    private int value;
    private Node lastElement;

    public Node(int value) {
        this.value = value;
        lastElement = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLastElement() {
        return lastElement;
    }

    public void setLastElement(Node lastElement) {
        this.lastElement = lastElement;
    }  
}
