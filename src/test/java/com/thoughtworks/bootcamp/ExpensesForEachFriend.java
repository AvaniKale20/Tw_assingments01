package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpensesForEachFriend {


    @Test
    void givenZeroMoneyByShrutiForZeroFriends_WhenPaid_ThenReturnZero()
    {
        String name="chaitali";
        double amountToGive=0.0;
        double amountGiven=0.0;
        Friends friends=new Friends(name,amountToGive,amountGiven);
        Assertions.assertEquals(0.0,friends.calculateExpensesForEachFriend());
    }
}