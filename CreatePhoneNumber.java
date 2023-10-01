package desafios;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {

        String phoneNumber = PhoneNumber(numbers);

        return phoneNumber;
    }

    public static String PhoneNumber(int[] numeros){
        String phoneNumber = "(";
        for(int i = 0; i < numeros.length; i++){
            String n = Integer.toString(numeros[i]);
            phoneNumber += n;
            if(i == 2) {
                phoneNumber += ") ";
            }
            if(i == 5){
                phoneNumber += "-";
            }
        }
        return phoneNumber;
    }

}
