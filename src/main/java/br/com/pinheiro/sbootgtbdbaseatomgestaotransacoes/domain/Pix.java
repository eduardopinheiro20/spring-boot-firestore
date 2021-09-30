package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.firestore.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pix {

    private PayloadPix payloadPix;

}
