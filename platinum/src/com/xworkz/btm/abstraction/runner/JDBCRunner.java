package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.App;
import com.xworkz.btm.abstraction.external.MySqlJDBC;
import com.xworkz.btm.abstraction.internal.JDBC;

public class JDBCRunner {
    public static void main(String[] args) {
        JDBC jdbc=new MySqlJDBC();

        App app=new App(jdbc);
        app.use();
    }
}
