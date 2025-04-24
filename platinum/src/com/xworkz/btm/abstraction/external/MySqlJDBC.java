package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.JDBC;

public class MySqlJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("save running in MySqlJDBC");
    }
}
