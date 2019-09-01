package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideAmountForEachFriend {

    private String name;
    private double amountToGive;
    private double amountGiven;


    @Test
    void givenZeroAmountForZeroFriends_WhenPaid_ThenReturnZero() {
        Friends friends = new Friends("chaitali", 0.0, 0.0);
        Assertions.assertEquals(0.0, friends.calculateExpensesForEachFriend());
    }

    @Test
    void givenHundredAmountForFourFriends_WhenPaid_ThenReturnTwentyFive() {

        String name = "Demon";
        double amountToGive = 0.0;
        double amountGiven = 100;
        Friends forFourPerson = new Friends(name, amountToGive, amountGiven);
        Assertions.assertEquals(25.0, forFourPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenZeroAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnZero() {

        String name = "Demon";
        double amountToGive = 0.0;
        double amountGiven = 0.0;
        Friends forTwoPerson = new Friends(name, amountToGive, amountGiven);
        Assertions.assertEquals(0.0, forTwoPerson.expensesForTwoFriends());
    }

    @Test
    void givenTenAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnFiveForEach() {
        String name = "Demon";
        double amountToGive = 0.0;
        double amountGiven = 10.0;
        Friends forTwoPerson = new Friends(name, amountToGive, amountGiven);
        Assertions.assertEquals(05.0, forTwoPerson.expensesForTwoFriends());
    }


}