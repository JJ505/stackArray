/**
 * Created by jalen johnson on 1/31/2017.
 */
public class Main {
    public static void main(String args[]){
        StackArray myStack = new StackArray(9,3);
        myStack.push(1,0);
        myStack.push(2,0);
        myStack.push(3,0);
        myStack.push(4,0);

        myStack.pop(0);
        myStack.push(4,0);
        myStack.pop(0);
        myStack.push(1,1);
        myStack.push(2,5);


    }
}
