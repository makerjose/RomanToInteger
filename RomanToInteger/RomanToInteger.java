public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "XXIV";
        try {
            int result = romanToInt(roman);
            System.out.println("Integer value of the Roman numeral " + roman + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Invalid Roman numeral: Input string is empty or null.");
        }

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = romanCharToInt(c);

            if (currentValue == -1 ) {
                throw new IllegalArgumentException("Invalid Roman numeral: Invalid character encountered.");
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
