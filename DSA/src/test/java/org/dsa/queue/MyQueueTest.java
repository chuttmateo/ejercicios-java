package org.dsa.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyQueueTest {

    private MyQueue<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new MyQueue<>();
    }

    @Test
    public void testEnQueueAndSize() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        Assertions.assertEquals(3, queue.size(), "Size should be 3 after enqueuing three elements");
    }

    @Test
    public void testDeQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        Assertions.assertEquals(1, queue.deQueue(), "First element dequeued should be 1");
        Assertions.assertEquals(2, queue.deQueue(), "Second element dequeued should be 2");
        Assertions.assertEquals(3, queue.deQueue(), "Third element dequeued should be 3");
    }

    @Test
    public void testDeQueueFromEmptyQueue() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> queue.deQueue());
        Assertions.assertEquals("Queue is empty", exception.getMessage());
    }

    @Test
    public void testEnQueueDeQueueAndSize() {
        queue.enQueue(1);
        queue.enQueue(2);
        Assertions.assertEquals(2, queue.size(), "Size should be 2 after enqueuing two elements");
        queue.deQueue();
        Assertions.assertEquals(1, queue.size(), "Size should be 1 after dequeuing one element");
        queue.enQueue(3);
        Assertions.assertEquals(2, queue.size(), "Size should be 2 after enqueuing another element");
    }

    @Test
    public void testDeQueueOrder() {
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        Assertions.assertEquals(10, queue.deQueue(), "First element dequeued should be 10");
        Assertions.assertEquals(20, queue.deQueue(), "Second element dequeued should be 20");
        Assertions.assertEquals(30, queue.deQueue(), "Third element dequeued should be 30");
    }


    @Test
    public void enQueueAndDeQueueElementsTest(){
        queue.enQueue(1);
        queue.enQueue(2);
        Assertions.assertEquals(2, queue.size(), "Queue size should be 2");

        Assertions.assertEquals(1, queue.deQueue(), "First element should be 1");

        Assertions.assertEquals(1, queue.size(), "Queue size should be 1");

        Assertions.assertEquals(2, queue.deQueue(), "First element should be 2");
    }
}
