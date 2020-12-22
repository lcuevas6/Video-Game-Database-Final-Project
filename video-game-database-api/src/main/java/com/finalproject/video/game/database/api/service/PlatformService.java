package com.finalproject.video.game.database.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalproject.video.game.database.api.entity.Platform;
import com.finalproject.video.game.database.api.entity.VideoGameName;
import com.finalproject.video.game.database.api.repository.PlatformRepository;
import com.finalproject.video.game.database.api.repository.UserRepository;
import com.finalproject.video.game.database.api.repository.VideoGameNameRepository;

@Service
public class PlatformService {
		@Autowired
		private PlatformRepository repo;
		
		@Autowired VideoGameNameRepository gameRepo;
		
		@Autowired UserRepository userRepo;
		
		public Platform createPlatfrom(Platform platform, Long gameId) throws Exception{
			VideoGameName game = gameRepo.findById(gameId).get();
			if (game == null) {
				throw new Exception("Game does not exist.");
			}
			
			return repo.save(platform);
		}
		
		
}
