package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    private String migrationMonth;

    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }

    public int getSpeed() {
        return 10;
    }

    public String color() {
        return "red";
    }
}
