package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

class BlackCell(gameTokens : List[GameToken] = List())  extends Cell(gameTokens) {

  override def addGameToken(gameToken: GameToken): BlackCell = {
    new BlackCell(addGameTokenToCell(gameToken));
  }

  override def removeGameToken(): BlackCell = {
    new BlackCell(removeLastTokenFromCell());
  }

}