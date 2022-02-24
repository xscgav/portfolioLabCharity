package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.entity.InstitutionEntity;

import java.util.List;

public interface InstitutionRepo extends JpaRepository<InstitutionEntity, Integer> {

    List<InstitutionEntity> findAllById(long id);
}
