import java.awt.List

class Personaje(var energia: Int){
    def felicidad(): Int ={

    } //COMO SACO EL UNIT?

  def rebeldia() = 1 / this.felicidad()

  def esRebelde(): Boolean ={return this.rebeldia() > 10}

  } //Y ESTE ERROR????
}

class Huesped (energia: Int, var minutosRestantes: Int, var amigos: List[Personaje]) extends Personaje (energia) {
  override def felicidad(): Int = {
    return minutosRestantes * this.felicidadAmigos()
  }

  def felicidadAmigos(): Int = {} //ACA TAMBIEN. COMO SACO EL UNIT?
}


class Anfitrion (energia: Int, var velocidadProcesamiento: Int, var recuerdos: List[Recuerdo]) extends Personaje (energia){
      override def felicidad(): Int = {
      return energia / velocidadProcesamiento * 10
    }
}

class Recuerdo (var descripcion: String, var escenario: Escenario){

}

class Escenario (var nombre: String, var categoria: String){

}

class Trama (var persoanjes: List[Personaje], var escenario: Escenario){

}


/*
class Personaje{
  var energia

  def energia(): Int ={
    return energia
  }

  def energia(unValor: Int){
    energia = unValor
  }

}


class Anfitrion extends Personaje{
  var velocidadProces
  var recuerdos
}


class Huesped extends Personaje{
  var minutosRestantes
  var amigos
}

class Recuerdo{
  var descripcion
  var escenario
}


class Escenario{
  var nombre
  var categoria
}


class Trama{
  var persoajes
  var escenario
}
*/