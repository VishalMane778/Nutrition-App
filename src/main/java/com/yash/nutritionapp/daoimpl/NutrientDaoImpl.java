package com.yash.nutritionapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.nutritionapp.dao.NutrientDao;
import com.yash.nutritionapp.domain.Nutrient;
import com.yash.nutritionapp.util.JDBCUtil;

public class NutrientDaoImpl implements NutrientDao{

    @Override
    public void addNutrient(Nutrient nutrient) {
        String sql = "INSERT INTO nutrients (id, nutrientName, nutrientCalorie, nutrientCarbs, nutrientSugar, nutrientFat, nutrientProtein, nutrientDescription) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";

        try {
            Connection con = JDBCUtil.getConnection();

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nutrient.getNutrientName());
            stmt.setDouble(2, nutrient.getNutrientCalorie());
            stmt.setDouble(3, nutrient.getNutrientCarbs());
            stmt.setDouble(4, nutrient.getNutrientSugar());
            stmt.setDouble(5, nutrient.getNutrientFat());
            stmt.setDouble(6, nutrient.getNutrientProtein());
            stmt.setString(7, nutrient.getNutrientDescription());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data insertion successful...");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Nutrient> getAllNutrients() {

        List<Nutrient> nutrients = new ArrayList<>();

        String sql = "SELECT * FROM nutrients;";

        try {
            Connection con = JDBCUtil.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                Nutrient nutrient = new Nutrient();
                nutrient.setNutrientName(rs.getString("nutrientName"));
                nutrient.setNutrientCalorie(rs.getDouble("nutrientCalorie"));
                nutrient.setNutrientCarbs(rs.getDouble("nutrientCarbs"));
                nutrient.setNutrientSugar(rs.getDouble("nutrientSugar"));
                nutrient.setNutrientFat(rs.getDouble("nutrientFat"));
                nutrient.setNutrientProtein(rs.getDouble("nutrientProtein"));
                nutrient.setNutrientDescription(rs.getString("nutrientDescription"));
                nutrients.add(nutrient);
            }



        }catch(Exception e) {
            e.printStackTrace();
        }


        return nutrients;
    }

}
