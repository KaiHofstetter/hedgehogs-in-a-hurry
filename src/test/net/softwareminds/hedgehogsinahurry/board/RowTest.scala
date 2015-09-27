package net.softwareminds.hedgehogsinahurry.board

import org.scalatest.{FlatSpec, FunSuite}

class RowTest extends FlatSpec {

  "A new WhiteCell" should "add a new game token" in {
    val row = new Row().addGameToken(2, GameToken.PLAYER_1);

    assert(row.cells(2).gameTokens.size == 1);
    assert(row.cells(2).gameTokens(0) == GameToken.PLAYER_1);
  }

  it should "move a game token" in {
    val row = new Row().addGameToken(2, GameToken.PLAYER_2);

    val movedRow = row.moveGameToken(2, 4);

    assert(movedRow.cells(2).gameTokens.size == 0);
    assert(movedRow.cells(4).gameTokens.size == 1);
    assert(movedRow.cells(4).gameTokens(0) == GameToken.PLAYER_2)
  }
}
