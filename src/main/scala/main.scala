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