package com.run.baby.run;

public class Profile {
    public static final String JDBC = "jdbc",
            POSTGRES_DB = "postgres",
            HSQL_DB = "hsqldb";

    public static String getActiveDbProfile() {
        try {
            Class.forName("org.postgresql.Driver");
            return POSTGRES_DB;
        } catch (ClassNotFoundException ex) {
            try {
                Class.forName("org.hsqldb.jdbcDriver");
                return Profile.HSQL_DB;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Could not find DB driver");
            }
        }
    }

}
