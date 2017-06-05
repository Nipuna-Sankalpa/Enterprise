/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicemaster.forms;

import com.servicemaster.data.SystemData;
import com.servicemaster.dialogs.ConfirmationDialog;
import com.servicemaster.dialogs.InformationDialog;
import com.servicemaster.guiFunctions.LableFunctions;
import com.servicemaster.internalFrames.BusinessPatnerFrame;
import com.servicemaster.internalFrames.CategoryFrame;
import com.servicemaster.internalFrames.ItemFrame;
import com.servicemaster.internalFrames.LocationFrame;
import com.servicemaster.internalFrames.PrinterFrame;
import com.servicemaster.internalFrames.RackSlotFrame;
import com.servicemaster.internalFrames.RacksFrame;
import com.servicemaster.internalFrames.ShortCutsFrame;
import com.servicemaster.internalFrames.StorageFrame;
import com.servicemaster.internalFrames.SubCategoryFrame;
import com.servicemaster.internalFrames.SubCategoryTypeFrame;
import com.servicemaster.internalFrames.VehicleFrame;
import com.servicemaster.internalFrames.VehicleTypeFrame;
import com.servicemaster.models.Module;
import com.servicemaster.models.User;
import com.servicemaster.utils.HibernateUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ruwan Madawala
 */
public class MainFrame extends javax.swing.JFrame {

    public static User user;

    /**
     * Creates new form MainFrame
     *
     * @param user
     */
    public MainFrame(User user) {
        initComponents();
        MainFrame.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon("images\\background.jpg");
            Image image = icon.getImage();

            Image newimage = image.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(newimage, 0, 0, this);
            }
        };
        panelShortcuts = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        mMasterFiles = new javax.swing.JMenu();
        mStorage = new javax.swing.JMenu();
        miStorage = new javax.swing.JMenuItem();
        miStorageRacks = new javax.swing.JMenuItem();
        miRackSlots = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miLocations = new javax.swing.JMenuItem();
        miPrinters = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miCategory = new javax.swing.JMenuItem();
        miSubCategoryType = new javax.swing.JMenuItem();
        miSubCategory = new javax.swing.JMenuItem();
        miItems = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miBusinessPartner = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        miVehileType = new javax.swing.JMenuItem();
        miVehicles = new javax.swing.JMenuItem();
        js1 = new javax.swing.JPopupMenu.Separator();
        miUsers = new javax.swing.JMenuItem();
        miUserPrivilages = new javax.swing.JMenuItem();
        js2 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        mTransactions = new javax.swing.JMenu();
        mReports = new javax.swing.JMenu();
        mOptions = new javax.swing.JMenu();
        miAddShortcuts = new javax.swing.JMenuItem();
        miChangeBackground = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Enterprise");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        panelShortcuts.setOpaque(false);
        panelShortcuts.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 4));

        desktopPane.setLayer(panelShortcuts, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panelShortcuts, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShortcuts, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        mFile.setText("File");
        mFile.setEnabled(false);
        mFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFileActionPerformed(evt);
            }
        });

        mMasterFiles.setText("Master Files");
        mMasterFiles.setEnabled(false);

        mStorage.setText("Storage");
        mStorage.setEnabled(false);

        miStorage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miStorage.setText("Storage");
        miStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStorageActionPerformed(evt);
            }
        });
        mStorage.add(miStorage);

        miStorageRacks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miStorageRacks.setText("Storage Racks");
        miStorageRacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStorageRacksActionPerformed(evt);
            }
        });
        mStorage.add(miStorageRacks);

        miRackSlots.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miRackSlots.setText("Rack Slots");
        miRackSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRackSlotsActionPerformed(evt);
            }
        });
        mStorage.add(miRackSlots);

        mMasterFiles.add(mStorage);
        mMasterFiles.add(jSeparator1);

        miLocations.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miLocations.setText("Locations");
        miLocations.setEnabled(false);
        miLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLocationsActionPerformed(evt);
            }
        });
        mMasterFiles.add(miLocations);

        miPrinters.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miPrinters.setText("Printers");
        miPrinters.setEnabled(false);
        miPrinters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPrintersActionPerformed(evt);
            }
        });
        mMasterFiles.add(miPrinters);
        mMasterFiles.add(jSeparator2);

        miCategory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miCategory.setText("Category");
        miCategory.setEnabled(false);
        miCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCategoryActionPerformed(evt);
            }
        });
        mMasterFiles.add(miCategory);

        miSubCategoryType.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miSubCategoryType.setText("Sub Category Type");
        miSubCategoryType.setEnabled(false);
        miSubCategoryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSubCategoryTypeActionPerformed(evt);
            }
        });
        mMasterFiles.add(miSubCategoryType);

        miSubCategory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miSubCategory.setText("Sub Category");
        miSubCategory.setEnabled(false);
        miSubCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSubCategoryActionPerformed(evt);
            }
        });
        mMasterFiles.add(miSubCategory);

        miItems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miItems.setText("Items");
        miItems.setEnabled(false);
        mMasterFiles.add(miItems);
        mMasterFiles.add(jSeparator3);

        miBusinessPartner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miBusinessPartner.setText("Business Partner");
        miBusinessPartner.setEnabled(false);
        miBusinessPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBusinessPartnerActionPerformed(evt);
            }
        });
        mMasterFiles.add(miBusinessPartner);
        mMasterFiles.add(jSeparator4);

        miVehileType.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miVehileType.setText("Vehicle Type");
        miVehileType.setEnabled(false);
        miVehileType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVehileTypeActionPerformed(evt);
            }
        });
        mMasterFiles.add(miVehileType);

        miVehicles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miVehicles.setText("Vehicles");
        miVehicles.setEnabled(false);
        miVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVehiclesActionPerformed(evt);
            }
        });
        mMasterFiles.add(miVehicles);

        mFile.add(mMasterFiles);
        mFile.add(js1);

        miUsers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miUsers.setText("Users");
        miUsers.setEnabled(false);
        mFile.add(miUsers);

        miUserPrivilages.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miUserPrivilages.setText("User Privilages");
        miUserPrivilages.setEnabled(false);
        mFile.add(miUserPrivilages);
        mFile.add(js2);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        mFile.add(miExit);

        menuBar.add(mFile);

        mTransactions.setText("Transactions");
        mTransactions.setEnabled(false);
        menuBar.add(mTransactions);

        mReports.setText("Reports");
        mReports.setEnabled(false);
        menuBar.add(mReports);

        mOptions.setText("Options");
        mOptions.setEnabled(false);

        miAddShortcuts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miAddShortcuts.setText("Add Shortcuts");
        miAddShortcuts.setEnabled(false);
        miAddShortcuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddShortcutsActionPerformed(evt);
            }
        });
        mOptions.add(miAddShortcuts);

        miChangeBackground.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        miChangeBackground.setText("Change background");
        miChangeBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangeBackgroundActionPerformed(evt);
            }
        });
        mOptions.add(miChangeBackground);

        menuBar.add(mOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        setSize(new java.awt.Dimension(616, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        this.exitApllication();
    }//GEN-LAST:event_miExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("from Module m order by m.moduleId");
        List objectList = query.list();
        for (Object object : objectList) {
            if (object instanceof Module) {
                Module module = (Module) object;
                String moduleCode = module.getModuleCode();
                String moduleName = module.getModuleName();
                allModuleMap.put(moduleName, moduleCode);
            }
        }

        query = session.createQuery("from Module m where m.isShortcutAdded = 0 order by m.moduleId");
        objectList = query.list();
        for (Object object : objectList) {
            if (object instanceof Module) {
                Module module = (Module) object;
                String moduleCode = module.getModuleCode();
                String moduleName = module.getModuleName();
                availableModuleMap.put(moduleName, moduleCode);
            }
        }

        query = session.createQuery("from Module m where m.isShortcutAdded = 1 order by m.moduleId");
        objectList = query.list();
        for (Object object : objectList) {
            if (object instanceof Module) {
                Module module = (Module) object;
                String moduleCode = module.getModuleCode();
                String moduleName = module.getModuleName();
                addedModuleMap.put(moduleName, moduleCode);
            }
        }
        session.getTransaction().commit();
        session.close();

        if (!addedModuleMap.isEmpty()) {
            Set<String> keySet = addedModuleMap.keySet();
            for (String key : keySet) {
                this.addShortCuts(key);
            }

            this.panelShortcuts.revalidate();
            this.panelShortcuts.repaint();
        }
    }//GEN-LAST:event_formWindowOpened

    private void miAddShortcutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddShortcutsActionPerformed
        ShortCutsFrame shortCuts = new ShortCutsFrame(this);
        shortCuts.setLocation(300, 0);
        desktopPane.add(shortCuts);
        shortCuts.setVisible(true);
    }//GEN-LAST:event_miAddShortcutsActionPerformed

    private void miChangeBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangeBackgroundActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.OPEN_DIALOG) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                Path path = Paths.get("images");
                Files.copy(new FileInputStream(selectedFile), path, StandardCopyOption.REPLACE_EXISTING);
                InformationDialog.showMessageBox("Please restart the application", "Restart");
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_miChangeBackgroundActionPerformed

    private void mFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFileActionPerformed
        this.exitApllication();
    }//GEN-LAST:event_mFileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.exitApllication();
    }//GEN-LAST:event_formWindowClosing

    private void miCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCategoryActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miCategoryActionPerformed

    private void miSubCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSubCategoryActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miSubCategoryActionPerformed

    private void miLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLocationsActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miLocationsActionPerformed

    private void miStorageRacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStorageRacksActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miStorageRacksActionPerformed

    private void miStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStorageActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miStorageActionPerformed

    private void miRackSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRackSlotsActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miRackSlotsActionPerformed

    private void miPrintersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPrintersActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miPrintersActionPerformed

    private void miSubCategoryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSubCategoryTypeActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miSubCategoryTypeActionPerformed

    private void miBusinessPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBusinessPartnerActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miBusinessPartnerActionPerformed

    private void miVehileTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVehileTypeActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miVehileTypeActionPerformed

    private void miVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVehiclesActionPerformed
        MainFrame.openWindow(MainFrame.allModuleMap.get(evt.getActionCommand()));
    }//GEN-LAST:event_miVehiclesActionPerformed

    private void exitApllication() {
        ConfirmationDialog.showMessageBox("Are you sure?", "Sure");
        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void openWindow(String moduleCode) {
        JInternalFrame internalFrame = null;
        switch (moduleCode) {
            case "1": {
                break;
            }
            case "2": {
                break;
            }
            case "3": {
                internalFrame = new StorageFrame();
                break;
            }
            case "4": {
                internalFrame = new RacksFrame();
                break;
            }
            case "5": {
                internalFrame = new RackSlotFrame();
                break;
            }
            case "6": {
                internalFrame = new LocationFrame();
                break;
            }
            case "7": {
                internalFrame = new CategoryFrame();
                break;
            }
            case "8": {
                internalFrame = new SubCategoryTypeFrame();
                break;
            }
            case "9": {
                internalFrame = new SubCategoryFrame();
                break;
            }
            case "10": {
                internalFrame = new ItemFrame();
                break;
            }
            case "11": {
                internalFrame = new BusinessPatnerFrame();
                break;
            }
            case "12": {
                internalFrame = new PrinterFrame();
                break;
            }
            case "13": {
                internalFrame = new VehicleTypeFrame();
                break;
            }
            case "14": {
                internalFrame = new VehicleFrame();
                break;
            }
            case "15": {
                break;
            }
            default: {
                internalFrame = null;
            }
        }

        if (internalFrame != null) {
            desktopPane.add(internalFrame);
            internalFrame.setVisible(true);
        }
    }

    public void addShortCuts(String name) {
        JLabel label = new JLabel(name);
        label.setName(name);
        label.setOpaque(true);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                MainFrame.openWindow(MainFrame.allModuleMap.get(((JLabel) event.getSource()).getName().trim()));
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                LableFunctions.changeBackgroundColor(event.getSource(), SystemData.MOUSE_ENTER_COLOR);
            }

            @Override
            public void mouseExited(MouseEvent event) {
                LableFunctions.changeBackgroundColor(event.getSource(), SystemData.MOUSE_EXIT_COLOR);
            }
        });
        label.setPreferredSize(new Dimension(150, 50));
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBackground(new Color(150, 255, 150));
        label.setBorder(new MatteBorder(1, 1, 1, 1, new Color(50, 255, 50)));
        this.panelShortcuts.add(label);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator js1;
    private javax.swing.JPopupMenu.Separator js2;
    public javax.swing.JMenu mFile;
    public javax.swing.JMenu mMasterFiles;
    public javax.swing.JMenu mOptions;
    public javax.swing.JMenu mReports;
    public javax.swing.JMenu mStorage;
    public javax.swing.JMenu mTransactions;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JMenuItem miAddShortcuts;
    public javax.swing.JMenuItem miBusinessPartner;
    public javax.swing.JMenuItem miCategory;
    private javax.swing.JMenuItem miChangeBackground;
    private javax.swing.JMenuItem miExit;
    public javax.swing.JMenuItem miItems;
    public javax.swing.JMenuItem miLocations;
    public javax.swing.JMenuItem miPrinters;
    private javax.swing.JMenuItem miRackSlots;
    private javax.swing.JMenuItem miStorage;
    private javax.swing.JMenuItem miStorageRacks;
    public javax.swing.JMenuItem miSubCategory;
    public javax.swing.JMenuItem miSubCategoryType;
    public javax.swing.JMenuItem miUserPrivilages;
    public javax.swing.JMenuItem miUsers;
    public javax.swing.JMenuItem miVehicles;
    public javax.swing.JMenuItem miVehileType;
    public javax.swing.JPanel panelShortcuts;
    // End of variables declaration//GEN-END:variables
    public static final LinkedHashMap<String, String> allModuleMap = new LinkedHashMap<>();
    public static final LinkedHashMap<String, String> availableModuleMap = new LinkedHashMap<>();
    public static final LinkedHashMap<String, String> addedModuleMap = new LinkedHashMap<>();
}
