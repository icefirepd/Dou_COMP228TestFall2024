package utils;

import models.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final String URL = "jdbc:oracle:thin:@//oracle1.centennialcollege.ca:1521/SQLD";
    private static final String User = "COMP228_F24_soh_8";
    private static final String Password = "password123";

    private static Connection Connection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(URL, User, Password);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Oracle JDBC Driver not found", e);
        }
    }

    public static List<Student> cityFilter(String city) throws SQLException {
        List<Student> students = new ArrayList<>();

        try (Connection connection = Connection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM Students WHERE city = ?")) {

            statement.setString(1, city);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Student student = new Student();
                    student.setStudentID(rs.getString("studentID"));
                    student.setFirstName(rs.getString("firstName"));
                    student.setLastName(rs.getString("lastName"));
                    student.setAddress(rs.getString("address"));
                    student.setCity(rs.getString("city"));
                    student.setProvince(rs.getString("province"));
                    student.setPostalCode(rs.getString("postalCode"));
                    students.add(student);
                }
            }
        }
        return students;
    }
}