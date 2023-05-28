package GroupProjectArray;

public class Task10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from
        //an Array of Strings?

        String[] arrayString = {"Wieke", "Dio", "Zico", "Wieke",
                "Fajar", "Fito", "Kivo", "Fajar"};
        System.out.println("Duplicate Elements are: ");

        for (int i = 0; i < arrayString.length; i++)
        {
            for (int j = i; j < arrayString.length; j++)
            {
                if( (arrayString[i].equals(arrayString[j])) && (i != j)  )
                {
                    System.out.print(arrayString[j] + " ");
                }

            }
        }


    }
}
