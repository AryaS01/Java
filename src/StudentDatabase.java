import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/studentdb";

    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        Scanner input = new Scanner(System.in);

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            System.out.println("Enter the number of students:");
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the roll number:");
                int rollno = input.nextInt();

                System.out.println("Enter the name:");
                String name = input.next();

                System.out.println("Enter the CGPA:");
                double cgpa = input.nextDouble();

                String sql = "INSERT INTO students (rollno, name, cgpa) VALUES (" + rollno + ", '" + name + "', " + cgpa + ")";
                stmt.executeUpdate(sql);
            }

            System.out.println("Data inserted successfully!");

            stmt.close();
            conn.close();
            input.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
