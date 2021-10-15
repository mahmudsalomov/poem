package uz.poem.lang;

import lombok.*;
import org.hibernate.Hibernate;
import uz.poem.template.AbsEntityShort;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lang extends AbsEntityShort {

    @NotNull
    @Column(unique = true)
    private String code;

    @NotNull
    @Column(unique = true)
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Lang lang = (Lang) o;
        return Objects.equals(getId(), lang.getId());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
