package com.placetolearn.repository;

import com.placetolearn.persistence.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
