package com.GreatLearning.Service;

import com.GreatLearning.model.Employee;

public class CredentialService {
    public static String randomCharacter(int length) {
        String randomPassword = "";

        for (int j = 0; j < length; j++) {
            int rand = (int) (Math.random() * 62);
            if (rand <= 9) {
                int number = rand + 48;
                randomPassword += (char)(number);
            } else if (rand <= 35) {
                int uppercase = rand + 55;
                randomPassword +=(char) (uppercase);
            } else {
                int lowercase = rand + 61;
                randomPassword += (char) (lowercase);
            }
        }
        System.out.println(randomPassword);
        return randomPassword;
    }
    public static String GenEmail(Employee emp){
        return emp.getFirstName()+emp.getLastName()+"@"+emp.getDepartment()+".Gl.com";
    }
}
