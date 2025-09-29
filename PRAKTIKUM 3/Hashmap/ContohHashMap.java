import java.util.HashMap;

public class ContohHashMap {
    public static void main(String[] args) {
        // membuat HashMap dengan key Integer dan value String
        HashMap<Integer, String> mahasiswa = new HashMap<>();

        // Menambahkan pasangan key-value
        mahasiswa.put(101, "Samsul");
        mahasiswa.put(102, "Samsudin");
        mahasiswa.put(103, "Sukirman");

        // Menampilkan isi HashMap
        System.out.println("Data Mahasiswa: " + mahasiswa);

        // Mengambil value berdasarkan key
        System.out.println("Mahasiswa dengan NIM 101: " + mahasiswa.get(101));

        // Mengubah value berdasarkan key
        mahasiswa.put(102, "Andi"); // Mengganti Samsudin menjadi Andi
        System.out.println("Setelah diubah: " + mahasiswa);

        // Menghapus data berdasarkan key
        mahasiswa.remove(103); // Menghapus data dengan key 103 (Sukirman)
        System.out.println("Setelah dihapus: " + mahasiswa);

        // Menampilkan semua key dan value
        for (Integer nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + " | Nama: " + mahasiswa.get(nim));
        }

        // Menampilkan jumlah elemen
        System.out.println("Jumlah data: " + mahasiswa.size());
    }
}