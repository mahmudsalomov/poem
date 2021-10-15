package uz.poem.fact;

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
public class FactTranslation extends AbsEntityLong {

    @ManyToOne
    private Fact fact;

    @ManyToOne
    private Lang lang;

    @NotNull
    private String title;

    @NotNull
    @Column(columnDefinition = "text")
    private String description;
}
