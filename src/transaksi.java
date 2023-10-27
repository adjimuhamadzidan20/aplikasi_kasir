import koneksidb.koneksi_db;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

public class transaksi extends javax.swing.JFrame {

    public transaksi() {
        initComponents();
        daftarProduk();
        jumlah();
        harga.setEditable(false);
        totaljumlah.setEditable(false);
        btnSubmitBayar.setEnabled(false);
        btnHitungTotal.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listProduk = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        tambahList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelItem = new javax.swing.JTable();
        btnHitungTotal = new javax.swing.JButton();
        totaljumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uangTunai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        btnSubmitBayar = new javax.swing.JButton();
        kembalibtn = new javax.swing.JButton();
        quanty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hapusList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaksi | BE - CASHIER");
        setResizable(false);
        setSize(new java.awt.Dimension(756, 545));

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Transaksi");

        listProduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Produk --" }));
        listProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProdukActionPerformed(evt);
            }
        });

        jLabel2.setText("Pilih Produk");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Harga");

        tambahList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/saves.png"))); // NOI18N
        tambahList.setText("Tambahkan");
        tambahList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahListActionPerformed(evt);
            }
        });

        tabelItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Produk", "Harga", "Qty", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(tabelItem);

        btnHitungTotal.setText("Hitung Total");
        btnHitungTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungTotalActionPerformed(evt);
            }
        });

        totaljumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Total Jumlah");

        jLabel6.setText("Yang dibayarkan");

        jLabel7.setText("Kembalian");

        kembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSubmitBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/saves.png"))); // NOI18N
        btnSubmitBayar.setText("Submit Pembayaran");
        btnSubmitBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitBayarActionPerformed(evt);
            }
        });

        kembalibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/kembalii.png"))); // NOI18N
        kembalibtn.setText("Kembali");
        kembalibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Qty");

        hapusList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon/eraser.png"))); // NOI18N
        hapusList.setText("Hapus");
        hapusList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kembalibtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(listProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quanty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tambahList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHitungTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kembalian, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmitBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totaljumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uangTunai, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(0, 95, Short.MAX_VALUE)))
                                .addGap(35, 35, 35))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(listProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(4, 4, 4)
                                .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quanty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tambahList)
                                .addComponent(hapusList))
                            .addComponent(btnHitungTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(totaljumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(uangTunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmitBayar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(kembalibtn)
                .addGap(29, 29, 29))
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

    // fungsi hapus list barang yang ditambahkan
    private void hapusListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusListActionPerformed
        DefaultTableModel listItem = (DefaultTableModel) tabelItem.getModel();

        hapusList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dapatkan baris yang dipilih
                int selectedRow = tabelItem.getSelectedRow();
                if (selectedRow != -1) {
                    // Hapus baris yang dipilih dari model tabel
                    listItem.removeRow(selectedRow);
                }
            }
        });
    }//GEN-LAST:event_hapusListActionPerformed

    private void kembalibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalibtnActionPerformed
        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembalibtnActionPerformed
    
    // fungsi submit pembayaran
    private void btnSubmitBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitBayarActionPerformed
        String total = totaljumlah.getText();
        String tunai = uangTunai.getText();

        if (Integer.parseInt(tunai) < Integer.parseInt(total)) {
            JOptionPane.showMessageDialog(null, "Yang dibayarkan kurang dari jumlah total!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int kembali = Integer.parseInt(tunai) - Integer.parseInt(total);
            kembalian.setText(Integer.toString(kembali));

            JOptionPane.showMessageDialog(null, "Jumlah Total Rp. "+ total +"\nTunai yang dibayarkan Rp. "+
                tunai +"\nKembalian Rp. "+ kembali, "Informasi", JOptionPane.INFORMATION_MESSAGE);
            resetAll();
        }
    }//GEN-LAST:event_btnSubmitBayarActionPerformed
    
    // fungsi hitung total jumlah
    private void btnHitungTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungTotalActionPerformed
        int jumlahTotal = 0;
        int tabelList = tabelItem.getRowCount();

        for (int i = 0; i < tabelList; i++) {
            jumlahTotal += Integer.parseInt((String) tabelItem.getValueAt(i, 3));
        }
        totaljumlah.setText(Integer.toString(jumlahTotal));
    }//GEN-LAST:event_btnHitungTotalActionPerformed
    
    // fungsi menambah list ke dalam tabel
    private void tambahListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahListActionPerformed
        String qty = quanty.getText();
        String total = jumlah.getText();

        if (qty.equals("") && total.equals("")) {
            return;
        } else {
            DefaultTableModel listItem = (DefaultTableModel) tabelItem.getModel();

            Object item[] = new Object[4];
            item [0] = (String) listProduk.getSelectedItem();
            item [1] = harga.getText();
            item [2] = quanty.getText();
            item [3] = jumlah.getText();

            listItem.addRow(item);
            tabelItem.setModel(listItem);
            resetKolom();
            btnHitungTotal.setEnabled(true);
            btnSubmitBayar.setEnabled(true);
        }
    }//GEN-LAST:event_tambahListActionPerformed
    
    // list pilihan barang produk pada combo box
    private void listProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProdukActionPerformed
        String produk = (String) listProduk.getSelectedItem();

        try {
            String sql = "SELECT harga_satuan FROM data_barang WHERE nama_barang = '"+ produk +"'";
            Connection connect = (Connection)koneksi_db.koneksi_db();
            Statement stat = connect.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                String barang = res.getString("harga_satuan");
                harga.setText(barang);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_listProdukActionPerformed

    private void resetKolom() {
        listProduk.setSelectedItem("");
        harga.setText("");
        quanty.setText("");
        jumlah.setText("");
    }
    
    private void resetAll() {
        DefaultTableModel listItem = (DefaultTableModel) tabelItem.getModel();
        
        listProduk.setSelectedItem("");
        harga.setText("");
        quanty.setText("");
        jumlah.setText("");
        totaljumlah.setText("");
        uangTunai.setText("");
        kembalian.setText("");
        listItem.setRowCount(0);
        
        btnSubmitBayar.setEnabled(false);
        btnHitungTotal.setEnabled(false);
    }
    
    public void daftarProduk() {
        try{
            String sql = "SELECT * FROM data_barang";
            Connection connect = (Connection)koneksi_db.koneksi_db();
            Statement stat = connect.createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                listProduk.addItem(res.getString("nama_barang"));
            }
            
            res.last();
            int jumlah_data = res.getRow();
            res.first();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        
    private void jumlah() {
        quanty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    int hasil = 0;
                    if (quanty.getText().equals("")) {
                        hasil = Integer.parseInt(quanty.getText()) * 0;
                    } else {
                        hasil = Integer.parseInt(quanty.getText()) * Integer.parseInt(harga.getText());
                    }
                    jumlah.setText(Integer.toString(hasil));
                } catch (Exception error) {
                    // JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    int hasil = 0;
                    if (quanty.getText().equals("")) {
                        hasil = Integer.parseInt(quanty.getText()) * 0;
                    } else {
                        hasil = Integer.parseInt(quanty.getText()) * Integer.parseInt(harga.getText());
                    }
                    jumlah.setText(Integer.toString(hasil));
                } catch (Exception error) {
                    // JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitungTotal;
    private javax.swing.JButton btnSubmitBayar;
    private javax.swing.JButton hapusList;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kembalian;
    private javax.swing.JButton kembalibtn;
    private javax.swing.JComboBox<String> listProduk;
    private javax.swing.JTextField quanty;
    private javax.swing.JTable tabelItem;
    private javax.swing.JButton tambahList;
    private javax.swing.JTextField totaljumlah;
    private javax.swing.JTextField uangTunai;
    // End of variables declaration//GEN-END:variables
}
