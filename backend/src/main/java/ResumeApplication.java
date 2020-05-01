import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(
        exclude = HibernateJpaAutoConfiguration.class
//		scanBasePackageClasses = {"com.resume.app"}
)

@EnableJpaAuditing
public class ResumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);

//		addProfessional('1', "hello@gmail.com", "Tom", "jenkins", "password", false);
//		getProfessional('1');
//		ENTITY_MANAGER_FACTORY.close();
    }
}

