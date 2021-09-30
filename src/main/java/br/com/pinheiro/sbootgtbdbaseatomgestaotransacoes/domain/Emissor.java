package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emissor {

    private Long idEmissor;
    private String codigoBancoEmissor;
    private String nomeEmissor;
}
