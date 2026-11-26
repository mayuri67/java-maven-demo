package com.demo;

public class App {

    public String getMessage() {
        return "Hello from Java Maven Docker Agent";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}