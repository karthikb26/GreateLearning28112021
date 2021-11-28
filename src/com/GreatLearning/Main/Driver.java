package com.GreatLearning.Main;

import java.util.Scanner;

import com.GreatLearning.Service.CredentialService;
import com.GreatLearning.model.*;
public class Driver {
    public static void main(String[] args) {
        String randomPassword = "";
        String firstName = "";
        String lastName = "";
        String email = "";
        String dept = "";

        int length = 8;

        System.out.println("Please enter the department from the following \n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        System.out.println("please enter the first name");
        firstName = in.next();
        System.out.println("please enter the Last name");
        lastName = in.next();
        Employee emp;
        switch (choice) {
            case 1:
                dept = "Tech";
                break;
            case 2:
                dept = "Admin";
                break;
            case 3:
                dept = "HR";
                break;
            case 4:
                dept = "Legal";
                break;
            default:
                System.out.println("please enter the valid department code");

                if(dept != ""){
                    emp = new Employee(firstName,lastName,dept);
                    email = CredentialService.GenEmail(emp);
                    randomPassword = CredentialService.randomCharacter(length);
                    System.out.println(email);
                    System.out.println(randomPassword);
                }
        }



    }
}
