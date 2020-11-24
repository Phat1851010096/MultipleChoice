/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.services;

import com.dht.pojo.Category;
import com.dht.pojo.Choice;
import com.dht.pojo.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CategoryServices {
    public static Category getCategoryByid(int id) throws SQLException{
        Connection conn = Utils.getConn();
        String q = "SELECT * FROM category WHERE id = ?";
        
        PreparedStatement stm = conn.prepareStatement(q);
        
        return null;
    }
    
    public static List<Category> getCategories() throws SQLException {
        Connection conn = Utils.getConn();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM category");
        
        List<Category> kq = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Category c = new Category(id, name);
            
            kq.add(c);
        }
        
        return kq;
    }
    
    public static void addQuestion(Question question, ArrayList<Choice> choice) throws SQLException{
        Connection conn = Utils.getConn();
//        String sql1 = "INSERT INTO question(id, content, category_id) VALUES(?, ?)";
//        String sql2 = "INSERT INTO choice(id, content, correct, question_id) VALUES(?, ?, ?, ?)";
////        String questionId = UUID.randomUUID().toString();
//        
//        conn.setAutoCommit(false);
//        
//        PreparedStatement stm = conn.prepareStatement(sql1);
//        stm.setString(1, question.getId());
//        stm.setString(2, question.getContent());
//        
//        stm.executeUpdate();
//        
//        for(Choice c: choice){
//            PreparedStatement st = conn.prepareCall(sql2);
//            st.setString(1, c.getId());
//            st.setString(2, c.getContent());
//            st.setBoolean(3, c.isCorrect());
//            st.setString(4, question.getId());
//        }
//        conn.commit();
        
       
        
    }

    private static String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
