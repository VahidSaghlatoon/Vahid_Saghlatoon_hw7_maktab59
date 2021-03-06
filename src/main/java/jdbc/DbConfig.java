package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class DbConfig {
    public static final String URL = "jdbc:mysql://localhost:3306/school";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static Connection dbConnection() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource.getConnection();
    }

}