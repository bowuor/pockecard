package com.wladek.pktcard;

import org.postgresql.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Keeun Baik
 */
@Configuration
public class TestConfiguration {

    @Bean
    public DataSource dataSource() throws SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new Driver());
        dataSource.setUrl("jdbc:postgresql://localhost:5432/pktcard");
        dataSource.setUsername("potgres");
        dataSource.setPassword("tech@2016");
        return dataSource;
    }

}
