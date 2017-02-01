/**
 * Created by jalen johnson on 1/31/2017.
 */
public class StackArray {
    //code to have n stacks using one array
    private int arrSize;
    private int[] arr;
    private int[] stackCounters;
    private int stackSize;
    private int numberOfStacks;
    public StackArray(int arrSize, int numberOfStacks){
        arr = new int[arrSize];
        stackCounters = new int[numberOfStacks];
        this.arrSize = arrSize;
        stackSize = arrSize/numberOfStacks;
        this.numberOfStacks = numberOfStacks;
    }

    public int push(int data, int stackSegment){
        if (stackSegment > numberOfStacks) {
            System.out.println("There are not that many stacks");
            return -1;
        }
        if (stackCounters[stackSegment]+1 > stackSize) {
            System.out.println("failing push, not enough room");
            return -1;
        }
        System.out.println("Pushing "+data+" to stack "+ stackSegment);
        stackCounters[stackSegment]++;
        arr[stackCounters[stackSegment]] = data;
        return 1;

    }
    public int pop(int stackSegment){
        if (stackCounters[stackSegment]==0) return -1;//cant pop
        stackCounters[stackSegment]--;
        System.out.println("Popping "+arr[stackCounters[stackSegment]+1]);
        return arr[stackCounters[stackSegment]+1];
    }

}
