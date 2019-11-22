package personaje

import recuerdo.Recuerdo
import escenario.Escenario

abstract class Personaje(var energia : Double)
{
  def nivelDeFelicidad() :Double =  energia
  def nivelDeRebeldia() :Double =  1/nivelDeFelicidad()
  def conocerUnEscenario(unEscenario :Escenario): Unit =  unEscenario.teVisita(this)
  def perderEnergia(unaEnergia :Double):Unit =
    {
      if (energia > unaEnergia)
        {
          energia -= unaEnergia
        }
      else
        {
          energia = 0
        }
    }
  def esRebelde():Boolean = nivelDeRebeldia() > 10
  def matar() =
    {
      energia -= energia
      this
    }
  def iniciarConversacion(otroPersonaje :Personaje): Unit =
  {
    energia /= 2
  }
  def iniciarConversacionConMuchos(otrosPersonajes :List[Personaje]): Unit =
  {
    otrosPersonajes.foreach(unPersonaje => iniciarConversacion(unPersonaje))
  }
}

class Anfitrion (energia : Double, var velocidad : Double , var recuerdos : List[Recuerdo]) extends Personaje(energia)
{
  override def nivelDeFelicidad(): Double = super.nivelDeFelicidad()/velocidad

  override def conocerUnEscenario(unEscenario: Escenario): Unit =
    {
      super.conocerUnEscenario(unEscenario)
      this.ganarRecuerdo(unEscenario)
    }
  def ganarRecuerdo(unEscenario: Escenario) =
    {
      recuerdos = recuerdos.:+(new Recuerdo(descripcion = s"fui a visitar ${unEscenario.nombre}",escenario = unEscenario))
    }

  override def iniciarConversacion(otroPersonaje: Personaje): Unit =
    {
      super.iniciarConversacion(otroPersonaje)
      velocidad /= 2
    }

  override def matar() =
    {
      super.matar()
      velocidad -= velocidad
      this
    }
}


class Huesped (energia : Double, var minutosRestantes :Int, var bff : List[Personaje]) extends Personaje(energia)
{
  override def nivelDeFelicidad(): Double = (minutosRestantes) * bff.map(unPersonaje => unPersonaje.nivelDeFelicidad()).sum
  override def conocerUnEscenario(unEscenario: Escenario): Unit =
    {
      super.conocerUnEscenario(unEscenario)
      minutosRestantes -= 10
    }

  override def matar() =
    {
      super.matar()
      minutosRestantes -= minutosRestantes
      this
    }
  override def iniciarConversacion(otroPersonaje: Personaje): Unit =
  {
    super.iniciarConversacion(otroPersonaje)
    agregarComoAmigo(otroPersonaje)
  }

  def agregarComoAmigo(personaje: Personaje) =
    {
      bff.::(personaje)
    }
}


