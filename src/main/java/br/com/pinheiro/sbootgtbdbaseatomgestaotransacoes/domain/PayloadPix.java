package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayloadPix {

    private String data;
    private String descricao;
    private String dtVencimentoPagamento;
    private Favorecido favorecido;
    private String idPagamento;
    private String nsu;
    private String numeroQrCode;
    private Boolean salvarContrato;
    private Integer seqTransacao;
    private BigDecimal valor;
    private ChavePix chavePix;
}
