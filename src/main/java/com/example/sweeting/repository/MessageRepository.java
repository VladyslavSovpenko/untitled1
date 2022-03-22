package com.example.sweeting.repository;

import com.example.sweeting.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {
    List<Message> findByTag(String tag);
}
