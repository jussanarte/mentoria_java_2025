/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import db.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        String sql = "SELECT id, name FROM department";

        try (
            Connection conn = DB.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ) {
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + ", " + rs.getString("name")
                );
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }
    }
}
