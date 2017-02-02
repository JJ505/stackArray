import org.junit.Test;

/**
 * Created by jjohn on 2/1/2017.
 */
public class TestStackArrayModule {

    //tests the push limit for a stack
    @Test
    public void testStackPushLimit(){
        StackArray myStack = new StackArray(9,3);
        myStack.push(1,0);
        myStack.push(2,0);
        myStack.push(3,0);
        assert -1 == myStack.push(4,0);

    }
    //tests popping from stack when it shouldnt be able to
    @Test
    public void testStackPopFail(){
        StackArray myStack = new StackArray(9,3);
        assert -1 == myStack.pop(1);
    }
}
