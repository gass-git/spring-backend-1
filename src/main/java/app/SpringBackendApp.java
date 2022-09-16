package app;

import app.entity.Human;
import app.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApp implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApp.class, args);
	}

	@Autowired
	private HumanRepository humanRepository;

	@Override
	public void run(String... args) throws Exception{

		Human client1 = Human.builder()
			.firstName("Jason")
			.lastName("Szada")
			.age(44)
			.height(1.73)
			.weight(67)
			.fatPercentage(32.3)
			.build();

		Human client2 = Human.builder()
			.firstName("Mat")
			.lastName("Kachanov")
			.age(44)
			.height(1.73)
			.weight(67)
			.fatPercentage(32.3)
			.build();

		humanRepository.save(client1);
		humanRepository.save(client2);
	}
}
