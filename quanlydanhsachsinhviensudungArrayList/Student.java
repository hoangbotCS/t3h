package quanlydanhsachsinhviensudungArrayList;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int yearOfBirth;
	private float score;

//	public Student(String id) {
//		this.id = id;
//	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [ma sinh vien = " + id + ", Ten = " + name + ", Nam sinh = " + yearOfBirth
				+ ", Diem trung binh = " + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		return id.compareTo(o.id);
	}

}
