package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Teacher {
    public static final String INSERT = "INSERT INTO teachers (firstName, lastName, studentID)\n" +
            "VALUES(?, ?, ?);";
    public static final String DELETE = "DELETE FROM teachers WHERE teacherID=?;";

    public static final String MODIFY = "UPDATE teachers\n" +
            "SET firstName=?, lastName=?, studentID=?\n" +
            "WHERE teacherID=?;";
    public static final String SHOWALL = "select * from teachers ;";
    public static final String TEACHER_STUDENTS = "SELECT s.teacherID , s.studentID ,s.firstName ,s.lastName FROM students s \n" +
            " WHERE s.teacherID = ? ;";

    public void showTeacherStudents() throws SQLException {

        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(TEACHER_STUDENTS);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter teacher id : ");
        statement.setInt(1, input.nextInt());
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("teacherID") + " " +
                    resultSet.getInt("studentID") + " " +
                    resultSet.getString("firstname") + " " +
                    resultSet.getString("lastName"));
        }

        statement.execute();
        statement.close();
        con.close();
    }

    public void add() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(INSERT);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name : ");
        statement.setString(1, input.next());
        System.out.print("Enter last name : ");
        statement.setString(2, input.next());
        System.out.print("Enter student id : ");
        statement.setInt(3, input.nextInt());

        statement.execute();
        statement.close();
        con.close();

    }

    public void delete() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(DELETE);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter teacher id : ");
        statement.setInt(1, input.nextInt());
        statement.execute();
        statement.close();
        con.close();
    }

    public void modify() throws SQLException {

        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(MODIFY);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name : ");
        statement.setString(1, input.next());
        System.out.print("Enter last name : ");
        statement.setString(2, input.next());
        System.out.print("Enter student id : ");
        statement.setInt(3, input.nextInt());
        System.out.print("Enter teacher id : ");
        statement.setInt(4, input.nextInt());
        statement.execute();
        statement.close();
        con.close();
    }

    public void showAll() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(SHOWALL);
        ResultSet resultSet = statement.executeQuery(SHOWALL);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("teacherID") + " " +
                    resultSet.getString("firstName") + " " +
                    resultSet.getString("lastName") + " " +
                    resultSet.getInt("studentID"));
        }
        statement.close();
        con.close();

    }

}
