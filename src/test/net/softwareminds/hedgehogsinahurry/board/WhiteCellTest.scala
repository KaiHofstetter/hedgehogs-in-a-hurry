package net.softwareminds.hedgehogsinahurry.board

import org.scalatest.{FlatSpec, FunSuite}

class WhiteCellTest extends FlatSpec {

  "A new WhiteCell" should "not have game tokens" in {
    val whiteCell = new WhiteCell();

    assert(whiteCell.isEmpty)
  }

  it should "add game tokens at the end" in {
    var whiteCell = new WhiteCell();

    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_1);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_2);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_3);

    assert(whiteCell.getNumberOfTokens() == 3);
    assert(whiteCell.getLastAddedGameToken() == GameToken.PLAYER_3)
  }

  it should "remove tokens from the end" in {
    var whiteCell = new WhiteCell();

    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_1);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_2);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_3);
    whiteCell = whiteCell.removeGameToken();

    assert(whiteCell.getNumberOfTokens == 2);
    assert(whiteCell.getLastAddedGameToken() == GameToken.PLAYER_2)
  }
}