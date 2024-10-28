package com.lbg;

import com.lbg.classes.PotatoVariety;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PotatoVariety frenchFry = new PotatoVariety(
                "Pomme Pont-Neuf",
                1,
                "The crust is crispy, while the core has the texture of a cooked potato, with a distinct mealiness");

        PotatoVariety fondant = new PotatoVariety("Fondant");

        System.out.println(frenchFry);
        System.out.println(fondant);

    }
}
