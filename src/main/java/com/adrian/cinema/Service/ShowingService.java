package com.adrian.cinema.Service;

import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Showing;
import com.adrian.cinema.repository.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Service
public class ShowingService {
    @Autowired
    ShowingRepository showingRepository;


    public List<Showing> getAllShowing()
    {
        return showingRepository.findAll();
    }

    public Showing createShowing(Showing showing)
    {
        return showingRepository.save(showing);
    }

    public Showing getShowingById(Long showingId)
    {
        return showingRepository.findById(showingId).
                orElseThrow(()->new ResourceNotFoundException("Showing","id_showing",showingId));
    }

    public Showing updateShowing(Long showingId,
                                  Showing showingDetails)
    {
        Showing showing = showingRepository.findById(showingId).
                orElseThrow(() -> new ResourceNotFoundException("Showing", "id_showing", showingId));

        showing.setDate(showingDetails.getDate());
        showing.setMovie(showingDetails.getMovie());
        showing.setPrice(showingDetails.getPrice());
        showing.setRoom(showingDetails.getRoom());
        Showing updatedShowing = showingRepository.save(showing);
        return updatedShowing;
    }

    public ResponseEntity<?> deleteShowing(Long showingId)
    {
        Showing showing = showingRepository.findById(showingId).
                orElseThrow(()->new ResourceNotFoundException("Showing","id_showing",showingId));
        showingRepository.delete(showing);
        return ResponseEntity.ok().build();
    }
}
