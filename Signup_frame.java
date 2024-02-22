package first;

import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HACKER
 */
public class Signup_frame extends javax.swing.JFrame {

    /**
     * Creates new form Signup_frame
     */
    public Signup_frame() {
        initComponents();
    

    // Group the gender radio buttons
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(male_gender);
    genderGroup.add(female_gender);
    genderGroup.add(costum_gender);

       
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
        jLabel1 = new javax.swing.JLabel();
        firstn_field = new javax.swing.JTextField();
        lastn_field = new javax.swing.JTextField();
        number_field = new javax.swing.JTextField();
        signpass_field = new javax.swing.JPasswordField();
        Month_box = new javax.swing.JComboBox<>();
        days_box = new javax.swing.JComboBox<>();
        year_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        female_gender = new javax.swing.JRadioButton();
        male_gender = new javax.swing.JRadioButton();
        costum_gender = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signup_bttn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Sign Up");

        firstn_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstn_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstn_field.setText("firstname");
        firstn_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstn_fieldActionPerformed(evt);
            }
        });

        lastn_field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastn_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastn_field.setText("Lastname");
        lastn_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastn_fieldActionPerformed(evt);
            }
        });

        number_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number_field.setText("Mobile number or email");
        number_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_fieldActionPerformed(evt);
            }
        });

        signpass_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        signpass_field.setText("jPasswordField1");
        signpass_field.setPreferredSize(new java.awt.Dimension(152, 22));
        signpass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signpass_fieldActionPerformed(evt);
            }
        });

        Month_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month_boxActionPerformed(evt);
            }
        });

        days_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Days", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "16", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        days_box.setSelectedItem("Day");
        days_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                days_boxActionPerformed(evt);
            }
        });

        year_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year_box.setSelectedItem("Day");
        year_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_boxActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Birthday?");

        female_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        female_gender.setText("Female");
        female_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_genderActionPerformed(evt);
            }
        });

        male_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        male_gender.setText("Male");
        male_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_genderActionPerformed(evt);
            }
        });

        costum_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        costum_gender.setText("Costum");
        costum_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costum_genderActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. ");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("You may receive SMS Notifications from us and can opt out any time.");

        signup_bttn.setText("SIGN-UP");
        signup_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_bttnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Gender?");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("It's simple and quick.");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/first/icons8-home (1).gif"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(female_gender)
                        .addGap(42, 42, 42)
                        .addComponent(male_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(costum_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signup_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(181, 181, 181)
                            .addComponent(days_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(year_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(firstn_field, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107)
                            .addComponent(lastn_field, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(number_field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signpass_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(138, 138, 138))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastn_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstn_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(number_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(signpass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(days_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(female_gender)
                    .addComponent(male_gender)
                    .addComponent(costum_gender))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(signup_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Month_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Month_boxActionPerformed

    private void days_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_days_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_days_boxActionPerformed

    private void year_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_boxActionPerformed

    private void female_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female_genderActionPerformed

    private void male_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male_genderActionPerformed

    private void costum_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costum_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costum_genderActionPerformed

    private void signup_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_bttnActionPerformed
       if(firstn_field.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your firstname","failed",JOptionPane.WARNING_MESSAGE);
            return;
            }
        else if(lastn_field.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your lastname","failed",JOptionPane.WARNING_MESSAGE);
            return;
            }
       else if(number_field.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your number","failed",JOptionPane.WARNING_MESSAGE);
            return;
            }
       else if(signpass_field.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your password","failed",JOptionPane.WARNING_MESSAGE);
            return;
            }
        if (!male_gender.isSelected() && !female_gender.isSelected() && !costum_gender.isSelected()) {
            // Prompt the user to select a gender
            JOptionPane.showMessageDialog(this, "Please select your gender.", "Gender Selection", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method without further processing
        }
        else if (male_gender.isSelected() && female_gender.isSelected() && costum_gender.isSelected()) {
        // Show a message indicating that only one gender should be selected
        JOptionPane.showMessageDialog(this, "Please select only one gender.", "Gender Selection", JOptionPane.WARNING_MESSAGE);
       
    }
        else {
        JOptionPane.showMessageDialog(null, "Successfully created!", "Success", JOptionPane.INFORMATION_MESSAGE);
             new Login_frame().setVisible(true);
            dispose();   
    }//GEN-LAST:event_signup_bttnActionPerformed
    }
    private void firstn_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstn_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstn_fieldActionPerformed

    private void lastn_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastn_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastn_fieldActionPerformed

    private void number_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number_fieldActionPerformed

    private void signpass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signpass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signpass_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new loginsignup().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Month_box;
    private javax.swing.JRadioButton costum_gender;
    private javax.swing.JComboBox<String> days_box;
    private javax.swing.JRadioButton female_gender;
    private javax.swing.JTextField firstn_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastn_field;
    private javax.swing.JRadioButton male_gender;
    private javax.swing.JTextField number_field;
    private javax.swing.JPasswordField signpass_field;
    private javax.swing.JButton signup_bttn;
    private javax.swing.JComboBox<String> year_box;
    // End of variables declaration//GEN-END:variables
}