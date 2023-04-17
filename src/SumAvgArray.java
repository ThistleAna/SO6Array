public class SumAvgArray {
    public static void main(String[] args) {
        // create integer sum
        int sum =0; // this variable is a container to add 2 number together
        // declare an array of 10 integer values inside the array.
        int [] numbers = {10, 21, 12, 14, 8, 9, 4, 18, 2, 10};
        // print using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
            sum = sum + numbers[i]; // we calculate sum += numbers[i]
        }
        System.out.println("Sum of number is " + sum);

        // calculate the average
        double avg = (double)sum/numbers.length; // TYPE CASTING = changing the datatype from int to doule

        System.out.println("Average is " + avg);

    }
}
