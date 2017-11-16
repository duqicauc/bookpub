package site.javadu.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import site.javadu.bookpub.domain.Book;

/**
 * 作用: User: duqi Date: 2017/11/16 Time: 22:53
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findBookByIsbn(String isbn);
}
