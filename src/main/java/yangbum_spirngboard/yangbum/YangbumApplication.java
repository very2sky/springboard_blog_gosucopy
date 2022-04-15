package yangbum_spirngboard.yangbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YangbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(YangbumApplication.class, args);
	}

}
