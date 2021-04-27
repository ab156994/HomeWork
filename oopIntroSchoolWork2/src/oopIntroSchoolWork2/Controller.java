package oopIntroSchoolWork2;

public class Controller {

	public static boolean isExistUser(Person[] persons, int userId) {
		for (Person person : persons) {
			if (person.getClass().getSimpleName().contains("User") && person.getId() == userId) {
				return true;
			}
		}
		return false;
	}

	public static boolean isExistCourse(Course[] courses, int courseId) {

		for (Course course : courses) {
			if (course.getId() == courseId) {
				return true;
			}
		}
		return false;
	}

	public static boolean isExistInstructor(Person[] persons, int instructorsId) {

		for (Person person : persons) {
			if (person.getClass().getSimpleName().contains("Instructor") && person.getId() == instructorsId) {
				return true;
			}
		}
		return false;
	}

}
