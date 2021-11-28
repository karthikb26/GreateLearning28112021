package com.GreatLearning.Service;

import com.GreatLearning.model.Employee;

import java.util.Random;

public class CredentialService {
    public static String randomCharacter(int length) {
        Random random = new Random();

        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_=+-/.?<>)";

        String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;

        char[] password = new char[length];

        for(int i = 0;i<8;i++) {
            int idx = random.nextInt(allowedChars.length());
            password[i] = allowedChars.charAt(idx);
        }


        return new String(password);

    }
    public static String GenEmail(Employee employee){
        return employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+".Gl.com";
    }

    public void showCredentials(Employee emp,String email,String password) {
        // display credentials
        System.out.println("Dear " + emp.getFirstName() + "- here are your credentials");
        System.out.println("Email Address--> "+email);
        System.out.println("Pasword--> "+password);
    }

}
