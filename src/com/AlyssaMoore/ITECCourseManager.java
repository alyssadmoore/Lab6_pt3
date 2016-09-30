package com.AlyssaMoore;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        ArrayList<ITECCourse> ITECCourseList = new ArrayList();

        ITECCourse infotech = new ITECCourse("Info Tech Concepts", 1100, 5, "T3050");
        infotech.addStudent("Max");
        infotech.addStudent("Nancy");
        infotech.addStudent("Orson");
        ITECCourseList.add(infotech);

        ITECCourse java = new ITECCourse("Java Programming", 2545, 3, "T3010");
        java.addStudent("Donald");
        java.addStudent("Hillary");
        ITECCourseList.add(java);

        for (ITECCourse course : ITECCourseList) {
            System.out.println("Name: " + course.getName());
            System.out.println("Free spaces: " + course.freeSpaces() + "\r\n");
        }
    }
}