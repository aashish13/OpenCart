/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opencart.service;

import com.opencart.dao.PromotionDao;
import com.opencart.entity.Promotion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bangalore-pc
 */
@Service
@Transactional
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    private PromotionDao promotionDao;

    @Override
    public void addPromotion(Promotion promotion) {
        promotionDao.addPromotion(promotion);
    }
    @Override
    public void removePromotion(Promotion promotion) {
        promotionDao.removePromotion(promotion);
    }
    @Override
    public List<Promotion> list() {
        return promotionDao.getAllPromotions();
    }
}
