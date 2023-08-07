package com.workintech.market;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MarketCar {
    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void addItems(List<String> groceryList) {
        System.out.println("İstediğiniz malzemeleri giriniz: ");
        String input = getInput();

      if(input.contains(",")) {
          String[] items = input.split(",");
          for(String item :  items) {
              if(item != null && !item.trim().isEmpty()){
                  if(!checkItemIsInList(groceryList, item)) {
                      groceryList.add(item.trim());
                  }
              }
          }
      } else {
          if(input != null && !input.isEmpty()) {
              groceryList.add(input);
          }
      }
        printSorted(groceryList);

}

    public static void removeItems(List<String> groceryList) {
        System.out.println("Cıkarmak istediğiniz malzemeleri giriniz: ");
        String input = getInput();

        if(input.contains(",")) {
            String[] items = input.split(",");
            for(String item :  items) {
                if(item != null && !item.trim().isEmpty()){
                    if(!checkItemIsInList(groceryList, item)) {
                        groceryList.remove(item.trim());
                    }
                }
            }
        } else {
            if(input != null && !input.isEmpty()) {
                groceryList.remove(input);
            }
        }

        printSorted(groceryList);

    }

    public static boolean checkItemIsInList(List<String> products, String product) {
    return products.contains(product.trim());
    }

    public static void printSorted(List<String> products) {
        Collections.sort(products);
        System.out.println(products);
        for(String product: products) {
            System.out.println(product);
        }
    }

}
