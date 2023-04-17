public class DummyFile {
    public static void main(String[] args) {
        System.out.println("Print array in reverse");
        int[ ] nums = {3, 8, 5, 2}; // index : 0, 1, 2, 3, 4 ,  length  :5
        for (int i=nums.length-1 ; i >= 0 ; i--) {
            System.out.println(nums[i]);
        }


    }
}
