package com.themisinc;

public class Person1 {

	private String firstName;
	private String lastName;
	private int age;
	private char sex;
	private Address address;

	public String toString() {

		return firstName + lastName + age + sex + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		if (firstName.length() <= 30) {

			this.firstName = firstName;
		} else {
			System.out.println("first name is invalid");
		}
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		if (lastName.length() <= 30) {

			this.lastName = lastName;
		} else {

			System.out.println(" last name is invalid");
		}
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		if (age >= 20 && age <= 40) {

			this.age = age;
		} else {

			System.err.println("not a valid age");
		}
	}

	public char getSex() {

		return sex;
	}

	public void setSex(char sex) {

		if (sex == 'M' || sex == 'F') {

			this.sex = sex;
		} else {

			System.err.println("not a valid sex");
		}
	}

	public Address getAddress() {

		return address;
	}

	public void setAddress(Address address) {

		this.address = address;
	}

	public boolean equals(Object obj) {

		boolean result = false;

		if (this.age == ((Person1) obj).age && 
			this.firstName.equals(((Person1) obj).firstName)&& 
			this.lastName.equals(((Person1) obj).lastName) && 
			this.sex==((Person1) obj).sex &&
			this.address.equals(((Person1)obj).address)) {
			
			result = true;

		}
		return result;

	}

}
