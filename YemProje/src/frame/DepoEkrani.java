/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import dao.DepoDao;
import entity.Depo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author cemr_
 */
public class DepoEkrani extends javax.swing.JDialog {

    DefaultTableModel model;

    DepoDao depoDao = new DepoDao();

    /**
     * Creates new form DepoEkrani
     */
    public DepoEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) table_alani.getModel();

        depoGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_alani = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firma_alani = new javax.swing.JTextField();
        adet_alani = new javax.swing.JTextField();
        fiyat_alani = new javax.swing.JTextField();
        ekle_button = new javax.swing.JButton();
        guncelle_button = new javax.swing.JButton();
        sil_button = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        arama_alani = new javax.swing.JTextField();
        kategori_milim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        table_alani.setBackground(new java.awt.Color(255, 51, 255));
        table_alani.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Yem Firma", "Yem Kategori", "Toplam Yem Adeti", "Yem Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_alani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_alaniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_alani);
        if (table_alani.getColumnModel().getColumnCount() > 0) {
            table_alani.getColumnModel().getColumn(0).setResizable(false);
            table_alani.getColumnModel().getColumn(1).setResizable(false);
            table_alani.getColumnModel().getColumn(2).setResizable(false);
            table_alani.getColumnModel().getColumn(3).setResizable(false);
            table_alani.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Yem Firma : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("Yem Kategori(milim) : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Toplam Yem Adedi(torba) :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Yem Fiyat : ");

        ekle_button.setBackground(new java.awt.Color(51, 255, 102));
        ekle_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ekle_button.setText("Ekle");
        ekle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_buttonActionPerformed(evt);
            }
        });

        guncelle_button.setBackground(new java.awt.Color(51, 255, 51));
        guncelle_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        guncelle_button.setText("Guncelle");
        guncelle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_buttonActionPerformed(evt);
            }
        });

        sil_button.setBackground(new java.awt.Color(102, 255, 51));
        sil_button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sil_button.setText("Sil");
        sil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_buttonActionPerformed(evt);
            }
        });

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Ara : ");

        arama_alani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_alaniKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Depo Ekrani");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(arama_alani))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firma_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(kategori_milim)
                                    .addComponent(adet_alani)
                                    .addComponent(fiyat_alani))))
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ekle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelle_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sil_button, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arama_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firma_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekle_button))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kategori_milim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(adet_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(guncelle_button)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sil_button)
                    .addComponent(fiyat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents
public void bosalt() {

        firma_alani.setText("");
        kategori_milim.setText("");
        adet_alani.setText("");
        fiyat_alani.setText("");
    }
    private void table_alaniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_alaniMouseClicked
        // TODO add your handling code here:
        int selectedRow = table_alani.getSelectedRow();

        firma_alani.setText(model.getValueAt(selectedRow, 1).toString());
        kategori_milim.setText(model.getValueAt(selectedRow, 2).toString());
        adet_alani.setText(model.getValueAt(selectedRow, 3).toString());
        fiyat_alani.setText(model.getValueAt(selectedRow, 4).toString());

    }//GEN-LAST:event_table_alaniMouseClicked
    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        table_alani.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void arama_alaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_alaniKeyReleased
        // TODO add your handling code here:
        String ara = arama_alani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_alaniKeyReleased

    private void ekle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_buttonActionPerformed
        // TODO add your handling code here:
        mesaj_yazisi.setText("");

        String firma = firma_alani.getText();
        String kategori = kategori_milim.getText();
        String adet = adet_alani.getText();
        String fiyat = fiyat_alani.getText();
        
        boolean kontrol = depoDao.kontrolYap(firma, kategori, adet);

        if (firma.equals("") && kategori.equals("") && adet.equals("") && fiyat.equals("")) {
            JOptionPane.showMessageDialog(this, "Lutfen gerekli alanları doldurunuz");

        }else if (!kontrol) {
            JOptionPane.showMessageDialog(this, "Boyle bir kayıt zaten var");
        }
        else {
            depoDao.ekleDepo(firma, kategori, adet, fiyat);
            mesaj_yazisi.setText("Depo basarıyla eklendi");
        }

        depoGoruntule();
        bosalt();
    }//GEN-LAST:event_ekle_buttonActionPerformed

    private void guncelle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_buttonActionPerformed
        // TODO add your handling code here:
        mesaj_yazisi.setText("");

        String firma = firma_alani.getText();
        String kategori = kategori_milim.getText();
        String adet = adet_alani.getText();
        String fiyat = fiyat_alani.getText();

        int selectedRow = table_alani.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Depo tablosu suanda bos");
            } else {
                mesaj_yazisi.setText("lutfen guncellenecek bir Depo seçiniz?");
            }

        } else {
            long id = (long) model.getValueAt(selectedRow, 0);
            if (true) {
                depoDao.guncelleDepo(id, firma, kategori, adet, fiyat);

                mesaj_yazisi.setText("Depo basarıyla guncellendi");
            } else {
                mesaj_yazisi.setText("Depo guncellenirken bir hata olustu ...lütfen tekrar deneyin..");
            }

            depoGoruntule();
            bosalt();
        }
    }//GEN-LAST:event_guncelle_buttonActionPerformed

    private void sil_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_buttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_alani.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Depo tablosu suanda bos");
            } else {
                mesaj_yazisi.setText("lutfen silinecek bir Depo seçiniz?");
            }

        } else {
            long id = (long) model.getValueAt(selectedRow, 0);
            if (true) {
                depoDao.silDepo(id);
                mesaj_yazisi.setText("Depo basarıyla silindi");
            } else {
                mesaj_yazisi.setText("Depo silinirken bir hata olustu ...lütfen tekrar deneyin..");
            }

        }
        depoGoruntule();
        bosalt();
    }//GEN-LAST:event_sil_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(DepoEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepoEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepoEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepoEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DepoEkrani dialog = new DepoEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adet_alani;
    private javax.swing.JTextField arama_alani;
    private javax.swing.JButton ekle_button;
    private javax.swing.JTextField firma_alani;
    private javax.swing.JTextField fiyat_alani;
    private javax.swing.JButton guncelle_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kategori_milim;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil_button;
    private javax.swing.JTable table_alani;
    // End of variables declaration//GEN-END:variables

    private void depoGoruntule() {
        model.setRowCount(0);

        ArrayList<Depo> depos = new ArrayList<>();

        depos = depoDao.depoList();

        if (depos != null) {
            for (Depo depo : depos) {
                Object[] eklenecek = {
                    depo.getId(), depo.getYemFirma(), depo.getYemKategori(), depo.getToplamYemAdet(), depo.getYemFiyat()};
                model.addRow(eklenecek);
            }
        } else {
            System.err.println("hata");
        }
    }
}
