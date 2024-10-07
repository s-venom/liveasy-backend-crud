package com.liveasy.assigment.transportapi.repositories;

// -- provides methods for interacting with the loads table.
//    extends JpaRepository, providing CRUD operations without the need to write SQL queries. 
import com.liveasy.assigment.transportapi.models.Load;
import org.springframework.data.jpa.repository.JpaRepository; // -- provides built-in methods like save, findById, deleteById, etc.
import java.util.*;

public interface LoadRepository extends JpaRepository<Load, UUID> {
    // to find loads by shipperId
    List<Load> findByShipperId(UUID shipperId);
}
