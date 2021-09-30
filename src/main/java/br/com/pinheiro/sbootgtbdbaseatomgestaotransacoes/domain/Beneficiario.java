package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiario {

    private String nomeBeneficiario;
    private String documentoBeneficiario;
    private String tipoBeneficioario;

}
