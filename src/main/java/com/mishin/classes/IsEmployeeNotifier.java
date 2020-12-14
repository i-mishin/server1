package com.mishin.classes;


public class IsEmployeeNotifier extends Notifier{
    public IsEmployeeNotifier(int mask) {
        super(mask);
    }

    protected void writeMessage(String msg) {
        System.out.println("Пользователь существует:" + msg);
    }
}
