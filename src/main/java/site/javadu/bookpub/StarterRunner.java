package site.javadu.bookpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import site.javadu.bookpub.repository.BookRepository;

/**
 * 作用:
 * User: duqi
 * Date: 2017/11/15
 * Time: 21:09
 */
public class StarterRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StarterRunner.class);

//    @Autowired
//    private DataSource ds;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        //logger.info("hello word");
        //logger.info("datasource:{}", ds.toString());

        logger.info("Number of books: " + bookRepository.count());
    }
}
