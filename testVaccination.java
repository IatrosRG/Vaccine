
/**
 * Write a description of class testVaccination here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class testVaccination
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        //create an array list object
        ArrayList <Vaccination> arrVacc = new ArrayList <Vaccination>();

        String name,id,type;
        boolean dose;

        for(int i = 0;i <3 ;i++)
        {
            System.out.print("Name:");
            name = scan.next();
            System.out.print("Mysejahtera ID");
            id = scan.next();
            System.out.print("Vaccine Type");
            type = scan.next();
            System.out.print("[true]if completed two doses OR [false]if not");
            dose = scan.nextBoolean();

            Vaccination v = new Vaccination(name,id,type,dose);
            arrVacc.add(v);
        }
        bubbleSort(arrVacc);
        for(int i = 0;i<arrVacc.size();i++)
        {
            System.out.println(arrVacc.get(i).toString());

        }
        System.out.println("--------------------------------------");

        System.out.print("Please Enter ID for searching>>");
        String search = scan.next();
        binarySearch(arrVacc,0,arrVacc.size()-1,search);
        System.out.println("--------------------------------------");

        for(int i = 0;i < arrVacc.size();i++)
        {
            if (arrVacc.get(i).getCompleteDose()==true)
            {
                System.out.println(arrVacc.get(i).toString());
            }
        }
    }

    public static void bubbleSort(ArrayList <Vaccination> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            {
                Vaccination v1 = arr.get(j);
                Vaccination v2 = arr.get(j+1);
                if (v1.getMysejID().compareTo(v2.getMysejID())>0)
                //arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    Vaccination temp = (Vaccination)arr.get(j);
                    //arr[j] = arr[j+1];
                    arr.set(j, arr.get(j+1));
                    //arr[j+1] = temp;
                    arr.set((j+1), temp);
                }
            }
    }

    public static void binarySearch(ArrayList <Vaccination> arr, int first, int last, String key){  
        int mid = (first + last)/2;  
        while( first <= last ){ 
            Vaccination v = (Vaccination)arr.get(mid);
            if ( v.getMysejID().compareTo(key)<0 ){  
                first = mid + 1;     
            }else if ( v.getMysejID().compareTo(key) == 0 ){  
                System.out.println(v.toString());  
                break;  
            }else{  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
            System.out.println("Element is not found!");  
        }  
    }  

}
