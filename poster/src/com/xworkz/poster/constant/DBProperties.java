package com.xworkz.poster.constant;

public enum DBProperties {

    URL("jdbc:mysql://localhost:3306/maha_2803"),
    USER_NAME("root"),
    SECRET("Mahalakshmi@2803"),
    VERSION_8;

    private String prop;

    private  DBProperties(String prop)
    {
        this.prop=prop;
    }
    private DBProperties()
    {

    }

    public String getProp() {
        return prop;
    }
}
