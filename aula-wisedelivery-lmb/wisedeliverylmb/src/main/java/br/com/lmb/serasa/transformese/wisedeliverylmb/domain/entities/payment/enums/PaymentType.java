package br.com.lmb.serasa.transformese.wisedeliverylmb.domain.entities.payment.enums;

public enum PaymentType {

    DINHEIRO(1, "Dinheiro"),
    CARTAO(2, "Cartão de crédito"),
    PIX(3, "Pix");

    @Getter
    private int ordem;
    @Getter
    private String descricao;

    PaymentType(int ordem, String descricao) {
        this.ordem = ordem;
        this.descricao = descricao;
    }
}
