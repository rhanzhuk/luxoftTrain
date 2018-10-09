package queuePack;

import java.util.Arrays;

/**
 * Created by dsk15 on 10/8/2018.
 */
public class ArrayQueue {


    Object [] array;
    int size;

    ArrayQueue(){
        array = new Object[5];
    }

    void enqueue(Object value) {
        if (size == array.length) {
            Object[] arrayTemp = new Object[size + 5];
            for (int i = 0; i < array.length; i++) {
                arrayTemp[i] = array[i];
            }
            array = arrayTemp;
        }
        array[size] = value;
        size++;
    }

    Object dequeue() {
        Object [] tempArray = new Object[array.length-1];
        array[0] = null;
        System.arraycopy(array,1,tempArray,0,tempArray.length-1);
        System.out.println();
        return null;
    }

    Object peek() {
        return null;
    }

    int size() {
        return 0;
    }

    // [A, B, C]
    public String toString() {
        return "";
    }
}
