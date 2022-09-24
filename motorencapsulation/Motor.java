/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author user
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakon = false;
    
    public void nyalakanMesin(){
        kontakon = true;
    }
    public void matikanMesin(){
        kontakon = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kecepatan < 100){
            if(kontakon == true){
                kecepatan += 50;
            }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }else {
                System.out.println("Kecepatan sudah maksimum");
            }
    }
    public void kurangiKecepatan(){
        if (kontakon == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatus(){
        if (kontakon == true){
            System.out.println("Kontak on");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
