package ao.com.angolar.games.controllers;

import ao.com.angolar.games.Dto.GameDTO;
import ao.com.angolar.games.Dto.GameMinDTO;
import ao.com.angolar.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameMinDTO> findAll () {
        return gameService.findAll();
    }

    @GetMapping("/{id_game}")
    public GameDTO findById(@PathVariable Long id_game) {
        return gameService.findById(id_game);
    }
}
