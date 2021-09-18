package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class student {

    public static final String INSERT = "INSERT INTO students (firstName, lastName, teacherID)\n" +
            "VALUES(?, ?, ?);";
    public static final String DELETE = "DELETE FROM students WHERE studentID=?;";

    public static final String MODIFY = "UPDATE students\n" +
            "SET firstName=?, lastName=?, teacherID=?\n" +
            "WHERE studentID=?;";
    public static final String SHOWALL = "select * from students ;";

    public  void add() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(INSERT);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name : ");
        statement.setString(1, input.next());
        System.out.print("Enter last name : ");
        statement.setString(2, input.next());
        System.out.print("Enter teacher id : ");
        statement.setInt(3, input.nextInt());

        statement.execute();
        statement.close();
        con.close();

    }

    public  void delete() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(DELETE);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student id : ");
        statement.setInt(1, input.nextInt());
        statement.execute();
        statement.close();
        con.close();
    }

    public  void modify() throws SQLException {

        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(MODIFY);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name : ");
        statement.setString(1, input.next());
        System.out.print("Enter last name : ");
        statement.setString(2, input.next());
        System.out.print("Enter teacher id : ");
        statement.setInt(3, input.nextInt());
        System.out.print("Enter student id : ");
        statement.setInt(4, input.nextInt());
        statement.execute();
        statement.close();
        con.close();
    }

    public  void showAll() throws SQLException {
        Connection con = DbConfig.dbConnection();
        PreparedStatement statement = con.prepareStatement(SHOWALL);
        ResultSet resultSet = statement.executeQuery(SHOWALL);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("studentID") + " " +
                    resultSet.getString("firstName") + " " +
                    resultSet.getString("lastName") + " " +
                    resultSet.getInt("teacherID"));
        }
        statement.close();
        con.close();

    }



}


