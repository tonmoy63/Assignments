package jdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class start {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User Please Enter Your Name: \n");
		String user = br.readLine();
		System.out.println("Welcome To Student Management App." + user);
		
		
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to UPDATE student");
			System.out.println("PRESS 5 to EXIT");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student
				
				System.out.println("Enter User Name: ");
				String name = br.readLine();
				System.out.println("Enter User Phone: ");
				String phone = br.readLine();
				System.out.println("Enter User City: ");
				String city = br.readLine();
				
				//create student object
				Student90 st = new Student90(name,phone,city);
				boolean ans = StudentDao.insertStudentRecordToDB(st);
				if(ans) {
					System.out.println("Student record Inserted Successfully...");
					System.out.println("Student Record:" + st);
				}else {
					System.out.println("Some error Occured While Inserting...Please try Again!");
				}
				
			}
			else if(c == 2) {
				//Delete student
				System.out.println("Enter Student ID To Delete: ");
				int userID = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudentRecordFromDB(userID);
				if(f) {
					System.out.println("Student Of ID " + userID + " Record Deleted... ");
				}else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c == 3) {
				//Display student
				StudentDao.showAllStudentRecords();
			}
			else if(c == 4) {
				//Update student
				System.out.println("PRESS 1 to UPDATE name");
				System.out.println("PRESS 2 to UPDATE phone");
				System.out.println("PRESS 3 to UPDATE city");
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter name to UPDATE...");
					String name = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student90 st = new Student90();
					st.setStudentName(name);
					boolean f = StudentDao.updateStudentRecord(val,name,id,st);
					if(f) {
						System.out.println("Student Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 2) {
					//Update Phone
					System.out.println("Enter phone to UPDATE...");
					String phone = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student90 st = new Student90();
					st.setStudentPhone(phone);
					boolean f = StudentDao.updateStudentRecord(val,phone,id,st);
					if(f) {
						System.out.println("Student Phone Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update city
					System.out.println("Enter city to UPDATE...");
					String city = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student90 st = new Student90();
					st.setStudentCity(city);
					boolean f = StudentDao.updateStudentRecord(val,city,id,st);
					if(f) {
						System.out.println("Student City Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
			else {
				
			}
			
		}
	}
	


}



 class Student90{
	
	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	
	
	
	public int getStudentID() {
		return studentID;
	}




	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentPhone() {
		return studentPhone;
	}




	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}




	public String getStudentCity() {
		return studentCity;
	}




	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}




	public Student90(int studentID, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}




	public Student90(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}




	public Student90() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
	
	
	
}


 
 
 
 
 
 
 

 class CP {
 	static Connection con;
 	public static Connection createc() {
 		
 		try {
 			
 			//load the driver
 			Class.forName("com.mysql.jdbc.Driver");
 			
 			//create the Connection
// 			String user = "root"; //user of mysql
// 			String password = "Owashim@1"; //password of mysql
// 			String url = "jdbc:mysql://localhost:3306/owashimdb";
 			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/owashimdb","root","Owashim@1");
 			
 			
 		}catch(Exception e) {
 			e.printStackTrace();
 		}
 		return con;
 		
 	}
 }
 
 



 class StudentDao {
 	public static boolean insertStudentRecordToDB(Student90 st) {
 		boolean f = false;
 		try {
 			Connection con = CP.createc();
 			String query = "insert into students(sname,sphone,scity) values(?,?,?)";
 			PreparedStatement pstmt = con.prepareStatement(query);
 			//set the value of parameters
 			pstmt.setString(1, st.getStudentName());
 			pstmt.setString(2, st.getStudentPhone());
 			pstmt.setString(3, st.getStudentCity());
 			
 			//execute..
 			pstmt.executeUpdate();
 			
 			f = true;
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
 		return f;
 	}


 	public static boolean deleteStudentRecordFromDB(int userID) {
 		// TODO Auto-generated method stub
 		boolean f = false;
 		try {
 			Connection con = CP.createc();
 			String query = "delete from students where sid=?";
 			PreparedStatement pstmt = con.prepareStatement(query);
 			//set the value of parameters
 			pstmt.setInt(1, userID);
 			
 			//execute..
 			pstmt.executeUpdate();
 			
 			f = true;
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
 		return f;
 	}


 	public static void showAllStudentRecords() {
 		// TODO Auto-generated method stub
 		boolean f = false;
 		try {
 			Connection con = CP.createc();
 			String query = "select * from students";
 			Statement st = con.createStatement();
 			ResultSet set = st.executeQuery(query);
 			
 			while(set.next()) {
 				int id = set.getInt(1);
 				String name = set.getString(2);
 				String phone = set.getString(3);
 				String city = set.getString("scity");
 				
 				System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent Phone: " + phone + " \nStudent city: " + city);
 				System.out.println("----------------------------------------------");
 			}
 			
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
 		
 	}


 	public static boolean updateStudentRecord(int val,String toUpdate,int id,Student90 st) {
 		// TODO Auto-generated method stub
 		boolean f = false;
 		
 		try {
 			  Connection con = CP.createc();
 			 if(val == 1) {
 					//Update Name
 					
 						String query = "update students set sname=? where sid=?";
 						PreparedStatement pstmt = con.prepareStatement(query);
 						pstmt.setString(1, toUpdate);
 						pstmt.setInt(2, id);
 						
 						//execute..
 						pstmt.executeUpdate();
 						f = true;
 				}
 				else if(val == 2) {
 					//Update Phone
 					String query = "update students set sphone=? where sid=?";
 					PreparedStatement pstmt = con.prepareStatement(query);
 					pstmt.setString(1, toUpdate);
 					pstmt.setInt(2, id);
 					
 					//execute..
 					pstmt.executeUpdate();
 					f = true;
 				}
 				else if(val == 3) {
 					//Update City
 					String query = "update students set scity=? where sid=?";
 					PreparedStatement pstmt = con.prepareStatement(query);
 					pstmt.setString(1, toUpdate);
 					pstmt.setInt(2, id);
 					
 					//execute..
 					pstmt.executeUpdate();
 					f = true;
 				}
 				else {
 					
 				}
 			
 		} catch (Exception e) {
 			// TODO: handle exception
 			e.printStackTrace();
 		}
 		
 		return f;
 	}
 
}
