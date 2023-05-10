package Class17;

import Class18.TV;

public class LGTV extends TV {
    // this class is subclass from package 18 class TV

    void printMake(){
        System.out.println(make);
    }

}

class LGTVTester{
    public static void main(String[] args) {
        LGTV lgtv=new LGTV();

    }
}
