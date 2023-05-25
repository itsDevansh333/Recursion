//program to find the first occerence of any element in the array using recursion
import java.util.Scanner;
public class first_index_of_element {
    public static void main(String[]aaa)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find the first occerence of: ");
        int key=sc.nextInt();
        first_index_of_element object=new first_index_of_element();
        int result=object.first_index(arr,0,key);
        System.out.println("The first occerence of "+key+" is at index: "+result);
    }
//    first_index is a function to return first occerence of the element in the array
    int first_index(int[] arr,int index,int key)
    {
        if(index==arr.length)
        {
            return -1;
        }
        int ele=first_index(arr,index+1,key);
        if(arr[index]==key)
            return index;
        else
            return ele;
    }
}
