package com.company.Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void executeTask() throws Exception {
        Subject math = new Subject("Math", 100);
        Subject prog = new Subject("Programming", 100);
        Subject extra = new Subject("Extracurricular Activities", 50);

        List<Subject> subjects = List.of(math, prog, extra);

        Map<Subject, Mark> stud1Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(75));
            put(prog, new Mark(97));
            put(extra, new Mark(49));
        }};

        Map<Subject, Mark>  stud2Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(55));
            put(prog, new Mark(90));
            put(extra, new Mark(39));
        }};

        Map<Subject, Mark>  stud3Marks = new HashMap<Subject, Mark>(){{
            put(math, new Mark(99));
            put(prog, new Mark(47));
            put(extra, new Mark(45));
        }};

        Student stud1 = new Student("Vitalii", "Drapak", subjects, stud1Marks);
        Student stud2 = new Student("Artem", "Derid", subjects, stud2Marks);
        Student stud3 = new Student("Anna", "Didukh", subjects, stud3Marks);

        Course course = new Course(List.of(stud1, stud2, stud3));
        course.calculateRating();
        course.showAllStudentsInfo();
        course.showStudentWithTheHighestMark();
        String lastNames = course.getPrintLastName();
        System.out.println("lastNames: " + lastNames);
    }
}
