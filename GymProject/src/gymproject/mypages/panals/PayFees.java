
package gymproject.mypages.panals;

import gymproject.BalanceDateConfrmation;
import gymproject.Dtcon;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PayFees extends javax.swing.JPanel {

    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    int btnflag = 0;
    int subcription_flag=0;
    int total = 0;                              //store total amount
    int s = 0;                                  //store subcription amount
    int extraRealAmount=0;                      //store extra amount
    String paidAmount;
    int paidAmountNum;                          //store paid amount
    int paidAmountNum2;                         //store balance amount
    Object id_num;                              //store selected ID
    boolean Ismodify = false;
    
    public boolean balance = true;
    
    
    public void updateBalance()    
    {
        Head.setText("View Balance Detail");
        btUpdate.setText("Details");
        savebt.setVisible(false);
        btsub.setVisible(false);
        subHead.setText("Search the Traniee and View the Traniee");
        Ismodify = false;
    }
    
    public void updateModify()
    {
        Head.setText("Modify Subcription");
        btsub.setVisible(false);
        Ismodify = true;
    }
    
    public void updateFee()    
    {
        Head.setText("Modify Fees Details");
        btUpdate.setEnabled(true);
        next.setVisible(true);
        subHead.setText("Search the Traniee and Select Next to edit");
        Ismodify = false;
    }
    
    public PayFees() 
    {
        initComponents();
        SSeparator.setVisible(true);
        USeparator.setVisible(false);
        initTable();
        updatesubcr();
    }
    
    void updatesubcr()
    {
        try {
            subcr.removeAllItems();
            
            //Database info gather
            String str = "SELECT * FROM `database_central`.`subcription`";
            st = c.createStatement();
            ResultSet rss = st.executeQuery(str);
            
            while(rss.next())
            {
                subcr.addItem(rss.getString(2));
            }
            subcription_flag=1;
        } 
        catch (SQLException ex) {
            System.out.println("Line = 91");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    void initTable()
    {
        try {
            String sql="select * from user ORDER BY `user`.`Fname` ASC ";
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
            System.out.println("Line = 122");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(0,150,62));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(1,198,83));
    }
    
    public void resetColor1(JLabel lb)
    {
        lb.setBackground(new Color(36,11,109));
    }
    
    public void setColor1(JLabel lb)
    {
        lb.setBackground(new Color(49,58,115));
    }
    
    public void natColor()
    {
        this.setForeground(new Color(36,11,109));
        setOpaque(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        Head = new javax.swing.JLabel();
        subHead = new javax.swing.JLabel();
        btSearch = new javax.swing.JLabel();
        btUpdate = new javax.swing.JLabel();
        SSeparator = new javax.swing.JSeparator();
        USeparator = new javax.swing.JSeparator();
        down = new javax.swing.JPanel();
        Work = new javax.swing.JPanel();
        Table_Pane = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        SearchPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        pnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_w = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        name_w = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        paid = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        subcr = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();
        savebt = new javax.swing.JLabel();
        btsub = new javax.swing.JLabel();
        priv = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 11, 109));
        setOpaque(false);

        home.setBackground(new java.awt.Color(1, 198, 83));
        home.setOpaque(false);

        Head.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        Head.setForeground(new java.awt.Color(255, 255, 255));
        Head.setText("Modify Fees Details");

        subHead.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subHead.setForeground(new java.awt.Color(255, 255, 255));
        subHead.setText("Search the Traniee and Select Next to edit");

        btSearch.setBackground(new java.awt.Color(36, 11, 109));
        btSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSearch.setForeground(new java.awt.Color(255, 255, 255));
        btSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btSearch.setText("Search");
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSearchMouseClicked(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(36, 11, 109));
        btUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUpdate.setText("Update");
        btUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(homeLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(subHead, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homeLayout.createSequentialGroup()
                            .addGap(268, 268, 268)
                            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SSeparator)
                                .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(USeparator)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Head)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SSeparator)
                        .addComponent(USeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btUpdate)))
        );

        down.setBackground(new java.awt.Color(36, 11, 109));
        down.setLayout(new java.awt.CardLayout());

        Work.setOpaque(false);

        Table_Pane.setBackground(new java.awt.Color(255, 255, 255));
        Table_Pane.setOpaque(false);

        data_table.setAutoCreateRowSorter(true);
        data_table.setBackground(new java.awt.Color(36, 11, 109));
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
        data_table.setGridColor(new java.awt.Color(36, 11, 109));
        data_table.setRowHeight(30);
        data_table.setRowMargin(3);
        data_table.setSelectionBackground(new java.awt.Color(1, 198, 83));
        data_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        data_table.setSurrendersFocusOnKeystroke(true);
        data_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tableMouseClicked(evt);
            }
        });
        Table_Pane.setViewportView(data_table);
        if (data_table.getColumnModel().getColumnCount() > 0) {
            data_table.getColumnModel().getColumn(0).setPreferredWidth(5);
            data_table.getColumnModel().getColumn(0).setHeaderValue("ID");
            data_table.getColumnModel().getColumn(1).setHeaderValue("Name");
            data_table.getColumnModel().getColumn(2).setHeaderValue("DOB");
            data_table.getColumnModel().getColumn(3).setHeaderValue("Phone Number");
        }

        SearchPane.setBackground(new java.awt.Color(36, 11, 109));
        SearchPane.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search :-");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Name.setBackground(new java.awt.Color(36, 11, 109));
        Name.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(1, 198, 83));
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

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        pnum.setBackground(new java.awt.Color(36, 11, 109));
        pnum.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        pnum.setForeground(new java.awt.Color(1, 198, 83));
        pnum.setText("Enter Phone Number");
        pnum.setToolTipText("Enter Phone Number");
        pnum.setBorder(null);
        pnum.setOpaque(false);
        pnum.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pnumCaretUpdate(evt);
            }
        });
        pnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnumFocusLost(evt);
            }
        });
        pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OR");

        next.setBackground(new java.awt.Color(36, 11, 109));
        next.setFont(new java.awt.Font("Magneto", 0, 24)); // NOI18N
        next.setForeground(new java.awt.Color(204, 204, 204));
        next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Right_52px.png"))); // NOI18N
        next.setOpaque(true);
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchPaneLayout = new javax.swing.GroupLayout(SearchPane);
        SearchPane.setLayout(SearchPaneLayout);
        SearchPaneLayout.setHorizontalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(pnum)
                    .addComponent(jSeparator2)
                    .addGroup(SearchPaneLayout.createSequentialGroup()
                        .addGroup(SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchPaneLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SearchPaneLayout.setVerticalGroup(
            SearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WorkLayout = new javax.swing.GroupLayout(Work);
        Work.setLayout(WorkLayout);
        WorkLayout.setHorizontalGroup(
            WorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Table_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WorkLayout.setVerticalGroup(
            WorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(WorkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Table_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        down.add(Work, "card2");

        update.setBackground(new java.awt.Color(36, 11, 109));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");

        id_w.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        id_w.setForeground(new java.awt.Color(1, 198, 83));
        id_w.setText("23");

        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 15));

        name_w.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        name_w.setForeground(new java.awt.Color(1, 198, 83));
        name_w.setText("Amit");

        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 15));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Paid");

        paid.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        paid.setForeground(new java.awt.Color(1, 198, 83));
        paid.setText("600");

        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 15));

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Subcription");

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Amount");

        bal.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        bal.setForeground(new java.awt.Color(1, 198, 83));
        bal.setText("100");

        jSeparator7.setPreferredSize(new java.awt.Dimension(50, 15));

        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 15));

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Balance");

        subcr.setBackground(new java.awt.Color(49, 58, 115));
        subcr.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        subcr.setForeground(new java.awt.Color(1, 198, 83));
        subcr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Mon", "3 Mon" }));
        subcr.setOpaque(false);
        subcr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subcrItemStateChanged(evt);
            }
        });

        amount.setBackground(new java.awt.Color(36, 11, 109));
        amount.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        amount.setForeground(new java.awt.Color(1, 198, 83));
        amount.setText("Enter Amount");
        amount.setBorder(null);
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
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountKeyPressed(evt);
            }
        });

        savebt.setBackground(new java.awt.Color(51, 51, 255));
        savebt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        savebt.setForeground(new java.awt.Color(255, 255, 255));
        savebt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Maintenance_30px.png"))); // NOI18N
        savebt.setText("UPDATE");
        savebt.setIconTextGap(15);
        savebt.setOpaque(true);
        savebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtMouseClicked(evt);
            }
        });

        btsub.setBackground(new java.awt.Color(20, 40, 90));
        btsub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btsub.setForeground(new java.awt.Color(255, 255, 255));
        btsub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Minus_15px.png"))); // NOI18N
        btsub.setText("SUB");
        btsub.setIconTextGap(10);
        btsub.setOpaque(true);
        btsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsubMouseClicked(evt);
            }
        });

        priv.setBackground(new java.awt.Color(36, 11, 109));
        priv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Left_52px.png"))); // NOI18N
        priv.setOpaque(true);
        priv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                privMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                privMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                privMouseExited(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(updateLayout.createSequentialGroup()
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(priv, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(savebt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(amount)
                            .addComponent(btsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateLayout.createSequentialGroup()
                                .addComponent(id_w, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subcr, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_w, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_w))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_w)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subcr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paid)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savebt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(priv, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        down.add(update, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(down, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusLost
        
        if ("".equals(Name.getText()))
        {
            Name.setText("Enter Name");
        }
    }//GEN-LAST:event_NameFocusLost

    private void pnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnumFocusLost
        
        if ("".equals(pnum.getText()))
        {
            pnum.setText("Enter Phone Number");
        }
    }//GEN-LAST:event_pnumFocusLost

    private void pnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumActionPerformed
        
    }//GEN-LAST:event_pnumActionPerformed

    private void btSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseClicked
        SSeparator.setVisible(true);
        USeparator.setVisible(false);
        Work.setVisible(true);
        update.setVisible(false);
    }//GEN-LAST:event_btSearchMouseClicked

    private void btUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUpdateMouseClicked
        int[] table_data = data_table.getSelectedRows();
        subcription_flag=0;
        if(table_data.length==0)
        {
            balance = false;
            JOptionPane.showMessageDialog(null, "Please Select Any Traniee");
        }
        else
        {
            try {
                SSeparator.setVisible(false);
                USeparator.setVisible(true);
                Work.setVisible(false);
                update.setVisible(true);
                
                //int refValue=0;
                
                //set id and name
                id_num =  data_table.getValueAt(table_data[0],0);    //To get id form table and display in id of update.
                Object name_num = data_table.getValueAt(table_data[0], 1); //To get name form table and display in name of update.
                id_w.setText(String.valueOf(id_num));
                name_w.setText(String.valueOf(name_num));
                
                
                //Database connectivity works 
                
                //set combo box name as subcr
                String query = "SELECT * FROM subcription WHERE `ID` IN (SELECT subcription_ID FROM fees WHERE `ID`='"+id_num+"')";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next())
                {
                    subcr.setSelectedItem(rss.getString(2));
                    s=rss.getInt("amount");                                     //set the value of s from database
                }
                
                //set paid and balance
                query= "SELECT * FROM fees WHERE `ID`="+id_num;
                st=c.createStatement();
                ResultSet rss1 = st.executeQuery(query);
                while(rss1.next())
                {
                    paid.setText(String.valueOf(rss1.getInt(3)));
                    bal.setText(String.valueOf(s-rss1.getInt(3)));
                }
                
            } catch (SQLException ex) {
                System.out.println("Line = 820");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        paidAmount = paid.getText();
        paidAmountNum = Integer.parseInt(paidAmount);
        paidAmountNum2 = Integer.parseInt(bal.getText());
        subcription_flag=1;
    }//GEN-LAST:event_btUpdateMouseClicked

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed

    }//GEN-LAST:event_amountActionPerformed

    private void amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusLost
        if("".equals(amount.getText()))
            amount.setText("Enter Amount");
    }//GEN-LAST:event_amountFocusLost

    private void savebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtMouseClicked
        
        int amnflag=0;                                                              //amnflag = amounnt flag
        if("Enter Amount".equals(amount.getText()))                                 //check what amount is given
        {
            amnflag=0;
        } 
        else if("".equals(amount.getText()))                                 //check what amount is given
        {
            amnflag=0;
        } 
        else if(" ".equals(amount.getText()))                                 //check what amount is given
        {
            amnflag=0;
        } 
        else 
        {
            amnflag = Integer.parseInt(amount.getText());
        }
        
        
        if(amnflag==0)                                                              //Is Any Amount Present
        {
            if(Ismodify == false)
            {
                balance=false;
                JOptionPane.showMessageDialog(SearchPane, "Please Enter any Amount first!");
            }
            else
            {
                try
                {
                    int temp = 1;
                    String query = "SELECT `ID` FROM subcription WHERE `Name` = '"+subcr.getSelectedItem()+"';";
                    st = c.createStatement();
                    ResultSet rss = st.executeQuery(query);

                    while(rss.next())
                    {
                        temp = rss.getInt(1);
                    }
                    
                    int amountt = 0;
                    int extraa = 0;
                    query = "SELECT paid,extra FROM fees WHERE `ID`="+id_num+";";
                    st = c.createStatement();
                    ResultSet rss1 = st.executeQuery(query);

                    while(rss1.next())
                    {
                        amountt = rss1.getInt(1);
                        extraa = rss1.getInt(2);
                    }
                    total = amountt + extraa;
                    
                    if(total > s)
                    {
                        int amountex = total-s;
                        query = "UPDATE fees SET subcription_ID="+temp+", paid = "+s+", extra = "+amountex+" WHERE `ID`="+id_num;
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                    }
                    else
                    {
                        query = "UPDATE fees SET subcription_ID="+temp+", paid = "+total+", extra = "+0+" WHERE `ID`="+id_num;
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                        
                    }
                    
                    balance=false;
                    JOptionPane.showMessageDialog(SearchPane, "Subcription Saved Successfully", "Done", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    balance=false;
                    JOptionPane.showMessageDialog(SearchPane, "Can't Update subcription");
                }
            }
        }
        else
        {
            balance =false;
            int reply = JOptionPane.showOptionDialog(SearchPane, "You are trying to add this money\n\nAdding "+amnflag+"Rs\n\n Did you want to save it?\n\n", "Save",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
            if(reply==0)
            {
                try {

                    int temp = 1;
                    String query = "SELECT `ID` FROM subcription WHERE `Name` = '"+subcr.getSelectedItem()+"';";
                    st = c.createStatement();
                    ResultSet rss = st.executeQuery(query);

                    while(rss.next())
                    {
                        temp = rss.getInt(1);
                    }

                    int amountt = 0;
                    int extraa = 0;
                    query = "SELECT paid,extra FROM fees WHERE `ID`="+id_num+";";
                    st = c.createStatement();
                    ResultSet rss1 = st.executeQuery(query);

                    while(rss1.next())
                    {
                        amountt = rss1.getInt(1);
                        extraa = rss1.getInt(2);
                    }
                    total = amountt + extraa;
                    total = total + amnflag;
                    if(total > s)
                    {
                        int amountex = total-s;
                        query = "UPDATE fees SET subcription_ID="+temp+", paid = "+s+", extra = "+amountex+" WHERE `ID`="+id_num;
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                    }
                    else
                    {
                        query = "UPDATE fees SET subcription_ID="+temp+", paid = "+total+", extra = "+0+" WHERE `ID`="+id_num;
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();

                    }
                    try {
                        Calendar cal = new GregorianCalendar();
                        int date = cal.get(Calendar.DATE);
                        int mon = cal.get(Calendar.MONTH);
                        mon++;
                        int yr = cal.get(Calendar.YEAR);
                        query = "INSERT INTO `database_central`.`history` (`ID`, `userID`, `amount`, `date`) VALUES (NULL, '"+id_num+"', '"+amnflag+"', '"+yr+"-"+mon+"-"+date+"')";
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                    }
                    catch(SQLException e) {
                        JOptionPane.showMessageDialog(SearchPane, "Recent Table not updated.\nline = 980 error");
                    }
                    balance=false;
                    JOptionPane.showMessageDialog(SearchPane, "Data Saved Successfully\n\nPress OK To continue.", "Done", JOptionPane.INFORMATION_MESSAGE);
                    String checkflag = bal.getText();
                    int checkflagConvetred = Integer.parseInt(checkflag);
                    if(checkflagConvetred > 0)
                    {
                        balance = false;
                        BalanceDateConfrmation BDC = new BalanceDateConfrmation();
                        BDC.setVisible(true);
                        BDC.ID = id_num;
                    }
                    else
                    {
                        query = "UPDATE fees SET due_date= NULL  WHERE `ID`="+id_num;
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                    }
                } catch (SQLException ex) {
                    System.out.println("Line = 977");
                    Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            
            
            try {
                
                //set paid and balance and extra
                int paidlocal = 0;                                               //Local Variable for getting paid value.
                String query= "SELECT * FROM fees WHERE `ID`="+id_num;
                st=c.createStatement();
                ResultSet rss1 = st.executeQuery(query);
                while(rss1.next())
                {
                    paidlocal = rss1.getInt(3);
                    extraRealAmount=rss1.getInt(6);
                }
                total = paidlocal + extraRealAmount;
                paid.setText(String.valueOf(total));
                bal.setText(String.valueOf(s-total));
                
            } catch (SQLException ex) {
                System.out.println("Line = 999");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
            paidAmount = paid.getText();
            paidAmountNum = Integer.parseInt(paidAmount);
            paidAmountNum2 = Integer.parseInt(bal.getText());
        }

    }//GEN-LAST:event_savebtMouseClicked

    private void amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusGained
        amount.setText("");
    }//GEN-LAST:event_amountFocusGained

    private void NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusGained
        Name.setText("");
        initTable();
    }//GEN-LAST:event_NameFocusGained

    private void pnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnumFocusGained
        pnum.setText("");
        initTable();
    }//GEN-LAST:event_pnumFocusGained

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
        setColor1(next);
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        resetColor1(next);
    }//GEN-LAST:event_nextMouseExited

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        int[] table_data = data_table.getSelectedRows();
        subcription_flag=0;
        if(table_data.length==0)
        {
            balance = false;
            JOptionPane.showMessageDialog(null, "Please Select Any Traniee");
        }
        else
        {
            try {
                
                //int refValue=0;
                
                //set id and name
                id_num =  data_table.getValueAt(table_data[0],0);    //To get id form table and display in id of update.
                Object name_num = data_table.getValueAt(table_data[0], 1); //To get name form table and display in name of update.
                id_w.setText(String.valueOf(id_num));
                name_w.setText(String.valueOf(name_num));
                
                
                //Database connectivity works 
                
                //set combo box name as subcr
                balance = false;
                String query = "SELECT * FROM subcription WHERE `ID` IN (SELECT subcription_ID FROM fees WHERE `ID`='"+id_num+"')";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next())
                {
                    subcr.setSelectedItem(rss.getString(2));
                    s=rss.getInt("amount");                                     //set the value of s from database
                }
                
                //set paid and balance and extra
                int paidlocal = 0;                                               //Local Variable for getting paid value.
                query= "SELECT * FROM fees WHERE `ID`="+id_num;
                st=c.createStatement();
                ResultSet rss1 = st.executeQuery(query);
                while(rss1.next())
                {
                    paidlocal = rss1.getInt(3);
                    extraRealAmount=rss1.getInt(6);
                }
                total = paidlocal + extraRealAmount;
                paid.setText(String.valueOf(total));
                bal.setText(String.valueOf(s-total));
                
                SSeparator.setVisible(false);
                USeparator.setVisible(true);
                Work.setVisible(false);
                update.setVisible(true);
                
                paidAmount = paid.getText();
                paidAmountNum = Integer.parseInt(paidAmount);
                paidAmountNum2 = Integer.parseInt(bal.getText());
                subcription_flag=1;
            } catch (SQLException ex) {
                System.out.println("Line = 1088");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }//GEN-LAST:event_nextMouseClicked

    private void privMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_privMouseClicked
        SSeparator.setVisible(true);
        USeparator.setVisible(false);
        Work.setVisible(true);
        update.setVisible(false);
    }//GEN-LAST:event_privMouseClicked

    private void privMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_privMouseEntered
        setColor1(priv);
    }//GEN-LAST:event_privMouseEntered

    private void privMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_privMouseExited
        resetColor1(priv);
    }//GEN-LAST:event_privMouseExited

    private void amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyPressed
        
    }//GEN-LAST:event_amountKeyPressed

    private void subcrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subcrItemStateChanged
        if(subcription_flag==1)
        {
            try {
                String query = "SELECT * FROM subcription WHERE `Name`='"+subcr.getSelectedItem()+"';";
                st=c.createStatement();
                ResultSet rss = st.executeQuery(query);
                while(rss.next())
                {
                    s=rss.getInt(3);
                }
                bal.setText(String.valueOf(s-total));
                paidAmountNum2 = Integer.parseInt(bal.getText());
                
            } catch (SQLException ex) {
                System.out.println("Line = 1130");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("/n/n/n"+ex+"/n/n/n");
            }
            
        }
    }//GEN-LAST:event_subcrItemStateChanged

    private void amountCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_amountCaretUpdate
        String key = amount.getText();
        int keyNum = 0;
        switch (key) {
            case "Enter Amount":
                break;
            case "":
                paid.setText(Integer.toString(paidAmountNum));
                bal.setText(Integer.toString(paidAmountNum2));
                break;
            default:
                keyNum = Integer.parseInt(key);
                if( paidAmountNum > 0 )
                {
                    paidAmountNum += keyNum;
                    paid.setText(Integer.toString(paidAmountNum));
                    paidAmountNum -= keyNum;
                    
                    paidAmountNum2 -= keyNum;
                    bal.setText(Integer.toString(paidAmountNum2));
                    paidAmountNum2 += keyNum;
                  
                }   break;
        }
    }//GEN-LAST:event_amountCaretUpdate

    private void data_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tableMouseClicked
        btnflag = 1;
    }//GEN-LAST:event_data_tableMouseClicked

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
                System.out.println("Line = 1198");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_NameCaretUpdate

    private void pnumCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pnumCaretUpdate
        if("Enter Phone Number".equals(pnum.getText()))
        {
            initTable();
        }
        else
        {
            try 
            {
                String sql="select * from user WHERE Ph_num LIKE '%"+pnum.getText()+"%'";
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
                System.out.println("Line = 1235");
                Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pnumCaretUpdate

    private void btsubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsubMouseClicked
        String input = null;
        int Paid=0,Extra=0;
        try {
            String query = "SELECT * FROM fees WHERE `ID`="+id_num;
            st=c.createStatement();
            ResultSet rss = st.executeQuery(query);
            while(rss.next())
            {
                Paid = rss.getInt(3);
                Extra= rss.getInt(6);
                balance = false;
                input = JOptionPane.showInputDialog(SearchPane, "Paid = "+Paid+" Rs\nBalance = "+paidAmountNum2+" Rs\nExtra Paid ="+Extra+" Rs \n\nEnter Amount to substract-", "Correction", JOptionPane.INFORMATION_MESSAGE);
            }
            
            //rander Input of user
            if(!"".equals(input))
            {
                int value = Integer.parseInt(input);
                if(Extra>0)
                {
                    if(value < Extra)
                    {
                        Extra = Extra - value;
                    }
                    else
                    {
                        value = value - Extra;
                        Paid = Paid - value;
                        Extra = 0;
                    }
                }
                else
                {
                    Paid = Paid - value;
                }
                
                
                //save it in database
                query = "UPDATE fees SET paid="+Paid+",extra="+Extra+" WHERE `ID`="+id_num;
                ps = c.prepareStatement(query);
                ps.executeUpdate();
                try {
                    Calendar cal = new GregorianCalendar();
                    int date = cal.get(Calendar.DATE);
                    int mon = cal.get(Calendar.MONTH);
                    mon++;
                    int yr = cal.get(Calendar.YEAR);
                    query = "INSERT INTO `database_central`.`history` (`ID`, `userID`, `amount`, `date`) VALUES (NULL, '"+id_num+"', '-"+input+"', '"+yr+"-"+mon+"-"+date+"')";
                    ps = c.prepareStatement(query);
                    ps.executeUpdate();
                }
                catch(SQLException e) {
                    JOptionPane.showMessageDialog(SearchPane, "Recent Table not updated.\nline = 980 error");
                }
                
            }
            
                
            
        } catch (SQLException ex) {
            System.out.println("Line = 1287");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //refresh all items
        try {
            
            int paidlocal = 0;                                               //Local Variable for getting paid value.
            String q = "SELECT * FROM fees WHERE `ID`="+id_num;
            st = c.createStatement();
            ResultSet rss = st.executeQuery(q);
            while(rss.next())
            {
                paidlocal = rss.getInt(3);
                extraRealAmount=rss.getInt(6);
            }
            total = paidlocal + extraRealAmount;
            paid.setText(String.valueOf(total));
            bal.setText(String.valueOf(s-total));
            
        } catch (SQLException ex) {
            System.out.println("Line=1307");
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
        paidAmount = paid.getText();
        paidAmountNum = Integer.parseInt(paidAmount);
        paidAmountNum2 = Integer.parseInt(bal.getText());
    }//GEN-LAST:event_btsubMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Head;
    private javax.swing.JTextField Name;
    private javax.swing.JSeparator SSeparator;
    private javax.swing.JPanel SearchPane;
    private javax.swing.JScrollPane Table_Pane;
    private javax.swing.JSeparator USeparator;
    private javax.swing.JPanel Work;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel btSearch;
    private javax.swing.JLabel btUpdate;
    private javax.swing.JLabel btsub;
    private javax.swing.JTable data_table;
    private javax.swing.JPanel down;
    private javax.swing.JPanel home;
    private javax.swing.JLabel id_w;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel name_w;
    private javax.swing.JLabel next;
    private javax.swing.JLabel paid;
    private javax.swing.JTextField pnum;
    private javax.swing.JLabel priv;
    private javax.swing.JLabel savebt;
    private javax.swing.JLabel subHead;
    private javax.swing.JComboBox<String> subcr;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
