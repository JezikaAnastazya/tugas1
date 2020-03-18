public class biodata{
    public String nama;
    public String nim;
    public String jurusan;
    public String fakultas;

  biodata(String nm, String stb, String Jurusan, String Fakultas){
       nama = nm;
         nim = stb;
	jurusan = Jurusan;
	fakultas = Fakultas;
    }

    public static void main(String[] args) {
        biodata mahasiswa = new biodata("jeje", "13020180143", "TI", "FIKOM"); //pemanggilan nama konstuktor atau terhubung.
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
	System.out.println(mahasiswa.jurusan);
	System.out.println(mahasiswa.fakultas);
    }
}
