package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.CellState.CellState

case class Board(val rows: List[Row] = List(new Row(), new Row(), new Row(), new Row(), new Row(), new Row())) {
  def setCellState(rowNum: Int, cellNum: Int, cellState: CellState): Board = {
    
    val updatedCellList : List[Cell] = rows(rowNum).cells.updated(cellNum, Cell(cellState));
    val updatedRowList : List[Row] = rows.updated(rowNum, Row(updatedCellList));

    Board(updatedRowList);
  }
}
