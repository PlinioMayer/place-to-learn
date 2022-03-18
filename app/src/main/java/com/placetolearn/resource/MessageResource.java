package com.placetolearn.resource;

import com.placetolearn.persistence.model.Message;
import com.placetolearn.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageResource {

    private final MessageService service;

    public MessageResource(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<Message> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Message find(@PathVariable Long id) {
        return service.find(id);
    }

    @PostMapping
    public Message save(@RequestBody Message message) {
        return service.save(message);
    }

    @PutMapping("/{id}")
    public Message update(@RequestBody Message message, @PathVariable Long id) {
        message.setId(id);
        return service.save(message);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
