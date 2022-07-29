package com.lao.javaLearning;

public class Student {
String student_name;
int rollNo;

//Eample for default constructor
/* do you see any constructors here? Nope! then you have no special powers,
 * compiler has created one here !!! 
 */
	public static void main(String[] args) {
		
Student student = new Student ();
System.out.println(student.student_name);
System.out.println(student.rollNo);
	}

}
