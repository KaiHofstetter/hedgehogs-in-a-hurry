package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class WhiteCell(gameTokens : List[GameToken] = List()) extends Cell(gameTokens) {

  def addGameToken(gameToken: GameToken): WhiteCell = {

    val updatedGameTokens: List[GameToken] = gameToken :: gameTokens;

    new WhiteCell(updatedGameTokens);
  }
}
