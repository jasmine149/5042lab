package com.demo.service;
import com.demo.model.persistingRoom;
import com.demo.model.persistingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class persistingRoomService {
    @Autowired
    persistingRoomRepository repo;
    public void save(persistingRoom persistingRoom) {
        repo.save(persistingRoom);
    }
    public List<persistingRoom> listAll() {
        return (List<persistingRoom>) repo.findAll();
    }
    public persistingRoom get(Long id) {
        return repo.findById(id).get();
    }
    public void delete(Long id) {
        repo.deleteById(id);
    }
    public List<persistingRoom> search(String keyword) {
        return repo.search(keyword);
    }
}
