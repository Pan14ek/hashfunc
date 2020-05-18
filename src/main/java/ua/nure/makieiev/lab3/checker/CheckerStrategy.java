package ua.nure.makieiev.lab3.checker;

public interface CheckerStrategy {

    String check(String correctInformation, String fakeInformation, int numberBits);

}