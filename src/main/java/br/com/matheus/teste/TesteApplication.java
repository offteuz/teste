package br.com.matheus.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		System.out.println("Teste");
		SpringApplication.run(TesteApplication.class, args);
	}

}
