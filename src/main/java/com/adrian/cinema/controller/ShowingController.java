package com.adrian.cinema.controller;

import com.adrian.cinema.Service.ShowingService;
import com.adrian.cinema.model.Showing;
import com.adrian.cinema.repository.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.adrian.cinema.exception.ResourceNotFoundException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowingController {
    private final ShowingService showingService;

    @Autowired
    ShowingController(ShowingService showingService) {
        this.showingService = showingService;
    }


    @GetMapping("/showing")
    public List<Showing> getAllShowing() {
        List<Showing> showings = showingService.getAllShowing();
        return showings;
    }

    @PostMapping("/showing")
    public Showing createShowing(@Valid @RequestBody Showing showing) {
        return showingService.createShowing(showing);
    }

    @GetMapping("/showing/{id_showing}")
    public Showing getShowingById(@PathVariable(value = "id_showing") Long showingId) {
        return showingService.getShowingById(showingId);
    }

    @PutMapping("/showing/{id_showing}")
    public Showing updateShowing(@PathVariable(value = "id_showing") Long showingId,
                                 @Valid @RequestBody Showing showingDetails) {
        return showingService.updateShowing(showingId, showingDetails);
    }

    @DeleteMapping("/showing/{id_showing}")
    public ResponseEntity<?> deleteUssers(@PathVariable(value = "id_showing") Long showingId) {
        return showingService.deleteShowing(showingId);
    }
}
