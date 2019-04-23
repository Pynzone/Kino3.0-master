package com.adrian.cinema.ConverterDTO;

import com.adrian.cinema.model.Showing;

public class DefaultShowingConverter implements BaseConverter<Showing, ShowingDTO> {

    @Override
   public ShowingDTO convert(Showing form){
        ShowingDTO showing = new ShowingDTO();
        showing.setShowingId(form.getShowingId());
        showing.setDate(form.getDate());
        showing.setPrice(form.getPrice());
        return showing;
    }
}
