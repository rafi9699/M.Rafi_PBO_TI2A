import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        // Membuat ArrayList bertipe String
        ArrayList<String> nama = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        nama.add("Samsul");
        nama.add("Samsudin");
        nama.add("Sukirman");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList: " + nama);

        // Mengambil elemen berdasarkan index
        System.out.println("Elemen ke-1: " + nama.get(0)); // index 0 = Samsul

        // Mengubah elemen
        nama.set(1, "Andi"); // Mengganti Samsudin menjadi Andi
        System.out.println("Setelah diubah: " + nama);

        // Menghapus elemen
        nama.remove(2); // Menghapus elemen index ke-2 (Sukirman)
        System.out.println("Setelah dihapus: " + nama);

        // Menampilkan jumlah elemen
        System.out.println("Jumlah elemen: " + nama.size());
    }
}