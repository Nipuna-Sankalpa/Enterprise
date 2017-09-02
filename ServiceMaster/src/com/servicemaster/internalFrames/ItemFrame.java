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
import com.servicemaster.models.Item;
import com.servicemaster.models.Manufacturer;
import com.servicemaster.models.RackSlot;
import com.servicemaster.models.SubCategory;
import com.servicemaster.models.Uom;
import com.servicemaster.utils.HibernateUtil;
import com.servicemaster.views.ItemView;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Neyomal
 */
public class ItemFrame extends javax.swing.JInternalFrame {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    /**
     * Creates new form ItemFrame
     */
    public ItemFrame() {
        initComponents();

        //Setting default values 
        txtIssueMethod.setText("1");
        cbxIsPhysical.setSelected(true);
        cbxIsActive.setSelected(true);
        //txtModTime.setText("12:00:00");

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
        txtItemCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtSellingProce = new javax.swing.JTextField();
        txtIssueMethod = new javax.swing.JTextField();
        txtReorderQuantity = new javax.swing.JTextField();
        cbxIsPhysical = new javax.swing.JCheckBox();
        cbxIsActive = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbSubCategory = new javax.swing.JComboBox<>();
        cmbRackSlot = new javax.swing.JComboBox<>();
        cmbBuyingUOM = new javax.swing.JComboBox<>();
        cmbSellingUOM = new javax.swing.JComboBox<>();
        txtRemarks = new javax.swing.JTextField();
        lblCodeSearch = new javax.swing.JLabel();
        lblNameSearch = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbManufacturer = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Add New Item");
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
        jLabel1.setText("Item Code :");

        txtItemCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Item Name :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Selling Price :");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Issue Method :");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Reorder Quantity :");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Is physical :");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Is Active :");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel14.setText("Remarks :");

        txtItemName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtSellingProce.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtIssueMethod.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtReorderQuantity.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setText("Sub category :");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel16.setText("Rack Slot :");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel17.setText("Buying UOM :");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel18.setText("Selling UOM :");

        txtRemarks.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

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

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel19.setText("Manufacturer :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReorderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxIsActive)
                                    .addComponent(cbxIsPhysical)
                                    .addComponent(txtIssueMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSellingProce, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSellingUOM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBuyingUOM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRackSlot, 0, 111, Short.MAX_VALUE)
                            .addComponent(cmbSubCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbBuyingUOM, cmbManufacturer, cmbRackSlot, cmbSellingUOM, cmbSubCategory, txtIssueMethod, txtRemarks, txtReorderQuantity, txtSellingProce});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCodeSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSellingProce, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIssueMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReorderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIsPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbRackSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBuyingUOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSellingUOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxIsActive, cbxIsPhysical, cmbBuyingUOM, cmbManufacturer, cmbRackSlot, cmbSellingUOM, cmbSubCategory, jLabel1, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, lblCodeSearch, lblNameSearch, txtIssueMethod, txtItemCode, txtItemName, txtReorderQuantity, txtSellingProce});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCodeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseClicked
        String itemCode = txtItemCode.getText().trim();
        List items = getItemByCode(itemCode, true);

        if (!items.isEmpty()) {
            ItemView itemView = new ItemView(items, this);
            MainFrame.desktopPane.add(itemView);
            itemView.setVisible(true);
        }
    }//GEN-LAST:event_lblCodeSearchMouseClicked

    private void lblCodeSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseEntered

    private void lblCodeSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCodeSearchMouseExited

    private void lblNameSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseClicked
        String itemName = txtItemName.getText().trim();
        List items = getItemByName(itemName, true);

        if (items.size() > 0) {
            ItemView itemView = new ItemView(items, this);
            MainFrame.desktopPane.add(itemView);
            itemView.setVisible(true);
        }
    }//GEN-LAST:event_lblNameSearchMouseClicked

    private void lblNameSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblNameSearchMouseEntered

    private void lblNameSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblNameSearchMouseExited

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
        if (!verifyInputs()) {
            InformationDialog.showMessageBox("Fill the required fields", "Transaction Incomplete");
        } else {
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();

                String strItemCode = txtItemCode.getText().trim().toUpperCase();
                String strItemName = txtItemName.getText().trim().toUpperCase();

                if (strItemCode.isEmpty()) {
                    List itemByName = this.getItemByName(strItemName, false);
                    if (!itemByName.isEmpty()) {
                        InformationDialog.showMessageBox("Item name already exists.", "Exist");
                    } else {
                        KeyCodeFunctions keyCodeFunctions = new KeyCodeFunctions();
                        strItemCode = keyCodeFunctions.getKey("ITM", "Item codes");
                        this.createNewItemOrUpdate(strItemCode, false);
                    }
                } else {
                    List itemByCode = this.getItemByCode(strItemCode, false);
                    if (itemByCode.isEmpty()) {
                        ConfirmationDialog.showMessageBox("Item does not exist. Create new?", "New");
                        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                            session.getTransaction().commit();
                            session.close();

                            KeyCodeFunctions keyCodeFunctions = new KeyCodeFunctions();
                            strItemCode = keyCodeFunctions.getKey("ITM", "Item codes");
                            this.createNewItemOrUpdate(strItemCode, false);
                        }
                    } else {
                        ConfirmationDialog.showMessageBox("Do you want to update?", "Update");
                        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                            this.createNewItemOrUpdate(strItemCode, true);
                        }
                    }
                }
            } catch (Exception e) {
                InformationDialog.showMessageBox("Invalid entry. Retry again", "Transaction Status");
            }
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblSaveMouseExited

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria manufactrerCriteria = session.createCriteria(Manufacturer.class);
        List<Manufacturer> manufacturers = manufactrerCriteria.list();
        for (Manufacturer manufacturer : manufacturers) {
            cmbManufacturer.addItem(manufacturer.getManufacturerName());
        }

        Criteria subCategoryCriteria = session.createCriteria(SubCategory.class);
        List<SubCategory> subCategorys = subCategoryCriteria.list();
        for (SubCategory subCategory : subCategorys) {
            cmbSubCategory.addItem(subCategory.getSubCategoryName());
        }

        Criteria rackSlotCriteria = session.createCriteria(RackSlot.class);
        List<RackSlot> rackSlots = rackSlotCriteria.list();
        for (RackSlot rackSlot : rackSlots) {
            cmbRackSlot.addItem(rackSlot.getRackSlotName());
        }

        Criteria uomCriteria = session.createCriteria(Uom.class);
        List<Uom> uoms = uomCriteria.list();
        for (Uom uom : uoms) {
            cmbBuyingUOM.addItem(uom.getUomName());
            cmbSellingUOM.addItem(uom.getUomName());
        }

        transaction.commit();
        session.close();
    }//GEN-LAST:event_formInternalFrameOpened

    public void clearAll() {
        this.setItemCodeEditable(true);
        txtItemCode.setText("");
        txtItemName.setText("");
        txtSellingProce.setText("");
        txtReorderQuantity.setText("");
        txtRemarks.setText("");

        cmbManufacturer.setSelectedIndex(0);
        cmbSubCategory.setSelectedIndex(0);
        cmbRackSlot.setSelectedIndex(0);
        cmbBuyingUOM.setSelectedIndex(0);
        cmbSellingUOM.setSelectedIndex(0);
    }

    public boolean verifyInputs() {
        return !((txtItemName.getText().isEmpty())
                || (txtSellingProce.getText().isEmpty())
                || (txtReorderQuantity.getText().isEmpty()));
    }

    private List getItemByCode(String itemCode, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Item i where i.itemCode like :code");
            query.setParameter("code", "%" + itemCode + "%");
        } else {
            query = session.createQuery("from Item i where i.itemCode = :code");
            query.setParameter("code", itemCode);
        }
        List list = query.list();

        session.getTransaction().commit();
        session.close();
        return list;
    }

    private List getItemByName(String itemName, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Item i where i.itemName like :name");
            query.setParameter("name", "%" + itemName + "%");
        } else {
            query = session.createQuery("from Item i where i.itemName = :name");
            query.setParameter("name", itemName);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private void createNewItemOrUpdate(String strItemCode, boolean update) {
        String strItemName = txtItemName.getText().trim().toUpperCase();
        String strSellingPrice = txtSellingProce.getText().trim();
        String strIssueMethod = txtIssueMethod.getText().trim();
        String strReOrderQty = txtReorderQuantity.getText().trim();
        Boolean bIsPhy = cbxIsPhysical.isSelected();
        Boolean bIsActive = cbxIsActive.isSelected();
        String strRemarks = txtRemarks.getText().trim().toUpperCase();
        String strManufacturer = cmbManufacturer.getSelectedItem().toString();
        String strSubCat = cmbSubCategory.getSelectedItem().toString();
        String strRackSlot = cmbRackSlot.getSelectedItem().toString();
        String strBuyUOM = cmbBuyingUOM.getSelectedItem().toString();
        String strSellUOM = cmbSellingUOM.getSelectedItem().toString();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Date date = new Date();

        Manufacturer manufacturer = (Manufacturer) session
                .createCriteria(Manufacturer.class)
                .add(Restrictions.eq("manufacturerName", strManufacturer))
                .uniqueResult();

        SubCategory subCategory = (SubCategory) session
                .createCriteria(SubCategory.class)
                .add(Restrictions.eq("subCategoryName", strSubCat))
                .uniqueResult();
        //txtItemCode.setText(catID.getSubCategoryCode());

        RackSlot rackSlot = (RackSlot) session
                .createCriteria(RackSlot.class)
                .add(Restrictions.eq("rackSlotName", strRackSlot))
                .uniqueResult();
        //txtItemName.setText(rack.getRackSlotCode());

        Uom buyingUom = (Uom) session
                .createCriteria(Uom.class)
                .add(Restrictions.eq("uomName", strBuyUOM))
                .uniqueResult();
        //txtSellingProce.setText(buom.getUomCode());

        Uom sellingUom = (Uom) session
                .createCriteria(Uom.class)
                .add(Restrictions.eq("uomName", strSellUOM))
                .uniqueResult();
        //txtIssueMethod.setText(suom.getUomCode());

        Item item = new Item();
        item.setItemCode(strItemCode);
        if (manufacturer.getManufacturerName().equalsIgnoreCase("NONE")) {
            item.setItemName(strItemName);
        } else {
            item.setItemName(strItemName);
        }

        item.setSellingPrice(Float.parseFloat(strSellingPrice));
        item.setIssueMethod(strIssueMethod);
        item.setReorderQuantity(Float.parseFloat(strReOrderQty));

        if (bIsPhy) {
            item.setIsPhysical(1);
        } else {
            item.setIsPhysical(0);
        }

        if (bIsActive) {
            item.setIsActive(1);
        } else {
            item.setIsActive(0);
        }

        item.setCreadetDate(date);
        item.setCreatedTime(date);
        item.setCreatedUser(MainFrame.user.getUserId());
        item.setRemark(strRemarks);
        item.setManufacturer((Manufacturer) session.load(Manufacturer.class, manufacturer.getManufacturerCode()));
        item.setSubCategory((SubCategory) session.load(SubCategory.class, subCategory.getSubCategoryCode()));
        item.setRackSlot((RackSlot) session.load(RackSlot.class, rackSlot.getRackSlotCode()));
        item.setUomByBuyingUom((Uom) session.load(Uom.class, buyingUom.getUomCode()));
        item.setUomBySellingUom((Uom) session.load(Uom.class, sellingUom.getUomCode()));

        session.saveOrUpdate(item);
        transaction.commit();
        session.close();

        clearAll();
        if (update) {
            InformationDialog.showMessageBox(SystemData.RECORD_UPDATED_MESSAGE, SystemData.RECORD_UPDATED_HEADING);
        } else {
            InformationDialog.showMessageBox(SystemData.NEW_RECORD_ADDED_MESSAGE, SystemData.NEW_RECORD_ADDED_HEADING);
        }
    }

    public void setItemCode(String itemCode) {
        this.txtItemCode.setText(itemCode);
    }

    public void setItemName(String itemName) {
        this.txtItemName.setText(itemName);
    }

    public void setSellingPrice(String sellingPrice) {
        this.txtSellingProce.setText(sellingPrice);
    }

    public void setIssueMethod(String issueMethod) {
        this.txtIssueMethod.setText(issueMethod);
    }

    public void setReorderQty(String reorderQty) {
        this.txtReorderQuantity.setText(reorderQty);
    }

    public void setIsPhysicle(boolean isPhysicle) {
        this.cbxIsPhysical.setSelected(isPhysicle);
    }

    public void setIsActive(boolean isActive) {
        this.cbxIsActive.setSelected(isActive);
    }

    public void setRemark(String remark) {
        this.txtRemarks.setText(remark);
    }

    public void setManufacturer(String manufacturer) {
        this.cmbManufacturer.setSelectedItem(manufacturer);
    }

    public void setSubCategory(String subCategory) {
        cmbSubCategory.setSelectedItem(subCategory);
    }

    public void setRackSlot(String rackSlot) {
        cmbRackSlot.setSelectedItem(rackSlot);
    }

    public void setBuyingUOM(String buyingUOM) {
        cmbBuyingUOM.setSelectedItem(buyingUOM);
    }

    public void setSellingUOM(String sellingUOM) {
        cmbSellingUOM.setSelectedItem(sellingUOM);
    }

    public void setItemCodeEditable(boolean editable) {
        this.txtItemCode.setEditable(editable);
    }

    public void setLblSaveText(String text) {
        this.lblSave.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbxIsActive;
    private javax.swing.JCheckBox cbxIsPhysical;
    private javax.swing.JComboBox<String> cmbBuyingUOM;
    private javax.swing.JComboBox<String> cmbManufacturer;
    private javax.swing.JComboBox<String> cmbRackSlot;
    private javax.swing.JComboBox<String> cmbSellingUOM;
    private javax.swing.JComboBox<String> cmbSubCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCodeSearch;
    private javax.swing.JLabel lblNameSearch;
    public javax.swing.JLabel lblSave;
    private javax.swing.JTextField txtIssueMethod;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtReorderQuantity;
    private javax.swing.JTextField txtSellingProce;
    // End of variables declaration//GEN-END:variables
}
