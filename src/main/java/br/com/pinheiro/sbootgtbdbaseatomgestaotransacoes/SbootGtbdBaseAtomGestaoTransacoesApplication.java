package br.com.pinheiro.sbootgtbdbaseatomgestaotransacoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gcp.data.firestore.repository.config.EnableReactiveFirestoreRepositories;

@EnableReactiveFirestoreRepositories
@SpringBootApplication
public class SbootGtbdBaseAtomGestaoTransacoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootGtbdBaseAtomGestaoTransacoesApplication.class, args);
	}

}
