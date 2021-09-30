package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Banco {

    private Long idBanco;
    private String codigoBanco;
    private String nomeBanco;
}
