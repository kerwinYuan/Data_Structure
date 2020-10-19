package myarray;

import java.util.Arrays;

public class MyArray<E> {
    private E[] data;

    private int size;

    public MyArray(int capacity){
        data = (E[]) new Object[capacity];

        size = 0;
    }

    public MyArray(){
        this(8);
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void add(int index,E e){
        if(size == data.length){
            throw new IllegalArgumentException("data is full");
        }
        if(index < 0 && index > size){
            throw  new IllegalArgumentException("index is illegal");
        }
        for(int i = size ; i >= index ;i--){
            data[i+1] = data[i];
        }
        data[index] = e;

        size++;
    }
    public void addFirst(E e){
        this.add(0,e);
    }

    public void addLast(E e){
        this.add(size,e);
    }

    public E remove(int index){
        if(index < 0 && index > size){
            throw  new IllegalArgumentException("index is illegal");
        }
        E temp = data[index];
        for(int i = index ; i < size ; i++){
            data[i] = data[i+1];
        }
        size--;
        return temp;
    }

    public void update(int index,E e){
        if(index < 0 && index > size){
            throw  new IllegalArgumentException("index is illegal");
        }
        data[index] = e;
    }

    public int contains(E e){
        for(int i = 0 ; i <= size ; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public boolean isExist(E e){
        for(int i = 0 ; i <= size ; i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<Integer>(16);
        ma.add(0,1);
        ma.addLast(2);
        ma.addLast(3);
        System.out.println(ma.toString());
        ma.remove(1);
        System.out.println(ma.toString());
        ma.addFirst(0);
        System.out.println(ma.toString());
    }
}
