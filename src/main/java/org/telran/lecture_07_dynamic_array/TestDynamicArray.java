package org.telran.lecture_07_dynamic_array;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray data = new DynamicArray();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
//        System.out.println(Arrays.toString(data.getArray()));
        System.out.println(data); // нативная
    }
}