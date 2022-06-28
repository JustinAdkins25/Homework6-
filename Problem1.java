
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Please enter a positive number: ");
            n = scan.nextInt();

        }


        int[] intarray = new int[n];

        System.out.println("Please enter " + n + " integers, greater than 0: ");
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = scan.nextInt();

        }
        System.out.print("Your entered: ");
        for (int i = 0; i < intarray.length; i++) {
            System.out.print(intarray[i]);
            System.out.print(" ");
        }

        int min = intarray[0];
        int max = intarray[0];
        int sum = 0;
        double avg = 0;
        System.out.println(" ");
        for (int i = 0; i <= intarray.length - 1; i++) {


            if (intarray[i] > max) {
                max = intarray[i];
            }
            if (intarray[i] < min) {
                min = intarray[i];
            }


            sum += intarray[i];

            //  sum = sum + intarray[0];
            avg = (double) sum / intarray.length;

        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Average: " + avg);

        System.out.println("Elements greater than average: ");
        for (int count = 0; count < intarray.length - 1; count++) {

            if (intarray[count] > avg) {


                System.out.print(intarray[count] + " ");

            }
        }


        System.out.println(" ");
        System.out.println("Elements greater than: " + intarray[intarray.length - 1]);

        for (int count = 0; count < intarray.length; count++) {
            if (intarray[count] > intarray[intarray.length - 1]) {
                System.out.print(intarray[count] + " ");
            }
        }

        System.out.println();

        System.out.println("Array in reverse order: ");
        for(int x= intarray.length-1; x>= 0; x--){
            System.out.print(intarray[x]+" ");
        }

    }
    }


