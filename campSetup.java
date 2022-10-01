/*
Problem Statement
Given N points on 2D plane, you have to setup a camp at a point such that sum of Manhattan distance all the points from that point is minimum. If there are many such points you have to find the point with minimum X coordinate and if there are many points with same X coordinate, you have to minimize Y coordinate.
Manhattan distance between points (x1, y1) and (x2, y2) = |x1 - x2| + |y1 - y2|.
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long arr1[]= new long[N];
        long arr2[]= new long[N];
        for(int i =0;i<N;i++){
            arr1[i] = s.nextLong();
            arr2[i] = s.nextLong();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int mid = (int)(Math.ceil((double)(N / 2.0) - 1));
        System.out.print(arr1[mid] + " " + arr2[mid]);
    }
}