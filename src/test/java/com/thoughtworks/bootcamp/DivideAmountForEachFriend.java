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

        Friends forFourPerson = new Friends("Demon", 0.0, 100.0);
        Assertions.assertEquals(25.0, forFourPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenZeroAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnZero() {
        Friends forTwoPerson = new Friends("Demon", 0.0, 0.0);
        Assertions.assertEquals(0.0, forTwoPerson.expensesForTwoFriends());
    }

    @Test
    void givenTenAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnFiveForEach() {
        Friends forTwoPerson = new Friends("Demon", 0.0, 10.0);
        Assertions.assertEquals(05.0, forTwoPerson.expensesForTwoFriends());
    }

    @Test
    void givenThreeHundredAmountByPerason2ForTwoFriends_WhenPaid_ThenReturnOneFiftyForEach() {
        Friends forTwoPerson = new Friends("Demon", 0.0, 300.0);
        Assertions.assertEquals(150.0, forTwoPerson.expensesForTwoFriends());
    }

    @Test
    void givenFiveHundredAmountByPerason2ForTwoFriends_WhenPaid_ThenReturnTwoFiftyForEach() {
        Friends forTwoPerson = new Friends("Demon", 0.0, 500.0);
        Assertions.assertEquals(250.0, forTwoPerson.expensesForTwoFriends());
    }


}