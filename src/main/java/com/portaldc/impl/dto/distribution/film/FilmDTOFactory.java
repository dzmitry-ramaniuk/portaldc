package com.portaldc.impl.dto.distribution.film;

import com.portaldc.api.dao.user.UserDAO;
import com.portaldc.api.dto.distibution.film.FilmDTO;
import com.portaldc.api.model.distributions.Film;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmDTOFactory {

    @Autowired
    UserDAO userDAO;


    public Film createModel(FilmDTO dto){
        Film film = new Film();

        if(dto != null){
            film.setLinkImdb(dto.getLinkImdb());
            film.setLinkKinopoisk(dto.getLinkKinopoisk());
            film.setTime(dto.getTime());
            film.setSubcategories(dto.getCategories());
            film.setCountry(dto.getCountry());
            film.setDescription(dto.getDescription());
            film.setGanre(dto.getGanre());
            if(dto.getId() != null)
                film.setId(dto.getId());
            film.setLinks(dto.getLinks());
            film.setName(dto.getName());
            film.setNativeName(dto.getNativeName());
            film.setGanre(dto.getGanre());
            film.setState(dto.getState());
            film.setYear(dto.getYear());
            film.setUser(userDAO.findUserById(dto.getId()));
        }

        return film;
    }
}