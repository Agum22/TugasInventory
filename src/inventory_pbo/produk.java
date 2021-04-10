
package inventory_pbo;


import java.util.Scanner;
import java.util.InputMismatchException;

public class produk {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public produk(){

    }
    public void masukkanData(){
        try{
            for(int a=0;a < semua;a++){
                System.out.println("Produk nomer"+(a+1));
                System.out.println("nama produk \t \ttekan 0 jika tidak jadi : ");

                run.nextLine();
                kodebarang[a]=a+1;
                nama[a] = run.nextLine();

                if (nama[a].equals("0")){
                    break;
                }

                System.out.println("harga produk : ");
                harga[a]= run.nextInt();
                System.out.println("stok produk : ");
                stok[a]= run.nextInt();
                nilai[a]=stok[a]*harga[a];
            }
        }catch (InputMismatchException e){
            System.err.println("nomer yang anda masukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("masukkan nomer produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("yang anda masukkan lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("nomer produk : "+kodebarang[i]);
            System.out.println("nama produk : "+ nama[i]);
            System.out.println("harga produk : "+harga[i]);
            System.out.println("stok produk : "+stok[i]);
            System.out.println("nilai produk : "+nilai[i]);
        }
    }

}
