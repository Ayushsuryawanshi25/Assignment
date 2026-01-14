package MiniProject3_StudentManagmentSystem;
	import java.util.*;
	import java.sql.*;
	public class StudentManagmentSystem {

		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			// TODO Auto-generated method stub
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner sc = new Scanner(System.in);
			Operations op = new Operations();
			int choice;
			
			do {
				System.out.println("Add Student Press - 1");
				System.out.println("Display Student Press - 2");
				System.out.println("Display Student in Sorted order Press - 3");
				System.out.println("Update Students Branch Press  - 4");
				System.out.println("Delete Students by Enrollment number Press - 5 ");
				System.out.println("Exit ! Press - 6\n");
				
				System.out.println("Enter Your Choice : ");
				choice  = sc.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.println("Enter enrollment number : ");
					int enrol = sc.nextInt();
					System.out.println("Enter name  : ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter branch : ");
					String branch = sc.nextLine();
					int row = op.addStudent(enrol, name, branch);
					System.out.println(row+" Student Added");
					System.out.println();
					break;
					
				case 2:
					op.display();
					break;
				
				case 3:
					op.displaySorted();
					break;
				
				case 4:
					System.out.println("Enter enrollment :");
					int enrolU= sc.nextInt();
					sc.nextLine();
					System.out.println("Enter branch to be updated :");
					String br = sc.nextLine();
					int updatedrow = op.updateBranch(enrolU,br);
					System.out.println(updatedrow+" row updated of student enrollment "+enrolU);
					break;
				
				case 5:
					System.out.println("Enter enrollment :");
					int enrolD= sc.nextInt();
					int deletedrow = op.deleteStudent( enrolD);
					System.out.println(deletedrow+" row deleted");
					break;
					
				default :
					System.out.println("Invalid Choice!");
					break;
				}
			}while(choice != 6);
			
			
			System.out.println("-----------------------------Thank You For Using Our System---------------------------------------------");
		}

	}
