/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicemaster.views;

import com.servicemaster.data.SystemData;
import com.servicemaster.dialogs.ConfirmationDialog;
import com.servicemaster.guiFunctions.LableFunctions;
import com.servicemaster.internalFrames.SubCategoryTypeFrame;
import com.servicemaster.models.Category;
import com.servicemaster.models.SubCategoryType;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RuwanM
 */
public class SubCategoryTypeView extends javax.swing.JInternalFrame {

    private final List list;
    private final SubCategoryTypeFrame subCategoryTypeFrame;

    /**
     * Creates new form CategoryView
     *
     * @param list
     * @param subCategoryTypeFrame
     */
    public SubCategoryTypeView(List<Category> list, SubCategoryTypeFrame subCategoryTypeFrame) {
        initComponents();
        this.list = list;
        this.subCategoryTypeFrame = subCategoryTypeFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        subCategoryTypeTable = new javax.swing.JTable();
        lblSelect = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();

        setTitle("Category View");
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

        subCategoryTypeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cat. Code", "Cat. Name", "Remark", "Is Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subCategoryTypeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subCategoryTypeTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(subCategoryTypeTable);

        lblSelect.setBackground(new java.awt.Color(150, 255, 150));
        lblSelect.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelect.setText("Select");
        lblSelect.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        lblSelect.setOpaque(true);
        lblSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSelectMouseExited(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 500, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (!list.isEmpty()) {
            DefaultTableModel tableModel = (DefaultTableModel) subCategoryTypeTable.getModel();
            tableModel.setRowCount(0);
            for (Object object : list) {
                if (object instanceof SubCategoryType) {
                    SubCategoryType subCategoryType = (SubCategoryType) object;
                    tableModel.addRow(new Object[]{subCategoryType.getSubCategoryTypeCode(), subCategoryType.getSubCategoryTypeName(), subCategoryType.getRemark(), (subCategoryType.getIsActive() == 1)});
                }
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void subCategoryTypeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subCategoryTypeTableMouseClicked
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            this.selectCategory();
        }
    }//GEN-LAST:event_subCategoryTypeTableMouseClicked

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        this.selectCategory();
    }//GEN-LAST:event_lblSelectMouseClicked

    private void lblSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseEntered
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_lblSelectMouseEntered

    private void lblSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseExited
        LableFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_lblSelectMouseExited

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

    private void selectCategory() {
        int selectedRow = subCategoryTypeTable.getSelectedRow();
        SubCategoryType subCategoryType = (SubCategoryType) list.get(selectedRow);
        subCategoryTypeFrame.setTxtSubCategoryTypeCode(subCategoryType.getSubCategoryTypeCode());
        subCategoryTypeFrame.setTxtSubCategoryTypeName(subCategoryType.getSubCategoryTypeName());
        subCategoryTypeFrame.setTxtRemark(subCategoryType.getRemark());
        subCategoryTypeFrame.setCbxIsActive((subCategoryType.getIsActive() == 1));
        subCategoryTypeFrame.setTxtCodeEditable(false);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable subCategoryTypeTable;
    // End of variables declaration//GEN-END:variables
}
