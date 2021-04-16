
import java.util.Scanner;
public class BubbleSorting {
    //making a function sorting
    void sorting(){
        
        Scanner sc = new Scanner(System.in);
        //Initializing array with its size.
        int ar[] = new int[5];
        // from here there are 3 steps which are most important and aglorithm of the program.
        
        //step 1 input
        //taking the input from the user by using for loop to take more than 2 input
        System.out.println("Enter the element : ");
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        //step2 process
        
        //in this step we use the loop for sorting element 
        // this for loop running for rows and checking the element in rows 
        for(int r =0; r<4;r++)
        {
            // this loop running for comparing elements 
            for(int c =0;c<4-r;c++){
                
                // if is used to swap the number here, "c+1" is used to comparing the elements of the column with next elements of column
                if(ar[c]>ar[c+1])
                {
                    //initializing the temporary element
                    int temp = ar[c];
                    ar[c]= ar[c+1];
                    ar[c+1]=temp;
                    
                }
            }
        }
        
        
        //step 3output
        
        //priting the SORTED data
        System.out.println("-----------------bubble sorted---------");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    public static void main(String args[]){
        BubbleSorting obj = new BubbleSorting();
        obj.sorting();
        
    }
    
}

    

