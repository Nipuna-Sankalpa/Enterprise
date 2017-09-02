/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicemaster.views;

import com.servicemaster.data.SystemData;
import com.servicemaster.dialogs.ConfirmationDialog;
import com.servicemaster.guiFunctions.LableFunctions;
import com.servicemaster.internalFrames.ItemFrame;
import com.servicemaster.models.Item;
import com.servicemaster.models.Manufacturer;
import com.servicemaster.models.RackSlot;
import com.servicemaster.models.SubCategory;
import com.servicemaster.models.Uom;
import com.servicemaster.utils.HibernateUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class ItemView extends javax.swing.JInternalFrame {

    private final List list;
    private final ItemFrame itemFrame;

    /**
     * Creates new form CategoryView
     *
     * @param list
     * @param itemFrame
     */
    public ItemView(List<Item> list, ItemFrame itemFrame) {
        initComponents();
        this.list = list;
        this.itemFrame = itemFrame;
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
        subCategoryTable = new javax.swing.JTable();
        lblSelect = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();

        setTitle("Item View");
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

        subCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Sub Cat. Code", "Selling Price", "Remark", "Is Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subCategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subCategoryTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(subCategoryTable);

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
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
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

        setBounds(0, 0, 788, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (!list.isEmpty()) {
            DefaultTableModel tableModel = (DefaultTableModel) subCategoryTable.getModel();
            tableModel.setRowCount(0);
            for (Object object : list) {
                if (object instanceof Item) {
                    Item item = (Item) object;
                    tableModel.addRow(new Object[]{item.getItemCode(),
                        item.getItemName(),
                        item.getSubCategory().getSubCategoryCode(),
                        item.getSellingPrice(),
                        item.getRemark(),
                        item.getIsActive() == 1});
                }
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void subCategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subCategoryTableMouseClicked
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            this.selectItem();
        }
    }//GEN-LAST:event_subCategoryTableMouseClicked

    private void lblSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSelectMouseClicked
        this.selectItem();
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

    private void selectItem() {
        int selectedRow = subCategoryTable.getSelectedRow();
        Item item = (Item) list.get(selectedRow);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        Manufacturer manufacturer = (Manufacturer) session.load(Manufacturer.class, item.getManufacturer().getManufacturerCode());
        SubCategory subCategory = (SubCategory) session.load(SubCategory.class, item.getSubCategory().getSubCategoryCode());
        RackSlot rackSlot =  (RackSlot) session.load(RackSlot.class, item.getRackSlot().getRackSlotCode());
        Uom buyingUOM =  (Uom) session.load(Uom.class, item.getUomByBuyingUom().getUomCode());
        Uom sellingUOM =  (Uom) session.load(Uom.class, item.getUomBySellingUom().getUomCode());

        itemFrame.setItemCode(item.getItemCode());
        itemFrame.setItemName(item.getItemName());
        itemFrame.setSellingPrice(item.getSellingPrice().toString());
        itemFrame.setIssueMethod(item.getIssueMethod());
        itemFrame.setReorderQty(item.getReorderQuantity().toString());
        itemFrame.setIsPhysicle(item.getIsPhysical() == 1);
        itemFrame.setIsActive(item.getIsActive() == 1);
        itemFrame.setRemark(item.getRemark());
        itemFrame.setManufacturer(manufacturer.getManufacturerName());
        itemFrame.setSubCategory(subCategory.getSubCategoryName());
        itemFrame.setRackSlot(rackSlot.getRackSlotName());
        itemFrame.setBuyingUOM(buyingUOM.getUomName());
        itemFrame.setSellingUOM(sellingUOM.getUomName());
        itemFrame.setItemCodeEditable(false);
        itemFrame.setLblSaveText("Update");
        
        transaction.commit();
        session.close();
        
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable subCategoryTable;
    // End of variables declaration//GEN-END:variables
}
