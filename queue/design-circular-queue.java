class MyCircularQueue {
    int front;
    int rear;
    int size;
    int capacity;
    int[] queue;
    
    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        // If the queue is empty, initialize front to 0
        if (isEmpty()) {
            front = 0;
        }
        // Circularly update rear pointer
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        // If the queue has only one element, reset front and rear
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Circularly update front pointer
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
