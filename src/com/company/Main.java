package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Pororo");
        dog.setBreed("Cavalier");
        dog.setColor("Blenhane");
        dog.setAge(1);
        dog.setWeight(2);

        System.out.println("          ~Dog~           ");

        System.out.println( "Name is: " + dog.getName() +"\n" + "Age is: " + dog.getAge()+ "\n" +"Breed is: "
                + dog.getBreed()+ "\n" + "Color is: " + dog.getColor() +  "\n" + "Weight is: " + dog.getWeight() +" kg");



        Cat cat = new Cat();
        cat.setName("Nao");
        cat.setColor("Black");
        cat.setAge(3);




        System.out.println("               ~Cat~               ");

        System.out.println("Name is: " + cat.getName()+ "\n" + "Age is: "
                + cat.getAge() + "\n"+ "Color is: " + cat.getColor()+ "\n" + "Skill: ");
        cat.getSkillMethod();


        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAge(2);
        fish.setColor("Orange");
        fish.setLength(7);


        System.out.println("             ~Fish~           ");


        System.out.println("Name is: "+ fish.getName()+"\n"+"Age is: " + fish.getAge()+"\n"+"Color is: "+fish.getColor()
        +"\n" + "Length is: " + fish.getLength());


        System.out.println("             ~Parrot~             ");


        Parrot parrot = new Parrot();
        parrot.setName("Gosha");
        parrot.setAge(1);
        parrot.setColor("Blue");


        System.out.println("Name is: "+ parrot.getName()+"\n"+"Age is: " + parrot.getAge()+"\n"+"Color is: "
                +parrot.getColor() +"\n"+"Skill: ");
        parrot.getParrotSkill();


    }
}
