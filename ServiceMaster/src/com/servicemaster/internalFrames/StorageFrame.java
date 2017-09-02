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
import com.servicemaster.guiFunctions.LableFunctions;
import com.servicemaster.models.KeyTable;
import com.servicemaster.models.Storage;
import com.servicemaster.utils.HibernateUtil;
import com.servicemaster.views.StorageView;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ruwan Madawala
 */
public class StorageFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Category
     */
    public StorageFrame() {
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
        txtStorageCode = new javax.swing.JTextField();
        txtStorageName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxIsActive = new javax.swing.JCheckBox();
        lblClose = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();
        lblCodeSearch = new javax.swing.JLabel();
        lblNameSearch = new javax.swing.JLabel();
        lblRacks = new javax.swing.JLabel();

        setTitle("Storage");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Storage code :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Storage name :");

        txtStorageCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtStorageName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

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

        lblView.setBackground(new java.awt.Color(150, 255, 150));
        lblView.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblView.setText("View");
        lblView.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblView.setOpaque(true);
        lblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViewMouseExited(evt);
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

        lblRacks.setBackground(new java.awt.Color(150, 255, 150));
        lblRacks.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblRacks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRacks.setText("Racks");
        lblRacks.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblRacks.setEnabled(false);
        lblRacks.setOpaque(true);
        lblRacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRacksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRacksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRacksMouseExited(evt);
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
                        .addComponent(lblRacks, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(txtStorageCode, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtStorageName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtStorageCode, txtStorageName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClose, lblSave, lblView});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCodeSearch, lblNameSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtStorageCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCodeSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtStorageName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRacks, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxIsActive, jLabel1, jLabel2, jLabel3, jLabel4, lblCodeSearch, lblNameSearch, txtRemark, txtStorageCode, txtStorageName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblClose, lblSave, lblView});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        ConfirmationDialog.showMessageBox("Are you sure?", "Sure");
        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String storageCode = txtStorageCode.getText().toUpperCase().trim();
        String storageName = txtStorageName.getText().toUpperCase().trim();
        String remark = txtRemark.getText().toUpperCase().trim();
        boolean isActivated = cbxIsActive.isSelected();

        if (storageCode.isEmpty()) {
            List storageByName = this.getStorageByName(storageName, false);
            if (storageByName.size() > 0) {
                InformationDialog.showMessageBox("Item name already exists.", "Exist");
            } else {
                session.getTransaction().commit();
                session.close();
                this.createNewLocation(storageName, remark, isActivated);
            }
        } else {
            List storageByCode = this.getStorageByCode(storageCode, false);
            if (storageByCode.isEmpty()) {
                ConfirmationDialog.showMessageBox("Code does not exist. Create new?", "New");
                if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                    session.getTransaction().commit();
                    session.close();
                    this.createNewLocation(storageName, remark, isActivated);
                }
            } else {
                ConfirmationDialog.showMessageBox("Do you want to update?", "Update");
                if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                    Storage storage = new Storage(storageCode);
                    storage.setStorageName(storageName);
                    storage.setRemark(remark);
                    storage.setIsActive(isActivated ? 1 : 0);
                    storage.setModifiedDate(new Date());
                    storage.setModifiedTime(new Date());
                    storage.setModifiedUser(MainFrame.user.getUserId());
                    session.saveOrUpdate(storage);

                    session.getTransaction().commit();
                    session.close();

                    InformationDialog.showMessageBox("Updated successfully.", "Success");
                    this.resetFrame();

                    this.lblRacks.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblViewMouseClicked

    private void lblViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblViewMouseEntered

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblViewMouseExited

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblSaveMouseExited

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCodeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCodeSearchMouseClicked
        String storageCode = txtStorageCode.getText().trim();
        List storage = getStorageByCode(storageCode, true);

        if (!storage.isEmpty()) {
            StorageView storageView = new StorageView(storage, this);
            MainFrame.desktopPane.add(storageView);
            storageView.setVisible(true);
        }
    }//GEN-LAST:event_lblCodeSearchMouseClicked

    private void lblNameSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameSearchMouseClicked
        String storageName = txtStorageName.getText().trim();
        List storage = getStorageByName(storageName, true);

        if (storage.size() > 0) {
            StorageView storageView = new StorageView(storage, this);
            MainFrame.desktopPane.add(storageView);
            storageView.setVisible(true);
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

    private void lblRacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRacksMouseClicked
        if (this.lblRacks.isEnabled()) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("ModuleCode", "4");
            map.put("Max", 0);
            MainFrame.openWindow(map);
            this.dispose();
        }
    }//GEN-LAST:event_lblRacksMouseClicked

    private void lblRacksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRacksMouseEntered
        if (this.lblRacks.isEnabled()) {
            LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
        }
    }//GEN-LAST:event_lblRacksMouseEntered

    private void lblRacksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRacksMouseExited
        if (this.lblRacks.isEnabled()) {
            LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
        }
    }//GEN-LAST:event_lblRacksMouseExited

    private void createNewLocation(String locationName, String remark, boolean isActivated) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String storageCode;
        Query query = session.createQuery("from KeyTable k where k.keyCode = :code");
        query.setParameter("code", "STO");
        List keyList = query.list();
        if (keyList.size() > 0) {
            KeyTable keyTable = (KeyTable) keyList.get(0);
            Integer keyNumber = keyTable.getKeyNumber();
            keyTable.setKeyNumber(keyNumber + 1);
            keyTable.setModifiedDate(new Date());
            keyTable.setModifiedTime(new Date());
            keyTable.setModifiedUser(MainFrame.user.getUserId());
            session.saveOrUpdate(keyTable);
            storageCode = "STO" + keyNumber;
        } else {
            KeyTable keyTable = new KeyTable();
            keyTable.setKeyCode("STO");
            keyTable.setKeyNumber(1001);
            keyTable.setKeyRemark("Storage");
            keyTable.setCreatedDate(new Date());
            keyTable.setCreatedTime(new Date());
            keyTable.setCreatedUser(MainFrame.user.getUserId());
            session.saveOrUpdate(keyTable);
            storageCode = "STO1000";
        }

        Storage storage = new Storage();
        storage.setStorageCode(storageCode);
        storage.setStorageName(locationName);
        storage.setRemark(remark);
        storage.setIsActive(isActivated ? 1 : 0);
        storage.setCreatedDate(new Date());
        storage.setCreatedTime(new Date());
        storage.setCreatedUser(MainFrame.user.getUserId());
        session.saveOrUpdate(storage);

        session.getTransaction().commit();
        session.close();

        InformationDialog.showMessageBox("Updated successfully.", "Success");
        this.resetFrame();

        this.lblRacks.setEnabled(true);
    }

    private List getStorageByCode(String storageCode, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Storage s where s.storageCode like :code");
            query.setParameter("code", "%" + storageCode + "%");
        } else {
            query = session.createQuery("from Storage s where s.storageCode = :code");
            query.setParameter("code", storageCode);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private List getStorageByName(String storageName, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        if (like) {
            query = session.createQuery("from Storage s where s.storageName like :name");
            query.setParameter("name", "%" + storageName + "%");
        } else {
            query = session.createQuery("from Storage s where s.storageName = :name");
            query.setParameter("name", storageName);
        }
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private void resetFrame() {
        txtStorageCode.setText("");
        txtStorageName.setText("");
        txtRemark.setText("");
        cbxIsActive.setSelected(false);
        txtStorageCode.setEditable(true);
    }

    public void setStorageCode(String categoryCode) {
        this.txtStorageCode.setText(categoryCode);
    }

    public void setStorageName(String categoryName) {
        this.txtStorageName.setText(categoryName);
    }

    public void setRemark(String remark) {
        this.txtRemark.setText(remark);
    }

    public void setIsActive(boolean IsActive) {
        this.cbxIsActive.setSelected(IsActive);
    }

    public void setStorageCodeEditable(boolean editable) {
        txtStorageCode.setEditable(editable);
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
    private javax.swing.JLabel lblRacks;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblView;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtStorageCode;
    private javax.swing.JTextField txtStorageName;
    // End of variables declaration//GEN-END:variables
}
