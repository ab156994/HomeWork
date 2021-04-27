package oopIntroSchoolWork2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs",
				"PYTHON,JAVA,C# gibi t�m programlama dilleri i�in temel programlama mant��� anla��l�r.", null);
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#+Angular)", null, null);
		Course course3 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java+React)", null, null);
		Course[] courses = { course1, course2, course3 };
		CourseManager courseManager = new CourseManager();
		courseManager.createCourse(courses); // Kurslar olu�turulup console bas�l�yor.

		/*-----------------------------------------------------------------------------------------------------*/

		User person1 = new User(1, "Selim", "Murat", "selim.murat@windowslive.com", "123456", 0, course1);
		User person2 = new User(2, "Adem", "Co�kun", "adem.coskun@windowslive.com", "111111", 0, course2);
		User person3 = new User(3, "Ali", "Bozyil", "ali.bozyil@windowslive.com", "222222", 0, null);
		User person4 = new User(4, "Serdar", "Demir", "serdar.demir@windowslive.com", "333333", 0, course3);
		Instructor person5 = new Instructor(1, "Engin", "Demiro�", "engin.demirog@windowslive.com", "88888", null);
		Instructor person6 = new Instructor(2, "Kerem", "Var��", "kerem.varis@windowslive.com", "123321", null);

		Person[] persons = { person1, person2, person3, person4, person5, person6 };
		PersonManager personManager = new PersonManager();
		personManager.createPerson(persons); // Olu�turulan ki�ilerin kullan�c� ve e�itmen oldu�u ekrana bast�r�lr.
		personManager.updatePercentToUserCourse(persons); // consoledan girilen ki�i id ile kurs y�zdesi g�ncelleme
															// yap�l�r.
		personManager.addUserToCourse(courses, persons);
		
		courseManager.addCourseToInstructor(persons, courses);
		
		/******************************************************************************************************************/
		
		System.out.println("/********** Program ��kt�s� ***********************/");

		// hocam e�er incelerseniz �dev yeti�medi yar�m kald� kusura bakmay�n hem i� hem �oluk �ocuk vakit bulunca arada derede anca yapabildim m�hendislik yok sizden ��rendim kadaryla bi�eyler yapmaya �al���yorum.

	}

}
