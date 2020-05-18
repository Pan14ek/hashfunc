package ua.nure.makieiev.lab3.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.stream.IntStream;

public class HashFunction {

    private HashFunction() {
    }

    public static int calculateHash(String message, int amountBits) {
        String md5Message = DigestUtils.md5Hex(message);
        String bits = SymbolConverter.convertByteToBinary(md5Message.getBytes());
        String[] arrayBits = bits.split("");
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(arrayBits.length - amountBits, arrayBits.length)
                .forEach(i -> stringBuilder.append(arrayBits[i]));
        return Integer.parseInt(stringBuilder.toString(), 2);
    }

}