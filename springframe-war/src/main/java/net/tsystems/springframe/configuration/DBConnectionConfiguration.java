package net.tsystems.springframe.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author storgovt
 */
@Configuration
public class DBConnectionConfiguration {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        //TODO [storgovt] change this parameters according your connection
        ds.setUrl("jdbc:mysql://localhost:3306/my_schema");
        ds.setUsername("root");
        ds.setPassword("1234");
        return ds;
    }
}
