package gymproject;


import gymproject.mypages.*;
import java.awt.Toolkit;


public class FirstPage extends javax.swing.JFrame {

 
    public int x,y;
    wellpic wl;
    Traniee tr;
    TaskPage tp;
    Notification_page np;
    accountPage fp;
    
    public boolean setflag()
    {
        boolean flag = tp.flag;
        return flag;
    }
    
    public void resetflag()
    {
        tp.flag = false;
    }
    
    public FirstPage() {
        
        this.setUndecorated(true);
        this.setResizable(false);
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
        this.setSize(x, y);
        
        wl = new wellpic();
        tr = new Traniee();
        tp = new TaskPage();
        np = new Notification_page();
        fp = new accountPage();
        
        desktopSet.add(wl);
        desktopSet.add(tr);
        desktopSet.add(tp);
        desktopSet.add(np);
        desktopSet.add(fp);
        
        wl.setVisible(true);
        tr.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(false);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopSet = new javax.swing.JDesktopPane();
        picc = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        main = new javax.swing.JMenu();
        wellpage = new javax.swing.JMenuItem();
        close = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        balanceMenu = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        stud = new javax.swing.JMenu();
        Basic = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ViewAll = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Update = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        desktopSet.setOpaque(false);

        javax.swing.GroupLayout desktopSetLayout = new javax.swing.GroupLayout(desktopSet);
        desktopSet.setLayout(desktopSetLayout);
        desktopSetLayout.setHorizontalGroup(
            desktopSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1486, Short.MAX_VALUE)
        );
        desktopSetLayout.setVerticalGroup(
            desktopSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );

        picc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/4.jpg"))); // NOI18N
        picc.setOpaque(true);
        picc.setPreferredSize(new java.awt.Dimension(1486, 571));

        menu.setBackground(new java.awt.Color(153, 255, 153));
        menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu.setAlignmentX(1.0F);
        menu.setAutoscrolls(true);
        menu.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        menu.setOpaque(false);
        menu.setPreferredSize(new java.awt.Dimension(60, 30));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setForeground(new java.awt.Color(5, 170, 240));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/Windows8_25px_1.png"))); // NOI18N
        main.setText("Main            ");
        main.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        main.setIconTextGap(10);
        main.setOpaque(true);
        main.setPreferredSize(new java.awt.Dimension(200, 39));

        wellpage.setText("Wellcome Page");
        wellpage.setPreferredSize(new java.awt.Dimension(200, 30));
        wellpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wellpageActionPerformed(evt);
            }
        });
        main.add(wellpage);

        close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        close.setText("Close");
        close.setIconTextGap(15);
        close.setPreferredSize(new java.awt.Dimension(143, 30));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        main.add(close);

        menu.add(main);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/Customs_25px_1.png"))); // NOI18N
        jMenu1.setText("Fees             ");
        jMenu1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jMenu1.setIconTextGap(10);
        jMenu1.setOpaque(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 39));

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Pay Fees");
        jMenuItem6.setToolTipText("");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(145, 30));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        balanceMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        balanceMenu.setText("Balance Fees");
        balanceMenu.setPreferredSize(new java.awt.Dimension(145, 30));
        balanceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceMenuActionPerformed(evt);
            }
        });
        jMenu1.add(balanceMenu);

        jMenuItem9.setText("Modify Subcription");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(230, 30));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        menu.add(jMenu1);

        stud.setBackground(new java.awt.Color(255, 255, 255));
        stud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/Dumbbell_25px_1.png"))); // NOI18N
        stud.setText("Traniee            ");
        stud.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        stud.setIconTextGap(10);
        stud.setOpaque(true);
        stud.setPreferredSize(new java.awt.Dimension(200, 39));

        Basic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Basic.setText("Basic");
        Basic.setPreferredSize(new java.awt.Dimension(200, 30));
        Basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasicActionPerformed(evt);
            }
        });
        stud.add(Basic);
        stud.add(jSeparator5);

        ViewAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ViewAll.setText("View All");
        ViewAll.setPreferredSize(new java.awt.Dimension(200, 30));
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });
        stud.add(ViewAll);
        stud.add(jSeparator6);

        Update.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Update.setText("Update");
        Update.setPreferredSize(new java.awt.Dimension(200, 30));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        stud.add(Update);

        menu.add(stud);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/Treadmill_25px.png"))); // NOI18N
        jMenu2.setText("Tasks");
        jMenu2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jMenu2.setIconTextGap(10);
        jMenu2.setOpaque(true);
        jMenu2.setPreferredSize(new java.awt.Dimension(220, 39));
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        menu.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Notification        ");
        jMenu3.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jMenu3.setOpaque(true);
        jMenu3.setPreferredSize(new java.awt.Dimension(220, 39));
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        menu.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Account        ");
        jMenu4.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jMenu4.setOpaque(true);
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 39));
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        menu.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/Logout Rounded Left_25px.png"))); // NOI18N
        jMenu5.setText("Log Out");
        jMenu5.setContentAreaFilled(false);
        jMenu5.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jMenu5.setIconTextGap(10);
        jMenu5.setOpaque(true);
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 39));
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        menu.add(jMenu5);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopSet)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(picc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopSet, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(picc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void wellpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wellpageActionPerformed
        wl.setVisible(true);
        tr.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(false);
    }//GEN-LAST:event_wellpageActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DisplayPanal dp = new DisplayPanal();
        dp.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void balanceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceMenuActionPerformed
        DisplayPanal dp = new DisplayPanal();
        dp.workingpane();
        dp.setVisible(true);
    }//GEN-LAST:event_balanceMenuActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DisplayPanal dp = new DisplayPanal();
        dp.subcriptionModify();
        dp.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void BasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasicActionPerformed
        tr.setVisible(true);
        wl.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(false);
        tr.basicSelection();
    }//GEN-LAST:event_BasicActionPerformed

    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
        tr.setVisible(true);
        wl.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(false);
        tr.ViewallSelection();
    }//GEN-LAST:event_ViewAllActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        tr.setVisible(true);
        wl.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(false);
        tr.UpdateSelection();
    }//GEN-LAST:event_UpdateActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        this.dispose();
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        tr.setVisible(false);
        wl.setVisible(false);
        tp.setVisible(true);
        np.setVisible(false);
        fp.setVisible(false);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        tr.setVisible(false);
        wl.setVisible(false);
        tp.setVisible(true);
        np.setVisible(false);
        fp.setVisible(false);
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
        tr.setVisible(false);
        wl.setVisible(false);
        tp.setVisible(false);
        np.setVisible(true);
        fp.setVisible(false);
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        tr.setVisible(false);
        wl.setVisible(false);
        tp.setVisible(false);
        np.setVisible(false);
        fp.setVisible(true);
        fp.setinit();
    }//GEN-LAST:event_jMenu4MenuSelected

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Basic;
    private javax.swing.JMenuItem Update;
    private javax.swing.JMenuItem ViewAll;
    private javax.swing.JMenuItem balanceMenu;
    private javax.swing.JMenuItem close;
    private javax.swing.JDesktopPane desktopSet;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenu main;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel picc;
    private javax.swing.JMenu stud;
    private javax.swing.JMenuItem wellpage;
    // End of variables declaration//GEN-END:variables
}
