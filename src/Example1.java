public class Example1 {
    public static void main(String[] args) {
        // array = collection of same data type datas
        // initialise array and put all datas inside
        String [] fNames = {"Harry", "Ron", "Draco", "Hermione", "Ginny", "Neville"};
        //  index = 0 to 5, length = 6
        // print each data using index number
        System.out.println(fNames[0]); // output Harry
        System.out.println(fNames[1]); // output Ron
        System.out.println(fNames[2]); // output Draco

        // find the length or how many datas inside array
        System.out.println("The array length is " + fNames.length);

        // automate and display all datas inside the array using for loop
        System.out.println("Display using for loop:");
        for (int index=0; index < fNames.length; index++){
            System.out.println(fNames[index]);
        }

        // use for-each loop to display all elements
        System.out.println("Display  using for-each loop:");
        for (String index: fNames){
            System.out.println(index); // just display the index not the name of the array
        }
    }
}
