
package gymproject.mypages;

import AppPackage.AnimationClass;
import gymproject.Attendance_Paan;
import gymproject.Dispan;
import gymproject.Members;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;



public class Traniee extends javax.swing.JInternalFrame {

    int selection = 1 ;
    
    
    GridBagLayout layout = new GridBagLayout();
    AnimationClass AC = new AnimationClass();
    int mov1x,mov1y;
    int mov2x,mov2y;
    int mov3x,mov3y;
    
    
    public Traniee() {
        initComponents();
        Toolkit tool = Toolkit.getDefaultToolkit();
            int x = (int) tool.getScreenSize().getWidth();
            int y = (int) tool.getScreenSize().getHeight();
            y-=30;
        this.setSize(x, y);
        pic2.setBounds(0, 0, x, y);
        MainPan.setBounds(0, 0, x, y);
        DownPan.setBounds(0, 0, x, y);
        InNavi.setBounds(0, 0, x, y);
     
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        Ani();
    }
    
    public void basicSelection()
    {
        mov1.setText("New Traniee");
        mov2.setText("Modify Traniee");
        mov3.setText("Search Traniee");
        setTitle("Basic Traniee");
        Reani();
        selection = 1;
    }
    
    public void ViewallSelection()
    {
        mov1.setText("Active Member");
        mov2.setText("UnActive Member");
        mov3.setText("Attendance");
        setTitle("View Traniee Details");
        Reani();
        selection = 2;
    }
    
    public void UpdateSelection()
    {
        mov1.setText("Health");
        mov2.setText("Subscription");
        mov3.setText("Attendance");
        setTitle("Update Traniee Details");
        Reani();
        selection = 3;
    }
    
    public void Ani()
    {
        mov1x = mov1.getX();
        mov1y = mov1.getY();
        AC.jLabelYUp(mov1y, 218, 2, 2, mov1);
        
        mov2x = mov3.getX();
        mov2y = mov3.getY();
        AC.jLabelYDown(mov2y, 422, 2, 2, mov3);
        
        mov3x = mov2.getX();
        mov3y = mov2.getY();
        AC.jLabelXLeft(mov3x, 100, 1, 2, mov2);
        
        arow1.setVisible(false);
        arow2.setVisible(false);
        arow3.setVisible(false);
    }
    
    
    public void Reani()
    {
        mov1.setLocation(mov1x, mov1y);
        mov3.setLocation(mov2x, mov2y);
        mov2.setLocation(mov3x, mov3y);
        
        AC.jLabelYUp(mov1y, 218, 2, 2, mov1);
        AC.jLabelYDown(mov2y, 422, 2, 2, mov3);
        AC.jLabelXLeft(mov3x, 100, 1, 2, mov2);
        
        arow1.setVisible(false);
        arow2.setVisible(false);
        arow3.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel2 = new javax.swing.JLabel();
        MainPan = new javax.swing.JPanel();
        DownPan = new javax.swing.JPanel();
        InNavi = new javax.swing.JPanel();
        mov3 = new javax.swing.JLabel();
        mov1 = new javax.swing.JLabel();
        mov2 = new javax.swing.JLabel();
        arowMov = new javax.swing.JPanel();
        arow2 = new javax.swing.JLabel();
        arow1 = new javax.swing.JLabel();
        arow3 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setTitle("Traniee");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        MainPan.setOpaque(false);
        MainPan.setLayout(new java.awt.CardLayout());

        DownPan.setLayout(null);

        InNavi.setOpaque(false);
        InNavi.setLayout(null);

        mov3.setBackground(new java.awt.Color(38, 40, 55));
        mov3.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        mov3.setForeground(new java.awt.Color(255, 255, 255));
        mov3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov3.setText("Update Traniee");
        mov3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mov3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mov3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mov3MouseExited(evt);
            }
        });
        InNavi.add(mov3);
        mov3.setBounds(100, 10, 260, 50);

        mov1.setBackground(new java.awt.Color(38, 40, 55));
        mov1.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        mov1.setForeground(new java.awt.Color(255, 255, 255));
        mov1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov1.setText("New Traniee");
        mov1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mov1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mov1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mov1MouseExited(evt);
            }
        });
        InNavi.add(mov1);
        mov1.setBounds(100, 610, 260, 50);

        mov2.setBackground(new java.awt.Color(38, 40, 55));
        mov2.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        mov2.setForeground(new java.awt.Color(255, 255, 255));
        mov2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov2.setText("View Traniee");
        mov2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mov2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mov2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mov2MouseExited(evt);
            }
        });
        InNavi.add(mov2);
        mov2.setBounds(960, 320, 260, 50);

        arowMov.setOpaque(false);
        arowMov.setLayout(null);

        arow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Right_52px.png"))); // NOI18N
        arowMov.add(arow2);
        arow2.setBounds(10, 118, 52, 66);

        arow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Right_52px.png"))); // NOI18N
        arowMov.add(arow1);
        arow1.setBounds(10, 15, 52, 66);

        arow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Right_52px.png"))); // NOI18N
        arowMov.add(arow3);
        arow3.setBounds(10, 215, 52, 66);

        InNavi.add(arowMov);
        arowMov.setBounds(0, 190, 120, 320);

        DownPan.add(InNavi);
        InNavi.setBounds(0, 0, 1230, 660);

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/namaste.jpg"))); // NOI18N
        DownPan.add(pic2);
        pic2.setBounds(0, 0, 1240, 662);

        MainPan.add(DownPan, "card3");

        getContentPane().add(MainPan);
        MainPan.setBounds(0, 0, 1230, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mov1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov1MouseEntered
        arow1.setVisible(true);
        AC.jLabelXRight(10, 70, 2, 2, arow1);
    }//GEN-LAST:event_mov1MouseEntered

    private void mov1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov1MouseExited
        AC.jLabelXLeft(70, 10, 1, 10, arow1);
        arow1.setVisible(false);
    }//GEN-LAST:event_mov1MouseExited

    private void mov2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov2MouseEntered
        arow2.setVisible(true);
        AC.jLabelXRight(10, 70, 2, 2, arow2);
    }//GEN-LAST:event_mov2MouseEntered

    private void mov3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov3MouseEntered
        arow3.setVisible(true);
        AC.jLabelXRight(10, 70, 2, 2, arow3);
    }//GEN-LAST:event_mov3MouseEntered

    private void mov3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov3MouseExited
        AC.jLabelXLeft(70, 10, 1, 10, arow3);
        arow3.setVisible(false);
    }//GEN-LAST:event_mov3MouseExited

    private void mov2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov2MouseExited
        AC.jLabelXLeft(70, 10, 1, 10, arow2);
        arow2.setVisible(false);
    }//GEN-LAST:event_mov2MouseExited

    private void mov1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov1MouseClicked
        if(selection == 1)
        {
            Dispan dp = new Dispan();
            dp.setVisible(true);
        }
        
        if(selection == 2)
        {
            Members m = new Members();
            m.setVisible(true);
            m.active();
        }
        
        if(selection == 3)
        {
            Dispan dp = new Dispan();
            dp.setVisible(true);
            dp.UpdateH();
        }
    }//GEN-LAST:event_mov1MouseClicked

    private void mov2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov2MouseClicked
        if(selection == 1)
        {
            Dispan dp = new Dispan();
            dp.setVisible(true);
            dp.Modify();
        }
        
        if(selection == 2)
        {
            Members m = new Members();
            m.setVisible(true);
            m.unactive();
        }
        
        if(selection == 3)
        {
            Dispan dp = new Dispan();
            dp.setVisible(true);
            dp.Subscription();
        }
    }//GEN-LAST:event_mov2MouseClicked

    private void mov3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mov3MouseClicked
        if(selection == 1)
        {
            Dispan dp = new Dispan();
            dp.setVisible(true);
            dp.SearchTran();
        }
        
        if(selection == 2)
        {
            Attendance_Paan bp = new Attendance_Paan();
            bp.setVisible(true);
            bp.view();
        }
        
        if(selection == 3)
        {
            Attendance_Paan bp = new Attendance_Paan();
            bp.setVisible(true);
            bp.edit();
        }
    }//GEN-LAST:event_mov3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DownPan;
    private javax.swing.JPanel InNavi;
    private javax.swing.JPanel MainPan;
    private javax.swing.JLabel arow1;
    private javax.swing.JLabel arow2;
    private javax.swing.JLabel arow3;
    private javax.swing.JPanel arowMov;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel mov1;
    private javax.swing.JLabel mov2;
    private javax.swing.JLabel mov3;
    private javax.swing.JLabel pic2;
    // End of variables declaration//GEN-END:variables
}
