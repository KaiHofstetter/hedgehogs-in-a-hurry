package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken
import org.scalatest.{FlatSpec, FunSuite}

class BoardTest extends FlatSpec {

  "A new Board" should "not have game tokens" in {
    val board = new Board();

    assert(board.rows forall (_.cells forall (_.isEmpty)))
  }

  it should "set the game token at the correct position" in {
    var board = new Board();

    board = board.addGameToken(2,4, GameToken.PLAYER_1);

    assert(board.rows(2).cells(4).getLastAddedGameToken() == GameToken.PLAYER_1)
  }

  it should "allow null value GameTokens for black fields" in {
    var board = new Board();

    board = board.setBlackField(2,4);

    assert(board.rows(2).cells(4).isInstanceOf[BlackCell]);
  }
}
