public class ContohThrow {
    // Metode untuk mengecek usia
    static void cekUsia(int usia) {
        if (usia < 18) {
            // Melemparkan exception secara manual
            throw new ArithmeticException("Usia tidak boleh kurang dari 18 tahun");
        } else {
            System.out.println("Usia valid: " + usia);
        }
    }

    public static void main(String[] args) {
        try {
            cekUsia(15); // Akan melempar exception
        } catch (ArithmeticException e) {
            // Menangkap exception dari metode cekUsia
            System.out.println("Terjadi error: " + e.getMessage());
        }
        System.out.println("Program tetap berjalan setelah throw");
    }
}