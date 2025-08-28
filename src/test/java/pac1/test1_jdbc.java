package pac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//public class test1_jdbc {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://127.0.0.1:3306/sarithadb1";

        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) 
        {
            System.out.println("Connected to DB!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
*/
	import java.sql.*;

	public class test1_jdbc {
	    static final String URL = "jdbc:mysql://127.0.0.1:3306/sarithadb1";
	    static final String USER = "root";
	    static final String PASSWORD = "root"; // Change to your DB password

	       public static void main(String[] args) {
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            // CREATE
	            createStudent(conn, 1, "Alice", 22);

	            // READ
	            readStudents(conn);

	            // UPDATE
	            updateStudentAge(conn, 1, 23);

	            // DELETE
	            deleteStudent(conn, 1);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // CREATE
	    public static void createStudent(Connection conn, int id, String name, int age) throws SQLException {
	        String sql = "INSERT INTO students (student_id, name, age) VALUES (?, ?, ?)";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            pstmt.setString(2, name);
	            pstmt.setInt(3, age);
	            int rows = pstmt.executeUpdate();
	            System.out.println("Inserted: " + rows + " row(s)");
	        }
	    }

	    // READ
	    public static void readStudents(Connection conn) throws SQLException {
	        String sql = "SELECT * FROM students";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            System.out.println("Student Records:");
	            while (rs.next()) {
	                int id = rs.getInt("student_id");
	                String name = rs.getString("name");
	                int age = rs.getInt("age");
	                System.out.println(id + " - " + name + " - " + age);
	            }
	        }
	    }

	    // UPDATE
	    public static void updateStudentAge(Connection conn, int id, int newAge) throws SQLException {
	        String sql = "UPDATE students SET age = ? WHERE student_id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, newAge);
	            pstmt.setInt(2, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println("Updated: " + rows + " row(s)");
	        }
	    }

	    // DELETE
	    public static void deleteStudent(Connection conn, int id) throws SQLException {
	        String sql = "DELETE FROM students WHERE student_id = ?";
	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, id);
	            int rows = pstmt.executeUpdate();
	            System.out.println("Deleted: " + rows + " row(s)");
	        }
	    }
	}

	

