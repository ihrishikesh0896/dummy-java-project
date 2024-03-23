package com.example;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Dummy Java Project Running");
        Config config = new Config();
        System.out.println("API Key: " + config.apiKey);
    }
}
