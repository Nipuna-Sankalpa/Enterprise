/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicemaster.internalFrames;

import com.servicemaster.entities.KeyTable;
import com.servicemaster.forms.MainFrame;
import com.servicemaster.utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ruwan Madawala
 */
public class Category extends javax.swing.JInternalFrame {

    /**
     * Creates new form Category
     */
    public Category() {
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
        txtCategoryCode = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JTextField();
        btnCodeSearch = new javax.swing.JButton();
        btnNameSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setTitle("Category");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Category code :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Category name :");

        txtCategoryCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtCategoryName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnCodeSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCodeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnCodeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodeSearchActionPerformed(evt);
            }
        });

        btnNameSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameSearchActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCodeSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNameSearch, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCategoryCode, txtCategoryName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCodeSearch, btnNameSearch});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, btnUpdate, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCodeSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCategoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCodeSearch, btnNameSearch, jLabel1, jLabel2, txtCategoryCode, txtCategoryName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClose, btnUpdate, btnView});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(this, "Are you sure?", "Sure", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCodeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodeSearchActionPerformed
        String categoryCode = txtCategoryCode.getText().trim();
        List categories = getCategoryByCode(categoryCode);

        if (categories.size() > 0) {

        }
    }//GEN-LAST:event_btnCodeSearchActionPerformed

    private void btnNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameSearchActionPerformed
        String categoryName = txtCategoryName.getText().trim();
        List categories = getCategoryByName(categoryName);

        if (categories.size() > 0) {

        }
    }//GEN-LAST:event_btnNameSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String categoryName = txtCategoryName.getText().toUpperCase().trim();
        List categoryByName = this.getCategoryByName(categoryName);
        if (categoryByName.size() > 0) {
            JOptionPane.showMessageDialog(this, "Item name already exists.", "Exist", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String catCode;
            Query query = session.createQuery("from KeyTable k where k.keyCode = :code");
            query.setParameter("code", "CAT");
            List keyList = query.list();
            if (keyList.size() > 0) {
                KeyTable keyTable = (KeyTable) keyList.get(0);
                Integer keyNumber = keyTable.getKeyNumber();
                keyTable.setKeyNumber(keyNumber + 1);
                keyTable.setModifiedDate(new Date());
                keyTable.setModifiedTime(new Date());
                keyTable.setModifiedUser(MainFrame.user.getUserId());
                session.saveOrUpdate(keyTable);
                catCode = "CAT" + keyNumber;
            } else {
                KeyTable keyTable = new KeyTable();
                keyTable.setKeyCode("CAT");
                keyTable.setKeyNumber(1000);
                keyTable.setKeyRemark("Category");
                keyTable.setCreatedDate(new Date());
                keyTable.setCreatedTime(new Date());
                keyTable.setCreatedUser(MainFrame.user.getUserId());
                session.saveOrUpdate(keyTable);
                catCode = "CAT1000";
            }

            com.servicemaster.entities.Category category = new com.servicemaster.entities.Category();
            category.setCategoryCode(catCode);
            category.setCategoryName(categoryName);
            category.setCreatedDate(new Date());
            category.setCreatedTime(new Date());
            category.setCreatedUser(MainFrame.user.getUserId());
            category.setRemarks(categoryName);
            session.saveOrUpdate(category);
        }
        session.getTransaction().commit();
        session.close();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private List getCategoryByCode(String categoryCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Category c where c.categoryCode like :code");
        query.setParameter("code", "%" + categoryCode + "%");
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    private List getCategoryByName(String categoryName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Category c where c.categoryName like :name");
        query.setParameter("name", "%" + categoryName + "%");
        List list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCodeSearch;
    private javax.swing.JButton btnNameSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCategoryCode;
    private javax.swing.JTextField txtCategoryName;
    // End of variables declaration//GEN-END:variables
    private boolean isNewCategory;
}