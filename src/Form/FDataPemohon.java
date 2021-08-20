/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizkytanjung
 */
public class FDataPemohon extends javax.swing.JFrame {

    /**
     * Creates new form FDataPemohon
     */
    private DefaultTableModel tabmode;
    Connection conn = new Koneksi().getConnection();

    NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public FDataPemohon() {
        initComponents();

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        view_data();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        t_no_hp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_alamat = new javax.swing.JTextArea();
        b_save = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();
        b_refresh_table = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data_pemohon = new javax.swing.JTable();
        b_search = new javax.swing.JButton();
        t_search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        b_edit = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t_nik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(237, 229, 252));

        jPanel1.setBackground(new java.awt.Color(28, 64, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 46));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PEMOHON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jLabel3.setText("ID Pemohon");

        jLabel4.setText("Nama Pemohon");

        jLabel5.setText("NIK Pemohon");

        jLabel9.setText("Alamat");

        t_id.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        t_nama.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        t_no_hp.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_no_hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_no_hpKeyTyped(evt);
            }
        });

        t_alamat.setColumns(20);
        t_alamat.setRows(5);
        jScrollPane1.setViewportView(t_alamat);

        b_save.setText("SAVE");
        b_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        b_cancel.setText("CANCEL");
        b_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelActionPerformed(evt);
            }
        });

        b_refresh_table.setText("Refresh Table");
        b_refresh_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refresh_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refresh_tableActionPerformed(evt);
            }
        });

        tbl_data_pemohon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_data_pemohon);

        b_search.setText("Search");
        b_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchActionPerformed(evt);
            }
        });

        t_search.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_searchKeyTyped(evt);
            }
        });

        b_edit.setText("Edit");
        b_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });

        b_delete.setText("Delete");
        b_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        jLabel6.setText("No Hp Pemohon");

        t_nik.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nikKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_search))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(t_no_hp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_id)
                            .addComponent(t_nik, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_refresh_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(b_refresh_table, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 71, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_search)
                                    .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String id_user, nama_user;

    private void justNumber(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    private void reset_text() {
        t_id.setText(null);
        t_nama.setText(null);
        t_nik.setText(null);
        t_no_hp.setText(null);
        t_alamat.setText(null);
    }

    public void view_data() {
        Object[] baris = {
            "ID ",
            "Nama",
            "NIK",
            "Alamat",
            "No Hp"
        };
        tabmode = new DefaultTableModel(null, baris);
        tbl_data_pemohon.setModel(tabmode);
        String search;
        if ("".equals(t_search.getText())) {
            search = "";
        } else {
            search = t_search.getText();
        }
        try {
            String sql = "SELECT * FROM tb_data_pemohon"
                    + " WHERE id_pemohon LIKE '%" + search + "%'"
                    + " OR nama_pemohon LIKE '%" + search + "%'"
                    + " ORDER BY id_pemohon ASC";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id = hasil.getString("id_pemohon");
                String nama = hasil.getString("nama_pemohon");
                String nik = hasil.getString("nik");
                String alamat = hasil.getString("alamat_pemohon");
                String no_hp = hasil.getString("no_hp_pemohon");
                String[] data = {
                    id,
                    nama,
                    nik,
                    alamat,
                    no_hp
                };
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL\n" + e, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        FUtama FormUtama = new FUtama();
        FormUtama.l_id_user.setText(id_user);
        FormUtama.l_nama_user.setText(nama_user);
        FormUtama.setVisible(true);
        this.setVisible(false);
//        JOptionPane.showMessageDialog(null, "Closing DISINI!","Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_formWindowClosing

    private void t_no_hpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_no_hpKeyTyped
        // TODO add your handling code here:
        justNumber(evt);
    }//GEN-LAST:event_t_no_hpKeyTyped

    private void save_data() {
        try {
            String sql = "INSERT INTO tb_data_pemohon VALUES"
                    + "("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            PreparedStatement stat = null;
            stat = conn.prepareStatement(sql);
            //stat.setString(4, (String)c_tipe_kamar.getSelectedItem());
            stat.setString(1, t_id.getText());
            stat.setString(2, t_nama.getText());
            stat.setString(3, t_nik.getText());
            stat.setString(4, t_alamat.getText());
            stat.setString(5, t_no_hp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            view_data();
            reset_text();
            t_id.requestFocus();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL.\n" + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void update_data() {
        try {
            String sql = "UPDATE tb_data_pemohon set "
                    + "nama_pemohon=?,"
                    + "nik=?,"
                    + "alamat_pemohon=?,"
                    + "no_hp_pemohon=?"
                    + " WHERE id_pemohon='" + t_id.getText() + "'";
            PreparedStatement stat = null;
            stat = conn.prepareStatement(sql);
            stat.setString(1, t_nama.getText());
            stat.setString(2, t_nik.getText());
            stat.setString(3, t_alamat.getText());
            stat.setString(4, t_no_hp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            b_save.setText("SAVE");
            t_id.setEditable(true);
            t_id.setBackground(new java.awt.Color(255, 255, 255));
            reset_text();
            view_data();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Update data GAGAL\n " + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        // TODO add your handling code here:
        if ("".equals(t_id.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom ID Pemohon TIDAK BOLEH KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_id.requestFocus();
        } else if ("".equals(t_nama.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom Nama Pemohon TIDAK BOLEH KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_nama.requestFocus();
        } else if ("".equals(t_nik.getText())) {
            JOptionPane.showMessageDialog(null, "Kolom NIK Pemohon TIDAK BOLEH KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_nama.requestFocus();
        } else {
            if ("SAVE".equals(b_save.getText())) {
                String sql = "SELECT * FROM tb_data_pemohon WHERE id_pemohon='" + t_id.getText() + "'";
                try {
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "ID Pemohon " + t_id.getText() + " SUDAH ADA!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        t_id.requestFocus();
                    } else {
                        save_data();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Cek duplikat ID Pemohon GAGAL! \n" + e);
                }
            } else {
                update_data();
            }
        }
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
        b_save.setText("SAVE");
        t_id.setEditable(true);
        t_id.setBackground(new java.awt.Color(255, 255, 255));
        reset_text();
    }//GEN-LAST:event_b_cancelActionPerformed

    private void b_refresh_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refresh_tableActionPerformed
        // TODO add your handling code here:
        view_data();
    }//GEN-LAST:event_b_refresh_tableActionPerformed

    private void search_data_barang() {
        String sql = ""
                + " SELECT *"
                + " FROM tb_data_pemohon"
                + " WHERE id_pemohon='" + t_id.getText() + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //t_penulis.setSelectedItem(rs.getString("tipe_kamar"));
                t_nama.setText(rs.getString("nama_pemohon"));
                t_alamat.setText(rs.getString("alamat_pemohon"));
                t_no_hp.setText(rs.getString("no_hp_pemohon"));
            } else {
                JOptionPane.showMessageDialog(null, "Data Pemohon TIDAK DITEMUKAN", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pencarian Data Pemohon GAGAL! \n" + e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        // TODO add your handling code here:

        int row_count = tbl_data_pemohon.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan diedit KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_pemohon.getSelectedRow();
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan diedit BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kode = (String) tbl_data_pemohon.getValueAt(baris, 0);
                b_save.setText("UPDATE");
                t_id.setText(kode);
                t_id.setEditable(false);
                t_id.setBackground(new java.awt.Color(237, 229, 252));
                t_nama.requestFocus();
                search_data_barang();
            }
        }
    }//GEN-LAST:event_b_editActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        int row_count = tbl_data_pemohon.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan dihapus KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_pemohon.getSelectedRow();
            //JOptionPane.showMessageDialog(null,"Baris dipilih "+baris,"Info", JOptionPane.INFORMATION_MESSAGE);
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan dihapus BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kode = (String) tbl_data_pemohon.getValueAt(baris, 0);
                int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data: " + kode + " ini..?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (ok == 0) {
                    try {
                        //panggil method koneksi
                        String sql = "DELETE FROM tb_data_pemohon WHERE id_pemohon ='" + kode + "'";
                        Statement st = conn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
                        view_data();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Meghapus data GAGAL" + ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        // TODO add your handling code here:
        view_data();
    }//GEN-LAST:event_b_searchActionPerformed

    private void t_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            view_data();
        }
    }//GEN-LAST:event_t_searchKeyTyped

    private void t_nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nikKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nikKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FDataPemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDataPemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDataPemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDataPemohon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDataPemohon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_refresh_table;
    private javax.swing.JButton b_save;
    private javax.swing.JButton b_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea t_alamat;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_nik;
    private javax.swing.JTextField t_no_hp;
    private javax.swing.JTextField t_search;
    private javax.swing.JTable tbl_data_pemohon;
    // End of variables declaration//GEN-END:variables
}
