package quanlydanhsachsinhviensudungArrayList;

import java.util.Scanner;

public class AddStudent extends Student {

//	public AddStudent(String id) {
//		super(id);
//	}

	public void addStudent() {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Nhap ma sinh vien:");
				setId(input.nextLine());
				System.out.println("Nhap ten:");
				setName(input.nextLine());
				System.out.println("Nhap nam sinh:");
				setYearOfBirth(input.nextInt());
				System.out.println("Nhap diem trung binh:");
				setScore(input.nextFloat());
				System.out.println("Da them thanh cong: " + getName());
				break;

			} catch (Exception e) {
				input.nextLine();
				System.out.println("Nhap sai dinh dang, vui long nhap lai");
			}
		}
	}
}
