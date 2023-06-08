package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.payment.enums;

import lombok.Getter;

public enum PaymentType {

    CASH(1, "Dinheiro"),
    CREDIT_CARD(2, "Cartão de crédito"),
    PIX(3, "Pix");

    @Getter
    private int order;
    @Getter
    private String description;

    PaymentType(int order, String description) {
        this.order = order;
        this.description = description;
    }
}
