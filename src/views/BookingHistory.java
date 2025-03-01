package views;

public class BookingHistory extends MainView {

    public BookingHistory(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAdmin = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setLayout(null);

        tabelAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(204, 255, 204), null, new java.awt.Color(255, 204, 204))));
        tabelAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Mechanic", "Spareparts", "Problem", "Price"
            }
        ));
        tabelAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabelAdmin);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 700, 170);

        lblTitle.setText("Booking History (customer)");
        add(lblTitle);
        lblTitle.setBounds(290, 40, 160, 16);
        add(lblBackground);
        lblBackground.setBounds(0, 0, 740, 300);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tabelAdmin;
    // End of variables declaration//GEN-END:variables
}
