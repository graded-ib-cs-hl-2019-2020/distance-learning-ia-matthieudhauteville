/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;
/**
 *
 * @author Matthieu
 */
public class Input {
    
    /**
     *
     */
    public static GUI1 gui1;
    
    public static void main(String[] args) {
        /* Create and display the GUI */
        
    }
    
    
    
    public static String arca = gui1.getArca();
    public static String firstname = gui1.getFirst();
    public static String lastname = gui1.getLast();
    public static int birthyear = gui1.getBirth();
    public static String course = gui1.getCourse();
    public static String gender = gui1.getGender();
    public static int numStudents = 0;
    public static int code = numStudents+1;
    public static Student students[] = new Student[10];
    
    public static void addStudent() {
        students[numStudents] = new Student(arca, firstname, lastname, birthyear, course, gender, code);
        numStudents++;    
    }
}
