package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class divideAmountForEachFriend {

    String name;
    double amountToGive;
    double amountGiven;


    @Test
    void givenZeroAmountByPerson1forZeroFriends_WhenPaidByPerson1_ThenReturnZero()
    {
        Friends friends=new Friends("chaitali",0.0,0.0);
        Assertions.assertEquals(0.0,friends.calculateExpensesForEachFriend());
    }

    @Test
    void givenZeroAmountByPerson2ForTwoFriends_WhenPaid_ThenReturnZero()
    {
        String name="Demon";
        double amountToGive=0.0;
        double amountGiven=0.0;
        Friends friends=new Friends(name,amountToGive,amountGiven);
        Assertions.assertEquals(0.0,friends.expensesForTwoFriends());
    }




}