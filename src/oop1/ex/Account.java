package oop1.ex;

public class Account {
    int balance;

    int desposit(int amount) {
        return balance += amount;
    }

    int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족\n잔고 : " + balance);
            return balance;
        } else {
            return balance -= amount;
        }
    }
}
