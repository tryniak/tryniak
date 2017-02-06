/**
 * Created by Igor on 03.02.2017.
 */import java.util.Scanner;
public class ast2 {
    public static void main(String[] args) {
        Scanner vv=new Scanner (System.in);
        int var, j=1;
        System.out.print("Enter the maximum width - ");
        var=vv.nextInt();
        for (int i=0; j<=2*var;){

            if ((i<(2*var-j))&&(j>var)){
                System.out.print(" *");
                i=i+1;
            }
            else if ((i<j) && (j<=var)){
                System.out.print("*");
                i=i+1;}
            else{
                System.out.println("");
                j=j+1;
                i=0;

            }
        }

    }

}



