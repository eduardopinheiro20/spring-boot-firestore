package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.enums;

import lombok.Getter;

@Getter
public enum  FirestoreCollection {

    COLLECTION_GESTAO_TRANSACOES("gestao-transacoes");

    private  String storageName;

    private  FirestoreCollection(String storage) { this.storageName = storage;}


}
