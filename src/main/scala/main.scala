class Personaje(var energia: Int){
    def felicidad(): Int = {
      return 1 //HAGO RETURN 1 PORQUE SINO HAY UN PROBLEMA DE TIPOS CON LOS DEF EN HUESPED Y ANFITRION
    }

  def rebeldia() = 1 / this.felicidad()

  def esRebelde(): Boolean ={return this.rebeldia() > 10}

}

class Huesped (energia: Int, var minutosRestantes: Int, var amigos: List[Personaje]) extends Personaje (energia) {
  override def felicidad(): Int = {
    return minutosRestantes * this.felicidadAmigos()
  }

  def felicidadAmigos(): Int ={
    return 1 //MODIFICAR
  }
}


class Anfitrion (energia: Int, var velocidadProcesamiento: Int, var recuerdos: List[Recuerdo]) extends Personaje (energia){
      override def felicidad(): Int = {
      return energia / velocidadProcesamiento * 10
    }
}

class Recuerdo (var descripcion: String, var escenario: Escenario){
  def emotividad(): Int = {
    return descripcion.size + escenario.nivelFama()
  }
}

class Escenario (var nombre: String, var categoria: String){
    def nivelFama(): Int ={
      return 100 + categoria.extra()
    }
}

class BajoCosto (var zona: String){
  def extra(): Int = {return zona.size}
}

object estandar {
  def extra(): Int ={ return 10}
}

class DeLujo(var cantidadVisitas: Int){
  def extra(): Int = {return cantidadVisitas}
}

class Trama (var persoanjes: List[Personaje], var escenario: Escenario){

}