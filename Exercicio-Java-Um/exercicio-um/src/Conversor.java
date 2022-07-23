public class Conversor {
    public static float conversor (String number) {
        float convertedNumber = 0;
        try {
            convertedNumber = Float.parseFloat(number);
        } catch (NumberFormatException error) {
            System.out.println("Valor informado não é número.");
        }
        return convertedNumber;
    }
    public static int conversorInt (String number) {
        int convertedNumber = 0;
        try {
            convertedNumber = Integer.parseInt(number);
        } catch (NumberFormatException error) {
            System.out.println("Valor informado não é número.");
        }
        return convertedNumber;
    }
}
