/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.servicemaster.functions;

import com.servicemaster.forms.MainFrame;
import com.servicemaster.models.KeyTable;
import com.servicemaster.utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RuwanM
 */
public class KeyCodeFunctions {
    public String getKey(String code, String remark){
        String keyCode;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from KeyTable k where k.keyCode = :code");
        query.setParameter("code", code);
        List keyList = query.list();
        if (keyList.isEmpty()) {
            KeyTable keyTable = new KeyTable();
            keyTable.setKeyCode(code);
            keyTable.setKeyNumber(1001);
            keyTable.setKeyRemark(remark);
            keyTable.setCreatedDate(new Date());
            keyTable.setCreatedTime(new Date());
            keyTable.setCreatedUser(MainFrame.user.getUserId());
            session.saveOrUpdate(keyTable);
            keyCode = code+"1000";
        } else {
            KeyTable keyTable = (KeyTable) keyList.get(0);
            Integer keyNumber = keyTable.getKeyNumber();
            keyTable.setKeyNumber(keyNumber + 1);
            keyTable.setModifiedDate(new Date());
            keyTable.setModifiedTime(new Date());
            keyTable.setModifiedUser(MainFrame.user.getUserId());
            session.saveOrUpdate(keyTable);
            keyCode = code + keyNumber;
        }
        
        session.getTransaction().commit();
        session.close();
        
        return keyCode;
    }
}