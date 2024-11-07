package fg.classes;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Kelas {@code AppFrame} merupakan JFrame utama aplikasi yang berisi title bar, daftar tugas, 
 * dan panel tombol untuk menambahkan tugas baru serta menghapus tugas yang sudah selesai.
 */
public class AppFrame extends JFrame {

    /**
     * Komponen title bar dari aplikasi.
     */
    private TitleBar title;

    /**
     * Daftar tugas yang ditampilkan dalam aplikasi.
     */
    private List list;

    /**
     * Panel tombol yang berisi tombol untuk menambahkan dan menghapus tugas.
     */
    private ButtonPanel btnPanel;

    /**
     * Tombol untuk menambahkan tugas baru.
     */
    private JButton addTask;

    /**
     * Tombol untuk menghapus tugas yang sudah selesai.
     */
    private JButton clear;

    /**
     * Konstruktor untuk membuat jendela utama aplikasi. Menginisialisasi komponen GUI
     * seperti title bar, daftar tugas, dan panel tombol, serta menambahkan listener 
     * untuk tombol tambah tugas dan tombol hapus.
     */
    public AppFrame() {
        // Mengatur ukuran jendela dan visibilitas
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);

        // Menginisialisasi komponen-komponen
        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();

        // Menambahkan komponen ke layout
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        // Mengambil tombol dari panel
        addTask = btnPanel.getAddTask();
        clear = btnPanel.getClear();

        // Menambahkan listener untuk interaksi tombol
        addListeners();
    }

    /**
     * Menambahkan listener ke tombol {@code addTask} untuk menambahkan tugas baru
     * dan ke tombol {@code clear} untuk menghapus tugas yang sudah selesai.
     */
    public void addListeners() {
        // Listener untuk tombol tambah tugas
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Membuat tugas baru dan menambahkannya ke dalam daftar
                Task task = new Task();
                list.add(task);
                list.updatNumbers();
                
                // Listener untuk perubahan status tugas (selesai atau belum)
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });

        // Listener untuk tombol hapus tugas
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Menghapus tugas yang sudah selesai
                list.removeCompletedTasks();
                repaint();
            }
        });
    }
}
