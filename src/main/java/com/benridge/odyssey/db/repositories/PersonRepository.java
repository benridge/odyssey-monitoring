package com.benridge.odyssey.db.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.benridge.odyssey.db.entities.PersonEntity;
@Repository
public interface PersonRepository  extends JpaRepository<PersonEntity, Integer>{

}