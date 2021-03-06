package com.finalproject.video.game.database.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;


@Service
public class VideoGameNameService {
	
	@Autowired
	private VideoGameNameRepository repo;
	
	
	
	public Iterable<VideoGameName> getAllGameNames() {
		return repo.findAll();
	}
	
	public VideoGameName getVideoGameName(Long gameId) {
		return repo.findById(gameId).get();
	}
	
	public VideoGameName createVideoGameName(VideoGameName videoGameName) {
		return repo.save(videoGameName);
		
	}
	
	public void deleteVideoGameName(Long gameId) {
		repo.deleteById(gameId);
	}	
			
}

