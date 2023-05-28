package Class9;

public class HW2 {
    public static void main(String[] args) {

        // Create an array of names and store all names of your group. Then print your name from that array.
        // (use 2 different ways of creating an array)

        String [] names={"Tsanita", "Sheilla", "Widya", "Wieke"};
        System.out.println(names[0]);

        String [] name=new String[4];
        name[0]="Tsanita";
        name[1]="Sheilla";
        name[2]="Widya";
        name[3]="Wieke";

        System.out.println(name[0]);
    }
}
