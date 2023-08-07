package com.workintech.market.main;

import com.workintech.market.MarketCar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> groceryList = new LinkedList<>();
        startMarket(groceryList);
    }
        public static void startMarket(List<String> groceryList) {
            Scanner scanner = new Scanner(System.in);
            while(true) {
                try {
                System.out.println("Yapmak istediğiniz işlemi giriniz: ");
                int value = scanner.nextInt();
                if(value < 0 || value > 2) {
                    System.out.println("Input must be between 0 and 2");
                }
                if(value == 0) {
                    System.exit(0);
                } else if(value == 1){
                    MarketCar.addItems(groceryList);
                } else if(value == 2){
                    MarketCar.removeItems(groceryList);
                }
            } catch(Exception ex) {
                    System.out.println("Invalid input: " + ex.getMessage());
                    System.exit(0);
                }
        }
    }

}