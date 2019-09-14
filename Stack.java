public class Stack {
    
    private Node top;
    private int size = 0;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }
    
    boolean isEmpty() { 
        return top == null;
    }
    
    void push(int value){ 
        Node newNode = new Node(value);
        if(isEmpty()){
            top = newNode;
            size++;
        } else {
            newNode.setLastElement(top);
            top = newNode;
            size++;
        }     
    }
    //the return will have to be converted back to Integer before use
    String pop(){
        if(isEmpty()){
            return "empty";
        } else {
            String temp = Integer.toString(top.getValue());
            top = top.getLastElement();
            size--;
            return temp;
        }  
    }
}
