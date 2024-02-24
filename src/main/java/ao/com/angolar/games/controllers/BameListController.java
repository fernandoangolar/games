package ao.com.angolar.games.controllers;

import ao.com.angolar.games.Dto.GameListDTO;
import ao.com.angolar.games.Dto.GameMinDTO;
import ao.com.angolar.games.service.GameListService;
import ao.com.angolar.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gamesList")
public class BameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> entity = gameService.findByGameList(listId);
        return entity;
    }
}
