package github;
public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack();
        Stack clone = new Stack();
        
        //populate a stack
        for (int i = 0; i < 10; i++) {
            newStack.push(i);
        }
        //copy from one stack to another
        copyStack(newStack, clone);
        
        //show both stacks
        System.out.print("Original stack: ");
        showStack(newStack);
        System.out.print("Clone stack: ");
        showStack(clone);

        
    }
    public static void copyStack(Stack original, Stack destination) {
        if(!original.isEmpty()) {
            String temp = original.pop();
            copyStack(original, destination);
            destination.push(Integer.parseInt(temp));
            original.push(Integer.parseInt(temp));
        }
    }
    
    public static void showStack(Stack stack) {
        Stack clone = new Stack();
        copyStack(stack, clone);
        
        System.out.print("[");
        int stackSize = clone.getSize();
        for (int i = 0; i < stackSize - 1; i++) {
            System.out.print(clone.pop() + ", ");
        }
        System.out.println(clone.pop() + "]");
    }
}
