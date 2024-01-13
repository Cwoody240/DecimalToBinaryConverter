public class Converter {
// Define the width of each column for the output
private static final int COLUMN_WIDTH = 15;

/**
 * The main method that serves as the entry point for the program.
 * @param args Command line arguments representing decimal numbers to be converted.
 */
public static void main(String[] args) {
    // Print the title of the columns (Base 10 and Base 2)
    Formatter.printTitle(COLUMN_WIDTH);

    // Loop through each command line argument
    for (String arg : args) {
        // Parse the argument as a double representing a decimal number
        double decimalNumber = Double.parseDouble(arg);

        // Convert the decimal number to its binary representation
        String binaryNumber = BinaryConverter.decimalToBinary(decimalNumber);

        // Print the formatted decimal and binary numbers
        Formatter.printFormattedNumber(decimalNumber, binaryNumber, COLUMN_WIDTH);
    }
}
}