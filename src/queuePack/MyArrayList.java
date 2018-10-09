package queuePack;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by dsk15 on 10/8/2018.
 */

public class MyArrayList implements queuePack.List {

    private int size;
    public static final int START_SIZE = 5;
    private Object [] array;

    MyArrayList(){
        array = new Object[START_SIZE];
    }
    @Override
    public void add(Object value) {
        if(size == array.length ){
            Object [] tempResultArray = new Object[(int)(array.length * 1.5)];
            System.arraycopy(array,0,tempResultArray,0,array.length);
            array = tempResultArray;
        }
        array[size] = value;
        size++;
       // System.out.println(size);
       // System.out.println(Arrays.toString(array));
    }

    @Override
    public void add(Object value, int index) {
        if(index < 0 && index > array.length){
            throw new ArrayIndexOutOfBoundsException();
        } else{
            for(int i = 0; i < array.length; i++){

            }
        }

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
