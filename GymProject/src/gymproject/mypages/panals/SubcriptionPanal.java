
package gymproject.mypages.panals;

import gymproject.Dtcon;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SubcriptionPanal extends javax.swing.JPanel {

    
    Dtcon d = new Dtcon();
    Connection c = d.getconnection();
    Statement st;
    PreparedStatement ps;
    
    int modi_price=0,modi_mon=0;
    public boolean balance = true;
    
    
    public SubcriptionPanal() {
        initComponents();
        updateRequire();
        
        View.setVisible(false);
        New.setVisible(true);
        Modify.setVisible(false);
        Delete.setVisible(false);
    }

    public void setColor(JLabel lb)
    {
        lb.setBackground(new Color(1,151,77));
    }
    
    public void resetColor(JLabel lb)
    {
        lb.setBackground(new Color(31,181,107));
    }
    
    public void updateRequire()
    {
        try {
            String sql="select * from subcription; ";
            st= c.createStatement();
            ResultSet rss=st.executeQuery(sql);
            DefaultTableModel tab = (DefaultTableModel)viewTable.getModel();
            
            Object[] row = new Object[4];
            
            while(tab.getRowCount()!=0)
            {
                tab.removeRow(0);
            }
            
            while(rss.next())
            {
                row[0]=rss.getInt(1);
                row[1]=rss.getString(2);
                row[2]=rss.getInt(4);
                row[3]=rss.getInt(3);
                tab.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PayFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navipan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        view_dy = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        new_dy = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Modify_dy = new javax.swing.JLabel();
        delete_dy = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dynipan = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Table_Pane = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        New = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NewName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        NewMonth = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        NewPrice = new javax.swing.JTextField();
        NewSave = new javax.swing.JLabel();
        Modify = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Month1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Save1 = new javax.swing.JLabel();
        Price1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Modi_Selection = new javax.swing.JComboBox<>();
        Delete = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Name2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Price2 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Modi_Selection1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Month2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        delete = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(856, 444));

        jPanel1.setBackground(new java.awt.Color(31, 181, 107));

        navipan.setBackground(new java.awt.Color(1, 151, 77));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Database View_25px.png"))); // NOI18N

        view_dy.setBackground(new java.awt.Color(1, 151, 77));
        view_dy.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        view_dy.setForeground(new java.awt.Color(255, 255, 255));
        view_dy.setText("View");
        view_dy.setOpaque(true);
        view_dy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_dyMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/New_25px.png"))); // NOI18N

        new_dy.setBackground(new java.awt.Color(31, 181, 107));
        new_dy.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        new_dy.setForeground(new java.awt.Color(255, 255, 255));
        new_dy.setText("New");
        new_dy.setOpaque(true);
        new_dy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_dyMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Edit Property_25px.png"))); // NOI18N

        Modify_dy.setBackground(new java.awt.Color(1, 151, 77));
        Modify_dy.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        Modify_dy.setForeground(new java.awt.Color(255, 255, 255));
        Modify_dy.setText("Modify");
        Modify_dy.setOpaque(true);
        Modify_dy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modify_dyMouseClicked(evt);
            }
        });

        delete_dy.setBackground(new java.awt.Color(1, 151, 77));
        delete_dy.setFont(new java.awt.Font("Curlz MT", 0, 18)); // NOI18N
        delete_dy.setForeground(new java.awt.Color(255, 255, 255));
        delete_dy.setText("Delete");
        delete_dy.setOpaque(true);
        delete_dy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_dyMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymproject/mypages/panals/Delete Message_25px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Subcription");

        javax.swing.GroupLayout navipanLayout = new javax.swing.GroupLayout(navipan);
        navipan.setLayout(navipanLayout);
        navipanLayout.setHorizontalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navipanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navipanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navipanLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete_dy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(new_dy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(navipanLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Modify_dy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, navipanLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(view_dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        navipanLayout.setVerticalGroup(
            navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navipanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(new_dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Modify_dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(navipanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete_dy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynipan.setBackground(new java.awt.Color(31, 181, 107));
        dynipan.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(31, 181, 107));
        View.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(31, 181, 107));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View");

        Table_Pane.setBackground(new java.awt.Color(255, 255, 255));
        Table_Pane.setOpaque(false);

        viewTable.setAutoCreateRowSorter(true);
        viewTable.setBackground(new java.awt.Color(31, 181, 107));
        viewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 181, 107), 1, true));
        viewTable.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        viewTable.setForeground(new java.awt.Color(255, 255, 255));
        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1 MONTH", "1", "300"},
                {"2", "3 MONTH", "3", "800"},
                {null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Month", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTable.setGridColor(new java.awt.Color(31, 181, 107));
        viewTable.setRowHeight(50);
        viewTable.setRowMargin(3);
        viewTable.setSelectionBackground(new java.awt.Color(1, 151, 77));
        viewTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        viewTable.setSurrendersFocusOnKeystroke(true);
        viewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTableMouseClicked(evt);
            }
        });
        Table_Pane.setViewportView(viewTable);

        jLabel4.setBackground(new java.awt.Color(31, 181, 107));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Here You Can see the activation which is working.");

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Table_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                .addContainerGap())
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Table_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        dynipan.add(View, "card2");

        New.setBackground(new java.awt.Color(31, 181, 107));
        New.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(31, 181, 107));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New");

        NewName.setBackground(new java.awt.Color(31, 181, 107));
        NewName.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        NewName.setForeground(new java.awt.Color(255, 255, 255));
        NewName.setText("Enter Name");
        NewName.setToolTipText("Enter Name");
        NewName.setBorder(null);
        NewName.setOpaque(false);
        NewName.setSelectionColor(new java.awt.Color(1, 151, 77));
        NewName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NewNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewNameFocusLost(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        NewMonth.setBackground(new java.awt.Color(31, 181, 107));
        NewMonth.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        NewMonth.setForeground(new java.awt.Color(255, 255, 255));
        NewMonth.setText("Enter Month");
        NewMonth.setToolTipText("Enter Month");
        NewMonth.setBorder(null);
        NewMonth.setOpaque(false);
        NewMonth.setSelectionColor(new java.awt.Color(1, 151, 77));
        NewMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NewMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewMonthFocusLost(evt);
            }
        });
        NewMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMonthActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        NewPrice.setBackground(new java.awt.Color(31, 181, 107));
        NewPrice.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        NewPrice.setForeground(new java.awt.Color(255, 255, 255));
        NewPrice.setText("Enter Price");
        NewPrice.setToolTipText("Enter Price");
        NewPrice.setBorder(null);
        NewPrice.setOpaque(false);
        NewPrice.setSelectionColor(new java.awt.Color(1, 151, 77));
        NewPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NewPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewPriceFocusLost(evt);
            }
        });

        NewSave.setBackground(new java.awt.Color(31, 181, 107));
        NewSave.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        NewSave.setForeground(new java.awt.Color(255, 255, 255));
        NewSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewSave.setText("Save");
        NewSave.setOpaque(true);
        NewSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewSaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NewLayout = new javax.swing.GroupLayout(New);
        New.setLayout(NewLayout);
        NewLayout.setHorizontalGroup(
            NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewLayout.createSequentialGroup()
                        .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NewLayout.createSequentialGroup()
                        .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewSave, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        NewLayout.setVerticalGroup(
            NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NewLayout.createSequentialGroup()
                        .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NewLayout.createSequentialGroup()
                        .addComponent(NewMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(NewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NewLayout.createSequentialGroup()
                        .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NewSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        dynipan.add(New, "card3");

        Modify.setBackground(new java.awt.Color(31, 181, 107));
        Modify.setOpaque(false);

        jLabel6.setBackground(new java.awt.Color(31, 181, 107));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modify");

        Name1.setEditable(false);
        Name1.setBackground(new java.awt.Color(31, 181, 107));
        Name1.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setText("Enter Name");
        Name1.setToolTipText("Name");
        Name1.setBorder(null);
        Name1.setOpaque(false);
        Name1.setSelectionColor(new java.awt.Color(1, 151, 77));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        Month1.setBackground(new java.awt.Color(31, 181, 107));
        Month1.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Month1.setForeground(new java.awt.Color(255, 255, 255));
        Month1.setText("Enter Month");
        Month1.setToolTipText("Month");
        Month1.setBorder(null);
        Month1.setOpaque(false);
        Month1.setSelectionColor(new java.awt.Color(1, 151, 77));
        Month1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Month1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Month1FocusLost(evt);
            }
        });
        Month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month1ActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        Save1.setBackground(new java.awt.Color(31, 181, 107));
        Save1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        Save1.setForeground(new java.awt.Color(255, 255, 255));
        Save1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Save1.setText("Save");
        Save1.setOpaque(true);
        Save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Save1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Save1MouseExited(evt);
            }
        });

        Price1.setBackground(new java.awt.Color(31, 181, 107));
        Price1.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Price1.setForeground(new java.awt.Color(255, 255, 255));
        Price1.setText("Enter Price");
        Price1.setToolTipText("Price");
        Price1.setBorder(null);
        Price1.setOpaque(false);
        Price1.setSelectionColor(new java.awt.Color(1, 151, 77));
        Price1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Price1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Price1FocusLost(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(31, 181, 107));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Select Subcription :-");

        Modi_Selection.setBackground(new java.awt.Color(31, 181, 107));
        Modi_Selection.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Modi_Selection.setForeground(new java.awt.Color(31, 181, 107));
        Modi_Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Month", "3 Month" }));
        Modi_Selection.setOpaque(false);
        Modi_Selection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Modi_SelectionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout ModifyLayout = new javax.swing.GroupLayout(Modify);
        Modify.setLayout(ModifyLayout);
        ModifyLayout.setHorizontalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modi_Selection, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifyLayout.createSequentialGroup()
                        .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Month1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        ModifyLayout.setVerticalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Modi_Selection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addComponent(Month1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        dynipan.add(Modify, "card4");

        Delete.setBackground(new java.awt.Color(31, 181, 107));
        Delete.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(31, 181, 107));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete");

        Name2.setEditable(false);
        Name2.setBackground(new java.awt.Color(31, 181, 107));
        Name2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setText("Enter Name");
        Name2.setToolTipText("Name");
        Name2.setBorder(null);
        Name2.setOpaque(false);
        Name2.setSelectionColor(new java.awt.Color(1, 151, 77));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        Price2.setEditable(false);
        Price2.setBackground(new java.awt.Color(31, 181, 107));
        Price2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Price2.setForeground(new java.awt.Color(255, 255, 255));
        Price2.setText("Enter Price");
        Price2.setToolTipText("Price");
        Price2.setBorder(null);
        Price2.setOpaque(false);
        Price2.setSelectionColor(new java.awt.Color(1, 151, 77));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        Modi_Selection1.setBackground(new java.awt.Color(31, 181, 107));
        Modi_Selection1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Modi_Selection1.setForeground(new java.awt.Color(31, 181, 107));
        Modi_Selection1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Month", "3 Month" }));
        Modi_Selection1.setOpaque(false);
        Modi_Selection1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Modi_Selection1ItemStateChanged(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(31, 181, 107));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Select Subcription :-");

        Month2.setEditable(false);
        Month2.setBackground(new java.awt.Color(31, 181, 107));
        Month2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        Month2.setForeground(new java.awt.Color(255, 255, 255));
        Month2.setText("Enter Month");
        Month2.setToolTipText("Month");
        Month2.setBorder(null);
        Month2.setOpaque(false);
        Month2.setSelectionColor(new java.awt.Color(1, 151, 77));
        Month2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month2ActionPerformed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        delete.setBackground(new java.awt.Color(31, 181, 107));
        delete.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setText("Delete");
        delete.setOpaque(true);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DeleteLayout = new javax.swing.GroupLayout(Delete);
        Delete.setLayout(DeleteLayout);
        DeleteLayout.setHorizontalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Month2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteLayout.createSequentialGroup()
                        .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modi_Selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DeleteLayout.setVerticalGroup(
            DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modi_Selection1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addComponent(Month2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DeleteLayout.createSequentialGroup()
                        .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        dynipan.add(Delete, "card5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(navipan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynipan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void view_dyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dyMouseClicked
        updateRequire();
        
        View.setVisible(true);
        New.setVisible(false);
        Modify.setVisible(false);
        Delete.setVisible(false);
        
        resetColor(view_dy);
        setColor(new_dy);
        setColor(Modify_dy);
        setColor(delete_dy);
    }//GEN-LAST:event_view_dyMouseClicked

    private void new_dyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_dyMouseClicked
        View.setVisible(false);
        New.setVisible(true);
        Modify.setVisible(false);
        Delete.setVisible(false);
        
        setColor(view_dy);
        resetColor(new_dy);
        setColor(Modify_dy);
        setColor(delete_dy);
    }//GEN-LAST:event_new_dyMouseClicked

    private void Modify_dyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modify_dyMouseClicked
        Modi_Selection.removeAllItems();
        Modi_Selection.addItem("Select");
        try
        {
            String query = "select Name from subcription;";
            st = c.createStatement();
            ResultSet rss = st.executeQuery(query);
            while(rss.next())
            {
                Modi_Selection.addItem(rss.getString(1));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Cant update Combo Box/nPlease Refresh Page");
        }
        
        View.setVisible(false);
        New.setVisible(false);
        Modify.setVisible(true);
        Delete.setVisible(false);
        
        setColor(view_dy);
        setColor(new_dy);
        resetColor(Modify_dy);
        setColor(delete_dy);
    }//GEN-LAST:event_Modify_dyMouseClicked

    private void delete_dyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_dyMouseClicked
        Modi_Selection1.removeAllItems();
        Modi_Selection1.addItem("Select");
        try
        {
            String query = "select Name from subcription;";
            st = c.createStatement();
            ResultSet rss = st.executeQuery(query);
            while(rss.next())
            {
                Modi_Selection1.addItem(rss.getString(1));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Cant update Combo Box/nPlease Refresh Page");
        }
        
        View.setVisible(false);
        New.setVisible(false);
        Modify.setVisible(false);
        Delete.setVisible(true);
        
        setColor(view_dy);
        setColor(new_dy);
        setColor(Modify_dy);
        resetColor(delete_dy);
    }//GEN-LAST:event_delete_dyMouseClicked

    private void viewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTableMouseClicked
        
    }//GEN-LAST:event_viewTableMouseClicked

    private void NewNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewNameFocusGained
        NewName.setText("");
    }//GEN-LAST:event_NewNameFocusGained

    private void NewNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewNameFocusLost

        if ("".equals(NewName.getText()))
        {
            NewName.setText("Enter Name");
        }
    }//GEN-LAST:event_NewNameFocusLost

    private void NewMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewMonthFocusGained
        NewMonth.setText("");
    }//GEN-LAST:event_NewMonthFocusGained

    private void NewMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewMonthFocusLost
        if ("".equals(NewMonth.getText()))
        {
            NewMonth.setText("Enter Month");
        }
    }//GEN-LAST:event_NewMonthFocusLost

    private void NewPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPriceFocusGained
        NewPrice.setText("");
    }//GEN-LAST:event_NewPriceFocusGained

    private void NewPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewPriceFocusLost
        if ("".equals(NewPrice.getText()))
        {
            NewPrice.setText("Enter Price");
        }
    }//GEN-LAST:event_NewPriceFocusLost

    private void NewMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMonthActionPerformed
        
    }//GEN-LAST:event_NewMonthActionPerformed

    private void NewSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewSaveMouseEntered
        setColor(NewSave);
    }//GEN-LAST:event_NewSaveMouseEntered

    private void NewSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewSaveMouseExited
        resetColor(NewSave);
    }//GEN-LAST:event_NewSaveMouseExited

    private void Month1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Month1FocusGained
        Month1.setText("");
    }//GEN-LAST:event_Month1FocusGained

    private void Month1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Month1FocusLost
        if ("".equals(Month1.getText()))
        {
            Month1.setText("Enter Month");
        }
    }//GEN-LAST:event_Month1FocusLost

    private void Month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month1ActionPerformed
        
    }//GEN-LAST:event_Month1ActionPerformed

    private void Save1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save1MouseEntered
        setColor(Save1);
    }//GEN-LAST:event_Save1MouseEntered

    private void Save1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save1MouseExited
        resetColor(Save1);
    }//GEN-LAST:event_Save1MouseExited

    private void Price1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Price1FocusGained
        Price1.setText("");
    }//GEN-LAST:event_Price1FocusGained

    private void Price1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Price1FocusLost
        if ("".equals(Price1.getText()))
        {
            Price1.setText("Enter Price");
        }
    }//GEN-LAST:event_Price1FocusLost

    private void Modi_SelectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Modi_SelectionItemStateChanged
        int selection = Modi_Selection.getSelectedIndex();
        if(selection == 0)
        {
            Name1.setText("Enter Name");
            Month1.setText("Enter Month");
            Price1.setText("Enter Price");
            modi_price = 0;
            modi_mon = 0;
        }
        else
        {
            try {
                String query = "select * from subcription where Name = '"+Modi_Selection.getSelectedItem()+"'";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                
                if(rss.next())
                {
                    Name1.setText(rss.getString(2));
                    modi_price = rss.getInt(3);
                    Price1.setText(rss.getString(3));
                    modi_mon = rss.getInt(4);
                    Month1.setText(rss.getString(4));
                }
            } catch (SQLException ex) {
                Logger.getLogger(SubcriptionPanal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_Modi_SelectionItemStateChanged

    private void Modi_Selection1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Modi_Selection1ItemStateChanged
        int selection = Modi_Selection1.getSelectedIndex();
        if(selection == 0)
        {
            Name2.setText("Enter Name");
            Month2.setText("Enter Month");
            Price2.setText("Enter Price");
        }
        else
        {
            try {
                String query = "select * from subcription where Name = '"+Modi_Selection1.getSelectedItem()+"'";
                st = c.createStatement();
                ResultSet rss = st.executeQuery(query);
                
                if(rss.next())
                {
                    Name2.setText(rss.getString(2));
                    Price2.setText(rss.getString(3));
                    Month2.setText(rss.getString(4));
                }
            } catch (SQLException ex) {
                Logger.getLogger(SubcriptionPanal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_Modi_Selection1ItemStateChanged

    private void Month2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Month2ActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        setColor(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        resetColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void NewSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewSaveMouseClicked
        int price=0,month=0;
        String sprice,smonth;
        try
        {
            sprice = NewPrice.getText();
            price = Integer.parseInt(sprice);
        }
        catch(Exception e)
        {
            price = 0;
        }
        try
        {
            sprice = NewMonth.getText();
            month = Integer.parseInt(sprice);
        }
        catch(Exception e)
        {
            month = 0;
        }
        
        
        try {
            String query = "INSERT INTO subcription(`Name`,amount,mon) VALUES('"+NewName.getText()+"',"+NewPrice.getText()+","+NewMonth.getText()+");";
            ps = c.prepareStatement(query);
            ps.executeUpdate();
            updateRequire();
        
            View.setVisible(true);
            New.setVisible(false);
            Modify.setVisible(false);
            Delete.setVisible(false);

            resetColor(view_dy);
            setColor(new_dy);
            setColor(Modify_dy);
            setColor(delete_dy);
        } 
        catch (SQLException ex) {
            Logger.getLogger(SubcriptionPanal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_NewSaveMouseClicked

    private void Save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save1MouseClicked
        int price=0,month=0;
        if(Price1.getText().equals("Enter Price"))
        {
            price = 0;
        }
        else if(Price1.getText().equals(" "))
        {
            price = 0;
        }
        else if(Price1.getText().equals(""))
        {
            price = 0;
        }
        else
        {
            price = Integer.parseInt(Price1.getText());
        }
            
        
        if(Month1.getText().equals("Enter Month"))
        {
            month = 0;
        }
        else if(Month1.getText().equals(" "))
        {
            month = 0;
        }
        else if(Month1.getText().equals(""))
        {
            month = 0;
        }
        else
        {
            month = Integer.parseInt(Month1.getText());
        }
        
        
        
        if(modi_price == 0 && modi_mon == 0)
        {
            balance = false;
            JOptionPane.showMessageDialog(null, "Please Select any entity");
        }
        else
        {
            if(price == 0 || month == 0)
            {
                balance = false;
                JOptionPane.showMessageDialog(null,"Please Enter Correct Values\nSystem unable to Understand.");
            }
            else
            {
                if(modi_price == price && modi_mon == month)
                {
                    balance = false;
                    JOptionPane.showMessageDialog(null,"Please change some data");
                }
                else
                {
                    try {
                        String query = "UPDATE subcription SET amount = "+price+", mon = "+month+" WHERE `Name` = '"+Name1.getText()+"';";
                        ps = c.prepareStatement(query);
                        ps.executeUpdate();
                        
                        //Get ID from Subcription
                        int IdModi = 0;
                        query = "SELECT ID FROM subcription WHERE `Name`= '"+Name1.getText()+"';";
                        st = c.createStatement();
                        ResultSet rss = st.executeQuery(query);
                        while(rss.next())
                        {
                            IdModi = rss.getInt(1);
                        }
                        
                        //set fees value as modified value
                        int IDofFEES = 0;
                        int PaidOfFees = 0;
                        int ExtraOfFees = 0;
                        int total = 0;
                        query = "SELECT * FROM fees WHERE `subcription_ID` = "+IdModi+";";
                        st = c.createStatement();
                        rss = st.executeQuery(query);
                        while(rss.next())
                        {
                            IDofFEES = rss.getInt(1);
                            PaidOfFees = rss.getInt(3);
                            ExtraOfFees = rss.getInt(6);
                            total = PaidOfFees + ExtraOfFees;
                            if(PaidOfFees > price)
                            {
                                PaidOfFees = price;
                                ExtraOfFees = total - PaidOfFees;
                            }
                            else if(ExtraOfFees > 0)
                            {
                                if(total < price)
                                {
                                    PaidOfFees = total;
                                    ExtraOfFees = 0;
                                }
                                else
                                {
                                    PaidOfFees = price;
                                    ExtraOfFees = total - PaidOfFees;
                                }
                            }
                            try
                            {
                                String secQ = "UPDATE fees SET paid = "+PaidOfFees+", extra = "+ExtraOfFees+" WHERE `ID` = '"+IDofFEES+"';";
                                ps = c.prepareStatement(secQ);
                                ps.executeUpdate();
                            }
                            catch(SQLException ex)
                            {
                                System.out.println("\n\n"+ex);
                            }
                        }
                        
                        
                        balance = false;
                        JOptionPane.showMessageDialog(null, "Data saved sucessfully");
                    } catch (SQLException ex) {
                        Logger.getLogger(SubcriptionPanal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        }
    }//GEN-LAST:event_Save1MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        balance = false;
        int select = JOptionPane.showConfirmDialog(null, "Are You Sure!");
        if(select == 0)
        {
            try {
                String query = "DELETE FROM subcription WHERE `Name`='"+Name2.getText()+"';";
                ps = c.prepareStatement(query);
                ps.executeUpdate();
                balance = false;
                JOptionPane.showMessageDialog(null, "Subcription Deleted");
                
                //update Modi_Selection1
                Modi_Selection1.removeAllItems();
                Modi_Selection1.addItem("Select");
                try
                {
                    query = "select Name from subcription;";
                    st = c.createStatement();
                    ResultSet rss = st.executeQuery(query);
                    while(rss.next())
                    {
                        Modi_Selection1.addItem(rss.getString(1));
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Cant update Combo Box/nPlease Refresh Page");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SubcriptionPanal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Delete;
    private javax.swing.JComboBox<String> Modi_Selection;
    private javax.swing.JComboBox<String> Modi_Selection1;
    private javax.swing.JPanel Modify;
    private javax.swing.JLabel Modify_dy;
    private javax.swing.JTextField Month1;
    private javax.swing.JTextField Month2;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JPanel New;
    private javax.swing.JTextField NewMonth;
    private javax.swing.JTextField NewName;
    private javax.swing.JTextField NewPrice;
    private javax.swing.JLabel NewSave;
    private javax.swing.JTextField Price1;
    private javax.swing.JTextField Price2;
    private javax.swing.JLabel Save1;
    private javax.swing.JScrollPane Table_Pane;
    private javax.swing.JPanel View;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel delete_dy;
    private javax.swing.JPanel dynipan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel navipan;
    private javax.swing.JLabel new_dy;
    private javax.swing.JTable viewTable;
    private javax.swing.JLabel view_dy;
    // End of variables declaration//GEN-END:variables
}
