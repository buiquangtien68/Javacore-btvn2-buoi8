import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<SKT> sktList=new ArrayList<>();
        System.out.println("Mời bạn nhập thông tin team SKT");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Mời bạn nhập tên tướng thứ "+(i+1));
            String name= scanner.nextLine();
            System.out.println("Mời bạn nhập vị trí của tướng thứ "+(i+1));
            String position= scanner.nextLine();
            SKT skt=new SKT(name,position);
            sktList.add(skt);
        }
        ArrayList<G2> g2List=new ArrayList<>();
        System.out.println("Mời bạn nhập thông tin team G2");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Mời bạn nhập tên tướng thứ "+(i+1));
            String name= scanner.nextLine();
            System.out.println("Mời bạn nhập vị trí của tướng thứ "+(i+1));
            String position= scanner.nextLine();
            G2 g2=new G2(name,position);
            g2List.add(g2);
        }
        SummonRift summonRift=new SummonRift(sktList,g2List);
        System.out.println(summonRift);
    }
}
