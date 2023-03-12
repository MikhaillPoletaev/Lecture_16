import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test

    public void whenFirstPlayerStrongerThanSecond() {
        Game game = new Game();
        Player player1 = new Player(1, "Григорий", 3);
        Player player2 = new Player(2, "Василий", 2);

        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Григорий", "Василий");

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void whenSecondPlayerStrongerThanFirst() {
        Game game = new Game();
        Player player1 = new Player(1, "Григорий", 3);
        Player player2 = new Player(2, "Василий", 6);

        game.register(player1);
        game.register(player2);

        int expected = 2;
        int actual = game.round("Григорий", "Василий");

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void whenStrengthTheSame() {
        Game game = new Game();
        Player player1 = new Player(1, "Григорий", 5);
        Player player2 = new Player(2, "Василий", 5);

        game.register(player1);
        game.register(player2);

        int expected = 0;
        int actual = game.round("Григорий", "Василий");

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void whenPlayer1IsNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Григорий", 5);
        Player player2 = new Player(2, "Василий", 5);

        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Григорий", "Василий"));


    }

    @Test

    public void whenPlayer2IsNotRegistered() {
        Game game = new Game();
        Player player1 = new Player(1, "Григорий", 5);
        Player player2 = new Player(2, "Василий", 5);

        game.register(player1);


        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Григорий", "Василий"));


    }

    @Test

    public void getId() {
        Game game = new Game();

        Player player1 = new Player(1, "Григорий", 5);
        Player player2 = new Player(2, "Василий", 5);

        game.register(player1);
        game.register(player2);

        int actual = 1;
        int expected = player1.getId();

        Assertions.assertEquals(expected, actual);


    }

}



