/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicemaster.internalFrames;

import com.servicemaster.data.SystemData;
import com.servicemaster.dialogs.ConfirmationDialog;
import com.servicemaster.dialogs.InformationDialog;
import com.servicemaster.forms.MainFrame;
import com.servicemaster.functions.KeyCodeFunctions;
import com.servicemaster.guiFunctions.LableFunctions;
import com.servicemaster.models.BusinessPartner;
import com.servicemaster.models.Vehicle;
import com.servicemaster.models.VehicleType;
import com.servicemaster.utils.HibernateUtil;
import com.servicemaster.views.VehicleView;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class VehicleFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form VehicleFrame
     */
    public VehicleFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lblNumberSearch = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yManufactureYear = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        cmbVehicleType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxIsActive = new javax.swing.JCheckBox();
        lblClose = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVehicleCode = new javax.swing.JTextField();
        lblCodeSearch = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbBusinessPatner = new javax.swing.JComboBox<>();
        lblNewBusinessPatner = new javax.swing.JLabel();
        lblBusinessPatnerRefresh = new javax.swing.JLabel();

        setTitle("Vehicle");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Vehicle number :");

        txtVehicleNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblNumberSearch.setBackground(new java.awt.Color(150, 255, 150));
        lblNumberSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumberSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        lblNumberSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblNumberSearch.setOpaque(true);
        lblNumberSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNumberSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNumberSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNumberSearchMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Manuf. year :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Vehicle type :");

        cmbVehicleType.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cmbVehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Is Active :");

        cbxIsActive.setSelected(true);

        lblClose.setBackground(new java.awt.Color(150, 255, 150));
        lblClose.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("Close");
        lblClose.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblClose.setOpaque(true);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        lblSave.setBackground(new java.awt.Color(150, 255, 150));
        lblSave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("Save");
        lblSave.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblSave.setOpaque(true);
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSaveMouseExited(evt);
            }
        });

        lblReset.setBackground(new java.awt.Color(150, 255, 150));
        lblReset.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReset.setText("Reset");
        lblReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblReset.setOpaque(true);
        lblReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResetMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Remark :");

        txtRemark.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Vehicle code :");

        txtVehicleCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblCodeSearch.setBackground(new java.awt.Color(150, 255, 150));
        lblCodeSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        lblCodeSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblCodeSearch.setOpaque(true);
        lblCodeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCodeSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCodeSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCodeSearchMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Bus. Patner :");

        cmbBusinessPatner.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cmbBusinessPatner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));

        lblNewBusinessPatner.setBackground(new java.awt.Color(150, 255, 150));
        lblNewBusinessPatner.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblNewBusinessPatner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewBusinessPatner.setText("New");
        lblNewBusinessPatner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblNewBusinessPatner.setOpaque(true);
        lblNewBusinessPatner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewBusinessPatnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNewBusinessPatnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNewBusinessPatnerMouseExited(evt);
            }
        });

        lblBusinessPatnerRefresh.setBackground(new java.awt.Color(150, 255, 150));
        lblBusinessPatnerRefresh.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblBusinessPatnerRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusinessPatnerRefresh.setText("Refresh");
        lblBusinessPatnerRefresh.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblBusinessPatnerRefresh.setOpaque(true);
        lblBusinessPatnerRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBusinessPatnerRefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBusinessPatnerRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBusinessPatnerRefreshMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRemark))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVehicleCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxIsActive))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                        .addComponent(cmbBusinessPatner, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbVehicleType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNewBusinessPatner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBusinessPatnerRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumberSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClose, lblReset, lblSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodeSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtVehicleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumberSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(yManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNewBusinessPatner)
                        .addComponent(lblBusinessPatnerRefresh))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cmbBusinessPatner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxIsActive))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxIsActive, cmbBusinessPatner, cmbVehicleType, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lblBusinessPatnerRefresh, lblCodeSearch, lblNewBusinessPatner, lblNumberSearch, txtRemark, txtVehicleCode, txtVehicleNumber, yManufactureYear});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblClose, lblReset, lblSave});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNumberSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumberSearchMouseClicked
        String vehicleNumber = txtVehicleNumber.getText().trim();

        List vehicles = this.getVehicleByNumber(vehicleNumber, true);
        if (!vehicles.isEmpty()) {
            VehicleView vehicleView = new VehicleView(vehicles, this);
            MainFrame.desktopPane.add(vehicleView);
            vehicleView.setVisible(true);
        }
    }//GEN-LAST:event_lblNumberSearchMouseClicked

    private void lblNumberSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumberSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblNumberSearchMouseEntered

    private void lblNumberSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNumberSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblNumberSearchMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        ConfirmationDialog.showMessageBox("Are you sure?", "Sure");
        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        if (txtVehicleCode.getText().toUpperCase().trim().isEmpty()) {
            List vehicles = this.getVehicleByNumber(txtVehicleNumber.getText().toUpperCase().trim(), false);
            if (!vehicles.isEmpty()) {
                InformationDialog.showMessageBox("Vehicle number already exists.", "Exist");
            } else {
                if (((String) cmbVehicleType.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)
                        || ((String) cmbBusinessPatner.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)) {
                    InformationDialog.showMessageBox("Please select a valid vehicle type and business patner", "Invalid");
                } else {
                    KeyCodeFunctions keyCodeFunctions = new KeyCodeFunctions();
                    this.saveOrUpdateVehicle(keyCodeFunctions.getKey("VEH", "Vehivle"), false);
                }
            }
        } else {
            List vehicles = this.getVehicleByCode(txtVehicleCode.getText().toUpperCase().trim(), false);
            if (vehicles.isEmpty()) {
                InformationDialog.showMessageBox("Invalid vehicle code. Please try again", "Invalid");
            } else {
                ConfirmationDialog.showMessageBox("Do you want to update?", "Update");
                if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                    if (((String) cmbVehicleType.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)
                            || ((String) cmbBusinessPatner.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)) {
                        InformationDialog.showMessageBox("Please select a valid vehicle type and business patner", "Invalid");
                    } else {
                        this.saveOrUpdateVehicle(txtVehicleCode.getText().toUpperCase().trim(), true);
                    }
                }
            }
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblSaveMouseExited

    private void lblResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseClicked
        this.clearAll();
    }//GEN-LAST:event_lblResetMouseClicked

    private void lblResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblResetMouseEntered

    private void lblResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblResetMouseExited

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        this.loadVehicleType(session);
        this.loadBusinessPartner(session);

        session.getTransaction().commit();
        session.close();
    }//GEN-LAST:event_formInternalFrameOpened

    private void lblCodeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseClicked
        String vehicleCode = txtVehicleCode.getText().trim();

        List vehicles = this.getVehicleByCode(vehicleCode, true);
        if (!vehicles.isEmpty()) {
            VehicleView vehicleView = new VehicleView(vehicles, this);
            MainFrame.desktopPane.add(vehicleView);
            vehicleView.setVisible(true);
        }
    }//GEN-LAST:event_lblCodeSearchMouseClicked

    private void lblCodeSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseEntered

    private void lblCodeSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseExited

    private void lblNewBusinessPatnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewBusinessPatnerMouseClicked
        BusinessPartnerFrame partnerFrame = new BusinessPartnerFrame();
        MainFrame.desktopPane.add(partnerFrame);
        partnerFrame.setVisible(true);
    }//GEN-LAST:event_lblNewBusinessPatnerMouseClicked

    private void lblNewBusinessPatnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewBusinessPatnerMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblNewBusinessPatnerMouseEntered

    private void lblNewBusinessPatnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewBusinessPatnerMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblNewBusinessPatnerMouseExited

    private void lblBusinessPatnerRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusinessPatnerRefreshMouseClicked
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        this.loadBusinessPartner(session);
        session.close();
    }//GEN-LAST:event_lblBusinessPatnerRefreshMouseClicked

    private void lblBusinessPatnerRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusinessPatnerRefreshMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblBusinessPatnerRefreshMouseEntered

    private void lblBusinessPatnerRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusinessPatnerRefreshMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblBusinessPatnerRefreshMouseExited

    private List getVehicleByCode(String vehicleCode, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Vehicle v join fetch v.vehicleType where v.vehicleCode like :code");
            query.setParameter("code", "%" + vehicleCode + "%");
        } else {
            query = session.createQuery("from Vehicle v join fetch v.vehicleType where v.vehicleCode = :code");
            query.setParameter("code", vehicleCode);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private List getVehicleByNumber(String vehicleNumber, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Vehicle v join fetch v.vehicleType where v.vehicleNumber like :code");
            query.setParameter("code", "%" + vehicleNumber + "%");
        } else {
            query = session.createQuery("from Vehicle v join fetch v.vehicleType where v.vehicleNumber = :code");
            query.setParameter("code", vehicleNumber);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    public void setVehicleCode(String vehicleCode) {
        this.txtVehicleCode.setText(vehicleCode);
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.txtVehicleNumber.setText(vehicleNumber);
    }

    public void setManufacturedYear(String manufactureYear) {
        this.yManufactureYear.setYear(Integer.parseInt(manufactureYear));
    }

    public void setVehicleType(String vehicleType) {
        VehicleType vType = this.vehicleTypeMap.get(vehicleType);
        this.cmbVehicleType.setSelectedItem(vType.getVehicleTypeCode() + "-" + vType.getVehicleTypeName());
    }

    public void setBusinessPatner(String businessPatner) {
        BusinessPartner bPatner = this.businessPatnerMap.get(businessPatner);
        this.cmbBusinessPatner.setSelectedItem(bPatner.getBusinessPartnerCode() + "-" + bPatner.getFirstName() + " " + bPatner.getLastName());
    }

    public void setRemark(String remark) {
        this.txtRemark.setText(remark);
    }

    public void setIsActive(boolean isActive) {
        this.cbxIsActive.setSelected(isActive);
    }

    public void setVehicleodeEditable(boolean editable) {
        txtVehicleNumber.setEditable(editable);
    }

    public void setLblSaveText(String text) {
        this.lblSave.setText(text);
    }

    private void clearAll() {
        txtVehicleCode.setText("");
        txtVehicleNumber.setText("");
        yManufactureYear.setYear(Calendar.getInstance().get(Calendar.YEAR));
        txtRemark.setText("");
        cbxIsActive.setSelected(false);
        txtVehicleNumber.setEditable(true);
        cmbVehicleType.setSelectedIndex(0);
        cmbBusinessPatner.setSelectedIndex(0);
    }

    private void saveOrUpdateVehicle(String strVehicleCode, boolean bUpdate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        VehicleType vehicleType = (VehicleType) session.createCriteria(VehicleType.class)
                .add(Restrictions.eq("vehicleTypeName", ((String) cmbVehicleType.getSelectedItem()).trim()))
                .uniqueResult();

        BusinessPartner businessPartner = (BusinessPartner) session.createCriteria(VehicleType.class)
                .add(Restrictions.eq("businessPartnerCode", ((String) cmbBusinessPatner.getSelectedItem()).split("-")[0].trim()))
                .uniqueResult();

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleCode(strVehicleCode);
        vehicle.setVehicleNumber(txtVehicleNumber.getText().toUpperCase().trim());
        vehicle.setManufactureredYear("" + yManufactureYear.getYear());
        vehicle.setVehicleType(vehicleType);
        vehicle.setBusinessPartner(businessPartner);
        vehicle.setRemark(txtRemark.getText().toUpperCase().trim());
        vehicle.setIsActive(cbxIsActive.isSelected() ? 1 : 0);
        if (bUpdate) {
            vehicle.setModifiedDate(new Date());
            vehicle.setModifiedTime(new Date());
            vehicle.setModifiedUser(MainFrame.user.getUserId());
        } else {
            vehicle.setCreatedDate(new Date());
            vehicle.setCreatedTime(new Date());
            vehicle.setCreatedUser(MainFrame.user.getUserId());
        }
        session.saveOrUpdate(vehicle);

        session.getTransaction().commit();
        session.close();

        if (bUpdate) {
            InformationDialog.showMessageBox("Successfully updated", "Success");
        } else {
            InformationDialog.showMessageBox("New entry created successfully", "Success");
        }
        this.clearAll();
    }

    private void loadBusinessPartner(Session session) {
        Query query = session.createQuery("from BusinessPartner b order by b.businessPartnerCode");
        List list = query.list();
        if (!list.isEmpty()) {
            cmbBusinessPatner.removeAllItems();
            for (Object object : list) {
                if (object instanceof BusinessPartner) {
                    BusinessPartner businessPartner = (BusinessPartner) object;
                    String businessPartnerCode = businessPartner.getBusinessPartnerCode();
                    String businessPartnerName = businessPartner.getFirstName() + " " + businessPartner.getLastName();
                    cmbBusinessPatner.addItem(businessPartnerCode + "-" + businessPartnerName);
                    this.businessPatnerMap.put(businessPartnerCode, businessPartner);
                }
            }
        }
    }

    private void loadVehicleType(Session session) {
        Query query = session.createQuery("from VehicleType v order by v.vehicleTypeCode");
        List list = query.list();
        if (!list.isEmpty()) {
            for (Object object : list) {
                if (object instanceof VehicleType) {
                    VehicleType vehicleType = (VehicleType) object;
                    String vehicleTypeName = vehicleType.getVehicleTypeName();
                    String vehicleTypeCode = vehicleType.getVehicleTypeCode();
                    cmbVehicleType.addItem(vehicleTypeCode + "-" + vehicleTypeName);
                    this.vehicleTypeMap.put(vehicleTypeCode, vehicleType);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxIsActive;
    private javax.swing.JComboBox<String> cmbBusinessPatner;
    private javax.swing.JComboBox<String> cmbVehicleType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBusinessPatnerRefresh;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCodeSearch;
    private javax.swing.JLabel lblNewBusinessPatner;
    private javax.swing.JLabel lblNumberSearch;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtVehicleCode;
    private javax.swing.JTextField txtVehicleNumber;
    private com.toedter.calendar.JYearChooser yManufactureYear;
    // End of variables declaration//GEN-END:variables
    private final TreeMap<String, VehicleType> vehicleTypeMap = new TreeMap<>();
    private final TreeMap<String, BusinessPartner> businessPatnerMap = new TreeMap<>();
}
