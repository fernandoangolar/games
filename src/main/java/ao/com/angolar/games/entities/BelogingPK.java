package ao.com.angolar.games.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Embeddable
public class BelogingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    public BelogingPK () {}

    public BelogingPK(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelogingPK that)) return false;
        return getGame().equals(that.getGame()) && getGameList().equals(that.getGameList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGame(), getGameList());
    }
}
