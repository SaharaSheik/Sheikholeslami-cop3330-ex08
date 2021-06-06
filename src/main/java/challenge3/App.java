package challenge3;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

import java.util.Scanner;

/*
Exercise 8 - Pizza Party
Challenge #3
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a
whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of
slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each
person should get. If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
Challenges
1) Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the
value entered is not numeric.
2) Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or
"Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
3) Create a variant of the program that prompts for the number of people and the number of pieces each person wants,
and calculate how many full pizzas you need to purchase.
 */
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int numPeople = input.nextInt();
        System.out.print("How many pieces each person wants? ");
        int numPiecesPerPerson = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int numSlicePerPizza = input.nextInt();

        int totalSlicesNeeded = numPeople * numPiecesPerPerson;
        int numPizzaOrder;

        if (totalSlicesNeeded%numSlicePerPizza == 0 ) {
            numPizzaOrder = totalSlicesNeeded / numSlicePerPizza;

        }else
            numPizzaOrder = (totalSlicesNeeded/numSlicePerPizza)+1;

        String output = "";

        if (numPizzaOrder>=2)
            output = String.format("You should order %d pizzas.", numPizzaOrder);
        if (numPizzaOrder == 1)
            output = String.format("You should order 1 pizza");

        System.out.println(output);


    }
}
