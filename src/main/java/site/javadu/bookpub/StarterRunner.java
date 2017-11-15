package site.javadu.bookpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * 作用:
 * User: duqi
 * Date: 2017/11/15
 * Time: 21:09
 */
public class StarterRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StarterRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("hello word");
    }
}
