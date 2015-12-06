/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.entity.Promotion;
import java.util.List;

/**
 *
 * @author Bangalore-pc
 */

public interface PromotionService {
    public void addPromotion(Promotion promotion);
    public void removePromotion(Promotion promotion);
    public List<Promotion> list();
    
}
