
public class Main {
    public static void main(String[] args) {
        // String roman = "MCMXCIV";
        String roman = "II";

        try {
            int result = RomanToInteger.romanToInt(roman);
            System.out.println("Integer value of the Roman numeral " + roman + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
