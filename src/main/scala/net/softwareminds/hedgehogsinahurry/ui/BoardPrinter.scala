package net.softwareminds.hedgehogsinahurry.ui

import net.softwareminds.hedgehogsinahurry.board.{BlackCell, Board}

class BoardPrinter(val board: Board) {
  def printBoard {
    for (row <- board.rows){
      print("|");
      for (cell <- row.cells){
        if( cell.isInstanceOf[BlackCell] ) {
          print(f"           X         |");
        } else {
          print(f"${cell.gameTokens}%20s |");
        }
      }
      println;
    }
  }
}
