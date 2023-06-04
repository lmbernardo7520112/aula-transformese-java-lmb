package br.com.lmb.serasa.transformese.wisedeliverylmb.controller.validator;

public interface Validator<T> {
    boolean validator(T t);
}
