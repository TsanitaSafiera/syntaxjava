package Class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {
        // we can store the objects of a class in variable whose type is interface
        Headset headset1=new Headset("arazer Nari Ultimate",79.99,4620);
        Headset headset2=new Headset("New steelSeries Arctics",52.64,4868);
        Headset headset3=new Headset("HyperX Cloud II",0,32116);
        System.out.println(headset1.toString());

        List<Headset> headsets = new ArrayList<>();
        headsets.add(headset1);
        headsets.add(headset2);
        headsets.add(headset3);
        // printList(headsets);
        System.out.println(headsets.toString());

        for (Headset h : headsets){
            h.printInfo();
        }

    }
    public static void printList(List<Headset>headsets){
        for (Headset h : headsets){
            h.printInfo();
        }
    }
}
class Headset{
    private String tittle;
    private double price;
    private int noOfReviews;

    public Headset(String tittle, double price, int noOfReviews) {
        this.tittle = tittle;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }


   public void printInfo(){
        // System.out.println(tittle+" "+price+" "+noOfReviews);

    }
    @Override
    public String toString(){
        return tittle + " "+price+ " "+noOfReviews;
    }




}