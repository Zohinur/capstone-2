# Big Zo's Deli Ordering System

## Overview

This project is a console-based Java application that simulates a sandwich shop ordering system. Users can create sandwich orders, add drinks and chips, customize toppings and sauces, calculate totals, and checkout their order.

The application uses object-oriented programming concepts such as:

* Classes and objects
* ArrayLists
* Enums
* Encapsulation
* Methods
* User input handling
* File saving



# Features

## Main Menu

Users can:

* Make a sandwich
* Add drinks
* Add chips
* Checkout
* Cancel order


# Sandwich Customization

Users can customize:

## Bread Types

* White
* Wheat
* Rye
* Wrap

## Sandwich Sizes

* 4 inch
* 8 inch
* 12 inch

## Toasting

* Toasted
* Not toasted

## Meat Options

* Steak
* Ham
* Salami
* Roast Beef
* Chicken
* Bacon

## Cheese Options

* American
* Provolone
* Cheddar
* Swiss

## Toppings

* Lettuce
* Peppers
* Onions
* Tomatoes
* Jalapeños
* Cucumbers
* Pickles
* Guacamole
* Mushrooms

## Sauces

* Mayo
* Mustard
* Ketchup
* Ranch
* Thousand Island
* Vinaigrette

## Sides

* Au Jus
* Sauce


# Additional Items

## Drinks

Users can add:

* Small drink
* Medium drink
* Large drink

## Chips

Users can add chips to their order.



# Checkout System

The checkout system:

* Displays the current order
* Calculates the total price
* Allows users to confirm or cancel the order
* Saves completed orders to a file



# Technologies Used

* Java
* ArrayList
* Scanner
* Enums
* Object-Oriented Programming (OOP)
* File Handling



# Project Structure

## Main Classes

### `userInterface`

Handles:

* User interaction
* Menus
* Input validation
* Order navigation

### `Order`

Stores customer items and calculates totals.

### `Sandwich`

Represents customizable sandwiches.

### `Drinks`

Represents drink objects.

### `Chips`

Represents chip objects.

### `fileManager`

Handles saving orders to files.



# How to Run

## Requirements

* Java JDK 17 or later
* IDE such as IntelliJ or VS Code

## Steps

1. Clone or download the project.
2. Open the project in your IDE.
3. Run the main class.
4. Follow the console instructions to place an order.



# Example Workflow

1. Start application
2. Create sandwich
3. Choose bread, size, meat, toppings, sauces, and sides
4. Add drink or chips
5. Checkout
6. Order is saved to a file



# Future Improvements

Possible future upgrades:

* GUI version using JavaFX or Swing
* Database integration
* Multiple sandwiches per combo
* Better receipt formatting
* Input validation improvements
* Online ordering support


# Favorite block of code 
    public boolean checkSandwich() {
    for (MenuItem m : order) {
    if (m instanceof Sandwich) {    
    return true;
    }
    }
    return false;
    }

    //Checks if there is a chip or a drink in the Arraylist
    public boolean checkChipDrink() {
        for (MenuItem m : order) {
            if (m instanceof Drinks || m instanceof Chips) {
                return true;
            }
        }
        return false;
    }


