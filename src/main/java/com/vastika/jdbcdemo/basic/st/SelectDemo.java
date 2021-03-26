package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    public static final String SQL = "select * from user_tbl";

    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {

            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                System.out.println("=====================");
                System.out.println("Id is: " + rs.getInt("id"));
                System.out.println("User Name is: " + rs.getString("user_name"));
                System.out.println("Password is: " + rs.getString("password"));
                System.out.println("=====================");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
