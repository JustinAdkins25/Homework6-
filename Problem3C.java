public class Problem3C {

    public static void main(String[] args) {

        int temp;
        int [] arr = {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println();

        temp = arr[0];
        arr[0]= arr[1];
        arr[1]= arr[2];
        arr[2]= arr[3];
        arr[3]= arr[4];
        arr[4]= arr[5];
        arr[5]= arr[6];
        arr[6]= arr[7];
        arr[7]= arr[8];
        arr[8]= arr[9];
        arr[9]= temp;

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}