package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayloadBoleto {

    private Integer contaOrigem;
    private Integer bancoOrigem;
    private Integer agenciaOrigem;
    private CartaoSelecionado cartaoSelecionado;
    private String codigoBarras;
    private Integer codigoSistemaOrigem;
    private Integer codigoTipoPagamento;
    private String dataEfetivacao;
    private String formaPagamento;
    private String linhaDigitavel;
    private BigDecimal valorPagamento;
    private BigDecimal valorPagamentoIOF;
    private Beneficiario beneficiario;
    private SacadorAvalista sacadorAvalista ;
    private DadosDoPagador dadosDoPagador;
    private Emissor emissor;
}
