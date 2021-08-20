/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import Koneksi.Koneksi;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
public class FDataBIChecking extends javax.swing.JFrame {

    /**
     * Creates new form FDataBarang
     */
    private DefaultTableModel tabmode;
    private final Connection conn = new Koneksi().getConnection();
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private String sql;

    NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public FDataBIChecking() {
        initComponents();

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width, screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        t_nama_nasabah.setEnabled(false);
        rp.setEnabled(false);

        kodeBi();
        view_data();
        tampilNasabah();

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
        t_nama_nasabah = new javax.swing.JTextField();
        b_save = new javax.swing.JButton();
        b_cancel = new javax.swing.JButton();
        b_refresh_table = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data_bi_Checking = new javax.swing.JTable();
        b_search = new javax.swing.JButton();
        t_search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        b_edit = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t_pinjaman_lain = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_nominal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_status = new javax.swing.JComboBox<>();
        rp = new javax.swing.JTextField();
        c_kode_nasabah = new javax.swing.JComboBox<>();

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
        jLabel1.setText("BI Checking");

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

        jLabel3.setText("Kode Nasabah");

        jLabel4.setText("Nama Nasabah");

        t_nama_nasabah.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

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

        tbl_data_bi_Checking.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_data_bi_Checking);

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

        jLabel5.setText("Pinjaman Lain");

        t_pinjaman_lain.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        jLabel6.setText("Status");

        t_nominal.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        jLabel7.setText("Nominal");

        c_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Lancar", "Tidak Lancar" }));

        rp.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        rp.setText("Rp.");

        c_kode_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_kode_nasabahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_nama_nasabah, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(c_kode_nasabah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_search))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_refresh_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t_pinjaman_lain)
                            .addComponent(c_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(c_kode_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(t_nama_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(t_pinjaman_lain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(c_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(t_nominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(b_refresh_table, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_search)
                                    .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
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

    private String id_user, nama_user, idBi;

    private void kodeBi() {
        try {
            statement = conn.createStatement();

            sql = "SELECT * FROM tb_data_bichecking ORDER by kode_bi DESC";
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String kbar = resultSet.getString("kode_bi").substring(1);
                String AN = "" + (Integer.parseInt(kbar) + 1);
                String Nol = "";

                switch (AN.length()) {
                    case 1:
                        Nol = "0000";
                        break;
                    case 2:
                        Nol = "000";
                        break;
                    case 3:
                        Nol = "00";
                        break;
                    case 4:
                        Nol = "0";
                        break;
                    case 5:
                        Nol = "";
                        break;
                    default:
                        break;
                }
                idBi = "B" + Nol + AN;
            } else {
                idBi = "B00001";
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tampilNasabah(){
        c_kode_nasabah.removeAllItems();
        try {
            sql = "SELECT * FROM tb_data_pemohon ORDER BY id_pemohon";
            statement = conn.createStatement();
            ResultSet hasil = statement.executeQuery(sql);
            c_kode_nasabah.addItem("--Pilih--");
            while (hasil.next()){
                String kode = hasil.getString("id_pemohon");
                c_kode_nasabah.addItem(kode);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kode Nasabah TIDAK DITEMUKAN.\n"+e,"Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void listNasabah(){
        try {
            sql = "SELECT * FROM tb_data_pemohon WHERE id_pemohon = '"+ c_kode_nasabah.getSelectedItem()+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                t_nama_nasabah.setText(rs.getString("nama_pemohon"));
            }
            else{
                t_nama_nasabah.setText(null);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e,"Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void reset_text() {
        t_nama_nasabah.setText("");
        t_pinjaman_lain.setText("");
        t_nominal.setText("");
        c_status.setSelectedItem("--Pilih--");
    }

    private void view_data() {
        Object[] baris = {
            "BI Checking",
            "Kode nasabah",
            "Nama nasabah",
            "Pinjaman lain",
            "Status",
            "Nominal"
        };
        tabmode = new DefaultTableModel(null, baris);
        tbl_data_bi_Checking.setModel(tabmode);
        String search;
        if ("".equals(t_search.getText())) {
            search = "";
        } else {
            search = t_search.getText();
        }
        try {
            sql = "SELECT * FROM tb_data_bichecking"
                    + " WHERE kode_bi LIKE '%" + search + "%'";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String kodeBi = hasil.getString("kode_bi");
                String kodeNasabah = hasil.getString("kode_nasabah");
                String namaNasabah = hasil.getString("nama_nasabah");
                String pinjamanLain = hasil.getString("pinjaman_lain");
                String status = hasil.getString("status");
                String nominal = hasil.getString("nominal");
                String[] data = {
                    kodeBi,
                    kodeNasabah,
                    namaNasabah,
                    pinjamanLain,
                    status,
                    nominal
                };
                tabmode.addRow(data);
                kodeBi();
            }
        } catch (SQLException e) {
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

    private void save_data() {
        try {
            sql = "INSERT INTO tb_data_bichecking VALUES"
                    + "("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")";
            PreparedStatement stat;
            stat = conn.prepareStatement(sql);
            stat.setString(1, idBi);
            stat.setString(2, c_kode_nasabah.getSelectedItem().toString());
            stat.setString(3, t_nama_nasabah.getText());
            stat.setString(4, t_pinjaman_lain.getText());
            stat.setString(5, c_status.getSelectedItem().toString());
            stat.setString(6, t_nominal.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            view_data();
            reset_text();
            c_kode_nasabah.requestFocus();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL.\n" + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void update_data() {
        try {
            sql = "UPDATE tb_data_bichecking SET "
                    + "kode_nasabah = ?,"
                    + "nama_nasabah = ?,"
                    + "pinjaman_lain = ?,"
                    + "status = ?,"
                    + "nominal = ?"
                    + " WHERE kode_bi = '" + idBi + "'";
            PreparedStatement stat;
            stat = conn.prepareStatement(sql);
            stat.setString(1, c_kode_nasabah.getSelectedItem().toString());
            stat.setString(2, t_nama_nasabah.getText());
            stat.setString(3, t_pinjaman_lain.getText());
            stat.setString(4, c_status.getSelectedItem().toString());
            stat.setString(5, t_nominal.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
            b_save.setText("SAVE");
            reset_text();
            view_data();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Update data GAGAL\n " + se, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        // TODO add your handling code here:
        if ("--Pilih--".equals(c_kode_nasabah.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Kode Nasabah BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            c_kode_nasabah.requestFocus();
        } else if ("".equals(t_pinjaman_lain.getText())) {
            JOptionPane.showMessageDialog(null, "Pinjaman lain BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_pinjaman_lain.requestFocus();
        } else if ("--Pilih--".equals(c_status.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Pinjaman lain BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            c_status.requestFocus();
        } else if ("".equals(t_nominal.getText())) {
            JOptionPane.showMessageDialog(null, "Pinjaman lain BELUM DIISI!", "Info", JOptionPane.INFORMATION_MESSAGE);
            t_nominal.requestFocus();
        }
        else {
            if ("SAVE".equals(b_save.getText())) {
                save_data();
            } else {
                update_data();
            }
        }
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelActionPerformed
        // TODO add your handling code here:
        reset_text();
    }//GEN-LAST:event_b_cancelActionPerformed

    private void b_refresh_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refresh_tableActionPerformed
        // TODO add your handling code here:
        view_data();
    }//GEN-LAST:event_b_refresh_tableActionPerformed

    private void search_data_jaminan() {
        sql = ""
                + " SELECT *"
                + " FROM tb_data_bichecking"
                + " WHERE kode_bi = '" + idBi + "'";
        try {
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                //t_penulis.setSelectedItem(rs.getString("tipe_kamar"));
//                t_nama.setText(rs.getString("nama_jaminan"));
//                t_no_tlp.setText(rs.getString("no_tlp_jaminan"));
//                t_alamat.setText(rs.getString("alamat_jaminan"));
                idBi = resultSet.getString("kode_bi");
            } else {
                JOptionPane.showMessageDialog(null, "Data Barang TIDAK DITEMUKAN", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pencarian Data jaminan GAGAL! \n" + e, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        // TODO add your handling code here:

        int row_count = tbl_data_bi_Checking.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan diedit KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_bi_Checking.getSelectedRow();
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan diedit BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kodeBi = (String) tbl_data_bi_Checking.getValueAt(baris, 0);
                String kodeNasabah = (String) tbl_data_bi_Checking.getValueAt(baris, 1);
                String namaNasabah = (String) tbl_data_bi_Checking.getValueAt(baris, 2);
                String pinjamanLain = (String) tbl_data_bi_Checking.getValueAt(baris, 3);
                String status = (String) tbl_data_bi_Checking.getValueAt(baris, 4);
                String nominal = (String) tbl_data_bi_Checking.getValueAt(baris, 5);
                b_save.setText("UPDATE");
                idBi = kodeBi;
                c_kode_nasabah.setSelectedItem(kodeNasabah);
                t_nama_nasabah.setText(namaNasabah);
                t_pinjaman_lain.setText(pinjamanLain);
                c_status.setSelectedItem(status);
                t_nominal.setText(nominal);
//                t_nama_nasabah.setEditable(false);
//                t_kode_jaminan.setBackground(new java.awt.Color(237, 229, 252));
//                t_kode_jaminan.requestFocus();
                search_data_jaminan();
            }
        }
    }//GEN-LAST:event_b_editActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
        int row_count = tbl_data_bi_Checking.getRowCount();

        if (row_count <= 0) {
            JOptionPane.showMessageDialog(null, "Data yang akan dihapus KOSONG!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int baris = tbl_data_bi_Checking.getSelectedRow();
            //JOptionPane.showMessageDialog(null,"Baris dipilih "+baris,"Info", JOptionPane.INFORMATION_MESSAGE);
            if (baris < 0) {
                JOptionPane.showMessageDialog(null, "Data yang akan dihapus BELUM DIPILIH!", "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String kode = (String) tbl_data_bi_Checking.getValueAt(baris, 0);
                int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data: " + kode + " ini..?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (ok == 0) {
                    try {
                        //panggil method koneksi
                        sql = "DELETE FROM tb_data_bichecking WHERE kode_bi ='" + kode + "'";
                        Statement st = conn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Info", JOptionPane.INFORMATION_MESSAGE);
                        view_data();
                    } catch (HeadlessException | SQLException ex) {
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


    private void c_kode_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_kode_nasabahActionPerformed
        // TODO add your handling code here:
        listNasabah();
    }//GEN-LAST:event_c_kode_nasabahActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDataBIChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FDataBIChecking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancel;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_refresh_table;
    private javax.swing.JButton b_save;
    private javax.swing.JButton b_search;
    private javax.swing.JComboBox<String> c_kode_nasabah;
    private javax.swing.JComboBox<String> c_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rp;
    private javax.swing.JTextField t_nama_nasabah;
    private javax.swing.JTextField t_nominal;
    private javax.swing.JTextField t_pinjaman_lain;
    private javax.swing.JTextField t_search;
    private javax.swing.JTable tbl_data_bi_Checking;
    // End of variables declaration//GEN-END:variables
}
