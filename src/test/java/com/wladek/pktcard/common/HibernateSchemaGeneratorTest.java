package com.wladek.pktcard.common;

import com.wladek.pktcard.TestConfiguration;
import org.hibernate.dialect.PostgreSQLDialect;
import org.postgresql.Driver;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.DatabaseMetadata;
import org.hibernate.tool.hbm2ddl.SchemaUpdateScript;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Keeun Baik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class HibernateSchemaGeneratorTest {

    @Autowired DataSource dataSource;
    Configuration cfg;
    PostgreSQLDialect dialect = new PostgreSQLDialect();

    @Before
    public void setup() {
        cfg = new Configuration();
        cfg.setProperty("hibernate.dialect", PostgreSQLDialect.class.getName());
        cfg.setProperty("hibernate.connection.driver_class", Driver.class.getName());
        cfg.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/pktcard");
        cfg.setProperty("hibernate.connection.username", "postgres");
        cfg.setProperty("hibernate.connection.password", "tech@2016");
        cfg.setNamingStrategy(new org.hibernate.cfg.ImprovedNamingStrategy());
    }

    @Test
    @Ignore
    public void createSchema() throws SQLException {
        String[] sqls = cfg.generateSchemaCreationScript(dialect);
        for(String sql : sqls) {
            System.out.println(sql);
        }
    }

    @Test
    @Ignore
    public void updateSchema() throws SQLException {
        DatabaseMetadata meta = new DatabaseMetadata(dataSource.getConnection(), dialect, cfg);
        List<SchemaUpdateScript> scripts = cfg.generateSchemaUpdateScriptList(dialect, meta);
        for(SchemaUpdateScript script : scripts) {
            System.out.println(script.getScript());
        }
    }

}
