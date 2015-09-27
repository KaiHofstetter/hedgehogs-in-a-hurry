package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class BlackCell(gameTokens : List[GameToken] = List())  extends Cell(gameTokens) {

  override def addGameToken(gameToken: GameToken): BlackCell = {

    val updatedGameTokens: List[GameToken] = gameToken :: gameTokens;

    new BlackCell(updatedGameTokens);
  }

  override def removeGameToken(): BlackCell = {

    val updatedGameTokens: List[GameToken] = gameTokens.drop(1);

    new BlackCell(updatedGameTokens);
  }
}