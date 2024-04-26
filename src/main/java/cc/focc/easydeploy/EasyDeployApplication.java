package cc.focc.easydeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import static java.lang.StringTemplate.STR;

@SpringBootApplication
public class EasyDeployApplication {

    private static Environment environment;

    @Autowired
    public EasyDeployApplication(Environment environment) {
        EasyDeployApplication.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication.run(EasyDeployApplication.class, args);
        String serverPort = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        String swaggerPath = environment.getProperty("springdoc.swagger-ui.path");
        System.out.println(STR."http://localhost:\{serverPort}\{contextPath}\{swaggerPath}");
    }

}
