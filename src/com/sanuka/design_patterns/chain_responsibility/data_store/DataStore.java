package com.sanuka.design_patterns.chain_responsibility.data_store;

import java.util.HashSet;
import java.util.Set;

public class DataStore {

    Set<String> academicStaff = new HashSet<>();
    Set<String> demonstratorStaff = new HashSet<>();
    Set<String> nonAcademicStaff = new HashSet<>();
    Set<String> students = new HashSet<>();

    public DataStore() {
        assignEmails();
    }

    private void assignEmails() {
        setAcademicStaffMails();
        setDemonstratorStaffMails();
        setNonAcademicStaffMails();
        setStudentsMails();

    }
    private void setAcademicStaffMails() {
        academicStaff.add("abc@a.com");
        academicStaff.add("cde@a.com");
        academicStaff.add("efg@a.com");
    }

    private void setDemonstratorStaffMails() {
        demonstratorStaff.add("ghi@a.com");
        demonstratorStaff.add("ijk@a.com");
        demonstratorStaff.add("klm@a.com");
    }

    private void setNonAcademicStaffMails() {
        nonAcademicStaff.add("mno@a.com");
        nonAcademicStaff.add("opq@a.com");
        nonAcademicStaff.add("qrs@a.com");
    }

    private void setStudentsMails() {
        students.add("stu@a.com");
        students.add("uww@a.com");
        students.add("xyz@a.com");
    }

    public Set<String> getAcademicStaff() {
        return academicStaff;
    }

    public Set<String> getDemonstratorStaff() {
        return demonstratorStaff;
    }

    public Set<String> getNonAcademicStaff() {
        return nonAcademicStaff;
    }

    public Set<String> getStudents() {
        return students;
    }
}
