package lab2;

public class Main {
    public static void main(String[] args) {

        IntroToProgrammingCourse newIntToProgramming = new IntroToProgrammingCourse("intro_programming","301", 3);
        IntroJavaCourse newIntroJava = new IntroJavaCourse("intro_java","050",3.5,"intro_programming");

        AdvancedJavaCourse newAdvJavaCourse = new AdvancedJavaCourse("adv_java","11010", 4.0, "introToJava");

        System.out.println("Course Name: " + newIntToProgramming.getCourseName() + "\nCourse Number: " +
                newIntToProgramming.getCourseNumber() + "\nCredits: " + newIntToProgramming.getCourseCredits() + "\n");
        System.out.println("Course Name: " + newIntroJava.getCourseName() + "\nCourse Number: " + newIntroJava.getCourseNumber() +
                "\nCredits: " + newIntroJava.getCourseCredits() + "\nPrereqs: " + newIntroJava.getPrerequisites() + "\n");


        System.out.println("Course Name: " + newAdvJavaCourse.getCourseName() +
                "\nCourse Number: " + newAdvJavaCourse.getCourseNumber() + "\nCredits: " + newAdvJavaCourse.getCourseCredits() +
                "\nPrereqs: " + newAdvJavaCourse.getPrerequisites() + "\n");

    }
}