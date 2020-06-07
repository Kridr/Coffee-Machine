package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachineProcessing coffeeMachineProcessing = new CoffeeMachineProcessing();
        boolean work = true;

        System.out.println("Write action (buy, fill, take, remaining, exit): ");

        while (work) {
            String action = scanner.next();

            work = coffeeMachineProcessing.process(action);
        }
    }

}

class CoffeeMachineProcessing {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;
    private States states;

    CoffeeMachineProcessing() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        money = 550;
        states = States.RUNNING;
    }

    public void remaining() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money\n");
    }

    public void take() {
        System.out.println("\nI gave you $" + money + '\n');
        money = 0;
    }

    public void fill() {
        states = States.FILLING_WATER;
    }

    public void fillWater(int plusWater) {
        water += plusWater;
        states = States.FILLING_MILK;
    }

    public void fillMilk(int plusMilk) {
        milk += plusMilk;
        states = States.FILLING_COFFEE_BEANS;
    }

    public void fillCoffeeBeans(int plusCoffeeBeans) {
        coffeeBeans += plusCoffeeBeans;
        states = States.FILLING_DISPOSABLE_CUPS;
    }

    public void fillDisposableCups(int plusDisposableCups) {
        disposableCups += plusDisposableCups;
        states = States.RUNNING;
    }

    public void buy() {
        states = States.BUYING;
    }

    public void buyEspresso() {
        int neededWater = Beverages.ESPRESSO.getWater();
        int neededMilk = Beverages.ESPRESSO.getMilk();
        int neededCoffeeBeans = Beverages.ESPRESSO.getCoffeeBeans();
        int price = Beverages.ESPRESSO.getPrice();

        if (water - neededWater < 0 && milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water, milk and coffee beans!\n");
        } else if (water - neededWater < 0 && milk - neededMilk < 0) {
            System.out.println("Sorry, not enough water and milk!\n");
        } else if (milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough milk and coffee beans!\n");
        } else if (water - neededWater < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water - neededWater < 0) {
            System.out.println("Sorry, not enough water!\n");
        } else if (milk - neededMilk < 0) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else {
            if (disposableCups - 1 < 0) {
                System.out.println("Sorry, not enough disposable cups!\n");
            } else {
                disposableCups -= 1;
            }
            System.out.println("I have enough resources, making you a coffee!\n");
            water -= neededWater;
            milk -= neededMilk;
            coffeeBeans -= neededCoffeeBeans;

            money += price;
        }
        states = States.RUNNING;
    }

    public void buyLatte() {
        int neededWater = Beverages.LATTE.getWater();
        int neededMilk = Beverages.LATTE.getMilk();
        int neededCoffeeBeans = Beverages.LATTE.getCoffeeBeans();
        int price = Beverages.LATTE.getPrice();

        if (water - neededWater < 0 && milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water, milk and coffee beans!\n");
        } else if (water - neededWater < 0 && milk - neededMilk < 0) {
            System.out.println("Sorry, not enough water and milk!\n");
        } else if (milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough milk and coffee beans!\n");
        } else if (water - neededWater < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water - neededWater < 0) {
            System.out.println("Sorry, not enough water!\n");
        } else if (milk - neededMilk < 0) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else {
            if (disposableCups - 1 < 0) {
                System.out.println("Sorry, not enough disposable cups!\n");
            } else {
                disposableCups -= 1;
            }
            System.out.println("I have enough resources, making you a coffee!\n");
            water -= neededWater;
            milk -= neededMilk;
            coffeeBeans -= neededCoffeeBeans;

            money += price;
        }
        states = States.RUNNING;
    }

    public void buyCappuccino() {
        int neededWater = Beverages.CAPPUCCINO.getWater();
        int neededMilk = Beverages.CAPPUCCINO.getMilk();
        int neededCoffeeBeans = Beverages.CAPPUCCINO.getCoffeeBeans();
        int price = Beverages.CAPPUCCINO.getPrice();

        if (water - neededWater < 0 && milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water, milk and coffee beans!\n");
        } else if (water - neededWater < 0 && milk - neededMilk < 0) {
            System.out.println("Sorry, not enough water and milk!\n");
        } else if (milk - neededMilk < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough milk and coffee beans!\n");
        } else if (water - neededWater < 0 && coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough water and coffee beans!\n");
        } else if (water - neededWater < 0) {
            System.out.println("Sorry, not enough water!\n");
        } else if (milk - neededMilk < 0) {
            System.out.println("Sorry, not enough milk!\n");
        } else if (coffeeBeans - neededCoffeeBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!\n");
        } else {
            if (disposableCups - 1 < 0) {
                System.out.println("Sorry, not enough disposable cups!\n");
            } else {
                disposableCups -= 1;
            }
            System.out.println("I have enough resources, making you a coffee!\n");
            water -= neededWater;
            milk -= neededMilk;
            coffeeBeans -= neededCoffeeBeans;

            money += price;
        }
        states = States.RUNNING;
    }

    public States getState() {
        return states;
    }

    //return true if coffee machine can work further
    public boolean process(String action) {
        switch (states) {
            case RUNNING:
                switch (action) {
                    case "buy":
                        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                        buy();
                        return true;
                    case "fill":
                        fill();
                        System.out.println("\nWrite how many ml of water do you want to add: ");
                        return true;
                    case "take":
                        take();
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                    case "remaining":
                        remaining();
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                    case "exit":
                        return false;
                }
            case BUYING:
                switch (action) {
                    case "1":
                        buyEspresso();
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                    case "2":
                        buyLatte();
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                    case "3":
                        buyCappuccino();
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                    case "back":
                        states = States.RUNNING;
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        return true;
                }
            case FILLING_WATER:
                fillWater(Integer.parseInt(action));
                System.out.println("Write how many ml of milk do you want to add:");
                return true;
            case FILLING_MILK:
                fillMilk(Integer.parseInt(action));
                System.out.println("Write how many grams of coffee beans do you want to add:");
                return true;
            case FILLING_COFFEE_BEANS:
                fillCoffeeBeans(Integer.parseInt(action));
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                return true;
            case FILLING_DISPOSABLE_CUPS:
                fillDisposableCups(Integer.parseInt(action));
                System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
                return true;

        }
        return false;
    }
}

enum Beverages {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    final private int water;
    final private int milk;
    final private int coffeeBeans;
    final private int price;

    Beverages(int water, int milk, int coffeeBeans, int price) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
    }

    int getWater() {
        return this.water;
    }

    int getMilk() {
        return this.milk;
    }

    int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    int getPrice() {
        return this.price;
    }
}
enum States {
    RUNNING, BUYING, FILLING_WATER, FILLING_MILK, FILLING_COFFEE_BEANS, FILLING_DISPOSABLE_CUPS;
}
