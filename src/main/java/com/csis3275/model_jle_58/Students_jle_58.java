package com.csis3275.model_jle_58;

import java.io.Serializable;

public class Students_jle_58 implements StudentInterface_jle_58, Serializable {

	private static final long serialVersionUID = 1L;

	protected String firstName;
	protected String lastName;
	protected boolean isInternational;
	protected String semester;
	protected String grade1;
	protected String grade2;
	protected String grade3;
	protected String grade4;
	protected String grade5;

	protected int numOfCourses;
	protected double totalGrade;
	protected String typeOfStudent;

	public Students_jle_58() {
		super();
	}

	public Students_jle_58(String firstName, String lastName, boolean isInternational, String semester, String grade1,
			String grade2, String grade3, String grade4, String grade5, String typeOfStudent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isInternational = isInternational;
		this.semester = semester;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.grade5 = grade5;
		this.typeOfStudent = typeOfStudent;

		this.totalGrade = 10;
		this.numOfCourses = 1;
	}

	public String getTypeOfStudent() {
		return typeOfStudent;
	}

	public void setTypeOfStudent(String typeOfStudent) {
		this.typeOfStudent = typeOfStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getGrade1() {
		return grade1;
	}

	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}

	public String getGrade2() {
		return grade2;
	}

	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}

	public String getGrade3() {
		return grade3;
	}

	public void setGrade3(String grade3) {
		this.grade3 = grade3;
	}

	public String getGrade4() {
		return grade4;
	}

	public void setGrade4(String grade4) {
		this.grade4 = grade4;
	}

	public String getGrade5() {
		return grade5;
	}

	public void setGrade5(String grade5) {
		this.grade5 = grade5;
	}

	public double getTotalGrade() {
		return this.totalGrade;
	}

	public int getNumOfCourses() {
		return this.numOfCourses;
	}

	@Override
	public double calGrade() {
		double convGrade;
		convGrade = convertGrade(grade1);
		if (convGrade != -1) {
			totalGrade += convGrade;
		}
		convGrade = convertGrade(grade2);
		if (convGrade != -1) {
			totalGrade += convGrade;
		}
		convGrade = convertGrade(grade3);
		if (convGrade != -1) {
			totalGrade += convGrade;
		}
		convGrade = convertGrade(grade4);
		if (convGrade != -1) {
			totalGrade += convGrade;
		}
		convGrade = convertGrade(grade5);
		if (convGrade != -1) {
			totalGrade += convGrade;
		}

		System.out.println("total grade: " + totalGrade + "  numOfCourses is " + numOfCourses);
		if (numOfCourses == 0)
			return -1;
		else
			return totalGrade / numOfCourses;

	}

	@Override
	public double convertGrade(String grade) {
		double numGrade = -1;
		switch (grade) {
		case "None":
			numGrade = -1;
			break;
		case "A+":
			numGrade = 4.33;
			numOfCourses++;
			break;
		case "A":
			numGrade = 4;
			numOfCourses++;
			break;
		case "A-":
			numGrade = 3.67;
			numOfCourses++;
			break;
		case "B+":
			numGrade = 3.33;
			numOfCourses++;
			break;
		case "B":
			numGrade = 3;
			numOfCourses++;
			break;
		case "B-":
			numGrade = 2.67;
			numOfCourses++;
			break;
		case "C+":
			numGrade = 2.33;
			numOfCourses++;
			break;
		case "C":
			numGrade = 2;
			numOfCourses++;
			break;
		case "F":
			numGrade = 0;
			numOfCourses++;
			break;
		case "W":
			numGrade = 0;
			break;
		case "UN":
			numOfCourses++;
			numGrade = -1;
			break;
		case "":
			numGrade = 0;
			break;
		default:
			break;
		}
		return numGrade;
	}

	public void copyAttributes(Students_jle_58 student) {
		this.firstName = student.firstName;
		this.lastName = student.lastName;
		this.isInternational = student.isInternational;
		this.semester = student.semester;
		this.grade1 = student.grade1;
		this.grade2 = student.grade2;
		this.grade3 = student.grade3;
		this.grade4 = student.grade4;
		this.grade5 = student.grade5;
		this.numOfCourses = student.numOfCourses;
		this.totalGrade = student.totalGrade;
		this.typeOfStudent = student.typeOfStudent;
		this.totalGrade = calGrade();
	}

}
