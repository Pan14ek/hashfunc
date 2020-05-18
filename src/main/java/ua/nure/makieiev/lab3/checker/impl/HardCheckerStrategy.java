package ua.nure.makieiev.lab3.checker.impl;

import org.apache.commons.lang3.StringUtils;
import ua.nure.makieiev.lab3.checker.CheckerStrategy;
import ua.nure.makieiev.lab3.util.HashFunction;

public class HardCheckerStrategy implements CheckerStrategy {

    @Override
    public String check(String correctInformation, String fakeInformation, int numberBits) {
        int correctHashCode = HashFunction.calculateHash(correctInformation, numberBits);
        int fakeHashCode = HashFunction.calculateHash(fakeInformation, numberBits);
        StringBuilder fakeInfoStringBuilder = new StringBuilder(fakeInformation);
        while (correctHashCode != fakeHashCode) {
            fakeInfoStringBuilder.append(StringUtils.SPACE);
            fakeHashCode = HashFunction.calculateHash(fakeInfoStringBuilder.toString(), numberBits);
        }
        return fakeInfoStringBuilder.toString();
    }

}