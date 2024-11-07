package fg.classes;

import javax.swing.*;
import java.awt.*;

/**
 * Kelas {@code TitleBar} merupakan komponen panel yang menampilkan judul "To Do List"
 * pada bagian atas antarmuka pengguna.
 */
public class TitleBar extends JPanel {

    /**
     * Konstruktor untuk membuat panel title bar dengan ukuran dan tampilan yang sudah
     * ditentukan. Menambahkan label teks "To Do List" ke panel.
     */
    public TitleBar() {
        // Mengatur ukuran preferensi panel
        this.setPreferredSize(new Dimension(400, 80));
        // Mengatur warna latar belakang (opsional, saat ini dikomentari)
        // this.setBackground(Color.decode("#48dbfb"));

        // Membuat label dengan teks "To Do List"
        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200, 80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        // Menambahkan label ke panel
        this.add(titleText);
    }
}
