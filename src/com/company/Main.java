package com.company;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr = {1,3,2,1,2,1,5,3,3,4,2};
        int[] a = {5, 8};
        int[] b = {1,1,1};
        int[]c =  { 2, 3, 5, 3, 5, 9};
        int[]d =  { 5, 3, 5, 3, 5, 9};
        int[]e = {1,3,7,1,9};


        System.out.println("First paint: " + solution(arr));
        System.out.println("2nd paint: " + solution(a));
        System.out.println("3rd paint: " + solution(b));
        System.out.println("3rd paint: " + solution(c));
        System.out.println("4th paint: " + solution(d));
        System.out.println("5th paint: " +solution(e));

    }

    public static int solution(int[] arr) {
        int sum = arr[0];
        int val = arr[0];
        int min = arr[0];

        for (int i = 1; i< arr.length; i++) {

            if (val < arr[i]) {
                min = val;
                val = arr[i];
                sum += (val - min);

            } else {
                val = arr[i];
                min = arr[i];
            }

        }
        return sum >1000000000? -1:sum;
    }

}