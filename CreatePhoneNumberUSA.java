package desafios;

public class CreatePhoneNumberUSA {

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(";

        for(int i = 0; i < numbers.length; ++i) {
            String n = Integer.toString(numbers[i]);
            phoneNumber = phoneNumber + n;
            if (i == 2) {
                phoneNumber = phoneNumber + ") ";
            }

            if (i == 5) {
                phoneNumber = phoneNumber + "-";
            }
        }

        return phoneNumber;
    }


}
