package Lesson18_Arrays;

public class Test6_minMax {
    public static void maxMin(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max element = " + max);
        System.out.println("Min element = " + min);
    }

    public static void main(String[] args) {
        double[] arr1 = {-1.2, 4.5, 3.0, 25.45, 100, 99};
        maxMin(arr1);
        maxMin(new double[] {1, -5, 3.25, 1.2, 99, 55, 33});

    }
}
