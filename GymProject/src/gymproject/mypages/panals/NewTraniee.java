
package gymproject.mypages.panals;

import gymproject.BalanceDateConfrmation;
import gymproject.Dtcon;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.*;



public class NewTraniee extends javax.swing.JPanel {

    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement pst;
    
    int buttonSitch = 0;
    int SubcriptionSelection;
    int s;
    int paidAmountNum = 0, paidAmountNum2 = 0;
    public boolean balance = true;
    
    double pannumber,drivnumber;
    int h,w,so,ch,la,ra;
    
    public NewTraniee() {
        initComponents();
        updatesubcr();
        amount.setEnabled(false);
    }
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(1,151,77));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(31,181,107));
    }

    void updatesubcr()
    {
        try {
            subSelection.removeAllItems();
            subSelection.addItem("Select");
            
            //Database info gather
            String str = "SELECT * FROM `database_central`.`subcription`";
            st = c.createStatement();
            ResultSet rss = st.executeQuery(str);
            
            while(rss.next())
            {
                subSelection.addItem(rss.getString(2));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navipan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bs = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        os = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bos = new javax.swing.JLabel();
        ps = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dynipan = new javax.swing.JPanel();
        basic = new javax.swing.JPanel();
        Head1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        DOB = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        anum = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        next1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        other = new javax.swing.JPanel();
        Head2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        pnum = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        eid = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        dlnum = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        pannum = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        addresh = new javax.swing.JTextField();
        next2 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        Head3 = new javax.swing.JLabel();
        hight = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        weight = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        solder = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        chest = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        larm = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        rarm = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        next3 = new javax.swing.JLabel();
        fee = new javax.swing.JPanel();
        Head4 = new javax.swing.JLabel();
        subSelection = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paidPayment = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        BalPayment = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        DisplaySelection = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        savebtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(31, 181, 107));

        navipan.setBackground(new java.awt.Color(1, 151, 77));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Details_25px.png"))); // NOI18N

        bs.setBackground(new java.awt.Color(31, 181, 107));
        bs.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        bs.setForeground(new java.awt.Color(255, 255, 255));
        bs.setText("Basic Detail");
        bs.setOpaque(true);
        bs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bsMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Spiderweb_25px.png"))); // NOI18N

        os.setBackground(new java.awt.Color(1, 151, 77));
        os.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        os.setForeground(new java.awt.Color(255, 255, 255));
        os.setText("Other Detail");
        os.setOpaque(true);
        os.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                osMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Natural User Interface 1_25px.png"))); // NOI18N

        bos.setBackground(new java.awt.Color(1, 151, 77));
        bos.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        bos.setForeground(new java.awt.Color(255, 255, 255));
        bos.setText("Body Detail");
        bos.setOpaque(true);
        bos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bosMouseClicked(evt);
            }
        });

        ps.setBackground(new java.awt.Color(1, 151, 77));
        ps.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        ps.setForeground(new java.awt.Color(255, 255, 255));
        ps.setText("Payment Detail");
        ps.setOpaque(true);
        ps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                psMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Customs_25px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create New");

        javax.swing.GroupLayout navipanLayout = new javax.swing.GroupLayout(navipan);
        navipan.setLayout(navipanLayout);
        navipanLayout.setHorizontalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navipanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navipanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navipanLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(os, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, navipanLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        navipanLayout.setVerticalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navipanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(os, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        dynipan.setBackground(new java.awt.Color(31, 181, 107));
        dynipan.setLayout(new java.awt.CardLayout());

        basic.setBackground(new java.awt.Color(31, 181, 107));
        basic.setLayout(null);

        Head1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head1.setForeground(new java.awt.Color(255, 255, 255));
        Head1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head1.setText("Basic Details");
        basic.add(Head1);
        Head1.setBounds(190, 20, 230, 54);
        basic.add(jSeparator1);
        jSeparator1.setBounds(10, 170, 157, 10);
        basic.add(jSeparator2);
        jSeparator2.setBounds(190, 170, 184, 10);

        fname.setBackground(new java.awt.Color(31, 181, 107));
        fname.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        fname.setText("First Name");
        fname.setToolTipText("First Name");
        fname.setBorder(null);
        fname.setNextFocusableComponent(lname);
        fname.setOpaque(false);
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        basic.add(fname);
        fname.setBounds(10, 140, 157, 27);

        lname.setBackground(new java.awt.Color(31, 181, 107));
        lname.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        lname.setText("Last Name");
        lname.setToolTipText("Last Name");
        lname.setBorder(null);
        lname.setNextFocusableComponent(gender);
        lname.setOpaque(false);
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        basic.add(lname);
        lname.setBounds(190, 140, 184, 27);

        gender.setBackground(new java.awt.Color(31, 181, 107));
        gender.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "MALE", "FEMALE" }));
        gender.setNextFocusableComponent(anum);
        gender.setOpaque(false);
        basic.add(gender);
        gender.setBounds(10, 230, 150, 32);

        DOB.setBackground(new java.awt.Color(31, 181, 107));
        DOB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DOB.setToolTipText("Date Of Birth");
        DOB.setInheritsPopupMenu(true);
        DOB.setName("Date Of Birth"); // NOI18N
        DOB.setNextFocusableComponent(next1);
        basic.add(DOB);
        DOB.setBounds(256, 335, 210, 32);
        DOB.getAccessibleContext().setAccessibleName("DOB");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Date Of Birth");
        basic.add(jLabel4);
        jLabel4.setBounds(10, 335, 242, 32);

        anum.setBackground(new java.awt.Color(31, 181, 107));
        anum.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        anum.setText("Addhar Number");
        anum.setToolTipText("Addhar Number");
        anum.setBorder(null);
        anum.setOpaque(false);
        anum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                anumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                anumFocusLost(evt);
            }
        });
        basic.add(anum);
        anum.setBounds(190, 230, 184, 32);
        basic.add(jSeparator3);
        jSeparator3.setBounds(190, 260, 184, 10);

        next1.setBackground(new java.awt.Color(31, 181, 107));
        next1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/icons8-Chevron Right-50.png"))); // NOI18N
        next1.setOpaque(true);
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next1MouseExited(evt);
            }
        });
        basic.add(next1);
        next1.setBounds(550, 300, 106, 100);

        jLabel1.setBackground(new java.awt.Color(1, 151, 77));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Upload");
        jLabel1.setOpaque(true);
        basic.add(jLabel1);
        jLabel1.setBounds(490, 250, 110, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/User_100px.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Profile Pic"));
        basic.add(jLabel5);
        jLabel5.setBounds(460, 70, 170, 170);

        dynipan.add(basic, "card2");

        other.setBackground(new java.awt.Color(31, 181, 107));
        other.setLayout(null);

        Head2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head2.setForeground(new java.awt.Color(255, 255, 255));
        Head2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head2.setText("Other Details");
        other.add(Head2);
        Head2.setBounds(200, 30, 200, 42);
        other.add(jSeparator4);
        jSeparator4.setBounds(60, 150, 200, 10);

        pnum.setBackground(new java.awt.Color(31, 181, 107));
        pnum.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        pnum.setText("Phone Number");
        pnum.setToolTipText("Phone Number");
        pnum.setBorder(null);
        pnum.setOpaque(false);
        pnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnumFocusLost(evt);
            }
        });
        other.add(pnum);
        pnum.setBounds(60, 120, 200, 30);
        other.add(jSeparator5);
        jSeparator5.setBounds(350, 150, 190, 10);

        eid.setBackground(new java.awt.Color(31, 181, 107));
        eid.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        eid.setText("Email ID");
        eid.setToolTipText("Email ID");
        eid.setBorder(null);
        eid.setOpaque(false);
        eid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eidFocusLost(evt);
            }
        });
        other.add(eid);
        eid.setBounds(350, 120, 190, 30);
        other.add(jSeparator6);
        jSeparator6.setBounds(60, 250, 200, 10);

        dlnum.setBackground(new java.awt.Color(31, 181, 107));
        dlnum.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        dlnum.setText("Driving Licence Number");
        dlnum.setToolTipText("Driving Licence Number");
        dlnum.setBorder(null);
        dlnum.setOpaque(false);
        dlnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dlnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dlnumFocusLost(evt);
            }
        });
        other.add(dlnum);
        dlnum.setBounds(60, 220, 200, 30);
        other.add(jSeparator7);
        jSeparator7.setBounds(350, 250, 190, 10);

        pannum.setBackground(new java.awt.Color(31, 181, 107));
        pannum.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        pannum.setText("PAN Number");
        pannum.setToolTipText("PAN Number");
        pannum.setBorder(null);
        pannum.setOpaque(false);
        pannum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pannumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pannumFocusLost(evt);
            }
        });
        other.add(pannum);
        pannum.setBounds(350, 220, 190, 30);
        other.add(jSeparator8);
        jSeparator8.setBounds(60, 350, 400, 10);

        addresh.setBackground(new java.awt.Color(31, 181, 107));
        addresh.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        addresh.setText("Addresh");
        addresh.setToolTipText("Addresh");
        addresh.setBorder(null);
        addresh.setOpaque(false);
        addresh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addreshFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addreshFocusLost(evt);
            }
        });
        addresh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addreshKeyReleased(evt);
            }
        });
        other.add(addresh);
        addresh.setBounds(60, 320, 400, 30);

        next2.setBackground(new java.awt.Color(31, 181, 107));
        next2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/icons8-Chevron Right-50.png"))); // NOI18N
        next2.setOpaque(true);
        next2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next2MouseExited(evt);
            }
        });
        other.add(next2);
        next2.setBounds(550, 300, 100, 100);

        dynipan.add(other, "card3");

        body.setBackground(new java.awt.Color(31, 181, 107));
        body.setLayout(null);

        Head3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head3.setForeground(new java.awt.Color(255, 255, 255));
        Head3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head3.setText("Physical Details");
        body.add(Head3);
        Head3.setBounds(200, 30, 230, 42);

        hight.setBackground(new java.awt.Color(31, 181, 107));
        hight.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        hight.setText("Height");
        hight.setToolTipText("Height");
        hight.setBorder(null);
        hight.setOpaque(false);
        hight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hightFocusLost(evt);
            }
        });
        body.add(hight);
        hight.setBounds(60, 130, 200, 30);
        body.add(jSeparator9);
        jSeparator9.setBounds(60, 160, 200, 10);

        weight.setBackground(new java.awt.Color(31, 181, 107));
        weight.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        weight.setText("Weight");
        weight.setToolTipText("Weight");
        weight.setBorder(null);
        weight.setOpaque(false);
        weight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                weightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                weightFocusLost(evt);
            }
        });
        body.add(weight);
        weight.setBounds(370, 130, 200, 30);
        body.add(jSeparator10);
        jSeparator10.setBounds(370, 160, 200, 10);

        solder.setBackground(new java.awt.Color(31, 181, 107));
        solder.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        solder.setText("Soulder");
        solder.setToolTipText("Solder");
        solder.setBorder(null);
        solder.setOpaque(false);
        solder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                solderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                solderFocusLost(evt);
            }
        });
        body.add(solder);
        solder.setBounds(60, 190, 200, 30);
        body.add(jSeparator11);
        jSeparator11.setBounds(60, 220, 200, 10);

        chest.setBackground(new java.awt.Color(31, 181, 107));
        chest.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        chest.setText("Chest");
        chest.setToolTipText("Chest");
        chest.setBorder(null);
        chest.setOpaque(false);
        chest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                chestFocusLost(evt);
            }
        });
        body.add(chest);
        chest.setBounds(370, 190, 200, 30);
        body.add(jSeparator12);
        jSeparator12.setBounds(370, 220, 200, 10);

        larm.setBackground(new java.awt.Color(31, 181, 107));
        larm.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        larm.setText("Left Arm");
        larm.setToolTipText("Left Arm");
        larm.setBorder(null);
        larm.setOpaque(false);
        larm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                larmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                larmFocusLost(evt);
            }
        });
        body.add(larm);
        larm.setBounds(60, 250, 200, 30);
        body.add(jSeparator13);
        jSeparator13.setBounds(60, 280, 200, 10);

        rarm.setBackground(new java.awt.Color(31, 181, 107));
        rarm.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        rarm.setText("Right Arm");
        rarm.setToolTipText("Right Arm");
        rarm.setBorder(null);
        rarm.setOpaque(false);
        rarm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rarmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rarmFocusLost(evt);
            }
        });
        rarm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rarmKeyReleased(evt);
            }
        });
        body.add(rarm);
        rarm.setBounds(370, 250, 200, 30);
        body.add(jSeparator14);
        jSeparator14.setBounds(370, 280, 200, 10);

        next3.setBackground(new java.awt.Color(31, 181, 107));
        next3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/icons8-Chevron Right-50.png"))); // NOI18N
        next3.setOpaque(true);
        next3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next3MouseExited(evt);
            }
        });
        body.add(next3);
        next3.setBounds(550, 300, 100, 100);

        dynipan.add(body, "card4");

        fee.setBackground(new java.awt.Color(31, 181, 107));
        fee.setLayout(null);

        Head4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head4.setForeground(new java.awt.Color(255, 255, 255));
        Head4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head4.setText("Payment Details");
        fee.add(Head4);
        Head4.setBounds(200, 30, 240, 42);

        subSelection.setBackground(new java.awt.Color(49, 58, 115));
        subSelection.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        subSelection.setForeground(new java.awt.Color(36, 11, 109));
        subSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Mon", "3 Mon" }));
        subSelection.setOpaque(false);
        subSelection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subSelectionItemStateChanged(evt);
            }
        });
        subSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subSelectionActionPerformed(evt);
            }
        });
        fee.add(subSelection);
        subSelection.setBounds(170, 160, 150, 32);

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Subcription");
        fee.add(jLabel13);
        jLabel13.setBounds(10, 160, 131, 30);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Paid");
        fee.add(jLabel7);
        jLabel7.setBounds(10, 240, 130, 30);

        paidPayment.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        paidPayment.setForeground(new java.awt.Color(36, 11, 109));
        paidPayment.setText("Select");
        fee.add(paidPayment);
        paidPayment.setBounds(170, 240, 150, 30);
        fee.add(jSeparator15);
        jSeparator15.setBounds(170, 270, 150, 10);

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Balance");
        fee.add(jLabel8);
        jLabel8.setBounds(370, 240, 110, 30);

        BalPayment.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        BalPayment.setForeground(new java.awt.Color(36, 11, 109));
        BalPayment.setText("Select");
        fee.add(BalPayment);
        BalPayment.setBounds(490, 240, 120, 30);
        fee.add(jSeparator16);
        jSeparator16.setBounds(490, 270, 120, 10);

        DisplaySelection.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        DisplaySelection.setForeground(new java.awt.Color(255, 255, 255));
        DisplaySelection.setText("Select");
        fee.add(DisplaySelection);
        DisplaySelection.setBounds(540, 160, 110, 30);

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Amount To be Pay =");
        fee.add(jLabel10);
        jLabel10.setBounds(360, 160, 170, 30);

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Amount");
        fee.add(jLabel15);
        jLabel15.setBounds(130, 330, 100, 30);

        amount.setBackground(new java.awt.Color(31, 181, 107));
        amount.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        amount.setForeground(new java.awt.Color(36, 11, 109));
        amount.setText("Enter Amount");
        amount.setBorder(null);
        amount.setOpaque(false);
        amount.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                amountCaretUpdate(evt);
            }
        });
        amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountFocusLost(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountKeyPressed(evt);
            }
        });
        fee.add(amount);
        amount.setBounds(250, 332, 150, 30);

        jSeparator17.setPreferredSize(new java.awt.Dimension(50, 15));
        fee.add(jSeparator17);
        jSeparator17.setBounds(250, 370, 170, 15);

        savebtn.setBackground(new java.awt.Color(31, 181, 107));
        savebtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savebtn.setText("Save");
        savebtn.setOpaque(true);
        savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebtnMouseExited(evt);
            }
        });
        fee.add(savebtn);
        savebtn.setBounds(460, 320, 170, 50);

        dynipan.add(fee, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navipan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void next1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseEntered
        setColor(next1);
    }//GEN-LAST:event_next1MouseEntered

    private void next1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseExited
        resetColor(next1);
    }//GEN-LAST:event_next1MouseExited

    private void next2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseEntered
        setColor(next2);
    }//GEN-LAST:event_next2MouseEntered

    private void next2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseExited
        resetColor(next2);
    }//GEN-LAST:event_next2MouseExited

    private void next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseClicked
        
        
        //check addhar detail
        try{
            String d1 = anum.getText();
            double d2 = Double.parseDouble(d1);
            try{
                String stemp = "1/1/2017";
                stemp = DOB.getDate().toString();

                //check meditory contant
                if("First Name".equals(fname.getText()) || "".equals(fname.getText()))
                {
                    balance = false;
                    JOptionPane.showMessageDialog(null, "Please Enter First Name");
                }
                else if("Last Name".equals(lname.getText()) || "".equals(lname.getText()))
                {
                    balance = false;
                    JOptionPane.showMessageDialog(null, "Please Enter Last Name");
                }
                else
                {
                    if(gender.getSelectedIndex() == 0) gender.setSelectedIndex(1);
                    basic.setVisible(false);
                    other.setVisible(true);
                    setColor(bs);
                    resetColor(os);
                    setColor(bos);
                    setColor(ps);

                    if(buttonSitch == 0) buttonSitch ++ ;
                }
            }
            catch(Exception e)
            {
                balance = false;
                JOptionPane.showMessageDialog(null, "Please Enter Date Of Birth");
            }
            
        }
        catch(NumberFormatException e)
        {
            balance = false;
            JOptionPane.showMessageDialog(null, "Enter proper Addhar number");
        }
         
    }//GEN-LAST:event_next1MouseClicked

    private void next2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseClicked
        try{
            String s = pnum.getText();
            double s1 = Double.parseDouble(s);
            
            try{
                String s2 = pannum.getText();
                pannumber = Double.parseDouble(s2);
            }
            catch(NumberFormatException e)
            {
                pannumber = 0;
            }
            
            try{
                String s2 = dlnum.getText();
                drivnumber = Double.parseDouble(s2);
            }
            catch(NumberFormatException e)
            {
                drivnumber = 0;
            }
            if("Addresh".equals(addresh.getText()) || "".equals(addresh.getText()))
            {
                balance = false;
                JOptionPane.showMessageDialog(null, "Please Enter Addresh");
            }
            else
            {
                other.setVisible(false);
                body.setVisible(true);
                setColor(os);
                setColor(bs);
                resetColor(bos);
                setColor(ps);

                if(buttonSitch == 1) buttonSitch ++ ;
            }
        }
        catch(Exception e)
        {
            balance = false;
            JOptionPane.showMessageDialog(null,"Please Enter Proper Phone number");
        }
        
        
    }//GEN-LAST:event_next2MouseClicked

    private void next3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseClicked
        try{
            String s2 = hight.getText();
            h = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            h = 0;
        }
        
        try{
            String s2 = weight.getText();
            w = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            w = 0;
        }
        
        try{
            String s2 = solder.getText();
            so = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            so = 0;
        }
        
        try{
            String s2 = chest.getText();
            ch = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            ch = 0;
        }
        
        try{
            String s2 = larm.getText();
            la = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            la = 0;
        }
        
        try{
            String s2 = rarm.getText();
            ra = Integer.parseInt(s2);
        }
        catch(NumberFormatException e)
        {
            ra = 0;
        }
        
        body.setVisible(false);
        fee.setVisible(true);
        setColor(bs);
        setColor(os);
        setColor(bos);
        resetColor(ps);
        
        if(buttonSitch == 2) buttonSitch ++ ;
    }//GEN-LAST:event_next3MouseClicked

    private void next3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseEntered
        setColor(next3);
    }//GEN-LAST:event_next3MouseEntered

    private void next3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseExited
        resetColor(next3);
    }//GEN-LAST:event_next3MouseExited

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        if ("First Name".equals(fname.getText()))
        {
            fname.setText("");
        }
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        if ("".equals(fname.getText()))
        {
            fname.setText("First Name");
        }
    }//GEN-LAST:event_fnameFocusLost

    private void lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusGained
        if ("Last Name".equals(lname.getText()))
        {
            lname.setText("");
        }
    }//GEN-LAST:event_lnameFocusGained

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
        if ("".equals(lname.getText()))
        {
            lname.setText("Last Name");
        }
    }//GEN-LAST:event_lnameFocusLost

    private void anumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anumFocusGained
        if ("Addhar Number".equals(anum.getText()))
        {
            anum.setText("");
        }
    }//GEN-LAST:event_anumFocusGained

    private void anumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_anumFocusLost
        if ("".equals(anum.getText()))
        {
            anum.setText("Addhar Number");
        }
    }//GEN-LAST:event_anumFocusLost

    private void pnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnumFocusGained
        if ("Phone Number".equals(pnum.getText()))
        {
            pnum.setText("");
        }
    }//GEN-LAST:event_pnumFocusGained

    private void pnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnumFocusLost
        if ("".equals(pnum.getText()))
        {
            pnum.setText("Phone Number");
        }
    }//GEN-LAST:event_pnumFocusLost

    private void eidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusGained
        if ("Email ID".equals(eid.getText()))
        {
            eid.setText("");
        }
    }//GEN-LAST:event_eidFocusGained

    private void eidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eidFocusLost
        if ("".equals(eid.getText()))
        {
            eid.setText("Email ID");
        }
    }//GEN-LAST:event_eidFocusLost

    private void dlnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dlnumFocusGained
        if ("Driving Licence Number".equals(dlnum.getText()))
        {
            dlnum.setText("");
        }
    }//GEN-LAST:event_dlnumFocusGained

    private void dlnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dlnumFocusLost
        if ("".equals(dlnum.getText()))
        {
            dlnum.setText("Driving Licence Number");
        }
    }//GEN-LAST:event_dlnumFocusLost

    private void pannumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pannumFocusGained
        if ("PAN Number".equals(pannum.getText()))
        {
            pannum.setText("");
        }
    }//GEN-LAST:event_pannumFocusGained

    private void pannumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pannumFocusLost
        if ("".equals(pannum.getText()))
        {
            pannum.setText("PAN Number");
        }
    }//GEN-LAST:event_pannumFocusLost

    private void addreshFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addreshFocusGained
        if ("Addresh".equals(addresh.getText()))
        {
            addresh.setText("");
        }
    }//GEN-LAST:event_addreshFocusGained

    private void addreshFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addreshFocusLost
        if ("".equals(addresh.getText()))
        {
            addresh.setText("Addresh");
        }
    }//GEN-LAST:event_addreshFocusLost

    private void hightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hightFocusGained
        if ("Height".equals(hight.getText()))
        {
            hight.setText("");
        }
    }//GEN-LAST:event_hightFocusGained

    private void hightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hightFocusLost
        if ("".equals(hight.getText()))
        {
            hight.setText("Height");
        }
    }//GEN-LAST:event_hightFocusLost

    private void weightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightFocusGained
        if ("Weight".equals(weight.getText()))
        {
            weight.setText("");
        }
    }//GEN-LAST:event_weightFocusGained

    private void weightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightFocusLost
        if ("".equals(weight.getText()))
        {
            weight.setText("Weight");
        }
    }//GEN-LAST:event_weightFocusLost

    private void solderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_solderFocusGained
        if ("Soulder".equals(solder.getText()))
        {
            solder.setText("");
        }
    }//GEN-LAST:event_solderFocusGained

    private void solderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_solderFocusLost
        if ("".equals(solder.getText()))
        {
            solder.setText("Solder");
        }
    }//GEN-LAST:event_solderFocusLost

    private void chestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chestFocusGained
        if ("Chest".equals(chest.getText()))
        {
            chest.setText("");
        }
    }//GEN-LAST:event_chestFocusGained

    private void chestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chestFocusLost
        if ("".equals(chest.getText()))
        {
            chest.setText("Chest");
        }
    }//GEN-LAST:event_chestFocusLost

    private void larmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_larmFocusGained
        if ("Left Arm".equals(larm.getText()))
        {
            larm.setText("");
        }
    }//GEN-LAST:event_larmFocusGained

    private void larmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_larmFocusLost
        if ("".equals(larm.getText()))
        {
            larm.setText("Left Arm");
        }
    }//GEN-LAST:event_larmFocusLost

    private void rarmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rarmFocusGained
        if ("Right Arm".equals(rarm.getText()))
        {
            rarm.setText("");
        }
    }//GEN-LAST:event_rarmFocusGained

    private void rarmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rarmFocusLost
        if ("".equals(rarm.getText()))
        {
            rarm.setText("Right Arm");
        }
    }//GEN-LAST:event_rarmFocusLost

    private void bsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsMouseClicked
        if(buttonSitch >= 0)
        {
            basic.setVisible(true);
            other.setVisible(false);
            body.setVisible(false);
            fee.setVisible(false);
            
            resetColor(bs);
            setColor(os);
            setColor(bos);
            setColor(ps);
        }
        
    }//GEN-LAST:event_bsMouseClicked

    private void osMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_osMouseClicked
        if(buttonSitch >= 1)
        {
            basic.setVisible(false);
            other.setVisible(true);
            body.setVisible(false);
            fee.setVisible(false);
            
            setColor(bs);
            resetColor(os);
            setColor(bos);
            setColor(ps);
        }
        
    }//GEN-LAST:event_osMouseClicked

    private void bosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bosMouseClicked
        if(buttonSitch >= 2)
        {
            basic.setVisible(false);
            other.setVisible(false);
            body.setVisible(true);
            fee.setVisible(false);
            
            setColor(bs);
            setColor(os);
            resetColor(bos);
            setColor(ps);
        }
        
    }//GEN-LAST:event_bosMouseClicked

    private void psMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psMouseClicked
        if(buttonSitch >= 3)
        {
            basic.setVisible(false);
            other.setVisible(false);
            body.setVisible(false);
            fee.setVisible(true);
            
            setColor(bs);
            setColor(os);
            setColor(bos);
            resetColor(ps);
        }
        
    }//GEN-LAST:event_psMouseClicked

    private void addreshKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addreshKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if("Phone Number".equals(pnum.getText()) || "".equals(pnum.getText()))
            {
                balance = false;
                JOptionPane.showMessageDialog(null, "Please Enter Phone number");
            }
            else if("Addresh".equals(addresh.getText()) || "".equals(addresh.getText()))
            {
                balance = false;
                JOptionPane.showMessageDialog(null, "Please Enter Addresh");
            }
            else
            {
                other.setVisible(false);
                body.setVisible(true);
                setColor(os);
                setColor(bs);
                resetColor(bos);
                setColor(ps);

                if(buttonSitch == 1) buttonSitch ++ ;
            }
        }
    }//GEN-LAST:event_addreshKeyReleased

    private void rarmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rarmKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            body.setVisible(false);
            fee.setVisible(true);
            setColor(bs);
            setColor(os);
            setColor(bos);
            resetColor(ps);

            if(buttonSitch == 2) buttonSitch ++ ;
        }
    }//GEN-LAST:event_rarmKeyReleased

    private void subSelectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subSelectionItemStateChanged
        SubcriptionSelection = subSelection.getSelectedIndex();
        if(SubcriptionSelection == 0)
        {
            amount.setEnabled(false);
            paidPayment.setText("Select");
            BalPayment.setText("Select");
            DisplaySelection.setText("Select");
        }
        else
        {
            try {
                String str = "SELECT * FROM `database_central`.`subcription` WHERE `ID`="+SubcriptionSelection;
                st = c.createStatement();
                ResultSet rss = st.executeQuery(str);
                
                while(rss.next())
                {
                    s=rss.getInt(3);
                    paidAmountNum2 = rss.getInt(3);
                    amount.setEnabled(true);
                    paidPayment.setText(Integer.toString(paidAmountNum));
                    BalPayment.setText(Integer.toString(paidAmountNum2));
                    DisplaySelection.setText(String.valueOf(rss.getInt(3)));
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(NewTraniee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_subSelectionItemStateChanged

    private void subSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subSelectionActionPerformed

    private void amountCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_amountCaretUpdate
        String key = amount.getText();
        int keyNum = 0;
        System.out.println(key);
        switch (key) {
            case "Enter Amount":
                break;
            case "":
                paidPayment.setText(Integer.toString(paidAmountNum));
                BalPayment.setText(Integer.toString(paidAmountNum2));
                break;
            default:
                keyNum = Integer.parseInt(key);
                if( (paidAmountNum2 <= s) && (paidAmountNum2 > 0) )
                {
                    paidAmountNum += keyNum;
                    paidPayment.setText(Integer.toString(paidAmountNum));
                    paidAmountNum -=keyNum;

                    paidAmountNum2 -= keyNum;
                    BalPayment.setText(Integer.toString(paidAmountNum2));
                    paidAmountNum2 +=keyNum;

                    if( Integer.parseInt(paidPayment.getText()) > s)
                    {
                        balance = false;
                        JOptionPane.showMessageDialog(null, "Payment More than limit. \nPlease check Again");
                    }
                }   break;
        }
    }//GEN-LAST:event_amountCaretUpdate

    private void amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusGained
        amount.setText("");
    }//GEN-LAST:event_amountFocusGained

    private void amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusLost
        if("".equals(amount.getText()))
        amount.setText("Enter Amount");
    }//GEN-LAST:event_amountFocusLost

    private void amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyPressed

    }//GEN-LAST:event_amountKeyPressed

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
        Object createdID = 0;
        
        if(BalPayment.getText().equals("0"))
        {
            
            String date = DOB.getDate().toString();
            try {
            
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fdate = sdf.format(DOB.getDate());
                
                //create a basic account
                String query = "INSERT INTO `database_central`.`user` (`ID`, `Fname`, `Lname`, `Adr_num`, `DOB`, `Ph_num`, `Acitve`) VALUES (NULL, '"+fname.getText()+"', '"+lname.getText()+"', "+anum.getText()+", '"+fdate+"', '"+pnum.getText()+"', '1')";
                pst= c.prepareStatement(query);
                pst.executeUpdate();
                
                //get the created id 
                query = "SELECT * FROM `user` WHERE `Ph_num`="+pnum.getText()+" and `Fname`='"+fname.getText()+"' and `Lname`='"+lname.getText()+"'";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next())
                {
                    createdID = rss.getInt(1);
                }
                
                //set the gender of traniee
                char gen = 'm';
                int temp = gender.getSelectedIndex();
                if(temp == 1)
                    gen = 'm';
                else
                    gen = 'f';
                
                //create the other info
                query = "INSERT INTO `database_central`.`otherinfo` (`ID`, `gender`, `Email_ID`, `Driving_num`, `Pan_num`, `Addresh`) VALUES ('"+createdID+"', '"+gen+"', '"+eid.getText()+"', '"+drivnumber+"', '"+pannumber+"', '"+addresh.getText()+"'); ";
                pst= c.prepareStatement(query);
                pst.executeUpdate();
                
                //create health info
                query = "INSERT INTO `database_central`.`health` (`ID`, `height`, `weight`, `soulder`, `chest`, `LeftArm`, `RightArm`) VALUES ('"+createdID+"', '"+h+"', '"+w+"', '"+so+"', '"+ch+"', '"+la+"', '"+ra+"');";
                pst= c.prepareStatement(query);
                pst.executeUpdate();
                
                //get current date
                Calendar caln = new GregorianCalendar();
                int cdate = caln.get(Calendar.DATE);
                int cmon = caln.get(Calendar.MONTH);
                cmon++;
                int cyr = caln.get(Calendar.YEAR);
                String current_Date = cyr+"-"+cmon+"-"+cdate;
                
                int paidpya =0;
                try
                {
                    String paidpy = amount.getText();
                    paidpya = Integer.parseInt(paidpy);
                }
                catch(NumberFormatException e)
                {
                    paidpya = 0;
                    JOptionPane.showMessageDialog(null,"Amount Parsing Problem");
                }

                
                // create a fees details
                query = "INSERT INTO `database_central`.`fees` (`ID`, `subcription_ID`, `paid`, `paying_date`, `due_date`, `extra`) VALUES ('"+createdID+"', '"+subSelection.getSelectedIndex()+"', '"+paidpya+"', '"+current_Date+"', NULL, '0');";
                pst= c.prepareStatement(query);
                pst.executeUpdate();
                
                try {
                    Calendar cal = new GregorianCalendar();
                    int dat = cal.get(Calendar.DATE);
                    int mon = cal.get(Calendar.MONTH);
                    mon++;
                    int yr = cal.get(Calendar.YEAR);
                    query = "INSERT INTO `database_central`.`history` (`ID`, `userID`, `amount`, `date`) VALUES (NULL, '"+createdID+"', '"+amount.getText()+"', '"+yr+"-"+mon+"-"+dat+"')";
                    pst = c.prepareStatement(query);
                    pst.executeUpdate();
                }
                catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Recent Table not updated.\nline = 1478 error");
                }
                
                balance = false;
                JOptionPane.showMessageDialog(null, "Your Acccount is Created\n\nThe generated ID is "+createdID);
                
                basic.setVisible(true);
                fee.setVisible(false);
                resetColor(bs);
                setColor(os);
                setColor(bos);
                setColor(ps);

                if(buttonSitch == 3) buttonSitch ++ ;
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(NewTraniee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(BalPayment.getText().equals("Select"))
        {
            balance = false;
            JOptionPane.showMessageDialog(null, "Select the Subcription");
        }
        else
        {
            balance = false;
            int SelectionConti = JOptionPane.showConfirmDialog(null, "The Balance is remain.\nDo you Want to continue");
            
            if(SelectionConti == 0)
            {
                
                
                String date = DOB.getDate().toString();
                try {

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String fdate = sdf.format(DOB.getDate());

                    //create a basic account
                    String query = "INSERT INTO `database_central`.`user` (`ID`, `Fname`, `Lname`, `Adr_num`, `DOB`, `Ph_num`, `Acitve`) VALUES (NULL, '"+fname.getText()+"', '"+lname.getText()+"', "+anum.getText()+", '"+fdate+"', '"+pnum.getText()+"', '1')";
                    pst= c.prepareStatement(query);
                    pst.executeUpdate();

                    //get the created id 
                    query = "SELECT * FROM `user` WHERE `Ph_num`="+pnum.getText()+" and `Fname`='"+fname.getText()+"' and `Lname`='"+lname.getText()+"'";
                    st = c.createStatement();
                    ResultSet rss = st.executeQuery(query);
                    while(rss.next())
                    {
                        createdID = rss.getInt(1);
                    }

                    //set the gender of traniee
                    char gen = 'm';
                    int temp = gender.getSelectedIndex();
                    if(temp == 1)
                        gen = 'm';
                    else
                        gen = 'f';

                    //create the other info
                    query = "INSERT INTO `database_central`.`otherinfo` (`ID`, `gender`, `Email_ID`, `Driving_num`, `Pan_num`, `Addresh`) VALUES ('"+createdID+"', '"+gen+"', '"+eid.getText()+"', '"+drivnumber+"', '"+pannumber+"', '"+addresh.getText()+"'); ";
                    pst= c.prepareStatement(query);
                    pst.executeUpdate();

                    //create health info
                    query = "INSERT INTO `database_central`.`health` (`ID`, `height`, `weight`, `soulder`, `chest`, `LeftArm`, `RightArm`) VALUES ('"+createdID+"', '"+h+"', '"+w+"', '"+so+"', '"+ch+"', '"+la+"', '"+ra+"');";
                    pst= c.prepareStatement(query);
                    pst.executeUpdate();

                    //get current date
                    Calendar caln = new GregorianCalendar();
                    int cdate = caln.get(Calendar.DATE);
                    int cmon = caln.get(Calendar.MONTH);
                    cmon++;
                    int cyr = caln.get(Calendar.YEAR);
                    String current_Date = cyr+"-"+cmon+"-"+cdate;

                    int paidpya = 0;
                    
                    try
                    {
                        String paidpy = amount.getText();
                        paidpya = Integer.parseInt(paidpy);
                    }
                    catch(Exception e)
                    {
                        paidpya = 0;
                        JOptionPane.showMessageDialog(null,"Amount Parsing Problem");
                    }
                    
                    
                    // create a fees details
                    query = "INSERT INTO `database_central`.`fees` (`ID`, `subcription_ID`, `paid`, `paying_date`, `due_date`, `extra`) VALUES ('"+createdID+"', '"+subSelection.getSelectedIndex()+"', '"+paidpya+"', '"+current_Date+"', NULL, '0');";
                    pst= c.prepareStatement(query);
                    pst.executeUpdate();

                    
                    try {
                        Calendar cal = new GregorianCalendar();
                        int dat = cal.get(Calendar.DATE);
                        int mon = cal.get(Calendar.MONTH);
                        mon++;
                        int yr = cal.get(Calendar.YEAR);
                        query = "INSERT INTO `database_central`.`history` (`ID`, `userID`, `amount`, `date`) VALUES (NULL, '"+createdID+"', '"+amount.getText()+"', '"+yr+"-"+mon+"-"+dat+"')";
                        pst = c.prepareStatement(query);
                        pst.executeUpdate();
                    }
                    catch(SQLException e) {
                        JOptionPane.showMessageDialog(null, "Recent Table not updated.\nline = 1589 error");
                    }
                    
                    balance = false;
                    BalanceDateConfrmation BDC = new BalanceDateConfrmation();
                    BDC.setVisible(true);
                    BDC.ID = createdID;
                    
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(NewTraniee.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }//GEN-LAST:event_savebtnMouseClicked

    private void savebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseEntered
        setColor(savebtn);
    }//GEN-LAST:event_savebtnMouseEntered

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
        resetColor(savebtn);
    }//GEN-LAST:event_savebtnMouseExited

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalPayment;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JLabel DisplaySelection;
    private javax.swing.JLabel Head1;
    private javax.swing.JLabel Head2;
    private javax.swing.JLabel Head3;
    private javax.swing.JLabel Head4;
    private javax.swing.JTextField addresh;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField anum;
    private javax.swing.JPanel basic;
    private javax.swing.JPanel body;
    private javax.swing.JLabel bos;
    private javax.swing.JLabel bs;
    private javax.swing.JTextField chest;
    private javax.swing.JTextField dlnum;
    private javax.swing.JPanel dynipan;
    private javax.swing.JTextField eid;
    private javax.swing.JPanel fee;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField hight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField larm;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel navipan;
    private javax.swing.JLabel next1;
    private javax.swing.JLabel next2;
    private javax.swing.JLabel next3;
    private javax.swing.JLabel os;
    private javax.swing.JPanel other;
    private javax.swing.JLabel paidPayment;
    private javax.swing.JTextField pannum;
    private javax.swing.JTextField pnum;
    private javax.swing.JLabel ps;
    private javax.swing.JTextField rarm;
    private javax.swing.JLabel savebtn;
    private javax.swing.JTextField solder;
    private javax.swing.JComboBox<String> subSelection;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
