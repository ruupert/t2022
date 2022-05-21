public interface QueueInterface {
    void enqueue(int value);
    int dequeue();
    Boolean isEmpty();
}
