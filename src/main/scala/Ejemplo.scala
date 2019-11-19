package animales

abstract class Animal(var anios: Int) {
  def cumplirAnios() = {
    this.anios += 1
  }
  def saludar(): String
}

class Perro(anios: Int, val raza: String) extends Animal(anios) {
  override def saludar(): String = s"Guau! Soy de la raza: $raza y tengo $anios"
}

class Gato(anios: Int) extends Animal(anios) {
  override def saludar(): String = s"Miau, tengo $anios años"
}