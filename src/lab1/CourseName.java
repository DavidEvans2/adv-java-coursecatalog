package lab1;

import javax.swing.*;

public abstract class CourseName {
    private String courseName;
    private String courseNumber;
    private double credits;

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits)
    {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,"Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public final void setCourseName(String courseName)
    {
        if(courseName == null || courseName.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Slow your roll pardner! the CourseName can't be empty!");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber()
    {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber)
    {
        if (courseNumber == null || courseNumber.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Howdy. Please enter the CourseNumber instead of leaving an empty string." +
                    "Much obliged.");
        }
        this.courseNumber = courseNumber;
    }
}
