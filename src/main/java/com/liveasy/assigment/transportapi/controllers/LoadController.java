package com.liveasy.assigment.transportapi.controllers;

// -- handles HTTP requests and passes data to the service layer.
//    exposes RESTful API endpoints to manage loads.
//    CRUD operations -as- HTTP methods (POST, GET, PUT, DELETE).
import com.liveasy.assigment.transportapi.models.Load;
import com.liveasy.assigment.transportapi.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/load") // -- base URL for the API as /load.
public class LoadController {
    @Autowired
    private LoadService loadService;

    // POST: add new load
    @PostMapping
    public String addLoad(@RequestBody Load load) {
        loadService.saveLoad(load);
        return "Load details added succesfully";
    }

    // GET: retrieve loads by shipperid
    @GetMapping
    public List<Load> getLoads(@RequestParam UUID shipperId) {
        return loadService.getLoadsByShipperId(shipperId);
    }

    // GET: Retrieve a load by loadId
    @GetMapping("/{loadId}")
    public Load getLoadById(@PathVariable UUID loadId) {
        return loadService.getLoadById(loadId);
    }

    // PUT: Update a load
    @PutMapping("/{loadId}")
    public String updateLoad(@PathVariable UUID loadId, @RequestBody Load load) {
        load.setLoadId(loadId);
        loadService.saveLoad(load);
        return "Load details updated successfully";
    }

    // DELETE: Delete a load
    @DeleteMapping("/{loadId}")
    public String deleteLoad(@PathVariable UUID loadId) {
        loadService.deleteLoadById(loadId);
        return "Load deleted successfully";
    }

}
