package model;

public class Rule extends Player {

   /* public void evaluate()
    {
        if (this.royalFlush() == 1)
        {
            System.out.println("You have a royal flush!");
        }
        else if (this.straightFlush() == 1)
        {
            System.out.println("You have a straight flush!");
        }
        else if (this.fourOfaKind() == 1)
        {
            System.out.println("You have four of a kind!");
        }
        else if (this.fullHouse() == 1)
        {
            System.out.println("You have a full house!");
        }
        else if (this.flush() == 1)
        {
            System.out.println("You have a flush!");
        }
        else if (this.straight() == 1)
        {
            System.out.println("You have a straight!");
        }
        else if (this.triple() == 1)
        {
            System.out.println("You have a triple!");
        }
        else if (this.twoPairs() == 1)
        {
            System.out.println("You have two pairs!");
        }
        else if (this.pair() == 1)
        {
            System.out.println("You have a pair!");
        }
        else
        {
            int highCard = this.highCard();
            System.out.println("Your highest card is " + highCard);
        }
    }

    // checks for a royal flush
    public int royalFlush()
    {
        if (hand[0].rank == 1 && hand[1].rank == 10 && hand[2].rank == 11 &&
                hand[3].rank == 12 && hand[4].rank == 13)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    // checks for a straight flush
    public int straightFlush()
    {
        for (int counter = 1; counter < 5; counter++)
        {
            if (hand[0].suit != hand[counter].suit)
            {
                return 0;
            }
        }
        for (int counter2 = 1; counter2 < 5; counter2++)
        {
            if (hand[counter2 - 1].rank != (hand[counter2].rank - 1))
            {
                return 0;
            }

        }
        return 1;

    }

    // checks for four of a kind
    public int fourOfaKind()
    {
        if (hand[0].rank != hand[3].rank && hand[1].rank != hand[4].rank)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    // checks for full house
    public int fullHouse()
    {
        int comparison = 0;
        for (int counter = 1; counter < 5; counter++)
        {
            if (hand[counter - 1].rank == hand[counter].rank)
            {
                comparison++;
            }
        }
        if (comparison == 3)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    // checks for flush
    public int flush()
    {
        for (int counter = 1; counter < 5; counter++)
        {
            if (hand[0].suit != hand[counter].suit)
            {
                return 0;
            }
        }
        return 1;
    }

    // check for straight
    public int straight()
    {
        for (int counter2 = 1; counter2 < 5; counter2++)
        {
            if (hand[counter2 - 1].rank != (hand[counter2].rank - 1))
            {
                return 0;
            }

        }
        return 1;
    }

    // checks for triple
    public int triple()
    {
        if (hand[0].rank == hand[2].rank || hand[2].rank == hand[4].rank)
        {
            return 1;
        }
        return 0;
    }

    // checks for two pairs
    public int twoPairs()
    {
        int check = 0;
        for(int counter = 1; counter < 5; counter++)
        {
            if (hand[counter - 1].rank == hand[counter].rank)
            {
                check++;
            }
        }
        if (check == 2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    // check for pair
    public int pair()
    {
        int check = 0;
        for(int counter = 1; counter < 5; counter++)
        {
            if (hand[counter - 1].rank == hand[counter].rank)
            {
                check++;
            }
        }
        if (check == 1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    // find highest card
    public int highCard()
    {
        int highCard = 0;
        for (int counter = 0; counter < 5; counter++)
        {
            if (hand[counter].rank > highCard)
            {
                highCard = hand[counter].rank;
            }
        }
        return highCard;
    }

*/

}
