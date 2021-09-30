package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ted {

    private PayloadTed payloadTed;

}
