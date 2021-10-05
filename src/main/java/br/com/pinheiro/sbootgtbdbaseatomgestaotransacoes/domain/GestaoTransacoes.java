package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GestaoTransacoes {

    private String idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;
    private Pix pix;
    private Ted ted;
    private Tef tef;
    private Boleto boleto;
}
