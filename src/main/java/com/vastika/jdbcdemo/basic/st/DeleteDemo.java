package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL = "delete from user_tbl where id = 2";
    public static void main(String[] args) {

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ) {

            st.executeUpdate(SQL);
            System.out.println("Data Deleted.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

