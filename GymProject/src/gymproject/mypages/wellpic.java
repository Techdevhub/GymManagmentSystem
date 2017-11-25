
package gymproject.mypages;

import gymproject.Attendance_Paan;
import gymproject.Dispan;
import gymproject.Members;
import gymproject.mypages.panals.PayFees;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class wellpic extends javax.swing.JInternalFrame {

    GridBagLayout layout = new GridBagLayout();
    PayFees pf;
    
    int noti = 1 ;
    
    public wellpic() {
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
            y-=30;
        this.setSize(x, y);
        jLabel1.setBounds(0, 0, x, y);
        NotiPanal.setVisible(false);
        pf = new PayFees();
        NotiDynamic.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        NotiDynamic.add(pf,c);
        pf.setVisible(false);
    }
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(36,11,109));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(160,155,190));
    }

    void setOp(JLabel ll)
    {
        ll.setOpaque(true);
    }
    
    void resetOp(JLabel ll)
    {
        ll.setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NotiPanal = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        notify = new javax.swing.JLabel();
        att = new javax.swing.JLabel();
        payf = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        otraniee = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NotiDynamic = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dott = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Wellcome Page");
        setPreferredSize(new java.awt.Dimension(1253, 687));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        NotiPanal.setBackground(new java.awt.Color(97, 212, 195));
        NotiPanal.setOpaque(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/CLS_30px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        notify.setBackground(new java.awt.Color(160, 155, 190));
        notify.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        notify.setForeground(new java.awt.Color(240, 240, 240));
        notify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notify.setText("Noticifaction");
        notify.setOpaque(true);
        notify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notifyMouseExited(evt);
            }
        });

        att.setBackground(new java.awt.Color(160, 155, 190));
        att.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        att.setForeground(new java.awt.Color(240, 240, 240));
        att.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        att.setText("Last payment");
        att.setOpaque(true);
        att.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attMouseExited(evt);
            }
        });

        payf.setBackground(new java.awt.Color(160, 155, 190));
        payf.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        payf.setForeground(new java.awt.Color(240, 240, 240));
        payf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payf.setText("Pay Fees");
        payf.setOpaque(true);
        payf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payfMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                payfMouseReleased(evt);
            }
        });

        search.setBackground(new java.awt.Color(160, 155, 190));
        search.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        search.setForeground(new java.awt.Color(240, 240, 240));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("Search");
        search.setOpaque(true);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });

        bal.setBackground(new java.awt.Color(160, 155, 190));
        bal.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        bal.setForeground(new java.awt.Color(240, 240, 240));
        bal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bal.setText("Balance");
        bal.setOpaque(true);
        bal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                balMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                balMouseReleased(evt);
            }
        });

        otraniee.setBackground(new java.awt.Color(160, 155, 190));
        otraniee.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        otraniee.setForeground(new java.awt.Color(240, 240, 240));
        otraniee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        otraniee.setText("Paid Member");
        otraniee.setOpaque(true);
        otraniee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otranieeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otranieeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otranieeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NotiPanalLayout = new javax.swing.GroupLayout(NotiPanal);
        NotiPanal.setLayout(NotiPanalLayout);
        NotiPanalLayout.setHorizontalGroup(
            NotiPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotiPanalLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NotiPanalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NotiPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NotiPanalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(NotiPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NotiPanalLayout.createSequentialGroup()
                        .addGroup(NotiPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payf, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otraniee, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NotiPanalLayout.setVerticalGroup(
            NotiPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotiPanalLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(payf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(otraniee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(NotiPanal, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setOpaque(false);

        NotiDynamic.setBackground(new java.awt.Color(36, 47, 65));
        NotiDynamic.setOpaque(false);
        NotiDynamic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        NotiDynamic.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 959, 653));

        dott.setBackground(new java.awt.Color(36, 11, 109));
        dott.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dott.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Menu_20px.png"))); // NOI18N
        dott.setOpaque(true);
        dott.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dottMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dott, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotiDynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NotiDynamic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dott, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1240, 660);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1237, 657);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dottMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dottMouseClicked
        
        if(noti % 2 == 0)
        {
            NotiPanal.setVisible(false);
            noti++;
            dott.setOpaque(true);
        }
        else
        {
            NotiPanal.setVisible(true);
            noti++;
            dott.setOpaque(false);
        }
    }//GEN-LAST:event_dottMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        pf.setVisible(false);
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void payfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payfMouseReleased
        pf.setVisible(false);
        pf.natColor();
        pf.updateFee();
        pf.setVisible(true);
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_payfMouseReleased

    private void balMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balMouseReleased
        pf.setVisible(false);
        pf.natColor();
        pf.updateBalance();
        pf.setVisible(true);
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_balMouseReleased

    private void payfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payfMouseEntered
        setColor(payf);
    }//GEN-LAST:event_payfMouseEntered

    private void payfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payfMouseExited
        resetColor(payf);
    }//GEN-LAST:event_payfMouseExited

    private void notifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifyMouseEntered
        setColor(notify);
    }//GEN-LAST:event_notifyMouseEntered

    private void notifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifyMouseExited
        resetColor(notify);
    }//GEN-LAST:event_notifyMouseExited

    private void attMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attMouseEntered
        setColor(att);
    }//GEN-LAST:event_attMouseEntered

    private void attMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attMouseExited
        resetColor(att);
    }//GEN-LAST:event_attMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        setColor(search);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        resetColor(search);
    }//GEN-LAST:event_searchMouseExited

    private void balMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balMouseEntered
        setColor(bal);
    }//GEN-LAST:event_balMouseEntered

    private void balMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balMouseExited
        resetColor(bal);
    }//GEN-LAST:event_balMouseExited

    private void otranieeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otranieeMouseEntered
        setColor(otraniee);
    }//GEN-LAST:event_otranieeMouseEntered

    private void otranieeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otranieeMouseExited
        resetColor(otraniee);
    }//GEN-LAST:event_otranieeMouseExited

    private void attMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attMouseClicked
        TableSelector bp = new TableSelector();
        bp.setVisible(true);
        bp.updatedue();
        pf.setVisible(false);
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_attMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        Dispan dp = new Dispan();
        dp.setVisible(true);
        dp.SearchTran();
        pf.setVisible(false);
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_searchMouseClicked

    private void otranieeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otranieeMouseClicked
        Members m = new Members();
        m.setVisible(true);
        m.paid();
        NotiPanal.setVisible(false);
        noti++;
        dott.setOpaque(true);
    }//GEN-LAST:event_otranieeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NotiDynamic;
    private javax.swing.JPanel NotiPanal;
    private javax.swing.JLabel att;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel dott;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel notify;
    private javax.swing.JLabel otraniee;
    private javax.swing.JLabel payf;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}
