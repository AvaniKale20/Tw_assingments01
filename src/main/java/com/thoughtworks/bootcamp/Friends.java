package com.thoughtworks.bootcamp;


import java.util.ArrayList;
import java.util.List;

public class Friends {

    private String name;
    List<String> listOfPepleInvolve = new ArrayList<String>();
    private double amountGiven;

    public Friends(String name, List<String> listOfPepleInvolve, double amountGiven) {
        this.name = name;
        this.listOfPepleInvolve = listOfPepleInvolve;
        this.amountGiven = amountGiven;
    }

    public double calculateExpensesForEachFriend() {
        double DividedIntoFriends = listOfPepleInvolve.size();
        return amountGiven / DividedIntoFriends;
    }


    public double calculateExpenses() {
        return 0.0;
    }
}
