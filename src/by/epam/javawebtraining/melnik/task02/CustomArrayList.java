package by.epam.javawebtraining.melnik.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CustomArrayList<T> extends CustomList<T> {

    public CustomArrayList() {
    }

    public CustomArrayList(int capacity) {
        super(capacity);
    }

    @Override
    public final int size() {
        int size = 0;

        for (int i = 0; i < getList().length; i++) {
            if (getList()[i] != null) {
                size++;
            }
        }

        return size;
    }

    @Override
    public int capacity() {
        return getList().length;
    }

    @Override
    public boolean isEmpty() {

        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }


    //------------------------------------------------
    private T[] increaseAndCopyArray() {
        T[] temp = (T[]) new Object[(int) (getList().length * 1.5) + 1];
        for (int i = 0; i < getList().length; i++) {
//            if (getList()[i] == null) {
//                continue;
//            }
            temp[i] = getList()[i];
        }
//        for (int i = getList().length; i < temp.length; i++) {
//            temp[i] = null;
//        }
        return temp;
    }

    private int takeIndexLastElement() {
        int index = -1;

        for (int i = 0; i < getList().length; i++) {
            if (getList()[i] != null) {
                index = i;
            }
        }
        return index;
    }

    //------------------------------------------------
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }
        return getList()[index];
    }

    public void set(int index, T element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        getList()[index] = element;
    }

    @Override
    public final void add(T t) {
        int index = takeIndexLastElement();

        if (index != getList().length - 1) {
            getList()[index + 1] = t;
        } else {
            T[] temp = (T[]) increaseAndCopyArray();
            setList(temp);
            getList()[index + 1] = t;
        }
    }

    public void add(int index, T element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }
//
        T[] temp = (T[]) new Object[capacity() - index];
        for (int i = index,  j = 0; i < getList().length; i++, j++) {
            temp[j] = getList()[i];
            getList()[i] = null;
        }
        getList()[index] = element;

//
//        for (int i = 0; i < ; i++) {
//
//        }
    }

    @Override
    public final void addAll(CustomCollection<T> collection) {
        int count = collection.size();
        
        for (int i = 0; i < count; i++) {
            add(collection.get(i));
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        T[] temp = (T[]) new Object[capacity() - index - 1];
        for (int i = index, j = 0; i < getList().length; i++, j++) {
            temp[j] = getList()[i];
            getList()[i] = null;
        }

        for (int i = 0, j = index; i < temp.length; i++, j++) {
            getList()[j] = temp[i];
        }
    }

    @Override
    public void remove(T t) {
    }

    @Override
    public void removeAll(T... t) {
    }

    public static void main(String[] args) {
        CustomList<Number> example = new CustomArrayList<>(2);

        example.add(new Integer(10));
        example.add(new Integer(15));
        example.addAll(example);

////        example.add(new Integer(20));
////
//        example.add(new Integer(30));
//        example.add(new Integer(40));

//        ArrayList<Integer> integers = new ArrayList<>(3);
////        integers.add(new Integer(5));
////        integers.add(new Integer(10));
////        integers.add(new Integer(15));
////        integers.set(2, new Integer(2));
//        integers.addAll(integers);


    }
}
