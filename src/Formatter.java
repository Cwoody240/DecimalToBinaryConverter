public class Formatter {
    /**
     * Prints the title for the columns in the output.
     * 
     * @param columnWidth The width of each column in the output.
     */
    public static void printTitle(int columnWidth) {
        // Print column headers for Base 10 and Base 2, with dynamic spacing
        System.out.printf("%-" + columnWidth + "s | %-" + columnWidth + "s %n", "Base 10", "Base 2");

        // Print a line to separate the headers from the data
        System.out.println(String.format("%-" + (columnWidth * 2 + 3) + "s", "").replace(' ', '-'));
    }

    /**
     * Formats and prints a given decimal number and its binary representation.
     * 
     * @param decimalNumber The decimal number to be formatted and printed.
     * @param binaryNumber  The binary representation of the decimal number.
     * @param columnWidth   The width of each column in the output.
     */
    public static void printFormattedNumber(double decimalNumber, String binaryNumber, int columnWidth) {
        // Format the decimal number, adding a leading space for positive numbers to align with negative numbers
        String formattedDecimal;
        if (decimalNumber < 0) {
            formattedDecimal = String.valueOf(decimalNumber);
        } else {
            formattedDecimal = " " + decimalNumber;
        }

        // Print the formatted decimal number and its binary representation in two columns
        System.out.printf("%-" + columnWidth + "s | %-" + columnWidth + "s%n", formattedDecimal, binaryNumber);
    }
}
