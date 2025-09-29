import java.io.IOException;

public class ContohThrows {

    // Metode yang mendeklarasikan bisa melempar IOException
    static void bacaFile() throws IOException {
        // Melempar exception secara manual
        throw new IOException("File tidak ditemukan");
    }

    public static void main(String[] args) {
        try {
            bacaFile(); // Memanggil metode yang melempar exception
        } catch (IOException e) {
            // Menangkap exception yang dilempar oleh metode bacaFile
            System.out.println("Terjadi error: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah throws");
    }
}