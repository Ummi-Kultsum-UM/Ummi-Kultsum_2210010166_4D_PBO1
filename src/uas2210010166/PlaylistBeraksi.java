
package uas2210010166;
import java.util.Scanner;

public class PlaylistBeraksi {
    public static void main(String[] args) {
        //objek
//        Playlist pl2 = new Playlist("Heaven", "RM", "3.14", 10);
//        System.out.println(pl2.detail());
//        System.out.println(pl2.detail("RPWP"));

    //error handling
    try{
        //io sederhana
        Scanner input = new Scanner(System.in);
    
        //array
        PlaylistFocus[] pl = new PlaylistFocus[2];
        
        //perulangan
        for (int i = 0; i < pl.length; i++) {
            System.out.println("Playlist " + (i+1));
            System.out.print("Input Judul lagu \t: ");
            String judul = input.nextLine();
            System.out.print("Input nama penyanyi \t: ");
            String penyanyi = input.nextLine();
            System.out.print("Input durasi lagu(#.##) : ");
            String durasi = input.nextLine();
            System.out.print("Pilih jumlah spin/putar lagu fokus (10/20): ");
            int jumlah = input.nextInt();
            //seleksi
            switch (jumlah) {
                case 10:
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Inputan salah! Pilih 10 atau 20.");
                    break;
            }
            input.nextLine();
            System.out.println("-----------------");
            //objek
            pl[i] = new PlaylistFocus(judul, penyanyi, durasi, jumlah);
        }

        //perulangan
        for(PlaylistFocus data: pl){
            System.out.println("Program Perkiraan Lama Playlist Focus satu lagu");
            System.out.println("-----------------------------------------------");
            System.out.println(data.detail());
            System.out.println("===============================================");
            
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format nomor : "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format durasi :"+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan umum : " + e.getMessage());
        }
 }
}
