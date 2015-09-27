package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken._

abstract class Cell(val gameTokens : List[GameToken]) {

  def addGameToken(gameToken: GameToken) : Cell
  def removeGameToken() : Cell

}
