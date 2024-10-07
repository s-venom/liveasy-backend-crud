package com.liveasy.assigment.transportapi.services;

// -- defines logic between the controller (API layer) and repository (database layer).
//    provides methods to CRUD Load entities.
import com.liveasy.assigment.transportapi.models.Load;
import com.liveasy.assigment.transportapi.repositories.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LoadService {
    @Autowired // -- to delegate database operations to the repository layer.
    private LoadRepository loadRepository;

    public Load saveLoad(Load load) {
        return loadRepository.save(load);
    }

    public List<Load> getLoadsByShipperId(UUID shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load getLoadById(UUID loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    public void deleteLoadById(UUID loadId) {
        loadRepository.deleteById(loadId);
    }
}
