package com.thoughtworks.bootcamp;

import java.util.List;

public class Friends {

    private String name;
    private  double amountToGive;
    private double amountGiven;

    public Friends(String name, double amountToGive, double amountGiven)
    {
        this.name=name;
        this.amountToGive=amountToGive;
        this.amountGiven=amountGiven;
    }


    public double calculateExpensesForEachFriend() {

        return 0.0;

    }
    public double expensesForTwoFriends()
    {
        return amountGiven/2;
    }
}
