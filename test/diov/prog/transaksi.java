/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diov.prog;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author falcao
 */
public class transaksi extends javax.swing.JFrame {

    int i = 0;
    private final ArrayList<Item> order  = new ArrayList<>();
    private String code;
    private final DefaultComboBoxModel comboModel;
    private final DefaultTableModel tabelModel;
    Penjualan beli = new Penjualan();
    
    public transaksi() {
        ComboBox comboX = new ComboBox();
        this.comboModel = new DefaultComboBoxModel<>(comboX.getJenis().toArray());
        
        tabelBeli tabelModel = new tabelBeli();
        this.tabelModel = new DefaultTableModel(tabelModel.getKolomNama(), 0); // tabel kolom nama
        initComponents();
    }
    
     //penambahan id
    private  void incid(){
        this.i += 1;
    }
    //pengurangan id
    private  void decid(){
        this.i -= 1;
    }
    
    private  Object[] addItem(String nama, int jumlah){
        double harga = 0;
        ComboBox items = new ComboBox();
        for(int a = 0 ; a < items.getHarga().size(); a++){
            if(nama.equalsIgnoreCase(items.getJenis().get(a))){
            harga = items.getHarga().get(a);
            }
        }
        Object[] obj = {
            nama,
            harga,
            jumlah
        };
        return obj;
    }
    
    //set fungsi code
    private String setKode(){
        this.incid();
        // tanggal
        String sk = new SimpleDateFormat("yyMMdd").format(new Date());
        this.code = String.format(sk + "%02d", this.i);
        return code;
    }
    
    // update fungsi jumlah
    private  void updateJumlah(String nama, int add){
        ArrayList<String> item = new ArrayList<>();
        for(int a = 0; a < tabelModel.getRowCount(); a++){
            item.add(tabelModel.getValueAt(a, 0).toString());
        }
        for(int a = 0; a < item.size(); a++){
            if(item.get(a).equals(nama)){
                int jumlah = new Integer (tabelModel.getValueAt(a, 2).toString());
                tabelModel.setValueAt(jumlah + add, a, 2);
            }
        }
    }
    // mengecek item double yang terpilih pada item sebelumnya
    private  boolean Duplicate(String nama){
        boolean result = false;
        ArrayList<String> item = new ArrayList<>();
        for(int a = 0; a < tabelModel.getRowCount(); a++){
            item.add(tabelModel.getValueAt(a, 0).toString());
        }
        for(String a : item){
            if(a.equals(nama)){
                result = true;
            }
        }
        return result;
    }
    //disable tombol remove dan save jiak isi table kosong
    private void order (){
        if(isEmpty()){
            this.saveButton.setEnabled(false);
            this.removeButton.setEnabled(false);
        }else{
            this.saveButton.setEnabled(true);
            this.removeButton.setEnabled(true);
        }
    }
    
    // mengecek jika isi tabel kosong
    private boolean isEmpty(){
        return this.table.getModel().getRowCount() <= 0;
    }
    // melakukan transaksi baru jika sudah transaksi sebelumnya
    private  void newTransaksi(){
        this.valuesSet.setText("");
        this.tanggalCode.setText("");
        this.newButton.setEnabled(true);
        this.saveButton.setEnabled(false);
        this.cancelButton.setEnabled(false);
        this.addButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.valuesSet.setEnabled(false);
        this.listItem.setEnabled(false);
        this.tabelModel.setRowCount(0);
        this.order .clear();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jToggleButton2 = new javax.swing.JToggleButton();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listItem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        valuesSet = new javax.swing.JTextField();
        removeButton = new javax.swing.JToggleButton();
        addButton = new javax.swing.JToggleButton();
        newButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JToggleButton();
        saveButton = new javax.swing.JToggleButton();
        tanggalCode = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jToggleButton2.setText("jToggleButton2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code");

        jLabel2.setText("Items");

        listItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kopi", "Susu", "Gula" }));
        listItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listItemActionPerformed(evt);
            }
        });

        table.setModel(this.tabelModel);
        table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        tanggalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listItem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valuesSet, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tanggalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newButton))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(21, 21, 21)
                        .addComponent(removeButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(listItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valuesSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void listItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listItemActionPerformed
   
    }//GEN-LAST:event_listItemActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // mengecek apakah ada baris yang dipilih
        if(table.getSelectedRow() <0){
            String z = "Silahkan memilih item yang mau diremove";
            JOptionPane.showMessageDialog(this, z,"Information",JOptionPane.INFORMATION_MESSAGE);
        }else{
            // jika ada baris yang dipilih, baris itu akan dihapus
            int count = table.getSelectedRows().length;
            for(int i = 0; i < count; i++){
                tabelModel.removeRow(table.getSelectedRow());
            }
        }
            this.order();
       
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String nama = this.listItem.getSelectedItem().toString();
        int jumlah = new Integer(this.valuesSet.getText());
        if(Duplicate(nama)){
            updateJumlah(nama, jumlah);
        }else{
            tabelModel.addRow(addItem(nama, jumlah));
        }
        this.order();
    }//GEN-LAST:event_addButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            // loop setiap tabel
            for(int i = 0; i < tabelModel.getRowCount(); i++){
                //menyimpan nama dan jumlah menjadi variable
                String nama = tabelModel.getValueAt(i, 0).toString();
                double harga = new Double(tabelModel.getValueAt(i, 1).toString());
                int jumlah = new Integer(tabelModel.getValueAt(i, 2).toString());
                this.order.add(new Item(nama, (int) harga, jumlah));
            }
            //Transaksi dengan kode dan comitted belanja
            Penjualan transaksi = new Penjualan(this.code, this.order);
            //menangani output transaksi
            StringBuilder z = new StringBuilder();
            //menambahkan hasil transaksi
            z.append(transaksi.Pembayaran());
            // memanggil dialog
            JOptionPane.showMessageDialog(this, z, "Transaksi" , JOptionPane.INFORMATION_MESSAGE);
            // melakukan transaksi baru
            newTransaksi();
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        this.valuesSet.setText("1");
        this.newButton.setEnabled(false);
        this.cancelButton.setEnabled(true);
        this.addButton.setEnabled(true);
        this.valuesSet.setEnabled(true);
        this.listItem.setEnabled(true);
        this.tanggalCode.setText(this.setKode());
    }//GEN-LAST:event_newButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        newTransaksi();
        this.decid();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tanggalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalCodeActionPerformed

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
    private javax.swing.JToggleButton addButton;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JComboBox<String> listItem;
    private javax.swing.JToggleButton newButton;
    private javax.swing.JToggleButton removeButton;
    private javax.swing.JToggleButton saveButton;
    private javax.swing.JTable table;
    private javax.swing.JTextField tanggalCode;
    private javax.swing.JTextField valuesSet;
    // End of variables declaration//GEN-END:variables
}
