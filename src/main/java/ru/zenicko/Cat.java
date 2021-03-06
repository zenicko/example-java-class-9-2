package ru.zenicko;

enum Gender {male, female, undefined};

public class Cat {
    static private int numberCats = 0;
    private int age;
    private String name;
    private String color;
    private Gender gender;
    private String voice;
    private String description;

    Cat() {
        System.out.println("I'm a empty cat!");
        age = 0;
        name = null;
        color = null;
        gender = Gender.undefined;
        description = null;
        voice = null;
        numberCats++;
    }

    Cat(int age, String name, String color, Gender gender, String voice, String description) {
        System.out.println("I'm a cat!");
        this.age = age;
        this.name = name;
        this.color = color;
        this.voice = voice;
        this.gender = gender;
        this.description = description;
        numberCats++;
    }

    public static int getNumberCats() {
        return numberCats;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setGenderCat(Gender gender) {
        this.gender = gender;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getVoice() {
        return voice;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }

    public Cat createChildCat(Cat cat) {
        if (this.gender == cat.gender) {
            System.out.println("It's impossible to ");
            return null;
        }
        String maleDescription, femaleDescription;

        if (this.gender == Gender.male) {
            maleDescription = "\n\tMale:" + this.description;
            femaleDescription = "\n\tFemale:" + cat.getDescription();
        } else {
            femaleDescription = "\n\tFemale:" + this.description;
            maleDescription = "\n\tMale:" + cat.getDescription();
        }
        System.out.println("I'm a kitty");
        return new Cat(0, cat.getName() + "-" + this.name, this.color + cat.getColor(),
                cat.getGender(), this.voice + cat.getVoice(),
                maleDescription + femaleDescription);
    }

    public void printInfoAboutCat() {
        {
            System.out.println("I'm the Cat!");
            System.out.println("Name: " + name);
            System.out.println("Age:" + age);
            System.out.println("Color:" + color);
            System.out.println("Gender:" + gender);
            System.out.println("Voice:" + voice);
            System.out.println("Description:" + description);
        }
    }

}
