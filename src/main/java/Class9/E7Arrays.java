package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[] flags={true, false, true, false, false, true};
        //write a loop to count how many values in above arrays are false

        int counter=0;
        for (int  i= 0;  i< flags.length;i++) {
            if (flags[i]==false){ //you can also write it => if(!flags[i])
                //System.out.println(flags[i]);
                counter++;
            }

        }
        System.out.println(counter);
    }
}
