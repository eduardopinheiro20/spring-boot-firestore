package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.impl;
;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.enums.FirestoreCollection;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.repository.GestaoTransacoesRepository;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
@Slf4j
public class GestaoTransacoesServiceImpl  implements GestaoTransacoesService {

    @Autowired
    private Firestore firestore;

    @Override
    public void addTransacoes(final GestaoTransacoes transacao) {
        createDocumentId(transacao);
         this.firestore.collection(FirestoreCollection.COLLECTION_GESTAO_TRANSACOES.getStorageName())
                         .document(transacao.getIdTransacao())
                         .create(transacao);
    }

    private void createDocumentId(final GestaoTransacoes pGestaoTransacoes) {
        String id = this.firestore.collection(FirestoreCollection.COLLECTION_GESTAO_TRANSACOES.getStorageName()).document().getId();
        pGestaoTransacoes.setIdTransacao(id);
    }

    @Override
    public GestaoTransacoes getById(final String id) {
        GestaoTransacoes transacao = null;

        try {
            ApiFuture<QuerySnapshot> future = this.firestore.collection(FirestoreCollection.COLLECTION_GESTAO_TRANSACOES.getStorageName()).whereEqualTo("idTransacao", id).get();
            Optional<QueryDocumentSnapshot> transacoesQuery = future.get().getDocuments().stream().findFirst();
            if(transacoesQuery.isPresent()){
                transacao = transacoesQuery.get().toObject(GestaoTransacoes.class);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException ee) {
            log.error("Erro na execução da quey", ee);
        }
        return  transacao;
    }

    @Override
    public String atualizarProtocoloFraudes(String id, final GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException {

        ApiFuture<WriteResult> collectionApiFuture =  getCollection().document(id).set(pGestaoTransacoes);
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    @Override
    public String atualizarStatusFraudes(final String id, final GestaoTransacoes pGestaoTransacoes)
                    throws ExecutionException, InterruptedException {

        ApiFuture<WriteResult> collectionApiFuture =  getCollection().document(id).set(pGestaoTransacoes);
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    public CollectionReference getCollection() {
        return firestore.collection("gestao-transacoes");
    }
}
