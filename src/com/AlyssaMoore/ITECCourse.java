package com.AlyssaMoore;

import java.util.ArrayList;

public class ITECCourse {

    protected String name;
    protected int code;
    protected ArrayList<String> students;
    protected int maxStudents;
    protected String room;

    ITECCourse(String courseName, int courseCode, int courseMaxStudents, String roomNum) {

        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList();
        room = roomNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;

    }
    public int getCode() {
        return code;
    }

    public void setCode(int newcode) {
        code = newcode;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String newRoom) {
        room = newRoom;
    }

    void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Sorry, course is full. Cannot enroll " + studentName + " to " + name);
        } else {
            students.add(studentName);
        }
    }

    void removeStudent(String name) {
        if (students.contains(name)) {
            students.remove(name);
        } else {
            System.out.println(name + " is not enrolled.");
        }
    }

    int getNumberOfStudents() {
        return students.size();
    }

    void writeCourseInfo () {
        ArrayList courseInfo = new ArrayList();
        courseInfo.add(0, getName());
        courseInfo.add(1, getCode());
        courseInfo.add(2, getMaxStudents());
        courseInfo.add(3, getRoom());
        System.out.println(courseInfo);
    }

    int freeSpaces () {
        int spaces = (getMaxStudents() - getNumberOfStudents());
        return spaces;
    }
}