package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DivideAmountForEachFriend {

    private List<String> listOfPepleInvolve = new ArrayList<String>();


    @Test
    void givenZeroAmountForZeroFriends_WhenPaid_ThenReturnZero() {

        List<String> listOfPepleInvolve = new ArrayList<String>();
        Friends friends = new Friends("Stefon", listOfPepleInvolve, 0.0);
        Assertions.assertEquals(0.0, friends.calculateExpenses());
    }

    @Test
    void givenHundredAmountForFourFriends_WhenPaid_ThenReturnTwentyFive() {

        listOfPepleInvolve.add("Aman");
        listOfPepleInvolve.add("Bella");
        listOfPepleInvolve.add("Stefon");
        listOfPepleInvolve.add("Demon");
        Friends forFourPerson = new Friends("Aman", listOfPepleInvolve, 100.0);
        Assertions.assertEquals(25.0, forFourPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenZeroAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnZero() {

        listOfPepleInvolve.add("Stefon");
        listOfPepleInvolve.add("Demon");
        Friends forTwoPerson = new Friends("Bella", listOfPepleInvolve, 0.0);
        Assertions.assertEquals(0.0, forTwoPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenTenAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnFiveForEach() {

        listOfPepleInvolve.add("Stefon");
        listOfPepleInvolve.add("Demon");
        Friends forTwoPerson = new Friends("Bella", listOfPepleInvolve, 10.0);
        Assertions.assertEquals(05.0, forTwoPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenThreeHundredAmountByPerason2ForTwoFriends_WhenPaid_ThenReturnTwoFiftyForEach() {

        listOfPepleInvolve.add("Stefon");
        listOfPepleInvolve.add("Demon");
        Friends forTwoPerson = new Friends("Bella", listOfPepleInvolve, 500.0);
        Assertions.assertEquals(250.0, forTwoPerson.calculateExpensesForEachFriend());
    }

    @Test
    void givenFiveHundredAmountByPerason2ForTwoFriends_WhenPaid_ThenReturnOneFiftyForEach() {

        listOfPepleInvolve.add("Aman");
        listOfPepleInvolve.add("Bella");
        Friends forTwoPerson = new Friends("Demon", listOfPepleInvolve, 300.0);
        Assertions.assertEquals(150.0, forTwoPerson.calculateExpensesForEachFriend());
    }


}