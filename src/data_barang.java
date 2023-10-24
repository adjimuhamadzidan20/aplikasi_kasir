import koneksidb.koneksi_db;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class data_barang extends javax.swing.JFrame {
    
    Connection connect = koneksi_db.koneksi_db();
    
    public data_barang() {
        initComponents();
        tabelDataBarang();
        kodeBarangAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namabarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jmlstok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablebarang = new javax.swing.JTable();
        simpanbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        hapusbtn = new javax.swing.JButton();
        caribtn = new javax.swing.JButton();
        hrgsatuan = new javax.swing.JTextField();
        kategori = new javax.swing.JComboBox<>();
        kembalibtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kodeBarang = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Barang | Aplikasi Kasir");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data Barang");

        jLabel2.setText("Nama Produk");

        jLabel3.setText("Kategori Produk");

        jLabel4.setText("Harga Satuan");

        jLabel5.setText("Jumlah Stok");

        tablebarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Produk", "Kategori", "Harga Satuan", "Jumlah Stok"
            }
        ));
        tablebarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablebarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablebarang);

        simpanbtn.setText("Simpan");
        simpanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanbtnActionPerformed(evt);
            }
        });

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        hapusbtn.setText("Hapus");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        caribtn.setText("Cari");
        caribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caribtnActionPerformed(evt);
            }
        });

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Kosmetik", "Bumbu Masak", "Sayuran", "Detergen", "Peralatan Rumah", "Peralatan Tulis/Kantor", "Peralatan Berat", "Akseseoris" }));

        kembalibtn.setText("Kembali");
        kembalibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Kode Produk");

        kodeBarang.setEditable(false);

        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(kategori, 0, 191, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caribtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(hrgsatuan, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addComponent(jmlstok))
                            .addGap(120, 120, 120)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(simpanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kembalibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(hrgsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(simpanbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusbtn))
                            .addComponent(jmlstok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resetbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caribtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kembalibtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void tabelDataBarang() {
        DefaultTableModel tabelBarang = new DefaultTableModel();
        tabelBarang.addColumn("Kode Barang");
        tabelBarang.addColumn("Nama Produk");
        tabelBarang.addColumn("Kategori");
        tabelBarang.addColumn("Harga Satuan");
        tabelBarang.addColumn("Jumlah Stok");
        
        try {
            String sql = "SELECT * FROM data_barang";
            Connection connect = (Connection)koneksi_db.koneksi_db();
            Statement stat = connect.createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while (res.next()) {
                tabelBarang.addRow(new Object[] {
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                });
                tablebarang.setModel(tabelBarang);
            } 
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // input id otomatis
    private void kodeBarangAuto() {
        String kode = "ITM000";
        int i = 0;
        try {
            String sql = "SELECT id_barang FROM data_barang";
            Connection connect = (Connection)koneksi_db.koneksi_db();
            Statement stat = connect.createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()) {
                kode = res.getString("id_barang");
            }
            
            kode = kode.substring(4);
            i = Integer.parseInt(kode) + 1;
            kode = "00"+ i;
            kode = "ITM" + kode.substring(kode.length()-3);
            kodeBarang.setText(kode);        
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void resetKolom() {
        namabarang.setText("");
        kategori.setSelectedItem("");
        hrgsatuan.setText("");
        jmlstok.setText("");
    }
    
    private void simpanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanbtnActionPerformed
        String idBarang = kodeBarang.getText();
        String namaProduk = namabarang.getText();
        String kategoriProduk = (String) kategori.getSelectedItem();
        String hargaSatuan = hrgsatuan.getText();
        String jumlah = jmlstok.getText();
        kodeBarang.setText(idBarang);
        
        if (namaProduk.equals("") || kategoriProduk.equals("") || hargaSatuan.equals("") || jumlah.equals("")) {
            JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong!", "Informasi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "INSERT INTO data_barang VALUES ('"+ idBarang +"','"+ namaProduk +"',"
                + "'"+ kategoriProduk +"','"+ hargaSatuan +"','"+ jumlah +"')";
                
                Connection connect = (Connection)koneksi_db.koneksi_db();
                PreparedStatement stat = connect.prepareStatement(sql);
                stat.execute();
                tabelDataBarang();
                
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kodeBarangAuto();
                resetKolom();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal tersimpan! "+ e.getMessage(), "Informasi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        String idBarang = kodeBarang.getText();
        String namaProduk = namabarang.getText();
        String kategoriProduk = (String) kategori.getSelectedItem();
        String hargaSatuan = hrgsatuan.getText();
        String jumlah = jmlstok.getText();

        if (namaProduk.equals("") || kategoriProduk.equals("") || hargaSatuan.equals("") || jumlah.equals("")) {
            JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong!", "Informasi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "UPDATE data_barang SET nama_barang = '"+ namaProduk +"', katagori = '"+ kategoriProduk +"', "
                + "harga_satuan = '"+ hargaSatuan +"', jumlah_stok = '"+ jumlah +"' WHERE id_barang = '"+ idBarang +"'";
                
                Connection connect = (Connection)koneksi_db.koneksi_db();
                PreparedStatement stat = connect.prepareStatement(sql);
                stat.execute();
                tabelDataBarang();
                
                JOptionPane.showMessageDialog(null, "Data berhasil terubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kodeBarangAuto();
                resetKolom();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal terubah! "+ e.getMessage(), "Informasi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
        String idBarang = kodeBarang.getText();
        
        int konfirm = JOptionPane.showConfirmDialog(null, "Hapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirm == 0) {
            try {
                String sql = "DELETE FROM data_barang WHERE id_barang = '"+ idBarang +"'";
                Connection connect = (Connection)koneksi_db.koneksi_db();
                PreparedStatement stat = connect.prepareStatement(sql);
                stat.execute();
                tabelDataBarang();

                JOptionPane.showMessageDialog(null, "Data berhasil terhapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                kodeBarangAuto();
                resetKolom();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal terhapus! "+ e.getMessage(), "Informasi", JOptionPane.ERROR_MESSAGE);
            }
        }   
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void kembalibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalibtnActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembalibtnActionPerformed

    private void tablebarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablebarangMouseClicked
        int no = tablebarang.getSelectedRow();
        
        String kodeProduk = tablebarang.getValueAt(no, 0).toString();
        String namaProduk = tablebarang.getValueAt(no, 1).toString();
        String kategoriProduk = tablebarang.getValueAt(no, 2).toString();
        String hargaSatuan = tablebarang.getValueAt(no, 3).toString();
        String jumlahStok = tablebarang.getValueAt(no, 4).toString();
        
        kodeBarang.setText(kodeProduk);
        namabarang.setText(namaProduk);
        kategori.setSelectedItem(kategoriProduk);
        hrgsatuan.setText(hargaSatuan);
        jmlstok.setText(jumlahStok);
    }//GEN-LAST:event_tablebarangMouseClicked

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        resetKolom();
        kodeBarangAuto();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void caribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caribtnActionPerformed
        String cariData = cari.getText();
        
        DefaultTableModel tabelBarang = new DefaultTableModel();
        tabelBarang.addColumn("Kode Barang");
        tabelBarang.addColumn("Nama Produk");
        tabelBarang.addColumn("Kategori");
        tabelBarang.addColumn("Harga Satuan");
        tabelBarang.addColumn("Jumlah Stok");
        
        try {
            String sql = "SELECT * FROM data_barang WHERE id_barang LIKE '%"+ cariData +"%' OR nama_barang LIKE '%"+ cariData +"%'";
            Connection connect = (Connection)koneksi_db.koneksi_db();
            Statement stat = connect.createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while (res.next()) {
                tabelBarang.addRow(new Object[] {
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                });
                tablebarang.setModel(tabelBarang);
            } 
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_caribtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JButton caribtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton hapusbtn;
    private javax.swing.JTextField hrgsatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jmlstok;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JButton kembalibtn;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namabarang;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton simpanbtn;
    private javax.swing.JTable tablebarang;
    // End of variables declaration//GEN-END:variables
}
