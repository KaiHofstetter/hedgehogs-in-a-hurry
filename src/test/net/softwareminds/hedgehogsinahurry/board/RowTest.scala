package net.softwareminds.hedgehogsinahurry.board

import org.scalatest.{FlatSpec, FunSuite}

class RowTest extends FlatSpec {

  "A new WhiteCell" should "add a new game token" in {
    val row = new Row().addGameToken(2, GameToken.PLAYER_1);

    assert(row.cells(2).getNumberOfTokens() == 1);
    assert(row.cells(2).getLastAddedGameToken() == GameToken.PLAYER_1);
  }

  it should "return last added game token" in {
    val row = new Row().addGameToken(2, GameToken.PLAYER_2)
                       .addGameToken(2, GameToken.PLAYER_4)
                       .addGameToken(2, GameToken.PLAYER_1);

    val lastAddedGameToken = row.getLastAddedGameToken(2);

    assert(lastAddedGameToken == GameToken.PLAYER_1)
  }


  it should "remove last added game token" in {
    val row = new Row().addGameToken(2, GameToken.PLAYER_2)
                       .addGameToken(2, GameToken.PLAYER_4)
                       .addGameToken(2, GameToken.PLAYER_1);

    val updatedRow = row.removeGameToken(2);

    assert(updatedRow.cells(2).getNumberOfTokens() == 2);
    assert(updatedRow.cells(2).getLastAddedGameToken() == GameToken.PLAYER_4);
  }
}
