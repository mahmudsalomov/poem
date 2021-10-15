package uz.poem.fact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FactRepository extends JpaRepository<Fact,Long> {
}
