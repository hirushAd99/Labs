public class testQueuesOperation {
    public static void main(String[] args) {
        QueuesOperation queuesObject = new QueuesOperation();
        int[] queuesArray = new int[10];
        queuesArray[0] = 12;
        queuesArray[1] = 89;
        queuesArray[2] = 55;
        queuesArray[3] = 69;
        queuesArray[4] = 33;
        queuesArray[5] = 84;
        queuesObject.QueuesOperation(queuesArray, 10,5);
        queuesObject.peek();
        queuesObject.enqueue(55);
        queuesObject.peek();
        queuesObject.dequeue();
        queuesObject.peek();
    }
}
