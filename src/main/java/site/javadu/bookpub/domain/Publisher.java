package site.javadu.bookpub.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    protected Publisher() { }

    public Publisher(String name) {
        this.name = name;
    }



    @Entity
    public class Reviewer {
        @Id
        @GeneratedValue
        private Long id;
        private String firstName;
        private String lastName;

        protected Reviewer() { }

        public Reviewer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
