package com.company.Task3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSimple {

    private String id;
    private String firstName;
    private String lastName;

    public StudentSimple() {
    }

    public StudentSimple(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentSimple(Student student){
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
    }

    public List<StudentSimple> transformFromStudent(List<Student> students) {
        return students.stream()
                .map(StudentSimple::new)
                .collect(Collectors.toList());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
