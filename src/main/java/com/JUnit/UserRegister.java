package com.JUnit;

import java.util.regex.Pattern;

public class UserRegister {
    private static final String NAME = "[A-Z][a-z]{2,}";
    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public UserRegisterInterface FirstNameValidate = FirstName -> {
        boolean result = Pattern.matches(NAME, FirstName);
        if (result){
            return result;
        } else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,"Invalid Firsrt Name");
        }
    };

    public UserRegisterInterface LastNameValidate = LastName -> {
        boolean result = Pattern.matches(NAME, LastName);
        if (result){
            return result;
        }else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,"Invalid Last Name");
        }
    };

    public UserRegisterInterface EmailValidate = Email -> {
        boolean result =  Pattern.matches(EMAIL, Email);
        if(result){
            return result;
        }else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL,"Invalid Email");
        }
    };

    public UserRegisterInterface PhoneNumberValidate = PhoneNumber -> {
        boolean result = Pattern.matches(PHONE_NUMBER, PhoneNumber);
        if(result){
            return result;
        }else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,"Invalid Phone Number");
        }
    };

    public UserRegisterInterface PasswordValidate = Password -> {
        boolean result = Pattern.matches(PASSWORD, Password);
        if(result){
            return result;
        }else{
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,"Invalid Password");
        }
    };
}
