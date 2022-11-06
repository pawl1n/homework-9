package stack;

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("first string");
        stack.push("second string");
        stack.push("third string");
        stack.push("fourth string");
        stack.push("fifth string");
        stack.push("sixth string");
        stack.push("seventh string");
        System.out.println(stack);
    }
}