/**
  * Created by constie on 12.04.2017.
  */
class Entity(var state: Int)
class CloneMe(species: Entity){
  def copy = new Entity(species.state)
}

//implicit def cloneMe(species: Entity): CloneMe = new CloneMe(species)

object Main {
  implicit def cloneMe(species: Entity): CloneMe = new CloneMe(species)

  def main(args: Array[String]){
    var pepper = new Entity(55)
    println("pepper: " + pepper.state)
    var salt = pepper.copy
    println("salt: " + salt.state)
  }
}
