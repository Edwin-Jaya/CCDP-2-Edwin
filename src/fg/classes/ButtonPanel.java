package fg.classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Kelas {@code ButtonPanel} merupakan panel yang berisi dua tombol, yaitu tombol
 * untuk menambahkan tugas baru dan tombol untuk menghapus tugas yang sudah selesai.
 */
public class ButtonPanel extends JPanel {

    /**
     * Tombol untuk menambahkan tugas baru.
     */
    private JButton addTask;

    /**
     * Tombol untuk menghapus tugas yang sudah selesai.
     */
    private JButton clear;

    /**
     * Border kosong yang digunakan untuk menghilangkan border default tombol.
     */
    Border emptyBorder = BorderFactory.createEmptyBorder();

    /**
     * Konstruktor untuk membuat panel tombol. Mengatur ukuran panel dan
     * menginisialisasi kedua tombol dengan teks dan properti yang sesuai.
     */
    public ButtonPanel() {
        // Mengatur preferensi ukuran panel
        this.setPreferredSize(new Dimension(400, 60));

        // Membuat tombol "Ajouter une Tache" dan menghilangkan border
        addTask = new JButton("Ajouter une Tache");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        // Menambahkan tombol addTask ke panel
        this.add(addTask);

        // Menambahkan ruang horizontal antara kedua tombol
        this.add(Box.createHorizontalStrut(30));

        // Membuat tombol "Tach Fini" dan menghilangkan border
        clear = new JButton("Tach Fini");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        // Menambahkan tombol clear ke panel
        this.add(clear);
    }

    /**
     * Mengembalikan referensi tombol tambah tugas.
     * 
     * @return tombol tambah tugas {@code addTask}.
     */
    public JButton getAddTask() {
        return addTask;
    }

    /**
     * Mengembalikan referensi tombol hapus tugas.
     * 
     * @return tombol hapus tugas {@code clear}.
     */
    public JButton getClear() {
        return clear;
    }
}
