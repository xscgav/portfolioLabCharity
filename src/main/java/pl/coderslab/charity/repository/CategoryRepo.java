package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.entity.CategoryEntity;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity,Integer> {

    List<CategoryEntity> findAllById(long id);
}
