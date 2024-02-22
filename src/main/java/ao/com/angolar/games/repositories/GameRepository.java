package ao.com.angolar.games.repositories;

import ao.com.angolar.games.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
