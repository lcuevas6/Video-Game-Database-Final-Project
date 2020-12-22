package com.finalproject.video.game.database.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Genre;

import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.GenreRepository;

import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repo;
	
	@Autowired VideoGameNameRepository gameRepo;
	
	
	public Genre createGenre(Genre genre, Long videoGameNameId) throws Exception{
		VideoGameName game = gameRepo.findById(videoGameNameId).get();
		if (game == null) {
			throw new Exception("Game does not exist.");
		}
			return repo.save(genre);
	}

}
