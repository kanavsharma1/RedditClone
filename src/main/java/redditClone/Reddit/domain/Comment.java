package redditClone.Reddit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Comment extends Auditable  {

    @Id
    @GeneratedValue
private Long id;
private String body;

    public Comment(String body) {
        this.body = body;
    }

    //Link
@ManyToOne
private Link link;

}
