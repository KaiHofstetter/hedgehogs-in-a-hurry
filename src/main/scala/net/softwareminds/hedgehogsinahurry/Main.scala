package net.softwareminds.hedgehogsinahurry

import net.softwareminds.hedgehogsinahurry.board.{Board, Row}
import net.softwareminds.hedgehogsinahurry.ui.BoardPrinter

object Main {
  def main(args: Array[String]) {

    val board = new Board()
    board.rows(0).cells(0).state = "occupied";
    board.rows(1).cells(1).state = "occupied";
    board.rows(2).cells(2).state = "occupied";
    board.rows(3).cells(3).state = "occupied";
    board.rows(4).cells(4).state = "occupied";

    println("Let the games begin!")
    println(new BoardPrinter(board).printBoard);
  }
}
