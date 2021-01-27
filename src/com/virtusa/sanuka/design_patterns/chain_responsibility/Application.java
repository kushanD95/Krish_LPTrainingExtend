package com.virtusa.sanuka.design_patterns.chain_responsibility;

import com.virtusa.sanuka.design_patterns.chain_responsibility.constants.MailAccessLevels;
import com.virtusa.sanuka.design_patterns.chain_responsibility.mail_clusters.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senderEmail;
        int mailAccessLevel, restricBoundrAccessLevel;


        StudentsCluster studentsCluster = new StudentsCluster();
        NonAcademicStaffCluster nonAcademicStaffCluster = new NonAcademicStaffCluster();
        DemonstratorStaffCluster demonstratorStaffCluster = new DemonstratorStaffCluster();
        AcademicStaffCluster academicStaffCluster = new AcademicStaffCluster();
        ReceiverSetter receiverSetter = new ReceiverSetter();


        studentsCluster.setSuccessor(nonAcademicStaffCluster);
        nonAcademicStaffCluster.setSuccessor(demonstratorStaffCluster);
        demonstratorStaffCluster.setSuccessor(academicStaffCluster);

        System.out.println("Enter the your Email Address : ");
        senderEmail = scanner.nextLine();
        System.out.println("Enter the Access Level of receivers (Upper Bound) : \n\t1 - Students\n\t2 - Non Academic Staff" +
                "\n\t3 - Demonstrators\n\t4 - Academic Staff");
        mailAccessLevel = scanner.nextInt();
        Mail mail = new Mail(senderEmail,mailAccessLevel);

        System.out.println("Enter the Restrict Access Level of receivers (Lower Bound) : \n\t1 - Students\n\t2 - Non Academic Staff" +
                "\n\t3 - Demonstrators\n\t4 - Academic Staff");
        restricBoundrAccessLevel = scanner.nextInt();

        switch (restricBoundrAccessLevel) {
            case MailAccessLevels.FACULTY_NON_ACADEMIC_STAFF:
                receiverSetter.setSuccessor(nonAcademicStaffCluster);
                break;
            case MailAccessLevels.FACULTY_DEMONSTRATOR_STAFF:
                receiverSetter.setSuccessor(demonstratorStaffCluster);
                break;
            case MailAccessLevels.FACULTY_ACADEMIC_STAFF:
                receiverSetter.setSuccessor(academicStaffCluster);
                break;
            default:
                receiverSetter.setSuccessor(studentsCluster);
        }


        mail = receiverSetter.addReceivers(mail);

        System.out.println("sender : " + mail.getSenderEmail() + "\n");

        for (String email:
             mail.getReceivers()) {
            System.out.println(email);
        }

    }
}
