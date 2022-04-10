package com.company.construktorExercises.konstruktorTask;

public class VipCustomer {
    private String name;
    private double limit;
    private String emailAddress;

    public VipCustomer() {
        this("defaultName",0,"default@gmail.com");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "default@gmail.com");
    }

    public VipCustomer(String name, double limit, String emailAddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
