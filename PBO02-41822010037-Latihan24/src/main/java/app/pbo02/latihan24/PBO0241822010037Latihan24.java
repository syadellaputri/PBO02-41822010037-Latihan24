/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan24;
import java.util.Scanner;
/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan24 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        Scanner input=new Scanner(System.in);
        System.out.println("======= Program Perbandingan Nilai ======");
        boolean bool = true;
        do{
            System.out.print("Masukkan Nilai pertama : ");
            int x=input.nextInt();
            System.out.print("Masukkan Nilai kedua : ");
            int y=input.nextInt();
            if(x>y){
                System.out.println("Hasil : "+x+" Lebih besar dari "+y);
            }else if(y>x){
                System.out.println("Hasil : "+y+" Lebih besar dari "+x);
            }else{
                System.out.println("Hasil : "+x+" Sama Dengan "+y);
            }
            System.out.print("Ulangi Aktivitas? (ya/tidak) : ");
            char pilih=input.next().charAt(0);
            if(pilih=='y' || pilih=='Y'){
                bool=true;
            }if(pilih=='n' || pilih=='N'){
                bool=false;
            }
        }while(bool==true);
    }
}
