package com.spargonaut;

class Main {
    public static void main(String[] args) {

        int firstNumber = 22;
        int secondNumber = 33;

        Adder adder = new Adder();
        int result = adder.addTwoInts(firstNumber, secondNumber);

        System.out.println("\n\nI have added " + firstNumber + " and " + secondNumber + " for a result of: " + result);
    }
}
