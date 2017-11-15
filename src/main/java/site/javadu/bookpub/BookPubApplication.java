package site.javadu.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookPubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookPubApplication.class, args);
    }

    /**
     * 在spring容器中定义StarterRunner对应的bean
     * @return
     */
    @Bean
    public StarterRunner starterRunner() {
        return new StarterRunner();
    }
}
