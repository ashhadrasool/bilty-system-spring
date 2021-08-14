package com.enterprises.mengal.biltysystem.repository.predicatee;

import com.enterprises.mengal.biltysystem.dto.bilty.BiltySearchDTO;
import com.enterprises.mengal.biltysystem.model.QBilty;
import com.querydsl.core.BooleanBuilder;

public class BiltyPredicate {

    QBilty bilty = QBilty.bilty;
    BiltySearchDTO biltySearchDTO;
    BooleanBuilder query;

    public BiltyPredicate(BiltySearchDTO biltySearchDTO){
        this.biltySearchDTO = biltySearchDTO;
        this.query = new BooleanBuilder();
    }
    public BooleanBuilder getPredicate() {
        updateForBiltyId();
        updateForFromId();
        updateForToId();
        updateForSenderId();
        updateForMaterialId();
        updateForWeight();
        updateForVehicleNo();
        return query;
    }

    void updateForBiltyId(){
        query = biltySearchDTO.getBiltyId()==null? query:
                query.and(QBilty.bilty.biltyId.eq(biltySearchDTO.getBiltyId()));
    }
    void updateForFromId(){
        query = biltySearchDTO.getFromId()==null? query:
                query.and(bilty.fromCode.codeid.eq(biltySearchDTO.getFromId()));
    }
    void updateForToId(){
        query = biltySearchDTO.getToId()==null? query:
                query.and(bilty.toCode.codeid.eq(biltySearchDTO.getToId()));
    }
    void updateForSenderId(){
        query = biltySearchDTO.getSenderId()==null? query:
                query.and(bilty.senderCode.codeid.eq(biltySearchDTO.getSenderId()));
    }
    void updateForMaterialId(){
        query = biltySearchDTO.getMaterialId()==null? query:
                query.and(bilty.materialCode.codeid.eq(biltySearchDTO.getMaterialId()));
    }
    void updateForWeight(){
        query = biltySearchDTO.getWeight()==null? query:
                query.and(QBilty.bilty.weight.eq(biltySearchDTO.getWeight()));
    }
    void updateForVehicleNo(){
        query = biltySearchDTO.getVehicleNo()==null? query:
                query.and(QBilty.bilty.vehicleNo.eq(biltySearchDTO.getVehicleNo()));
    }

}