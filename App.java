class NilaiUlangan {
    String nama_pelajaran = "Fisika";
    int kelas = 11;

    NilaiUlangan (String nama_pelajaran, int kelas){
        this.nama_pelajaran = nama_pelajaran;
        this.kelas = kelas;

    }
    void display(){
        System.out.println("Nilai ujian " + nama_pelajaran + " kelas " + kelas );
    }
}

class NilaiSiswa extends NilaiUlangan {
    String nama_siswa;
    int nilai;

    NilaiSiswa(String nama_siswa, String nama_pelajaran, int kelas, int nilai) {
        super(nama_pelajaran, kelas);
        this.nama_siswa = nama_siswa;
        this.nilai = nilai;
    }

    void display() {
        System.out.println("Nama Siswa: " + nama_siswa);
        super.display(); 
        System.out.println("Nilai: " + nilai);
    }
}

public class App {
    public static void main(String[] args) {
        NilaiSiswa siswa1 = new NilaiSiswa("jeni", "Fisika", 11, 85);
        siswa1.display();
    }
}