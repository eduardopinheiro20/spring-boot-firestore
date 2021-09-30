package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.firestore.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collectionName = "gestao-transacoes")
public class GestaoTransacoes {

    @DocumentId
    private String idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;
    private Pix pix;
    private Ted ted;
    private Tef tef;
    private Boleto boleto;
}
