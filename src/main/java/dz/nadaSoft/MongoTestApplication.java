package dz.nadaSoft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoTestApplication implements CommandLineRunner {

    @Override
    public void run(java.lang.String... strings) throws Exception {

    }

    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args) ;


    }
}
