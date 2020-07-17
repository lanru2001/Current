package com.temitopeolanrewaju81;

//Using inheritance OOPS concept
// super or  parent class
class CheckingAccount {
    // Variables for the super class
     protected String account_Number = "123456789";
     protected int account_Balance=1000;

    public void deposit(){
        System.out.println("Working hard to stack up my account,lol!");

    }

}

//sub or child class

  public class SavingsAccount extends CheckingAccount{
     private String  account_Numb = "3456789";
     private int amount_wdl = 100;

    public static void main(String [] args){

        //Create a  myMy object
        SavingsAccount myMy =new SavingsAccount();

        //Call the deposit function from the child class
        myMy.deposit();

        //Accessing variables in super class
        System.out.println(myMy.account_Number);
        System.out.println(myMy.account_Balance);
        System.out.println(myMy.account_Numb);
        System.out.println(myMy.amount_wdl);


    }


}



