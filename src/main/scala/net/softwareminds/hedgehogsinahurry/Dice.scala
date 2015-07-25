package net.softwareminds.hedgehogsinahurry

import scala.util.Random

object Dice {
  val randomGenerator = new Random;

  def rollDice(): Int = {
    randomGenerator.nextInt(6)+1;
  }
}
