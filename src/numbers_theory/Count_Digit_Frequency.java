package numbers_theory;

public class Count_Digit_Frequency {
    public static void main(String[] args) {
        int number = 12345611;
        int frequency_of = 1;
        int count_digit = 0;
        while (number > 0){
            int rem = number % 10;
            if (rem == frequency_of){
                count_digit++;
            }
            number = number / 10;
        }
        System.out.println(count_digit);
    }
}

//output-: 3