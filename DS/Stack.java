public class Stack {
    public static void main(String[] args) {
       
    int[] array = new int[100];
    int top = 0;

    }

    public static int push(int value) {
        array.push(value);
    }

    public void pop() {
        return array[--top];
    }

    public void peek() {
        return array[top - 1];
    }

    public void isEmpty() {
        if(top == 0) {
            return true;
        }
        return false;
    }

    public void size() {
        return top;
    }

    public clear() {
        int element = [];
        return element;
    }

    public void value() {
        return array;
    }
}