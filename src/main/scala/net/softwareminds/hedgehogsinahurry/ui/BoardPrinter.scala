package net.softwareminds.hedgehogsinahurry.ui

import net.softwareminds.hedgehogsinahurry.board.{Cell, WhiteCell, BlackCell, Board}

class BoardPrinter(val board: Board) {
  def printBoard {
    for (row <- board.rows){
      print("|");
      for (cell <- row.cells){
        printCell(cell);
      }
      println;
    }
  }

  private def printCell(cell: Cell): Unit = cell match {
    case blackCell : BlackCell => print(f"B${blackCell.gameTokens}%20sB |");
    case whiteCell : WhiteCell => print(f"W${whiteCell.gameTokens}%20sW |");
  }
}
