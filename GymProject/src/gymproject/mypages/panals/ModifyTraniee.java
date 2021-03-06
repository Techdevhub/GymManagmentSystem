
package gymproject.mypages.panals;

import gymproject.Dtcon;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModifyTraniee extends javax.swing.JPanel {

    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    
    int buttonSitch = 0;
    
    Object id_num;
    int adhar;
    double pannumber,drivnumber;
    int h,w,so,ch,la,ra;
    
    public ModifyTraniee() {
        initComponents();
        
        selectTraniee.setVisible(true);
        basic.setVisible(false);
        other.setVisible(false);
        body.setVisible(false);
        confrm.setVisible(false);
        
        initTable();
    }

    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(1,151,77));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(31,181,107));
    }
    
    void initTable()
    {
        try {
            String sql="select * from user; ";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)data_table.getModel();
            
            Object[] row = new Object[4];
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                row[0]=rss.getInt(1);
                String name = rss.getString(2)+" "+rss.getString(3);
                row[1]=name;
                row[2]=rss.getDate(5);
                row[3]=rss.getLong(6);
                tab.addRow(row);
            }
            
        } catch (SQLException ex) {
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
        conf = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stra = new javax.swing.JLabel();
        dynipan = new javax.swing.JPanel();
        selectTraniee = new javax.swing.JPanel();
        Head5 = new javax.swing.JLabel();
        next4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        num = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
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
        confrm = new javax.swing.JPanel();
        Head4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_Sett = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(31, 181, 107));
        setPreferredSize(new java.awt.Dimension(856, 444));

        navipan.setBackground(new java.awt.Color(1, 151, 77));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Details_25px.png"))); // NOI18N

        bs.setBackground(new java.awt.Color(1, 151, 77));
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

        conf.setBackground(new java.awt.Color(1, 151, 77));
        conf.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        conf.setForeground(new java.awt.Color(255, 255, 255));
        conf.setText("Comfermation");
        conf.setOpaque(true);
        conf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Customs_25px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modify Here");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Check All_25px.png"))); // NOI18N

        stra.setBackground(new java.awt.Color(31, 181, 107));
        stra.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        stra.setForeground(new java.awt.Color(255, 255, 255));
        stra.setText("Select Traniee");
        stra.setOpaque(true);
        stra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                straMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navipanLayout = new javax.swing.GroupLayout(navipan);
        navipan.setLayout(navipanLayout);
        navipanLayout.setHorizontalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(navipanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navipanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navipanLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(os, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(navipanLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(navipanLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        navipanLayout.setVerticalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navipanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stra))
                .addGap(18, 18, 18)
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
                    .addComponent(conf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynipan.setBackground(new java.awt.Color(31, 181, 107));
        dynipan.setLayout(new java.awt.CardLayout());

        selectTraniee.setBackground(new java.awt.Color(31, 181, 107));
        selectTraniee.setLayout(null);

        Head5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head5.setForeground(new java.awt.Color(255, 255, 255));
        Head5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head5.setText("Seach Traniee");
        selectTraniee.add(Head5);
        Head5.setBounds(190, 20, 230, 54);

        next4.setBackground(new java.awt.Color(31, 181, 107));
        next4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/icons8-Chevron Right-50.png"))); // NOI18N
        next4.setOpaque(true);
        next4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                next4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                next4MouseExited(evt);
            }
        });
        selectTraniee.add(next4);
        next4.setBounds(550, 300, 106, 100);

        Name.setBackground(new java.awt.Color(36, 11, 109));
        Name.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Enter Name");
        Name.setToolTipText("Enter Name");
        Name.setBorder(null);
        Name.setOpaque(false);
        Name.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NameCaretUpdate(evt);
            }
        });
        Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFocusLost(evt);
            }
        });
        selectTraniee.add(Name);
        Name.setBounds(470, 170, 170, 30);

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        selectTraniee.add(jSeparator15);
        jSeparator15.setBounds(470, 200, 160, 10);

        num.setBackground(new java.awt.Color(36, 11, 109));
        num.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 255));
        num.setText("Enter Phone Number");
        num.setToolTipText("Enter Phone Number");
        num.setBorder(null);
        num.setOpaque(false);
        num.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                numCaretUpdate(evt);
            }
        });
        num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numFocusLost(evt);
            }
        });
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        selectTraniee.add(num);
        num.setBounds(470, 250, 170, 30);

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        selectTraniee.add(jSeparator16);
        jSeparator16.setBounds(470, 280, 160, 10);

        jLabel13.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("OR");
        selectTraniee.add(jLabel13);
        jLabel13.setBounds(530, 220, 60, 20);

        jScrollPane1.setBackground(new java.awt.Color(31, 181, 107));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 181, 107)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        data_table.setAutoCreateRowSorter(true);
        data_table.setBackground(new java.awt.Color(31, 181, 107));
        data_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 181, 107), 1, true));
        data_table.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        data_table.setForeground(new java.awt.Color(255, 255, 255));
        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Amit", "2/5/96", "9865653268"},
                {"2", "Shubham", "8/4/96", "9465875632"},
                {"3", "Sagar", "26/9/96", "9854784565"},
                {"4", "Bipin", "29/12/92", "8462358753"},
                {"5", "Naresh", "6/8/98", "9865321470"},
                {"6", "Sanket", "9/8/96", "9865214352"},
                {"7", "Anurag", "7/8/96", "8564325875"},
                {"8", "Tripathi", "25/9/89", "7569841235"},
                {"9", "Aman", "15/8/99", "9464685532"},
                {"10", "Sanjay", "8/9/89", "7548462351"},
                {"11", "Binaye", "14/2/96", "8546231547"},
                {"12", "Kunal", "30/1/98", null}
            },
            new String [] {
                "ID", "Name", "DOB", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data_table.setGridColor(new java.awt.Color(31, 181, 107));
        data_table.setRowHeight(30);
        data_table.setRowMargin(3);
        data_table.setSelectionBackground(new java.awt.Color(1, 151, 77));
        data_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        data_table.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(data_table);
        if (data_table.getColumnModel().getColumnCount() > 0) {
            data_table.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        selectTraniee.add(jScrollPane1);
        jScrollPane1.setBounds(12, 132, 452, 310);

        dynipan.add(selectTraniee, "card6");

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
        lname.setOpaque(false);
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        basic.add(lname);
        lname.setBounds(190, 140, 184, 27);

        gender.setBackground(new java.awt.Color(31, 181, 107));
        gender.setFont(new java.awt.Font("Viner Hand ITC", 0, 16)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "MALE", "FEMALE" }));
        gender.setOpaque(false);
        basic.add(gender);
        gender.setBounds(10, 230, 150, 32);

        DOB.setBackground(new java.awt.Color(31, 181, 107));
        DOB.setToolTipText("Date Of Birth");
        DOB.setName("Date Of Birth"); // NOI18N
        basic.add(DOB);
        DOB.setBounds(281, 335, 195, 32);

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
        next1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                next1KeyPressed(evt);
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
        pannum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pannumActionPerformed(evt);
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
        solder.setText("Solder");
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
        body.add(rarm);
        rarm.setBounds(370, 250, 200, 30);
        body.add(jSeparator14);
        jSeparator14.setBounds(370, 280, 200, 10);

        next3.setBackground(new java.awt.Color(31, 181, 107));
        next3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        next3.setForeground(java.awt.Color.red);
        next3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next3.setText("Save");
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

        confrm.setBackground(new java.awt.Color(31, 181, 107));
        confrm.setLayout(null);

        Head4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Head4.setForeground(new java.awt.Color(255, 255, 255));
        Head4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Head4.setText("Comfirmed");
        confrm.add(Head4);
        Head4.setBounds(200, 30, 240, 42);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(234, 234, 234));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Your Account is Updated Sucessfully.");
        confrm.add(jLabel8);
        jLabel8.setBounds(100, 100, 460, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(234, 234, 234));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Now You Can go back and check or Update Again.");
        confrm.add(jLabel9);
        jLabel9.setBounds(90, 250, 500, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(234, 234, 234));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Your Account ID is ");
        confrm.add(jLabel10);
        jLabel10.setBounds(180, 170, 180, 50);

        id_Sett.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        id_Sett.setForeground(new java.awt.Color(234, 234, 234));
        id_Sett.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_Sett.setText("2548");
        confrm.add(id_Sett);
        id_Sett.setBounds(370, 170, 100, 50);

        refresh.setBackground(new java.awt.Color(31, 181, 107));
        refresh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(234, 234, 234));
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setText("Click hear to refresh this page");
        refresh.setOpaque(true);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        confrm.add(refresh);
        refresh.setBounds(210, 360, 240, 50);

        dynipan.add(confrm, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navipan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsMouseClicked
        if(buttonSitch >= 1)
        {
            selectTraniee.setVisible(false);
            basic.setVisible(true);
            other.setVisible(false);
            body.setVisible(false);
            confrm.setVisible(false);

            resetColor(bs);
            setColor(os);
            setColor(bos);
            setColor(conf);
            setColor(stra);
        }
        
    }//GEN-LAST:event_bsMouseClicked

    private void osMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_osMouseClicked
        if(buttonSitch >= 2)
        {
            selectTraniee.setVisible(false);
            basic.setVisible(false);
            other.setVisible(true);
            body.setVisible(false);
            confrm.setVisible(false);

            setColor(bs);
            resetColor(os);
            setColor(bos);
            setColor(conf);
            setColor(stra);
        }
        
    }//GEN-LAST:event_osMouseClicked

    private void bosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bosMouseClicked
        if(buttonSitch >= 3)
        {
            selectTraniee.setVisible(false);
            basic.setVisible(false);
            other.setVisible(false);
            body.setVisible(true);
            confrm.setVisible(false);

            setColor(bs);
            setColor(os);
            resetColor(bos);
            setColor(conf);
            setColor(stra);
        }
        
    }//GEN-LAST:event_bosMouseClicked

    private void confMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confMouseClicked
        if(buttonSitch >= 4)
        {
            selectTraniee.setVisible(false);
            basic.setVisible(false);
            other.setVisible(false);
            body.setVisible(false);
            confrm.setVisible(true);

            setColor(bs);
            setColor(os);
            setColor(bos);
            resetColor(conf);
            setColor(stra);
        }
        
    }//GEN-LAST:event_confMouseClicked

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

    private void next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseClicked
        try{
            String d1 = anum.getText();
            double d2 = Double.parseDouble(d1);
            try{
                String stemp = "1/1/2017";
                stemp = DOB.getDate().toString();

                //check meditory contant
                if("First Name".equals(fname.getText()) || "".equals(fname.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter First Name");
                }
                else if("Last Name".equals(lname.getText()) || "".equals(lname.getText()))
                {
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
                    setColor(conf);
                    setColor(stra);

                    if(buttonSitch == 1) buttonSitch ++ ;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Please Enter Date Of Birth");
            }
            
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Enter proper Addhar number");
        }
        
        
    }//GEN-LAST:event_next1MouseClicked

    private void next1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseEntered
        setColor(next1);
    }//GEN-LAST:event_next1MouseEntered

    private void next1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseExited
        resetColor(next1);
    }//GEN-LAST:event_next1MouseExited

    private void next1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_next1KeyPressed
        basic.setVisible(false);
        other.setVisible(true);
        setColor(bs);
        resetColor(os);
        setColor(bos);
        setColor(conf);
        setColor(stra);

        if(buttonSitch == 1) buttonSitch ++ ;
    }//GEN-LAST:event_next1KeyPressed

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
                JOptionPane.showMessageDialog(null, "Please Enter Addresh");
            }
            else
            {
                other.setVisible(false);
                body.setVisible(true);
                setColor(os);
                setColor(bs);
                resetColor(bos);
                setColor(conf);
                setColor(stra);

                if(buttonSitch == 2) buttonSitch ++ ;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Enter Proper Phone number");
        }
        
        
        
        
    }//GEN-LAST:event_next2MouseClicked

    private void next2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseEntered
        setColor(next2);
    }//GEN-LAST:event_next2MouseEntered

    private void next2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next2MouseExited
        resetColor(next2);
    }//GEN-LAST:event_next2MouseExited

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
        if ("Solder".equals(solder.getText()))
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
        
        
        //Update the database
        String date = DOB.getDate().toString();
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fdate = sdf.format(DOB.getDate());
            int addnumm = Integer.parseInt(anum.getText());

            //create a basic account
            String query = "UPDATE `user` SET Fname='"+fname.getText()+"', Lname='"+lname.getText()+"', Adr_num="+addnumm+", DOB='"+fdate+"', Ph_num="+pnum.getText()+" WHERE `user`.`ID`="+id_num+"; ";
            ps= c.prepareStatement(query);
            ps.executeUpdate();

            //set the gender of traniee
            char gen = 'm';
            int temp = gender.getSelectedIndex();
            if(temp == 1)
                gen = 'm';
            else
                gen = 'f';

            //create the other info
            query = "UPDATE `database_central`.`otherinfo` SET `gender` = '"+gen+"', `Email_ID` = '"+eid.getText()+"', `Driving_num` = '"+dlnum.getText()+"', `Pan_num` = '"+pannum.getText()+"', `Addresh` = '"+addresh.getText()+"' WHERE `otherinfo`.`ID` = "+id_num+";  ";
            ps= c.prepareStatement(query);
            ps.executeUpdate();
            
            //create health info
            query = "UPDATE `health` SET `height` = "+h+", `weight` = "+w+", `soulder` = "+so+", `chest` = "+ch+", `LeftArm` = "+la+", `RightArm` = "+ra+" WHERE `health`.`ID` = "+id_num+";";
            ps= c.prepareStatement(query);
            ps.executeUpdate();
            
            
            
            //Switch to next page
            id_Sett.setText(String.valueOf(id_num));
            body.setVisible(false);
            confrm.setVisible(true);
            setColor(stra);
            setColor(bs);
            setColor(os);
            setColor(bos);
            resetColor(conf);

            if(buttonSitch == 3) buttonSitch ++ ;
 
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(NewTraniee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_next3MouseClicked

    private void next3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseEntered
        setColor(next3);
    }//GEN-LAST:event_next3MouseEntered

    private void next3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next3MouseExited
        resetColor(next3);
    }//GEN-LAST:event_next3MouseExited

    private void straMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_straMouseClicked
        if(buttonSitch >= 0)
        {
            selectTraniee.setVisible(true);
            basic.setVisible(false);
            other.setVisible(false);
            body.setVisible(false);
            confrm.setVisible(false);

            resetColor(stra);
            setColor(bs);
            setColor(os);
            setColor(bos);
            setColor(conf);
        }
    }//GEN-LAST:event_straMouseClicked

    private void next4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next4MouseClicked
        
        
        int[] table_data = data_table.getSelectedRows();
        if(table_data.length==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select Any Traniee");
        }
        else
        {
            try {
                
                //set id and name
                id_num =  data_table.getValueAt(table_data[0],0);    //To get id form table and display in id of update.
                
                //Select data from user.
                String sql="select * from user WHERE `ID`="+id_num;
                st= c.createStatement();
                ResultSet rss=st.executeQuery(sql);
                while(rss.next())
                {
                    fname.setText(rss.getString(2));
                    lname.setText(rss.getString(3));
                    anum.setText(rss.getString(4));
                    DOB.setDate(rss.getDate(5));
                    pnum.setText(rss.getString(6));
                }
                
                //Select data from otherinfo.
                String sql1="select * from otherinfo WHERE `ID`="+id_num;
                st= c.createStatement();
                ResultSet rss1=st.executeQuery(sql1);
                while(rss1.next())
                {
                    String gen = rss1.getString(2);
                    if("m".equals(gen))
                    {
                        gender.setSelectedIndex(1);
                    }
                    else
                    {
                        gender.setSelectedIndex(2);
                    }
                    
                    eid.setText(rss1.getString(3));
                    dlnum.setText(rss1.getString(4));
                    pannum.setText(rss1.getString(5));
                    addresh.setText(rss1.getString(6));
                }
                
                String sql2="select * from health WHERE `ID`="+id_num;
                st= c.createStatement();
                ResultSet rss2=st.executeQuery(sql2);
                while(rss2.next())
                {
                    hight.setText(rss2.getString(2));
                    weight.setText(rss2.getString(3));
                    solder.setText(rss2.getString(4));
                    chest.setText(rss2.getString(5));
                    larm.setText(rss2.getString(6));
                    rarm.setText(rss2.getString(7));
                } 
                
                selectTraniee.setVisible(false);
                basic.setVisible(true);
                setColor(stra);
                resetColor(bs);
                setColor(os);
                setColor(bos);
                setColor(conf);

                if(buttonSitch == 0) buttonSitch ++ ;
            } catch (SQLException ex) {
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
      
    }//GEN-LAST:event_next4MouseClicked

    private void next4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next4MouseEntered
        setColor(next4);
    }//GEN-LAST:event_next4MouseEntered

    private void next4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next4MouseExited
        resetColor(next4);
    }//GEN-LAST:event_next4MouseExited

    private void NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusGained
        Name.setText("");
    }//GEN-LAST:event_NameFocusGained

    private void NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusLost

        if ("".equals(Name.getText()))
        {
            Name.setText("Enter Name");
        }
    }//GEN-LAST:event_NameFocusLost

    private void numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusGained
        num.setText("");
    }//GEN-LAST:event_numFocusGained

    private void numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusLost

        if ("".equals(num.getText()))
        {
            num.setText("Enter Phone Number");
        }
    }//GEN-LAST:event_numFocusLost

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed

    }//GEN-LAST:event_numActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        selectTraniee.setVisible(true);
        confrm.setVisible(false);
        resetColor(stra);
        setColor(bs);
        setColor(bos);
        setColor(conf);

        if(buttonSitch == 4) buttonSitch = 0;
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        setColor(refresh);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        resetColor(refresh);
    }//GEN-LAST:event_refreshMouseExited

    private void NameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NameCaretUpdate
        if("Enter Name".equals(Name.getText()))
        {
            initTable();
        }
        else
        {
            try {
                String sql="select * from user WHERE concat(Fname,Lname) LIKE '%"+Name.getText()+"%'";
                st= c.createStatement();
                ResultSet rss=st.executeQuery(sql);
                DefaultTableModel tab = (DefaultTableModel)data_table.getModel();

                Object[] row = new Object[4];

                while(tab.getRowCount()!=0)
                {
                    tab.removeRow(0);
                }

                while(rss.next())
                {
                    row[0]=rss.getInt(1);
                    String name = rss.getString(2)+" "+rss.getString(3);
                    row[1]=name;
                    row[2]=rss.getDate(5);
                    row[3]=rss.getLong(6);
                    tab.addRow(row);
                }

            } catch (SQLException ex) {
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NameCaretUpdate

    private void numCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_numCaretUpdate
        if("Enter Phone Number".equals(num.getText()))
        {
            initTable();
        }
        else
        {
            try 
            {
                String sql="select * from user WHERE Ph_num LIKE '%"+num.getText()+"%'";
                st= c.createStatement();
                ResultSet rss=st.executeQuery(sql);
                DefaultTableModel tab = (DefaultTableModel)data_table.getModel();

                Object[] row = new Object[4];

                while(tab.getRowCount()!=0)
                {
                    tab.removeRow(0);
                }

                while(rss.next())
                {
                    row[0]=rss.getInt(1);
                    String name = rss.getString(2)+" "+rss.getString(3);
                    row[1]=name;
                    row[2]=rss.getDate(5);
                    row[3]=rss.getLong(6);
                    tab.addRow(row);
                }

            } catch (SQLException ex) {
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_numCaretUpdate

    private void pannumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pannumActionPerformed
        
    }//GEN-LAST:event_pannumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JLabel Head1;
    private javax.swing.JLabel Head2;
    private javax.swing.JLabel Head3;
    private javax.swing.JLabel Head4;
    private javax.swing.JLabel Head5;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField addresh;
    private javax.swing.JTextField anum;
    private javax.swing.JPanel basic;
    private javax.swing.JPanel body;
    private javax.swing.JLabel bos;
    private javax.swing.JLabel bs;
    private javax.swing.JTextField chest;
    private javax.swing.JLabel conf;
    private javax.swing.JPanel confrm;
    private javax.swing.JTable data_table;
    private javax.swing.JTextField dlnum;
    private javax.swing.JPanel dynipan;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField hight;
    private javax.swing.JLabel id_Sett;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
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
    private javax.swing.JLabel next4;
    private javax.swing.JTextField num;
    private javax.swing.JLabel os;
    private javax.swing.JPanel other;
    private javax.swing.JTextField pannum;
    private javax.swing.JTextField pnum;
    private javax.swing.JTextField rarm;
    private javax.swing.JLabel refresh;
    private javax.swing.JPanel selectTraniee;
    private javax.swing.JTextField solder;
    private javax.swing.JLabel stra;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
