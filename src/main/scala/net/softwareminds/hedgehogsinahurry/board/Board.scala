package net.softwareminds.hedgehogsinahurry.board

import net.softwareminds.hedgehogsinahurry.board.GameToken.GameToken

case class Board(val rows: List[Row] = List(new Row(), new Row(), new Row(), new Row(), new Row(), new Row())) {
  def addGameToken(rowNum: Int, cellNum: Int, gameToken: GameToken): Board = {
    val updatedRows : List[Row] = rows.updated(rowNum, rows(rowNum).addGameToken(cellNum, gameToken));

    Board( updatedRows );
  }

  def removeGameToken(rowNum: Int, cellNum: Int): Board = {
    val updatedRows: List[Row] = rows.updated(rowNum, rows(rowNum).removeGameToken(cellNum));

    Board(updatedRows);
  }

  def setBlackField(rowNum: Int, cellNum: Int): Board = {
    val updatedRows : List[Row] = rows.updated(rowNum, rows(rowNum).setBlackField(cellNum));

    Board( updatedRows );
  }
}
