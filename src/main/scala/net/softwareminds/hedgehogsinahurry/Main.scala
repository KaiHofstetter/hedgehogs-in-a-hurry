package net.softwareminds.hedgehogsinahurry

import net.softwareminds.hedgehogsinahurry.board.CellState.OCCUPIED
import net.softwareminds.hedgehogsinahurry.board.{CellState, Board, Row}
import net.softwareminds.hedgehogsinahurry.ui.BoardPrinter

object Main {
  def main(args: Array[String]) {

    val board = new Board()
    board.rows(0).cells(0).state = OCCUPIED;
    board.rows(1).cells(1).state = OCCUPIED;
    board.rows(2).cells(2).state = OCCUPIED;
    board.rows(3).cells(3).state = OCCUPIED;
    board.rows(4).cells(4).state = OCCUPIED;

    println("Let the games begin!")
    println(new BoardPrinter(board).printBoard);
  }
}
