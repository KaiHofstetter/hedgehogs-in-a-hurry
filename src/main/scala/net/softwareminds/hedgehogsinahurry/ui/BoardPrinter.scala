package net.softwareminds.hedgehogsinahurry.ui

import net.softwareminds.hedgehogsinahurry.board.Board

class BoardPrinter(val board: Board) {
  def printBoard {
    for (row <- board.rows){
      print("|");
      for (cell <- row.cells){
        print(f"${cell.state}%8s |");
      }
      println;
    }
  }
}
