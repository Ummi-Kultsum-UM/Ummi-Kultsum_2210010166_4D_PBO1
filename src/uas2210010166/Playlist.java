
package uas2210010166;
//class 1
public class Playlist {
    //atribut dan encapsulation
    protected String judul, penyanyi, durasi;
    protected int jumlah;

    //constructor
    Playlist (String judul, String penyanyi, String durasi, int jumlah){
        this.judul = judul;
        this.penyanyi =  penyanyi;
        this.durasi = durasi;
        this.jumlah = jumlah;
    }
    
    //mutator (setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
    //accessor (getter)
    public String getJudul() {
        return judul;
    }

    public String getDurasi() {
        return durasi;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    
   public String detail(){
         return "Judul            \t: " + getJudul() +
          "\nPenyanyi             \t: " + getPenyanyi() + 
          "\nDurasi               \t: " + getDurasi() + " menit" +
          "\nJumlah spin lagu fokus \t: " +getJumlah() + " spin";
    }
   //polymorphism (overloading)
   public String detail(String album){
       return detail() + " \nAlbum \t\t\t: "+album;
   }

}

