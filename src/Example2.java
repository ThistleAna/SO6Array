public class Example2 {
    public static void main(String[] args) {
        // array = collection of data (same data type)
        // declare an array
        int [] age = new int [5]; // creating 1 row, 10 col of table

        age [0] = 15; // insert data/element into the array
        age [1] = 15;
        age [2] = 20;
        age [3] = 17;
        age [4] = 16;

        // length of array = how many data inside the array
        int data = age.length;
        System.out.println(age[0]);
        System.out.println("Length of the array is " + age.length);

    }
}
