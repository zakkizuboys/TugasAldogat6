package tugasalgodat6;
import java.util.Scanner;
public class Driver {
    public static void main(String [] args){
        Boosters x = new Boosters();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int y = in.nextInt();
        for(int i = 0; i < y; i++){
            System.out.println("Data ke " + (i+1) + " = ");
            x.insert(in.nextInt());
            x.place(x.root);
        }
        System.out.println(x.toString());
    }
}
