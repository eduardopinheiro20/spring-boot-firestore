package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayloadTef {

    private Integer codigoBancoFavorecido;
    private Integer codigoBancoRemetente;
    private Integer codigoLiquidacao;
    private Integer codigoSistemaOrigem;
    private Integer codigoTipoContaFavorecido;
    private Integer codigoTipoContaRemetente;
    private Integer codigoTipoTransacao;
    private String dataTransferencia;
    private String descricaoTransacao;
    private String numeroAgenciaFavorecido;
    private String numeroAgenciaRemetente;
    private Integer numeroContaFavorecido;
    private Integer numeroContaRemetente;
    private Boolean salvarFavorecido;
    private BigDecimal valorTransacao;
}
