package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

case class Cell(gameTokens : List[GameToken] = List()) {
  def addGameToken(gameToken: GameToken): Cell = {

    val updatedGameTokens : List[GameToken] = gameToken :: gameTokens;

    Cell( updatedGameTokens );
  }

  def setBlackField(): Cell = {
    Cell( null );
  }

  def isBlackField(): Boolean = {
    gameTokens == null;
  }
}
