package views;

public class RegisterView extends MainView {
    
    public RegisterView(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 660));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setPreferredSize(new java.awt.Dimension(1000, 660));
        setLayout(null);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bgRegister.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1000, 660);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
