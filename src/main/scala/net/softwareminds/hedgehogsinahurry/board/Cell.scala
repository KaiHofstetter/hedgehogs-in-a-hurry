package net.softwareminds.hedgehogsinahurry.board

class Cell {
  object State extends Enumeration {
    type State = Value
    val EMPTY, OCCUPIED = Value
  }
}
