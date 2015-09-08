package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class BlackCell(gameTokens : List[GameToken] = List()) extends Cell(gameTokens){

  def addGameToken(gameToken: GameToken) : BlackCell = {

    val updatedGameTokens: List[GameToken] = gameToken :: gameTokens;

    new BlackCell(updatedGameTokens);
  }
}
