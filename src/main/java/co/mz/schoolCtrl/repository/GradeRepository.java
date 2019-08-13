package co.mz.schoolCtrl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.mz.schoolCtrl.model.Grade;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Long> {

	List<Grade> findByDescriptionStartingWithIgnoreCase(String nome);


}
