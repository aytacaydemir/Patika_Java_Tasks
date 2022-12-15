package org.aytac;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int seri = 0;
        for (int i = 0; i < numbers.length; i++) {
        	
            seri = numbers[i]/(i+1);
        }

        System.out.println(numbers.length/seri);
    }
}