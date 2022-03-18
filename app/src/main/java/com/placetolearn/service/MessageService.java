package com.placetolearn.service;

import com.placetolearn.persistence.model.Message;
import com.placetolearn.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> list() {
        return repository.findAll();
    }

    public Message find(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Message save(Message message) {
        return repository.save(message);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
