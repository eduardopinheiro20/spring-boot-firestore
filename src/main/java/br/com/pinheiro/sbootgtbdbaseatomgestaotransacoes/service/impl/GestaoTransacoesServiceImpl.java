package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.impl;
;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.firebase.FirebaseInitializer;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.repository.GestaoTransacoesRepository;
import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import java.util.concurrent.ExecutionException;

@Service
public class GestaoTransacoesServiceImpl  implements GestaoTransacoesService {

    @Autowired
    GestaoTransacoesRepository  transacoesRepository;

    @Autowired
    private FirebaseInitializer firebase;

    @Override
    public Mono<GestaoTransacoes> addTransacoes(final GestaoTransacoes pGestaoTransacoes) {
        return transacoesRepository.save(pGestaoTransacoes);
    }

    @Override public Flux<GestaoTransacoes> get() {
        return null;
    }

    @Override
    public Mono<GestaoTransacoes> getById(final String id) {
        return transacoesRepository.findById(id);
    }

    @Override
    public Flux<GestaoTransacoes> getByWebsite(final String website) {
        return null;
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
        return firebase.getFirestore().collection("gestao-transacoes");
    }
}
