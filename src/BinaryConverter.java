public class BinaryConverter {
    // Maximum number of digits for the binary representation of the fractional part
    private static final int MAX_DIGITS = 8;

    /**
     * Converts a decimal number to its binary representation.
     * @param number The decimal number to convert.
     * @return The binary representation of the decimal number.
     */
    public static String decimalToBinary(double number) {
        // Special case handling for zero
        if (number == 0)
            return " 0";

        StringBuilder binary = new StringBuilder();
        // Extract the integer part of the number
        int integerPart = (int) number;
        // Calculate the fractional part
        double fractionalPart = number - integerPart;

        // Handling for negative numbers
        if (integerPart < 0) {
            binary.append("-");
            integerPart = -integerPart;
            fractionalPart = -fractionalPart;
        }

        // Convert the integer part to binary and append to StringBuilder
        binary.append(convertIntegerToBinary(integerPart));

        // Add an extra space for positive numbers for alignment in output
        if (number >= 0) {
            binary.insert(0, " ");
        }

        // Convert the fractional part to binary if it exists
        if (fractionalPart > 0) {
            binary.append(".");
            binary.append(decimalFractionToBinary(fractionalPart));
        }

        return binary.toString();
    }

    /**
     * Converts the integer part of a decimal number to binary.
     * @param number The integer part of a decimal number.
     * @return Binary string representation of the integer part.
     */
    private static String convertIntegerToBinary(int number) {
        // Special case handling for zero
        if (number == 0)
            return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            // Prepend the binary digit (remainder of division by 2)
            binary.insert(0, (number % 2));
            number /= 2; // Divide the number by 2 for next iteration
        }
        return binary.toString();
    }

    /**
     * Converts the fractional part of a decimal number to binary.
     * @param decimalFraction The fractional part of a decimal number.
     * @return Binary string representation of the fractional part.
     */
    private static String decimalFractionToBinary(double decimalFraction) {
        StringBuilder binary = new StringBuilder();

        // Convert the fractional part to binary within the limit of MAX_DIGITS
        while (decimalFraction > 0 && binary.length() < MAX_DIGITS) {
            decimalFraction *= 2;
            if (decimalFraction >= 1) {
                binary.append('1');
                decimalFraction -= 1; // Subtract 1 to retain only the fractional part
            } else {
                binary.append('0');
            }
        }

        return binary.toString();
    }
}
