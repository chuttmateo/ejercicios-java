package org.dsa.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrStackTest {

    private ArrStack stack;

    @BeforeEach
    public void setUp() {
        stack = new ArrStack();
    }

    @Test
    public void testPushAndSize() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size(), "Size should be 2 after pushing two elements");

        stack.push(3); // This should trigger a resize
        assertEquals(3, stack.size(), "Size should be 3 after pushing three elements");
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek(), "Peek should return the last pushed element");
        //check that the element is still there
        assertEquals(2, stack.peek(), "Peek should return the last pushed element and don't delete it");
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop(), "Pop should return the last pushed element");
        assertEquals(2, stack.pop(), "Pop should return the second last pushed element");
        assertEquals(1, stack.pop(), "Pop should return the first pushed element");
    }
   //Verifican que se lancen excepciones adecuadas al intentar hacer pop o peek en una pila vacía.
    @Test
    public void testPopFromEmptyStack() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.pop();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testPeekFromEmptyStack() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            stack.peek();
        });
        assertEquals("Stack is empty", exception.getMessage());
    }
}

