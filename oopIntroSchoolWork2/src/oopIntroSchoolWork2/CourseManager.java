package oopIntroSchoolWork2;

import java.util.Scanner;

public class CourseManager {

	public void createCourse(Course[] courses) {

		for (Course course : courses) {
			System.out.println(course.getName() + "Kursu oluþturuldu.");
		}
	}

	public void addCourseToInstructor(Person[] persons, Course[] courses) {
		Scanner inputCourseId = new Scanner(System.in);
		System.out.println("Hangi Kursa eðitmen atamak istiyorsunuz? Id' sini giriniz :");
		int courseId = inputCourseId.nextInt();

		Scanner inputInstructorId = new Scanner(System.in);
		System.out.println("Atanacak eðitmenin id' sini giriniz :");
		int instructorId = inputInstructorId.nextInt();

		if (Controller.isExistCourse(courses, courseId)) {
			for (Course course : courses) {
				if (course.getId() == courseId) {
					for (Person person : persons) {
						if (person.getId() == instructorId) {
							Instructor instructor = (Instructor) person;
							course.setInstructor(instructor);
							instructor.setCourse(course);
						}
					}
				}
			}
		} else {
			System.out.println("Girilen id' de kurs mevcut deðildir. Verinizi kontrol ediniz.");
		}
	}
}
