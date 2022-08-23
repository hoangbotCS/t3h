package quanlydanhsachsinhviensudungArrayList;

import java.util.Scanner;

public class Application {
	public static void menu() {
		System.out.println("Vui long chon cac chuc nang sau: ");
		System.out.println("1.Them sinh vien vao danh sach");
		System.out.println("2.In ra danh sach sinh vien");
		System.out.println("3.Lay ra so luong sinh vien trong danh sach");
		System.out.println("4.Lam rong danh sach sinh vien");
		System.out.println("5.Kiem tra sinh vien co ton tai trong danh sach hay khong ");
		System.out.println("6.Xoa sinh vien ");
		System.out.println("7.Tim kiem 1 sinh vien dua tren ten");
		System.out.println("8.Xuat ra danh sach sinh vien co diem tu cao den thap");
		System.out.println("9.Thoat");
	}

	public static void main(String[] args) {
		ListStudent listStudent = new ListStudent();
		Scanner input = new Scanner(System.in);
		int function = 0;
		while (true) {
			System.out.println("---------------------------------------------------");
			menu();
				try {
					function = input.nextInt();

					while (function < 1 || function > 9) {
						System.out.println("Xin vui long nhap so tu 1 den 9");
						function = input.nextInt();
					}
				} catch (Exception e) {
					System.out.println("Xin vui long nhap so tu 1 den 9");
					break;
				}
				switch (function) {
				case 1:
					AddStudent student = new AddStudent();
					student.addStudent();
					listStudent.addList(student);
					break;
				case 2:
					listStudent.showListStudent();
					break;
				case 3:
					System.out.println("So luong sinh vien hien co: " + listStudent.showSizeList());
					break;
				case 4:
					listStudent.removeAll();
					System.out.println("Da xoa danh sach sinh vien");
					break;
				case 5:
					System.out.println("Nhap ma sinh vien: ");
					input.nextLine();
					String id = input.nextLine();
					listStudent.checkStudent(id);
					break;
				case 6:
					System.out.println("Nhap ma sinh vien muon xoa");
					input.nextLine();
					id = input.nextLine();
					listStudent.deleteStudent(id);
					break;
				case 7:
					System.out.println("Nhap ten sinh vien: ");
					input.nextLine();
					String name = input.nextLine();
					listStudent.checkStudentForName(name);
				default:
					break;
				}

			}
		}
	}

