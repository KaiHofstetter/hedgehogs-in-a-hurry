package net.softwareminds.hedgehogsinahurry

import net.softwareminds.hedgehogsinahurry.board.CellState.OCCUPIED
import net.softwareminds.hedgehogsinahurry.board.{CellState, Board, Row}
import net.softwareminds.hedgehogsinahurry.ui.BoardPrinter

object Main {
  def main(args: Array[String]) {

    val board = new Board()
      .setCellState(0,0,OCCUPIED)
      .setCellState(1,1,OCCUPIED)
      .setCellState(2,2,OCCUPIED)
      .setCellState(3,3,OCCUPIED)
      .setCellState(4,4,OCCUPIED);

    println("Let the games begin!")
    println(new BoardPrinter(board).printBoard);
  }
}
