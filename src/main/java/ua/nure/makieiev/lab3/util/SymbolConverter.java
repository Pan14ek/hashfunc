package ua.nure.makieiev.lab3.util;

public class SymbolConverter {

    private static final int FIRST_SYMBOL = 1;
    private static final int BINARY_FORMAT = 0x100;

    private SymbolConverter() {
    }

    public static String convertByteToBinary(byte[] lineBytes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte lineByte : lineBytes) {
            String binaryString = getBinaryString(lineByte);
            stringBuilder.append(binaryString);
        }
        return stringBuilder.toString();
    }

    private static String getBinaryString(byte lineByte) {
        return Integer.toBinaryString(BINARY_FORMAT + lineByte).substring(FIRST_SYMBOL);
    }

}