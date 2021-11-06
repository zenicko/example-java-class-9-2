package ru.zenicko;

import ru.zenicko.Cat;

public class StartMain {
    public static void main(String[] args) {
        Cat murka = new Cat(3, "Мурка", "Grey", Gender.female,
                "Мурр-\bрррр\b-ми-ми","British shorthair");
        Cat Kot = new Cat();
        Cat Kitty;

        Kot.setAge(5);
        Kot.setColor("Black");
        Kot.setName("Кот");
        Kot.setVoice("Шшш-шуу\bууш-шш");
        Kot.setGenderCat(Gender.male);
        Kot.setDescription("Himalayan cat");
        System.out.println("How many cats are at home? " + Cat.getNumberCats());
        Kitty = murka.createChildCat(Kot);
        Kitty.printInfoAboutCat();
        System.out.println("How many cats are at home? " + Cat.getNumberCats() + "\n\n??!!WTF!!??\n\n");
    }
}
