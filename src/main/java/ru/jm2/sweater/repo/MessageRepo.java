package ru.jm2.sweater.repo;

import org.springframework.data.repository.CrudRepository;
import ru.jm2.sweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
