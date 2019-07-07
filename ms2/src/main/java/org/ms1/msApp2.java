package org.ms1;

import com.alibaba.fastjson.JSON;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.Optional;

@RestController
@SpringBootApplication
public class msApp2 {
    public static void main(String[] args) {
        SpringApplication.run(msApp2.class,args);
    }

    @Autowired
    private Optional<DataSource> dataSource;

    @RequestMapping("ms2")
    public Optional test(){
        return dataSource.map(datasource->{
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource.get());
            return jdbcTemplate.queryForList("SELECT t.* FROM test.pes_cs_2019_05 t\n" +
                    "LIMIT 501");
        });
    }
}
