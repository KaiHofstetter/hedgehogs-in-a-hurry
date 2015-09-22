package net.softwareminds.hedgehogsinahurry.board

import org.scalatest.{FlatSpec, FunSuite}

class WhiteCellTest extends FlatSpec {

  "A new WhiteCell" should "not have game tokens" in {
    val whiteCell = new WhiteCell();

    assert(whiteCell.gameTokens.isEmpty)
  }

  it should "add game tokens at the end" in {
    var whiteCell = new WhiteCell();

    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_1);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_2);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_3);

    assert(whiteCell.gameTokens.size == 3);
    assert(whiteCell.gameTokens(0) == GameToken.PLAYER_3)
    assert(whiteCell.gameTokens(1) == GameToken.PLAYER_2)
    assert(whiteCell.gameTokens(2) == GameToken.PLAYER_1)
  }

  it should "remove tokens from the end" in {
    var whiteCell = new WhiteCell();

    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_1);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_2);
    whiteCell = whiteCell.addGameToken(GameToken.PLAYER_3);
    whiteCell = whiteCell.removeGameToken();

    assert(whiteCell.gameTokens.size == 2);
    assert(whiteCell.gameTokens(0) == GameToken.PLAYER_2)
    assert(whiteCell.gameTokens(1) == GameToken.PLAYER_1)
  }
}