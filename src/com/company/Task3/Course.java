package com.company.Task3;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Course {
    private List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void calculateRating() throws Exception {
        for (Student stud : students){
            System.out.println("Prosperity of the " + stud.getFirstName() + " " + stud.getLastName() +  ": " + stud.calculateProsperityInPercent());
        }
    }

    public void addSubjectForAllStudents(Subject subject){
        for (Student student : students){
            student.getSubjectList().add(subject);
            student.getSubjectToMark().put(subject, new Mark(0));
        }
    }

    public void showAllStudentsInfo() {
        for (Student student : students) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            for (Subject subject : student.getSubjectList()){
                System.out.println(subject.getName() + ": " + student.getSubjectToMark().get(subject).getDefinedMark());
            }
            System.out.println("-----------------------------");
        }
    }

    public void showStudentWithTheHighestMark() throws Exception {
        Map<Integer, List<Student>> markToStudents = new HashMap<>();
        for (Student stud : students){
            int mark = stud.calculateProsperityInPercent();
            if (markToStudents.containsKey(mark)){
                markToStudents.get(mark).add(stud);
            }else{
                markToStudents.put(mark, List.of(stud));
            }
        }
        int maxMark = 0;

        for (Integer mark : markToStudents.keySet()){
            if (maxMark < mark){
                maxMark = mark;
            }
        }

        for (Student stud : markToStudents.get(maxMark)) {
            System.out.println("Student with the highest mark: " + stud.getFirstName() + " " + stud.getLastName());
            System.out.println("Mark: " + maxMark);
        }
    }

    public List<Student> filterUser() {
        return students.stream().
                filter(e -> {
                    try {
                        return e.calculateProsperityInPercent() > 3.0;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public String getPrintLastName() {
        return students.stream()
                .map(Student::getLastName)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("Something went wrong");
    }

    public void sortListStudents() {
        students.sort (Comparator.comparing (Student::getFirstName)
                        .thenComparing (Student::getLastName));
    }
}
