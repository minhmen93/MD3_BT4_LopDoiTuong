package stopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[100000];
       StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println("In ra Arr : "+ Arrays.toString(arr));
        stopWatch.stop();
         stopWatch.getElapsedTime();
         System.out.println(" Elapsed Time : " +stopWatch.getElapsedTime()+"ms");

    }
}
