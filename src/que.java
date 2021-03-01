public class que {
    int rear;
    int front;
    int size;
    int capacity;
    int[] arr;

    public que(int c) {
        rear = 0;
        front = 0;
        size = 0;
        capacity = c;
        arr = new int[c];
    }

    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("overflow");
        } else {
            if (rear < capacity) {
                arr[rear] = data;
                rear++;
            } else if(size!=capacity) {
                rear = 0;
            }
        }
        size++;
    }

    public int dequeue() {
        int res = 0;
        if (size == 0) {
            System.out.println("underflow");
        } else {
            if (front == capacity) {
                front = 0;
            } if(front<capacity) {
                res = arr[front];
                front++;
            }
            size--;
        }
        return res;

    }
    void traverse()
    {
        if(front<rear)
        {
            for (int i = front; i <rear ; i++) {
                System.out.println(arr[i]);
            }
        }
        else
        {

            for(int i=front;i<capacity;i++)
            {
                System.out.println(arr[i]);
            }
            for(int i=0;i<rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
