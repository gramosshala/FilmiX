/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gid;

import BLL.Bileta;
import BLL.MenyraPageses;
import BLL.Pagesat;
import DAL.MenyraPagesesRepository;
import DAL.PagesatRepository;
import DAL.ShitjeException;
import DialogFrames.PagesaMeSukses;
import GUIMODEL.MenyraPagesComboBoxModel;
import static gid.DashboardDatabase.xx;
import static gid.DashboardDatabase.yy;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author Gramos
 */
public class MenyraPagesesForm extends javax.swing.JFrame {

    /**
     * Creates new form MenyraPageses
     */
    MenyraPagesesRepository menyraPagesesRepository = new MenyraPagesesRepository();
    MenyraPagesComboBoxModel menyraPagesesComboxModel = new MenyraPagesComboBoxModel();
    PagesatRepository pagesatRepository = new PagesatRepository();
    
    static Bileta b;
    
    private long shuma = 0;
    public MenyraPagesesForm() {
        initComponents();
        loadComboBoxSallat();
    }
    public MenyraPagesesForm(String emriMbiemri,String ulsja,String salla,long shuma,Bileta bileta,String emriFilmit,String ushqimi){
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
       this.b = bileta;
       this.shuma = shuma;
        loadComboBoxSallat();
        emriField.setText(emriMbiemri);
        seatName.setText(ulsja);
        ushqimiText.setText(ushqimi);
        shumaBiletes.setText(String.valueOf(shuma + "$"));
        setTextFieldToFalse();
        sallaText.setText(salla);
        movieNameTextField.setText(emriFilmit);
        
        
        
    }
  
    public long getShuma(){
        return shuma;
    }
    //ma bukur diqka
    public void setTextFieldToFalse(){
        
        Component [] components = this.getContentPane().getComponents();
        
        for(Component component : components){
            if(component instanceof JTextField){
                ((JTextField)component).setEditable(false);
            }
        }
    
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientNameTF2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        registerButton = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBoxMenyraPageses = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        shumaBiletes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emriField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seatName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sallaText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        movieNameTextField = new javax.swing.JTextField();
        ushqimiText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        clientNameTF2.setBackground(new java.awt.Color(22, 96, 131));
        clientNameTF2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        clientNameTF2.setForeground(new java.awt.Color(255, 255, 255));
        clientNameTF2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(22, 96, 131));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8jPanel2MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8jPanel2MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total:");

        jPanel4.setBackground(new java.awt.Color(22, 96, 131));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment Details");

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotot/processo.png"))); // NOI18N
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        comboBoxMenyraPageses.setBackground(new java.awt.Color(214, 75, 75));
        comboBoxMenyraPageses.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        comboBoxMenyraPageses.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxMenyraPageses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxMenyraPageses.setSelectedItem("Zgjedh Rolin");
        comboBoxMenyraPageses.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        comboBoxMenyraPageses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxMenyraPageses.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotot/icons8_previous_24px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        shumaBiletes.setEditable(false);
        shumaBiletes.setBackground(new java.awt.Color(22, 96, 131));
        shumaBiletes.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        shumaBiletes.setForeground(new java.awt.Color(255, 255, 255));
        shumaBiletes.setText("0$");
        shumaBiletes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_name_25px.png")); // NOI18N
        jLabel14.setText("Name");

        emriField.setBackground(new java.awt.Color(22, 96, 131));
        emriField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        emriField.setForeground(new java.awt.Color(255, 255, 255));
        emriField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_aircraft_seat_aisle_25px_1.png")); // NOI18N
        jLabel15.setText("Seat");

        seatName.setBackground(new java.awt.Color(22, 96, 131));
        seatName.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        seatName.setForeground(new java.awt.Color(255, 255, 255));
        seatName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_curtains_25px.png")); // NOI18N
        jLabel16.setText("Hall");

        sallaText.setBackground(new java.awt.Color(22, 96, 131));
        sallaText.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        sallaText.setForeground(new java.awt.Color(255, 255, 255));
        sallaText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_movie_25px.png")); // NOI18N
        jLabel17.setText("Movie name");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_pay_25px.png")); // NOI18N
        jLabel18.setText("Payment method");

        movieNameTextField.setBackground(new java.awt.Color(22, 96, 131));
        movieNameTextField.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        movieNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        movieNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        ushqimiText.setBackground(new java.awt.Color(22, 96, 131));
        ushqimiText.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        ushqimiText.setForeground(new java.awt.Color(255, 255, 255));
        ushqimiText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\AppData\\Local\\Temp\\icons8_kawaii_french_fries_25px.png")); // NOI18N
        jLabel19.setText("Food");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(68, 68, 68))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ushqimiText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sallaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emriField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxMenyraPageses, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shumaBiletes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(registerButton)
                                        .addGap(24, 24, 24)))))
                        .addGap(130, 130, 130))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sallaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(movieNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ushqimiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxMenyraPageses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shumaBiletes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(36, 36, 36)
                .addComponent(registerButton)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked

        
        if(comboBoxMenyraPageses.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this,"Ju lutem zgjedheni menyren e pageses");
        }
        
        
        try {
            Pagesat pagesat = new Pagesat();
            
            pagesat.setBiletaID(b);
            pagesat.setMenyraPagesesID((MenyraPageses)comboBoxMenyraPageses.getSelectedItem());
            pagesat.setShuma(getShuma());
            
            pagesatRepository.create(pagesat);
            PagesaMeSukses pagesaMeSukses = new PagesaMeSukses(this,true);
            pagesaMeSukses.setVisible(true);
        } catch (ShitjeException ex) {
            Logger.getLogger(MenyraPagesesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_registerButtonMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        //registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotot/addMovieHover.png"))); // NOI18N
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
      //  registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotot/addMovie.png"))); // NOI18N
    }//GEN-LAST:event_registerButtonMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        this.dispose();
        Dashboard d = new Dashboard(Dashboard.getPerdoruesUsername());
        d.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel8jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x-xx,y-yy);
    }//GEN-LAST:event_jPanel8jPanel2MouseDragged

    private void jPanel8jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8jPanel2MouseClicked
        xx= evt.getX();
        yy =evt.getY();
    }//GEN-LAST:event_jPanel8jPanel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.0; i<1.0;i=i+ 0.1){
          String value = i+ "";
          float f = Float.valueOf(value);
          this.setOpacity(f);
          try{
              Thread.sleep(50);
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenyraPageses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenyraPageses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenyraPageses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenyraPageses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenyraPagesesForm().setVisible(true);
            }
        });
    }
    
     public void loadComboBoxSallat(){
        try {
            List<MenyraPageses> lista = menyraPagesesRepository.findAll();
            menyraPagesesComboxModel.addList(lista);
            comboBoxMenyraPageses.setModel(menyraPagesesComboxModel);
            comboBoxMenyraPageses.repaint();
        } catch (ShitjeException ex) {
            Logger.getLogger(MenyraPagesesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField clientNameTF2;
    private javax.swing.JComboBox comboBoxMenyraPageses;
    public javax.swing.JTextField emriField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JTextField movieNameTextField;
    private javax.swing.JLabel registerButton;
    public javax.swing.JTextField sallaText;
    public javax.swing.JTextField seatName;
    public javax.swing.JTextField shumaBiletes;
    public javax.swing.JTextField ushqimiText;
    // End of variables declaration//GEN-END:variables
}
