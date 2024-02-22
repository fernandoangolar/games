package ao.com.angolar.games.service;

import ao.com.angolar.games.Dto.GameDTO;
import ao.com.angolar.games.entities.Game;
import ao.com.angolar.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {

        List<Game> game = gameRepository.findAll();
        List<GameDTO> dto = game.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }
}
