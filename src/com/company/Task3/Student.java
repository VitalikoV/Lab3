package com.company.Task3;

import java.util.List;
import java.util.Map;

public class Student {
    private String id;
    private final String firstName;
    private final String lastName;
    private List<Subject> subjectList;
    private Map<Subject, Mark> subjectToMark;



    public Student(String firstName, String lastName, List<Subject> subjectList, Map<Subject, Mark> subjectToMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectList = subjectList;
        this.subjectToMark = subjectToMark;
    }

    public int calculateProsperityInPercent()  {
        boolean isSizeAreEqual = subjectToMark.values().size() != subjectList.size();
        boolean isListContainsSubjects = subjectList.containsAll(subjectToMark.keySet());
        boolean isMapContainsSubjects = subjectToMark.keySet().containsAll(subjectList);
        if(isSizeAreEqual || !isListContainsSubjects|| !isMapContainsSubjects){
            System.out.println("Prosperity can't be calculated cause not all subjects have marks");
             return 0;
        }
        return calculateProsperity(subjectToMark, 0, subjectList.size());
    }

    private int calculateProsperity(Map<Subject, Mark> subjectToMark, int currentSubjectNumber , int numberOfSubjects){
        Subject currentSubject = subjectList.get(currentSubjectNumber);
        Mark currentMark = subjectToMark.get(currentSubject);
        int markNumber = currentMark.getDefinedMark() <= currentSubject.getMaxMark()? currentMark.getDefinedMark() : currentSubject.getMaxMark();
        if (currentSubjectNumber == numberOfSubjects-1)
            return markNumber;

        if (currentSubjectNumber== 0)
            return ((markNumber + calculateProsperity(subjectToMark, currentSubjectNumber+1, numberOfSubjects))/numberOfSubjects);

        return (markNumber + calculateProsperity(subjectToMark, currentSubjectNumber+1, numberOfSubjects));
}

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Map<Subject, Mark> getSubjectToMark() {
        return subjectToMark;
    }

    public void setSubjectToMark(Map<Subject, Mark> subjectToMark) {
        this.subjectToMark = subjectToMark;
    }

}
