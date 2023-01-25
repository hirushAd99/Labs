public class TestStackOperation {
    public static void main(String[] args) {
        StackOperation newObject = new StackOperation();
        //System.out.println("");
        int arraySize = 4;
        int[] elementArray = new int[]{34, 78, 89, 0};
        newObject.StackOperation(arraySize, elementArray, 3);
        newObject.peek();
        newObject.push(45);
        newObject.peek();
        newObject.printElement();
        newObject.push(66);
        newObject.peek();
        newObject.pop();
        newObject.printElement();
    }
}
