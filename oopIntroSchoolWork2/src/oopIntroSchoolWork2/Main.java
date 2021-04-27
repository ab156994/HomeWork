package oopIntroSchoolWork2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giriþ için Temel Kurs",
				"PYTHON,JAVA,C# gibi tüm programlama dilleri için temel programlama mantýðý anlaþýlýr.", null);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(C#+Angular)", null, null);
		Course course3 = new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java+React)", null, null);
		Course[] courses = { course1, course2, course3 };
		CourseManager courseManager = new CourseManager();
		courseManager.createCourse(courses); // Kurslar oluþturulup console basýlýyor.

		/*-----------------------------------------------------------------------------------------------------*/

		User person1 = new User(1, "Selim", "Murat", "selim.murat@windowslive.com", "123456", 0, course1);
		User person2 = new User(2, "Adem", "Coþkun", "adem.coskun@windowslive.com", "111111", 0, course2);
		User person3 = new User(3, "Ali", "Bozyil", "ali.bozyil@windowslive.com", "222222", 0, null);
		User person4 = new User(4, "Serdar", "Demir", "serdar.demir@windowslive.com", "333333", 0, course3);
		Instructor person5 = new Instructor(1, "Engin", "Demiroð", "engin.demirog@windowslive.com", "88888", null);
		Instructor person6 = new Instructor(2, "Kerem", "Varýþ", "kerem.varis@windowslive.com", "123321", null);

		Person[] persons = { person1, person2, person3, person4, person5, person6 };
		PersonManager personManager = new PersonManager();
		personManager.createPerson(persons); // Oluþturulan kiþilerin kullanýcý ve eðitmen olduðu ekrana bastýrýlr.
		personManager.updatePercentToUserCourse(persons); // consoledan girilen kiþi id ile kurs yüzdesi güncelleme
															// yapýlýr.
		personManager.addUserToCourse(courses, persons);
		
		courseManager.addCourseToInstructor(persons, courses);
		
		/******************************************************************************************************************/
		
		System.out.println("/********** Program Çýktýsý ***********************/");

		// hocam eðer incelerseniz ödev yetiþmedi yarým kaldý kusura bakmayýn hem iþ hem çoluk çocuk vakit bulunca arada derede anca yapabildim mühendislik yok sizden öðrendim kadaryla biþeyler yapmaya çalýþýyorum.

	}

}
