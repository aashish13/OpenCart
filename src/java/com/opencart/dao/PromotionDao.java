/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.dao;

import com.opencart.entity.Promotion;
import java.util.List;

/**
 *
 * @author Bangalore-pc
 */
public interface PromotionDao {
    
    public void addPromotion(Promotion promotion);
    public void removePromotion(Promotion promotion);
    public List<Promotion> getAllPromotions();
    
    
}
