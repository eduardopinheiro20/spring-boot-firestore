package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosDoPagador {

    private String nomePagador;
    private String documentoPagador;
    private String tipoPagador;
    private ContaPagador contaPagador;

}