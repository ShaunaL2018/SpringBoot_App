package utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootPlay.entity.Employee;
import com.bootPlay.repository.EmployeeRepository;

@Configuration
public class LoadDB {

  private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

//  @Bean
//  CommandLineRunner initDatabase(EmployeeRepository repository) {
//
//    return args -> {
//      log.info("Preloading " + repository.save(new Employee("Jane Doe", "cook")));
//      log.info("Preloading " + repository.save(new Employee("John Doe", "housekeeping")));
//    };
//  }
}