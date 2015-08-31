package net.softwareminds.hedgehogsinahurry

import net.softwareminds.hedgehogsinahurry.board.{GameToken, Board, Row}
import net.softwareminds.hedgehogsinahurry.ui.BoardPrinter

object Main {
  def main(args: Array[String]) {

    val board = new Board()
      .setBlackField(0,1)
      .setBlackField(1,2)
      .setBlackField(2,3)
      .setBlackField(3,4)
      .addGameToken(0,0,GameToken.PLAYER_1)
      .addGameToken(1,1,GameToken.PLAYER_1)
      .addGameToken(2,2,GameToken.PLAYER_2)
      .addGameToken(3,3,GameToken.PLAYER_2)
      .addGameToken(4,4,GameToken.PLAYER_3);

    println("Let the games begin!")
    println(new BoardPrinter(board).printBoard);
  }
}
