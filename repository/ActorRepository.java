package me.ratna.springboot12.repository;

import me.ratna.springboot12.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor,Long> {
}
