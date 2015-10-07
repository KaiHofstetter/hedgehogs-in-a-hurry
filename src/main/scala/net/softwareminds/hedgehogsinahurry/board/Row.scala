package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken._

case class Row(val cells: List[Cell] = List(new WhiteCell(), new WhiteCell(), new WhiteCell(), new WhiteCell(), new WhiteCell())) {
  def addGameToken(cellNum: Int, gameToken: GameToken): Row = {
    val updatedCells: List[Cell] = cells.updated(cellNum, cells(cellNum).addGameToken(gameToken));

    Row(updatedCells);
  }

  def removeGameToken(sourceCellNum: Int): Row = {
    val updatedCells: List[Cell] = cells.updated(sourceCellNum, cells(sourceCellNum).removeGameToken())

    Row(updatedCells);
  }

  def getLastAddedGameToken(sourceCellNum: Int): GameToken = {
    cells(sourceCellNum).getLastAddedGameToken();
  }

  def setBlackField(cellNum: Int): Row = {
    val updatedCells: List[Cell] = cells.updated(cellNum, new BlackCell());

    Row(updatedCells);
  }
}
