package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SacadorAvalista {

    private String nomeSacador;
    private String documentoSacador;
    private String tipoSacador;
}