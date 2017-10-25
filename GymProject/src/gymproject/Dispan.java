
package gymproject;

import gymproject.mypages.panals.*;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Dispan extends javax.swing.JFrame {

    
    GridBagLayout layout = new GridBagLayout();
    NewTraniee nt;
    ModifyTraniee mt;
    SubcriptionPanal sp;
    updateHealth up;
    SearchTraniee st;
    
    int xM;
    int yM;
    
    public Dispan() {
        initComponents();
        setOpacity(0.95F);
        
        nt = new NewTraniee();
        mt = new ModifyTraniee();
        sp = new SubcriptionPanal();
        up = new updateHealth();
        st = new SearchTraniee();
        
        disss.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        disss.add(nt,c);
        c.gridx = 0;
        c.gridy = 0;
        disss.add(mt,c);
        c.gridx = 0;
        c.gridy = 0;
        disss.add(sp,c);
        c.gridx = 0;
        c.gridy = 0;
        disss.add(up,c);
        c.gridx = 0;
        c.gridy = 0;
        disss.add(st,c);
        
        nt.setVisible(true);
        mt.setVisible(false);
        sp.setVisible(false);
        up.setVisible(false);
        st.setVisible(false);
    }
    
    void close()
    {
        this.dispose();
    }
    
    public void Modify()
    {
        nt.setVisible(false);
        mt.setVisible(true);
        sp.setVisible(false);
        up.setVisible(false);
        st.setVisible(false);
    }

    public void Subscription()
    {
        nt.setVisible(false);
        mt.setVisible(false);
        sp.setVisible(true);
        up.setVisible(false);
        st.setVisible(false);
    }
    
    public void UpdateH()
    {
        nt.setVisible(false);
        mt.setVisible(false);
        sp.setVisible(false);
        up.setVisible(true);
        st.setVisible(false);
    }
    
    public void SearchTran()
    {
        nt.setVisible(false);
        mt.setVisible(false);
        sp.setVisible(false);
        up.setVisible(false);
        st.setVisible(true);
    }
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(255,0,0));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(36,11,109));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        disss = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        closss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(36, 11, 109));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(31, 181, 107));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 493));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(1, 151, 77));

        disss.setBackground(new java.awt.Color(1, 151, 77));

        javax.swing.GroupLayout disssLayout = new javax.swing.GroupLayout(disss);
        disss.setLayout(disssLayout);
        disssLayout.setHorizontalGroup(
            disssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        disssLayout.setVerticalGroup(
            disssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(36, 11, 109));

        closss.setBackground(new java.awt.Color(36, 11, 109));
        closss.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        closss.setForeground(new java.awt.Color(255, 255, 255));
        closss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closss.setText("X");
        closss.setOpaque(true);
        closss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closssMouseExited(evt);
            }
        });

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(disss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseClicked
        nt.balance = false;
        close();
    }//GEN-LAST:event_closssMouseClicked

    private void closssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseEntered
        setColor(closss);
    }//GEN-LAST:event_closssMouseEntered

    private void closssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closssMouseExited
        resetColor(closss);
    }//GEN-LAST:event_closssMouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xM, y-yM);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xM = evt.getX();
        yM = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if(nt.balance == true && sp.balance == true)
        {
            JOptionPane.showMessageDialog(null, "Please Close This window First");
        }
        nt.balance = true;
        sp.balance = true;
    }//GEN-LAST:event_formWindowDeactivated

    
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
            java.util.logging.Logger.getLogger(Dispan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dispan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dispan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dispan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closss;
    private javax.swing.JPanel disss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
