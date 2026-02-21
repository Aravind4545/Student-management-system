package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class crudoperations {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/crud";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		int ch;
		do {
			Scanner sc = new Scanner(System.in);
			displaymenu();

			ch = Integer.parseInt(sc.next());
			switch (ch) {
			case 1:
				insertion();
				break;
			case 2:
				deletion();
				break;
			case 3:
				updation();
				break;
			case 4:
				studentdetails();
				break;
			case 5:
				allstudentsdata();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (ch > 0);
	}

	private static void allstudentsdata() {
		try {

			Class.forName(null);
			Connection con = DriverManager.getConnection(null, null, null);
			PreparedStatement pmst = con.prepareStatement(null);
			pmst.executeUpdate();
			con.close();
			pmst.close();

		} catch (Exception e) {
			e.printStackTrace(); // type of error
		}

	}

	private static void studentdetails() {
		try {

			Class.forName(null);
			Connection con = DriverManager.getConnection(null, null, null);
			PreparedStatement pmst = con.prepareStatement(null);
			pmst.executeUpdate();
			con.close();
			pmst.close();

		} catch (Exception e) {
			e.printStackTrace(); // type of error
		}

	}

	private static void updation() {
		try {

			Scanner sc = new Scanner(System.in);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "update register set pinno=?, email=?, username=?, password=? where pinno=?";
			PreparedStatement pmst = con.prepareStatement(sql);
			System.out.println("Enter old pinno:");
			pmst.setString(5, sc.next());
			System.out.println("Enter new pinno:");
			pmst.setString(1, sc.next());
			System.out.println("Enter new email:");
			pmst.setString(2, sc.next());
			System.out.println("Enter new username:");
			pmst.setString(3, sc.next());
			System.out.println("Enter new password:");
			pmst.setString(4, sc.next());
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Data updated.");
			} else {
				System.out.println("Data not updated.");
			}
			con.close();
			pmst.close();

		} catch (Exception e) {
			e.printStackTrace(); // type of error
		}

	}

	private static void deletion() {
		try {

			Class.forName(null);
			Connection con = DriverManager.getConnection(null, null, null);
			PreparedStatement pmst = con.prepareStatement(null);
			pmst.executeUpdate();
			con.close();
			pmst.close();

		} catch (Exception e) {
			e.printStackTrace(); // type of error
		}

	}

	private static void insertion() {
		try {

			Scanner sc = new Scanner(System.in);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "insert into register(pinno, email, username, password) values(?,?,?,?)";
			PreparedStatement pmst = con.prepareStatement(sql);
			System.out.println("Enter pinno:");
			pmst.setString(1, sc.next());
			System.out.println("Enter email:");
			pmst.setString(2, sc.next());
			System.out.println("Enter username:");
			pmst.setString(3, sc.next());
			System.out.println("Enter password:");
			pmst.setString(4, sc.next());
			int i = pmst.executeUpdate();
			if (i > 0) {
				System.out.println("Data added.");
			} else {
				System.out.println("Data not added.");
			}
			con.close();
			pmst.close();

		} catch (Exception e) {
			e.printStackTrace(); // type of error
		}

	}

	private static void displaymenu() {
		System.out.println("Select the option:");
		System.out.println("\t1.insertion");
		System.out.println("\t2.deletebypinno");
		System.out.println("\t3.updatebypinno");
		System.out.println("\t4.studentdetailsbypinno");
		System.out.println("\t5.getallstudentdata");
		System.out.println("\t6.exit");
	}

}
