package uz.poem.author;

import lombok.*;
import uz.poem.template.AbsEntityLong;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author extends AbsEntityLong {
    @NotNull
    private String originalName;
}
