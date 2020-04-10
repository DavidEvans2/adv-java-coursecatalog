package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends CourseName {

    String courseNumber;
    private String courseName;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double courseCredits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(courseCredits);
    }

}