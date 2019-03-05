
package Chapter5;

public class Array {
    public static void main(String[]args){
        // $people = [] // php
        // bil data dalam array = 3 fixed
        String[] people = new String[3];
        people[0] = "Abu";
        people[1] = "Ali";
        people[2] = "Ramasamy";
        // people[3] = "John Doe"; ini error - kalau mention 4 kena mention 4
        
        System.out.println(people[2]);
        
        //int[] bil = new int - ini x boleh sebab primitif
        Integer [] bil = new Integer [5]; // so jadikan Integer
        int[] jum ={1,2,4}; 
        
        for (int i=0; i<jum.length; i++){
            System.out.println(jum[i]);
        }
        
        int j=0;
        while (j < jum.length){
            //System.out.println(jum[j]); --- ini ok
            System.out.printf("Val = %s, ", jum[j]);
            j++;
        }
    }
}
