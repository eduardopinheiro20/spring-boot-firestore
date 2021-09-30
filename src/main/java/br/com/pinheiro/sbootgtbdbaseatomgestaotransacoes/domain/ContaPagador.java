package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaPagador {

    private Banco banco;
    private String agencia;
    private String conta;
}
