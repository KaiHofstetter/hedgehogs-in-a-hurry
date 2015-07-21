package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken._

case class Row(val cells : List[Cell] = List(new Cell(), new Cell(), new Cell(), new Cell(), new Cell())) {
  def addGameToken(cellNum: Int, gameToken: GameToken): Row = {

    val updatedCells : List[Cell] = cells.updated(cellNum, cells(cellNum).addGameToken(gameToken));

    Row( updatedCells );
  }
}
