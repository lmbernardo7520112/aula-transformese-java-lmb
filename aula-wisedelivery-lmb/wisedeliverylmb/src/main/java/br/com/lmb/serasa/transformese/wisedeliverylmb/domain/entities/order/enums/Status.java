package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.order.enums;

import lombok.Getter;

public enum Status {
    CookingTime(1, "Being prepared", false),
    Delivery(2, "Out for delivery", false),
    Concluded(3, "Concluded", true);

    Status(int order, String description, boolean ultimo) {
        this.order = order;
        this.description = description;
        this.last = last;
    }
    
    @Getter int order;
    @Getter String description;
    @Getter boolean last;
}
