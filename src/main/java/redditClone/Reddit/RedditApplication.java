package redditClone.Reddit;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import redditClone.Reddit.Repository.CommentRepository;
import redditClone.Reddit.Repository.LinkRepositoy;
import redditClone.Reddit.domain.Comment;
import redditClone.Reddit.domain.Link;

@SpringBootApplication
@EnableJpaAuditing
public class RedditApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	//@Bean
	CommandLineRunner runner(LinkRepositoy linkRepositoy, CommentRepository commentRepository){
		return args -> {
		    //Creating a Link
			Link link = new Link("getting started with spring boot 2","https://springboot.com");
			//Saving a Link
			linkRepositoy.save(link);
			//Creating a comment
            Comment comment = new Comment("this is springboot 2 comment");
            //Saving a comment
            commentRepository.save(comment);
            // Linking(Associating) the comment to the link
            link.addComment(comment);
//           System.out.println("inserted link and a comment");
		};
	}
            }
