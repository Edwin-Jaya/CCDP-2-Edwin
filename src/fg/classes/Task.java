package fg.classes;

import javax.swing.*;
import java.awt.*;

/**
 * Kelas {@code Task} merepresentasikan satu tugas yang ditampilkan sebagai panel
 * dengan label nomor, field untuk memasukkan nama tugas, dan tombol untuk menandai tugas sebagai selesai.
 */
public class Task extends JPanel {

    /**
     * Label untuk menampilkan nomor urut tugas.
     */
    private JLabel index;

    /**
     * Field teks untuk memasukkan atau menampilkan nama tugas.
     */
    private JTextField taskName;

    /**
     * Tombol untuk menandai tugas sebagai selesai.
     */
    private JButton done;

    /**
     * Menyimpan status apakah tugas telah diselesaikan atau belum.
     */
    private boolean checked;

    /**
     * Konstruktor untuk membuat panel tugas baru dengan tata letak, label, field nama tugas, 
     * dan tombol yang telah diatur. Secara default, tugas belum diselesaikan.
     */
    public Task() {
        // Mengatur ukuran dan warna latar belakang panel tugas
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.decode("#48dbfb"));

        // Mengatur layout untuk panel
        this.setLayout(new BorderLayout());

        // Tugas belum ditandai selesai saat pertama kali dibuat
        checked = false;

        // Inisialisasi label index tanpa teks, dan menambahkan ke sisi kiri (Barat)
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        // Inisialisasi field teks untuk nama tugas dengan teks default dan warna tertentu
        taskName = new JTextField("Entrer une tache");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.decode("#54a0ff"));
        this.add(taskName, BorderLayout.CENTER);

        // Inisialisasi tombol 'done' untuk menandai tugas sebagai selesai, dan menambahkan ke sisi kanan (Timur)
        done = new JButton("Entrer");
        done.setPreferredSize(new Dimension(40, 20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done, BorderLayout.EAST);
    }

    /**
     * Mengembalikan tombol yang digunakan untuk menandai tugas sebagai selesai.
     * 
     * @return tombol {@code done}
     */
    public JButton getDone() {
        return done;
    }

    /**
     * Mengubah nomor urut tugas yang ditampilkan di label index.
     * 
     * @param num nomor urut baru yang akan ditampilkan
     */
    public void changeIndex(int num) {
        this.index.setText(num + "");
        this.revalidate(); // Memperbarui tampilan setelah perubahan
    }

    /**
     * Mengubah status tugas menjadi selesai, serta mengubah warna latar belakang panel dan nama tugas menjadi hijau.
     */
    public void changeState() {
        this.setBackground(Color.green);
        taskName.setBackground(Color.green);
        checked = true; // Menandai bahwa tugas telah selesai
    }
}
