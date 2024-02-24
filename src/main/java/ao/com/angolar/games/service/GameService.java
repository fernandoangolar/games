package ao.com.angolar.games.service;

import ao.com.angolar.games.Dto.GameDTO;
import ao.com.angolar.games.Dto.GameMinDTO;
import ao.com.angolar.games.entities.Game;
import ao.com.angolar.games.projections.GameMinProjection;
import ao.com.angolar.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll() {

        List<Game> game = gameRepository.findAll();
        List<GameMinDTO> dto = game.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    public GameDTO findById(Long id_game) {

        Game game = gameRepository.findById(id_game).get();
        GameDTO dto = new GameDTO(game);
        return dto;
    }

    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }
}
