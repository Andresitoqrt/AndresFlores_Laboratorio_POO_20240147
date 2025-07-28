package AndresFlores_20240147.AndresFlores_20240147;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AndresFlores20240147Application {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(),entry.getValue()));

		SpringApplication.run(AndresFlores20240147Application.class, args);
	}

}
