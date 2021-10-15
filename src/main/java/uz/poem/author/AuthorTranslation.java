package uz.poem.author;

import lombok.*;
import uz.poem.lang.Lang;
import uz.poem.template.AbsEntityLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AuthorTranslation extends AbsEntityLong {
    @ManyToOne
    private Author author;
    @ManyToOne
    private Lang lang;
    @NotNull
    private String name;
    @Column(columnDefinition = "text")
    private String description;
}
