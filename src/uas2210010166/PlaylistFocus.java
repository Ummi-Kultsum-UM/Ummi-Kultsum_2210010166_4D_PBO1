
package uas2210010166;
//inheritance
public class PlaylistFocus extends Playlist{
    private int lamaPlaylist, filter;
    
    //overriding
    public PlaylistFocus(String judul, String penyanyi, String durasi, int jumlah) {
        super(judul, penyanyi, durasi, jumlah);
    }

    public int getDurasiDetik(){
        //4.30
      return Integer.parseInt(getDurasi().substring(0, 1)) * 60 + Integer.parseInt(getDurasi().substring(2, 4));
    }
       
    public int getFilter(){ 
       //seleksi switch
        switch(getJumlah()){
            case 10:
                return filter = 5280; //22 lagu filter dengan durasi kurang dari 4 menit
            case 20:
                return filter = 11280; //47 lagu filter dengan durasi kurang dari 4 menit
            default :
               return filter = 0;
        }
    }
    
    public int getLamaPl(){
        return (getDurasiDetik() * getJumlah() + getFilter());
    }                                                                    

    @Override
    public String detail() {
        return super.detail() +
                "\nDurasi lagu               : "+getDurasiDetik()+ " detik" +
                "\nPerkiraan durasi Filter   : +- "+getFilter()/60 +" menit atau " +getFilter() +" detik" +
                "\nPerkiraan durasi Playlist : +- " + getLamaPl()/60+" menit atau " +getLamaPl() +" detik";
    }


   
    
    
}
