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
			.sex("male")
			.age(44)
			.height(1.73)
			.weight(67)
			.fatPercentage(18.4)
			.build();

		Human client2 = Human.builder()
			.firstName("Mat")
			.lastName("Kachanov")
			.sex("male")
			.age(22)
			.height(1.65)
			.weight(60)
			.fatPercentage(25.7)
			.build();

		Human client3 = Human.builder()
			.firstName("Robert")
			.lastName("Kovacs")
			.sex("male")
			.age(34)
			.height(1.87)
			.weight(87)
			.fatPercentage(27.3)
			.build();

		Human client4 = Human.builder()
			.firstName("Laura")
			.lastName("Shapovalov")
			.sex("female")
			.age(23)
			.height(1.61)
			.weight(51)
			.fatPercentage(12.3)
			.build();

		Human client5 = Human.builder()
			.firstName("Vendel")
			.lastName("Pavilion")
			.sex("male")
			.age(56)
			.height(1.76)
			.weight(73)
			.fatPercentage(16.1)
			.build();
			
		Human client6 = Human.builder()
			.firstName("Julia")
			.lastName("Rosemary")
			.sex("female")
			.age(18)
			.height(1.67)
			.weight(60)
			.fatPercentage(26.3)
			.build();

		Human client7 = Human.builder()
			.firstName("Jonathan")
			.lastName("miklossy")
			.sex("male")
			.age(43)
			.height(1.90)
			.weight(105)
			.fatPercentage(32.3)
			.build();

		Human client8 = Human.builder()
			.firstName("Kaku")
			.lastName("Kachanov")
			.sex("male")
			.age(61)
			.height(2.01)
			.weight(97)
			.fatPercentage(23.3)
			.build();

		humanRepository.save(client1);
		humanRepository.save(client2);
		humanRepository.save(client3);
		humanRepository.save(client4);
		humanRepository.save(client5);
		humanRepository.save(client6);
		humanRepository.save(client7);
		humanRepository.save(client8);
	}
}
