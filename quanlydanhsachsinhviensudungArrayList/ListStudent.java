package quanlydanhsachsinhviensudungArrayList;

import java.util.ArrayList;

public class ListStudent {
	private ArrayList<Student> listStudent;

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public ListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public ListStudent() {
		this.listStudent = new ArrayList<Student>();
	}

	public void addList(Student sd) {
		this.listStudent.add(sd);
	}

	public void showListStudent() {
		for (Student student : listStudent) {

			System.out.println(student.toString());
		}
	}

	public int showSizeList() {
		return listStudent.size();
	}

	public void removeAll() {
		listStudent.removeAll(listStudent);
	}

	public void checkStudent(String id) {
		for (Student student : listStudent) {
			if (student.getId().equals(id) == true) {
				System.out.println(student);

			}
		}

	}

	public void deleteStudent(String id) {
		for (int i = 0; i < listStudent.size(); i++) {
			if (listStudent.get(i).getId().equals(id) == true) {
				System.out.println("Da xoa: " + listStudent.get(i));
				listStudent.remove(listStudent.get(i));
			} else {
				System.out.println("Sinh vien khong co trong danh sach, vui long nhap lai");
			}
		}
	}
	public void checkStudentForName(String name) {
		for (Student student : listStudent) {
			if (student.getName().equals(name) == true) {
				System.out.println(student);

			}
		}

	}
}
