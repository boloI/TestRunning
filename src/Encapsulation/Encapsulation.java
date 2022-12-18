package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        play();
        sleep();
        feed();
    }



    public static void setMood(String mood) {
        Encapsulation.mood = mood;
    }

    public static void setHungry(String hungry) {
        Encapsulation.hungry = hungry;
    }

    public static void setEnergy(String energy) {
        Encapsulation.energy = energy;
    }

    private static String mood;
    private static String hungry;
    private static String energy;
    private static String meow(){
        return "meow";
    }

    String cat;
    public static void sleep(){
        energy= "energy increasing";
        hungry= " is getting hungry";
        System.out.println("cat is sleeping = " + energy +" ," + hungry);
    }
    public static void  play(){
        mood=" mood ++ ";
        energy=" energy -- ";
        meow();
        System.out.println("cat is playing = " +  mood+ "," +energy+ "," +meow());
    }
    public static void feed(){
        hungry="finaly i am eating ";
        mood="feeling better,moood UP ";
        meow();
        System.out.println("cat getting feed= " + hungry+ "," +mood+ "," +meow());
    }


}
