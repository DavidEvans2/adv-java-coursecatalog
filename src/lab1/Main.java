package lab1;

public class Main {
    public static void main(String[] args)
    {
        //Declaring using Abstract class
        CourseName newAdvancedJava = new AdvancedJavaCourse("AdvancedJava", "A113", "IntroToJava", 3);

        //Declaring as Class Type
        AdvancedJavaCourse extraAdvancedJava = new AdvancedJavaCourse("Advanced Java", "0007", "IntroToJava", 4);

        CourseName newIntJavaCourse = new IntroJavaCourse("intro_java","007","IntroToProgramming",4);
        CourseName newIntroToProgrammingCourse = new IntroToProgrammingCourse("IntroToProgramming", "2319", 3.5);

        System.out.println("Course Name: " + newAdvancedJava.getCourseName() + "\nCourse Number: " + newAdvancedJava.getCourseNumber() +
                "\nCredits: " + newAdvancedJava.getCredits() + "\n");
        System.out.println("Course Name: " + extraAdvancedJava.getCourseName() + "\nCourse Number: " + extraAdvancedJava.getCourseNumber() +
                "\nCredits: " + extraAdvancedJava.getCredits() + "\nPrerequisites: " + extraAdvancedJava.getPrerequisites() + "\n");

        System.out.println("Course Name: " + newIntJavaCourse.getCourseName() + "\nCourse Number: " + newIntJavaCourse.getCourseNumber() +
                "\nCredits: " + newIntJavaCourse.getCredits() + "\n");
        System.out.println("Course Name: " + newIntroToProgrammingCourse.getCourseName() + "\nCourse Number: "
                + newIntroToProgrammingCourse.getCourseNumber() + "\nCredits: " + newIntroToProgrammingCourse.getCredits() + "\n");


    }
}
