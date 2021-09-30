package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class PayloadTed {

    private Integer codigoFinalidade;
    private Integer codigoLiquidacao;
    private Integer codigoSistemaOrigem;
    private Integer codigoTipoContaFavorecido;
    private Integer codigoTipoContaRemetente;
    private Integer codigoTipoTransacao;
    private String dataTransferencia;
    private String descricaoTransacao;
    private Integer idBancoFavorecido;
    private Integer idBancoRemetente;
    private String nomeFavorecido;
    private Integer numeroAgenciaFavorecido;
    private Integer numeroAgenciaRemetente;
    private Integer numeroContaFavorecido;
    private Integer numeroContaRemetente;
    private String numeroCpfCnpjFavorecido;
    private Boolean salvarFavorecido;
    private String tipoPessoaFavorecido;
    private BigDecimal valorTransacao;

}
