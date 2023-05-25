import java.util.Scanner;
public class tower_of_hanoi {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n=sc.nextInt();
        tower_of_hanoi object=new tower_of_hanoi();
        object.Tower_of_hanoi(n,'A','B','C');
    }
    void Tower_of_hanoi(int n,char from,char to, char aux)
    {
        if(n==0)
            return;
        Tower_of_hanoi(n-1,from,aux,to);
        System.out.println("Mode "+n+" from "+from+" to "+to);
        Tower_of_hanoi(n-1,aux,to,from);
    }
}
