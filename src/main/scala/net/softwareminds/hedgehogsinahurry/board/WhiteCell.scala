package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class WhiteCell(gameTokens : List[GameToken] = List()) extends Cell(gameTokens) {

  def addGameToken(gameToken: GameToken): WhiteCell = {

    val updatedGameTokens: List[GameToken] = gameToken :: gameTokens;

    new WhiteCell(updatedGameTokens);
  }

  def removeGameToken(): WhiteCell = {

    val updatedGameTokens: List[GameToken] = gameTokens.drop(1);

    new WhiteCell(updatedGameTokens);
  }
}
