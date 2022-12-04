package com.minsung;


public class Account {
    private String bankName;

    private int balance;

    private int pinNum;

    private User userInformation;

    public Account(String bankName, int balance, int pinNum, User userInformation) {
        this.bankName = bankName;
        this.balance = balance;
        this.pinNum = pinNum;
        this.userInformation = userInformation;
    }

    public void showBalance() {
        System.out.println(this.balance);
    }

    public int returnWithdraw() {
        return this.balance;
    }


    public void deposit(int money) {
        this.balance += money;
        int cost = returnWithdraw();

        String depPhrase = "Deposited amount is " + money;
        String curPhrase = "Current balance is " + cost;
        System.out.println(depPhrase);
        System.out.println(curPhrase);
    }

    public void withDraw(int money) {
        try {
            int cost = returnWithdraw() - money;
            if(cost < 0) {
                throw new Exception();
            }
            this.balance = cost;
            System.out.println("withdraw money "+ money + " current balance is " + cost);
        } catch (Exception e) {
            System.out.println("Balance is insufficient");
        }

    }
    public int getPinNum() {
        return this.pinNum;
    }


}
