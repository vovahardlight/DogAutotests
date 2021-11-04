public class Dog {
    String name;
    int age;
    int weightNow;
    int weightBeen;//year ago
    int height;
    String breed;
    String color;
    int estimatedLifeCycle;
    int eatPerDay; //gm food
    int successWellFedDays;// per month
    int meat;
    int porridge;
    int cheburek;

    int width;
    int height1;

    public Dog(String name,int age,int weightNow,int weightBeen,int height,String breed,String color,
               int estimatedLifeCycle,int eatPerDay,int successWellFedDays,int meat,int porridge,int cheburek){
        this.name = name;
        this.age = age;
        this.weightNow = weightNow;
        this.weightBeen = weightBeen;
        this.height = height;
        this.breed = breed;
        this.color = color;
        this.estimatedLifeCycle = estimatedLifeCycle;
        this.eatPerDay = eatPerDay;
        this.successWellFedDays = successWellFedDays;
        this.meat = meat;
        this.porridge = porridge;
        this.cheburek = cheburek;


    }

    String showNameAgeColorBreed(String showName,int showAge,String showColor,String showBreed){return
            "My dog's name is " + showName + ",his age is " + showAge + ",his own color is " + showColor +
                    ",breed-" + showBreed;}
    String addition(int eatPerDay){return "Eat per two days "
            + (eatPerDay + eatPerDay) + "gm";}
    String subtraction(int weightNow,int weightBeen){return "Difference at weight gain per year is " +
            (weightNow - weightBeen) + "kg";}
    String multiplication(int weightNow,int weightBeen){return "Approximate weight after two years the dog is " +
            (((weightNow - weightBeen)*2) + weightNow) + "kg";}
    String division(int height,int age){return "The dog grows " + (height/age) + "cm per year";}

    String addition(int meat,int porridge,int cheburek){return "Ate all the food " + (meat + porridge + cheburek) + "gm";}
    String subtraction(int eatPerDay,int meat,int cheburek){return "Ate carbohydrates per day " + (eatPerDay - meat - cheburek) +
    "gm";}
    String multiplication(int successWellFedDays,int meat,int cheburek){return "Ate all proteins per month " +
            ((successWellFedDays * meat) + (successWellFedDays * cheburek)) + "gm";}
            String division(int meat,int successWellFedDays,int weightNow,int age)
            {return "Need to ate per year protein to gain a kg of weight " +
                    (((meat * successWellFedDays)*12) / (weightNow / age)) + "gm";}

                    static void  sayGaf(){
                        System.out.println("gaaaaaf");
                    }
                    static void sayGaf(String x){
                        System.out.println(x);
                    }

    public static void main(String[] args) {
        Dog streetDog = new Dog("sharik",4,9,6,45,"dvorniaga","bright-grey",
                12,800,10,200,400,200);

        streetDog.showNameAgeColorBreed(streetDog.name, streetDog.age, streetDog.color, streetDog.breed);
        System.out.println(streetDog.showNameAgeColorBreed(streetDog.name, streetDog.age, streetDog.color, streetDog.breed));

        streetDog.addition(streetDog.eatPerDay);
        System.out.println(streetDog.addition(streetDog.eatPerDay));

        streetDog.subtraction(streetDog.weightNow, streetDog.weightBeen);
        System.out.println(streetDog.subtraction(streetDog.weightNow, streetDog.weightBeen));

        streetDog.multiplication(streetDog.weightNow, streetDog.weightBeen);
        System.out.println(streetDog.multiplication(streetDog.weightNow, streetDog.weightBeen));

        streetDog.division(streetDog.height, streetDog.age);
        System.out.println(streetDog.division(streetDog.height, streetDog.age));



        streetDog.addition(streetDog.meat, streetDog.porridge, streetDog.cheburek);
        System.out.println(streetDog.addition(streetDog.meat, streetDog.porridge, streetDog.cheburek));

        streetDog.subtraction(streetDog.eatPerDay, streetDog.meat, streetDog.cheburek);
        System.out.println(streetDog.subtraction(streetDog.eatPerDay, streetDog.meat, streetDog.cheburek));

        streetDog.multiplication(streetDog.successWellFedDays, streetDog.meat, streetDog.cheburek);
        System.out.println(streetDog.multiplication(streetDog.successWellFedDays, streetDog.meat, streetDog.cheburek));

        streetDog.division(streetDog.meat, streetDog.successWellFedDays, streetDog.weightNow, streetDog.age);
        System.out.println(streetDog.division(streetDog.meat, streetDog.successWellFedDays, streetDog.weightNow,
                streetDog.age));

        sayGaf();
        sayGaf("What");
        sayGaf("fuck");

    }

}
