package fg.classes;

import javax.swing.*;
import java.awt.*;

/**
 * Kelas {@code List} merupakan panel yang digunakan untuk menampilkan daftar tugas dalam aplikasi.
 * Panel ini menggunakan layout grid dan memiliki latar belakang berwarna.
 */
public class List extends JPanel {
    
    /**
     * Konstruktor untuk membuat panel daftar tugas dengan layout grid berisi 10 baris.
     * Setiap baris memiliki jarak vertikal (vertical gap) sebesar 5 piksel, dan latar belakangnya
     * diatur menggunakan warna biru muda.
     */
    public List() {
        // Mengatur layout grid dengan 10 baris dan jarak vertikal antar elemen sebesar 5 piksel
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);
        
        // Mengatur layout dan warna latar belakang panel
        this.setLayout(layout);
        this.setBackground(Color.decode("#48dbfb"));
    }

    /**
     * Metode untuk memperbarui indeks tugas pada daftar.
     * Setiap tugas di dalam daftar akan diurutkan dan diberikan nomor urut berdasarkan posisinya.
     */
    public void updatNumbers() {
        // Mengambil semua komponen dalam panel
        Component[] listItems = this.getComponents();
        
        // Melakukan iterasi terhadap komponen dan memperbarui indeks tugas
        for (int i = 0; i < listItems.length; i++) {
            // Memeriksa apakah komponen adalah instance dari kelas Task
            if (listItems[i] instanceof Task) {
                // Mengubah indeks tugas berdasarkan posisinya di daftar
                ((Task) listItems[i]).changeIndex(i + 1);
            }
        }
    }

    /**
     * Metode untuk menghapus tugas yang telah diselesaikan dari daftar.
     * Saat ini, metode ini belum diimplementasikan.
     */
    public void removeCompletedTasks() {
        // Implementasi untuk menghapus tugas yang telah diselesaikan akan ditambahkan di sini
    }

}
