/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author user
 */
public class Anggota {
    private String noktp;
    private String nama;
    private int limitPinjam;
    private int jmlPinjam;
    
    Anggota (String noktp, String nama, int limitPinjam){
        this.noktp = noktp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    public int getLimitPinjam(){
        return limitPinjam;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getjmlPinjam(){
        return jmlPinjam;
    }
    
    public void pinjam(int jmlPin){
        if(jmlPin < limitPinjam){
            jmlPinjam = jmlPin;
        }else {
            System.out.println("Maaf jumlah pinjam melebihi limit");
        }
    }
    
    public void angsur (int jmlAngsur){
        int angsuran = (int) (0.1*jmlPinjam);
        if(jmlAngsur > angsuran){
             jmlPinjam -= jmlAngsur;    
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        
    }
}
