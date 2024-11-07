package fg.classes;

/**
 * Kelas utama {@code TodoList} yang berfungsi sebagai entry point untuk aplikasi. 
 * Kelas ini akan membuat dan menampilkan jendela aplikasi {@code AppFrame}.
 */
public class TodoList {

    /**
     * Metode utama yang dijalankan saat aplikasi dimulai.
     * Metode ini akan membuat instance dari {@code AppFrame} yang merupakan GUI utama dari aplikasi.
     * 
     * @param args argumen baris perintah (tidak digunakan di aplikasi ini)
     */
    public static void main(String args[]) {
        // Membuat dan menampilkan jendela aplikasi
        new AppFrame();
    }
}
