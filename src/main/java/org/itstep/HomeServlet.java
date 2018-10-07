package org.itstep;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    List<Masters> master;

    public static final String connectionString = "jdbc:sqlite:database.db";
    String userName = "root";
    String password = "";

    @Override
    public void init() throws ServletException {
        super.init();
        executeSql("create table if not exists masters\n" +
                "(\n" +
                "  id   integer primary key autoincrement,\n" +
                "  name varchar(255) null,\n" +
                "  img  varchar(255) null\n" +
                ");");
    }

    void executeSql(String sql) {
        try(Connection connection = DriverManager.getConnection(connectionString, userName,password)) {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Connection connection = DriverManager.getConnection(connectionString, userName,password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM masters");
            master = new ArrayList<>();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");

                master.add(new Masters(name,img));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("master",master);
        req.getRequestDispatcher("/WEB-INF/view/index.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}