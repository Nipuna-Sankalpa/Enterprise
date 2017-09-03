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
import com.servicemaster.models.ServiceBay;
import com.servicemaster.utils.HibernateUtil;
import com.servicemaster.views.LocationView;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ruwan Madawala
 */
public class LocationFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Category
     */
    public LocationFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        txtLocationCode = new javax.swing.JTextField();
        txtLocationName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxIsActive = new javax.swing.JCheckBox();
        lblClose = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        lblReset = new javax.swing.JLabel();
        lblCodeSearch = new javax.swing.JLabel();
        lblNameSearch = new javax.swing.JLabel();

        setTitle("Locations");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Location code :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Location name :");

        txtLocationCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtLocationName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Remark :");

        txtRemark.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Is Active :");

        cbxIsActive.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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

        lblNameSearch.setBackground(new java.awt.Color(150, 255, 150));
        lblNameSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        lblNameSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblNameSearch.setOpaque(true);
        lblNameSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNameSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNameSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNameSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRemark))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxIsActive))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLocationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLocationCode, txtLocationName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClose, lblReset, lblSave});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCodeSearch, lblNameSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtLocationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCodeSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtLocationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNameSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
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

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxIsActive, jLabel1, jLabel2, jLabel3, jLabel4, lblCodeSearch, lblNameSearch, txtLocationCode, txtLocationName, txtRemark});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblClose, lblReset, lblSave});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        ConfirmationDialog.showMessageBox("Are you sure?", "Sure");
        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        if (txtLocationCode.getText().toUpperCase().trim().isEmpty()) {
            List locationByName = this.getLocationByName(txtLocationName.getText().toUpperCase().trim(), false);
            if (locationByName.size() > 0) {
                InformationDialog.showMessageBox("Item name already exists.", "Exist");
            } else {
                KeyCodeFunctions keyCodeFunctions = new KeyCodeFunctions();
                this.saveOrUpdateLocation(keyCodeFunctions.getKey("LOC", "Location"), false);
            }
        } else {
            List locationByCode = this.getLocationByCode(txtLocationCode.getText().toUpperCase().trim(), false);
            if (locationByCode.isEmpty()) {
                InformationDialog.showMessageBox("Invalid location code. Please try again", "Invalid");
            } else {
                ConfirmationDialog.showMessageBox("Do you want to update?", "Update");
                if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                    this.saveOrUpdateLocation(txtLocationCode.getText().toUpperCase().trim(), true);
                }
            }
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void saveOrUpdateLocation(String strLocationCode, boolean bUpdate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ServiceBay serviceBay = new ServiceBay();
        serviceBay.setServiceBayCode(strLocationCode);
        serviceBay.setServiceBayName(txtLocationName.getText().toUpperCase().trim());
        serviceBay.setRemark(txtRemark.getText().toUpperCase().trim());
        serviceBay.setIsActive(cbxIsActive.isSelected() ? 1 : 0);
        if (bUpdate) {
            serviceBay.setModifiedDate(new Date());
            serviceBay.setModifiedTime(new Date());
            serviceBay.setModifiedUser(MainFrame.user.getUserId());
        } else {
            serviceBay.setCreatedDate(new Date());
            serviceBay.setCreatedTime(new Date());
            serviceBay.setCreatedUser(MainFrame.user.getUserId());
        }
        session.saveOrUpdate(serviceBay);

        session.getTransaction().commit();
        session.close();

        if (bUpdate) {
            InformationDialog.showMessageBox("Successfully updated", "Success");
        } else {
            InformationDialog.showMessageBox("New entry created successfully", "Success");
        }
        this.clearAll();
    }

    private void lblResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseClicked
        this.clearAll();
    }//GEN-LAST:event_lblResetMouseClicked

    private void lblResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblResetMouseEntered

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblResetMouseExited

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblSaveMouseExited

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCodeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseClicked
        String locationCode = txtLocationCode.getText().trim();
        List locations = getLocationByCode(locationCode, true);

        if (!locations.isEmpty()) {
            LocationView locationView = new LocationView(locations, this);
            MainFrame.desktopPane.add(locationView);
            locationView.setVisible(true);
        }
    }//GEN-LAST:event_lblCodeSearchMouseClicked

    private void lblNameSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseClicked
        String locationName = txtLocationName.getText().trim();
        List locations = getLocationByName(locationName, true);

        if (locations.size() > 0) {
            LocationView locationView = new LocationView(locations, this);
            MainFrame.desktopPane.add(locationView);
            locationView.setVisible(true);
        }
    }//GEN-LAST:event_lblNameSearchMouseClicked

    private void lblCodeSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseEntered

    private void lblNameSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblNameSearchMouseEntered

    private void lblCodeSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseExited

    private void lblNameSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblNameSearchMouseExited
    
    private List getLocationByCode(String locationCode, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from ServiceBay s where s.serviceBayCode like :code");
            query.setParameter("code", "%" + locationCode + "%");
        } else {
            query = session.createQuery("from ServiceBay s where s.serviceBayCode = :code");
            query.setParameter("code", locationCode);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private List getLocationByName(String locationName, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from ServiceBay s where s.serviceBayName like :name");
            query.setParameter("name", "%" + locationName + "%");
        } else {
            query = session.createQuery("from ServiceBay s where s.serviceBayName = :name");
            query.setParameter("name", locationName);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private void clearAll() {
        txtLocationCode.setText("");
        txtLocationName.setText("");
        txtRemark.setText("");
        cbxIsActive.setSelected(false);
        txtLocationCode.setEditable(true);
    }

    public void setLocationCode(String categoryCode) {
        this.txtLocationCode.setText(categoryCode);
    }

    public void setLocationName(String categoryName) {
        this.txtLocationName.setText(categoryName);
    }

    public void setRemark(String remark) {
        this.txtRemark.setText(remark);
    }

    public void setIsActive(boolean IsActive) {
        this.cbxIsActive.setSelected(IsActive);
    }

    public void setLocationCodeEditable(boolean editable) {
        txtLocationCode.setEditable(editable);
    }

    public void setLblSaveText(String text) {
        this.lblSave.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCodeSearch;
    private javax.swing.JLabel lblNameSearch;
    private javax.swing.JLabel lblReset;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextField txtLocationCode;
    private javax.swing.JTextField txtLocationName;
    private javax.swing.JTextField txtRemark;
    // End of variables declaration//GEN-END:variables
}
