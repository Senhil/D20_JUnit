package com.JUnit;

@FunctionalInterface
public interface UserRegisterInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}