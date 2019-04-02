/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.Scanner;

/**
 * StudentManger - Main class to run the application.
 * @author ayush
 */
public class StudentManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCase;

        //input for number of test cases
        noOfTestCase = sc.nextInt();
        String inputStr;
        String[] inputs;
        String name;
        float cgpa;
        int tokenNumber;
        while (noOfTestCase-- >= 0) {
            try {
                inputStr = sc.nextLine();
                inputs = inputStr.split(" ");
                switch (inputs[0].toUpperCase()) {
                    case "ENTER":
                        name = inputs[1];
                        cgpa = Float.parseFloat(inputs[2]);
                        tokenNumber = Integer.parseInt(inputs[3]);
                        StudentQueue.enter(new Student(name, cgpa, tokenNumber));
                        break;
                    case "SERVED":
                        StudentQueue.serve();
                        break;
                    default:
                    //INVALID Input
                }
            }catch(Exception e){
                //To catch exception due to Unexpected error while parsing Input
            }
        }
        //print the remaning the students list
        StudentQueue.printList();
    }

}
