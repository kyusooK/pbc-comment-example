package pbccommentexample.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pbccommentexample.PostApplication;

@Entity
@Table(name = "Post_table")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Embedded
    private Comment comment;

    public static PostRepository repository() {
        PostRepository postRepository = PostApplication.applicationContext.getBean(
            PostRepository.class
        );
        return postRepository;
    }
}
