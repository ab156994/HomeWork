package oopIntroSchoolWork2;

public abstract class Person {

	public Person() {
	}

	public Person(int id, String name, String surName, String mailAdress, String sifre) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.mailAdress = mailAdress;
		this.sifre = sifre;
	}
	private int id;
	private String name;
	private String surName;
	private String mailAdress;
	private String sifre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

}
