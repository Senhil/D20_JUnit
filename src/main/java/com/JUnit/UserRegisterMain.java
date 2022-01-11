package com.JUnit;

public class UserRegisterMain {
    public static void main(String[] args) {
        UserRegisterUseCases obj = new UserRegisterUseCases();
        obj.ValidateFirstName();
        obj.ValidateLastName();
        obj.ValidateEmail();
        obj.ValidateMobileNoFormat();
        obj.PasswordRuleMinimum8Character();
        obj.PasswordRuleAtleastOneUpperCase();
        obj.PasswordRuleAtleastOneNumericValue();
        obj.PasswordRuleExactlyOneSpecialCharacter();
        obj.ClearAllEmailSample();
    }
}
