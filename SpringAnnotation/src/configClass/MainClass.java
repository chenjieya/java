package configClass;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"configClass","controller","service", "dao", "domain"})
@Import(ConfigClass.class)
public class MainClass {
}
