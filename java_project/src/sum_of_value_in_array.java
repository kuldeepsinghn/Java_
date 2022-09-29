public class sum_of_value_in_array {
    public static void main(String[] args) {
        int an_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : an_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}