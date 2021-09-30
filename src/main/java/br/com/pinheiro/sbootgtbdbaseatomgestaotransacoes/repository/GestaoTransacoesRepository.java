package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.repository;

import br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes.domain.GestaoTransacoes;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;

public interface GestaoTransacoesRepository extends FirestoreReactiveRepository <GestaoTransacoes> {
}
