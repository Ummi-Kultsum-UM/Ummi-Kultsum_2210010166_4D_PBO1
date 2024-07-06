# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi "Program Perkiraan Lama Durasi Playlist Focus satu lagu(lagu yang sama tetapi diputar berkali-kali)" menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul, penyanyi, durasi dan jumlah putar suatu lagu, dan memberikan output berupa informasi detail dari durasi dan jumlah putar tersebut seperti durasi lagu dalam detik, perkiraan durasi lagu filter, dan perkiraan durasi playlistnya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Playlist`, `PlaylistFocus`, dan `PlaylistBeraksi` adalah contoh dari class.

```bash
public class Playlist {
    ...
}

public class PlaylistFocus extends Playlist {
    ...
}

public class PlaylistBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pl[i] = new PlaylistFocus(judul, penyanyi, durasi, jumlah);` adalah contoh pembuatan object.

```bash
pl[i] = new PlaylistFocus(judul, penyanyi, durasi, jumlah);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, 'penyanyi', 'durasi' dan `jumlah` adalah contoh atribut dari class utama(playlist} serta 'lamaPlaylist' dan 'filter' dari class PlaylistFocus.

```bash
     String judul, penyanyi, durasi;
     int jumlah;
     int lamaPlaylist, filter;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Playlist` dan `PlaylistFocus`.

```bash
    Playlist (String judul, String penyanyi, String durasi, int jumlah){
        this.judul = judul;
        this.penyanyi =  penyanyi;
        this.durasi = durasi;
        this.jumlah = jumlah;
    }

	public PlaylistFocus(String judul, String penyanyi, String durasi, int jumlah) {
        super(judul, penyanyi, durasi, jumlah);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul`, 'setPenyanyi', 'setDurasi' dan `setJumlah` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, 'getPenyanyi', 'getDurasi', `getJumlah`, 'getDurasiDetik', 'getFilter', dan 'getLamaPl'   adalah contoh method accessor.

```bash
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
	    public int getDurasiDetik(){
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `lamaPlaylist` dan `Filter` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter. Selain itu, Encapsulation membuat atribut menjadi protected dan hanya bisa diakses di class yang sama, dalam package yang sama dan dalam sub class.

```bash
    protected String judul, penyanyi, durasi;
    protected int jumlah;
	  private int lamaPlaylist, filter;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PlaylistFocus` mewarisi `Playlist` dengan sintaks `extends`.

```bash
	public class PlaylistFocus extends Playlist{
		...
	}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `detail(String)` di `Playlist` merupakan overloading method `detail()` dan `detail()` di `PlaylistFocus` merupakan override dari method `detail()` di `Playlist`.

```bash
   //polymorphism (overloading)
   public String detail(String album){
       return detail() + " \nAlbum \t\t\t: "+album;
   }

    @Override
    public String detail() {
        return super.detail() +
                "\nDurasi lagu               : "+getDurasiDetik()+ " detik" +
                "\nPerkiraan durasi Filter   : +- "+getFilter()/60 +" menit atau " +getFilter() +" detik" +
                "\nPerkiraan durasi Playlist : +- " + getLamaPl()/60+" menit atau " +getLamaPl() +" detik";
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getFilter`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
	for (int i = 0; i < pl.length; i++) {
		...
	}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
		 Scanner input = new Scanner(System.in);
		    System.out.println("Playlist " + (i+1));
        System.out.print("Input Judul lagu \t: ");
        String judul = input.nextLine();
        System.out.print("Input nama penyanyi \t: ");
        String penyanyi = input.nextLine();
        System.out.print("Input durasi lagu(#.##) : ");
        String durasi = input.nextLine();
        System.out.print("Pilih jumlah spin/putar lagu fokus (10/20): ");
        int jumlah = input.nextInt();

    		System.out.println("Program Perkiraan Lama Playlist Focus satu lagu");
    		System.out.println("-----------------------------------------");
    		System.out.println(data.detail());
    		System.out.println("===========================================");
            
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PlaylistFocus[] pl = new PlaylistFocus[2];` adalah contoh penggunaan array.

```bash
	PlaylistFocus[] pl = new PlaylistFocus[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
	try {
			// code that might throw an exception
		   }catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor : "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format durasi :"+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan umum : " + e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ummi Kultsum
NPM : 2210010166
