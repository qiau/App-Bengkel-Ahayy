package views;

import models.User;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ProfileView extends MainView {
    private User user;
    
    public ProfileView(MainFrame mainFrame, User user) {
        super(mainFrame);
        this.user = user;
        initComponents();
        displayUserData();
    }

    
    private void displayUserData() {
        txtName.setText(user.getName());
        txtAddress.setText(user.getAddress());
        txtPhone.setText(user.getPhoneNumber());
        txtUsername.setText(user.getUsername());
        txtPassword.setText(user.getPassword());
        displayProfileImage();
    }
    
    private void displayProfileImage() {
        ImageIcon profileImageIcon;

        if (user.getProfileImage() != null) {
            // Jika ada gambar profil, gunakan yang telah diubah ukurannya
            profileImageIcon = new ImageIcon(user.getProfileImage());
        } else {
            // Jika tidak ada gambar profil, gunakan gambar default
            profileImageIcon = new ImageIcon(getClass().getResource("/assets/imgDefaultAdmin.png"));
        }

        profileImageLabel.setIcon(profileImageIcon);
        profileImageLabel.repaint();
    }
    
    private void chooseProfileImage() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Update foto profil
            updateProfileImage(selectedFile.getAbsolutePath());
        }
    }
    
    private void updateProfileImage(String imagePath) {
        // Resize gambar sebelum disimpan
        String resizedImagePath = resizeImage(imagePath, 100, 100);

        // Simpan path gambar yang baru diubah ukurannya ke objek User
        user.setProfileImage(resizedImagePath);

        // Tampilkan gambar yang baru diubah ukurannya di GUI
        displayProfileImage();
    }
    
    private String resizeImage(String inputImagePath, int scaledWidth, int scaledHeight) {
        try {
            File inputFile = new File(inputImagePath);
            BufferedImage inputImage = ImageIO.read(inputFile);

            Image scaledImage = inputImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
            outputImage.getGraphics().drawImage(scaledImage, 0, 0, null);

            // Ambil path direktori dari file input
            String outputDirectory = inputFile.getParent();

            // Ubah nama file output untuk menyimpan gambar yang diubah ukurannya di direktori yang sama
            String outputImagePath = outputDirectory + File.separator + "resized_" + inputFile.getName();
            ImageIO.write(outputImage, "jpg", new File(outputImagePath));

            return outputImagePath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profileImageLabel = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblGambar = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setLayout(null);

        profileImageLabel.setBackground(new java.awt.Color(255, 255, 255));
        profileImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        profileImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileImageLabel.setText("Add Image");
        profileImageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileImageLabelMouseClicked(evt);
            }
        });
        add(profileImageLabel);
        profileImageLabel.setBounds(210, 430, 88, 16);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password :");
        add(lblPassword);
        lblPassword.setBounds(350, 320, 130, 30);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(670, 20, 72, 23);

        lblGambar.setMaximumSize(new java.awt.Dimension(200, 270));
        lblGambar.setMinimumSize(new java.awt.Dimension(200, 270));
        lblGambar.setPreferredSize(new java.awt.Dimension(200, 270));
        add(lblGambar);
        lblGambar.setBounds(97, 116, 200, 270);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name :");
        add(lblName);
        lblName.setBounds(380, 120, 110, 30);

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("Address :");
        add(lblAddress);
        lblAddress.setBounds(360, 170, 130, 30);

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhone.setText("Phone :");
        add(lblPhone);
        lblPhone.setBounds(360, 220, 140, 30);

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username :");
        add(lblUsername);
        lblUsername.setBounds(350, 270, 130, 30);

        btnEdit.setBackground(new java.awt.Color(122, 122, 122));
        btnEdit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 122, 122), 4, true));
        add(btnEdit);
        btnEdit.setBounds(470, 370, 90, 26);

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(txtName);
        txtName.setBounds(470, 120, 240, 30);

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(470, 170, 240, 30);

        txtPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(txtPhone);
        txtPhone.setBounds(470, 220, 240, 30);

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(txtUsername);
        txtUsername.setBounds(470, 270, 240, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(470, 320, 240, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bgProfile.png"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 750, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void profileImageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImageLabelMouseClicked
        // TODO add your handling code here:
        chooseProfileImage();
    }//GEN-LAST:event_profileImageLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel profileImageLabel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
