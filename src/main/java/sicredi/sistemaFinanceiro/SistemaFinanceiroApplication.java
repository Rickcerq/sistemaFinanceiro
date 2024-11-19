package sicredi.sistemaFinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "sicredi.sistemaFinanceiro")
public class SistemaFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFinanceiroApplication.class, args);
	}

}
