package proj2;

public class Main {
    private String name;

    private static void Main(String[] args) {
         Gym gym = new Gym();
         gym.setName("StrongBody");

         Group group1 = new Group();
         group1.setName("Pilates");

         Group group2 = new Group();
         group2.setName("Bicycle");

         Coach coach1 = new Coach();
         coach1.setName("Misha");

         Coach coach2 = new Coach();
         coach2.setName("Jane");

         Training training1 = new Training();
         training1.setName("Bicycle Training");

         Training training2 = new Training();
         training2.setName("Pilates Training");


    }
}
