
public class StackImpl{
    private int arr[];
    private int top;
    private int limit;
    StackImpl(int size){
        arr=new int[size];
        limit=size;
        top=-1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is Full.");
            System.exit(1);
        }
        System.out.println("1st Stack: "+x);
        arr[++top]=x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getSize(){
        return top+1;
    }
    private boolean isEmpty() {
        return top==-1;
    }
    private boolean isFull() {
        return top==limit-1;
    }
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Stack2 stack=new Stack2(5);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.print("Stack: ");
        stack.printStack();
        stack.pop();
        System.out.println("\n Stack After pop");
        stack.printStack();
    }
}
