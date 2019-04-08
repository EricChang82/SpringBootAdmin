package SpringBootAdmin.SpringBootAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
 
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminMain 
{
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminMain.class, args);
    }
}
