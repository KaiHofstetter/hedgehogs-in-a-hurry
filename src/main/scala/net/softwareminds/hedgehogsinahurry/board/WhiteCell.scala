package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class WhiteCell(gameTokens : List[GameToken] = List()) extends Cell(gameTokens) {

  override def addGameToken(gameToken: GameToken): WhiteCell = {
    new WhiteCell(addGameTokenToCell(gameToken));
  }

  override def removeGameToken(): WhiteCell = {
    new WhiteCell(removeLastTokenFromCell());
  }

}
