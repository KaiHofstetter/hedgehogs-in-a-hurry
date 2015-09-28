package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken._

abstract class Cell(private val gameTokens: List[GameToken]) {

  def addGameToken(gameToken: GameToken): Cell

  def removeGameToken(): Cell

  protected def addGameTokenToCell(gameToken: GameToken) : List[GameToken] = {
    gameToken :: gameTokens
  }

  protected def removeLastTokenFromCell() : List[GameToken] = {
    gameTokens.drop(1);
  }

  def getLastAddedGameToken() : GameToken = {
    gameTokens.head;
  }

  def getNumberOfTokens() : Int = {
    gameTokens.length;
  }

  def isEmpty() : Boolean = {
    gameTokens.isEmpty;
  }

 }
