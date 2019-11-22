package  trama

import escenario.Escenario
import personaje.Personaje


class Trama (var personajes :List[Personaje], val escenarioPrincipal :Escenario)
{
  def complejidad() :Double =
    {
      escenarioPrincipal.nivelDeFama() / personajes.map(unPersonaje => unPersonaje.nivelDeFelicidad()).max
    }
  def renovar() =
    {
      escenarioPrincipal.evolucionar()
      personajes = personajes.filter(unPersonaje => !(unPersonaje.esRebelde()))
    }


  def referenciaCruzada(otraTrama :Trama): Unit =
  {
    otraTrama.referenciaCruzada(this)
    conocerElOtroEscenario(otraTrama.escenarioPrincipal)
    interactuarConOtros(otraTrama.personajes)
  }
  def conocerElOtroEscenario(escenario: Escenario): Unit =
  {
    personajes.foreach(personaje => personaje.conocerUnEscenario(escenario))
  }
  def interactuarConOtros(otrosPersonajes: List[Personaje]): Unit =
  {
    personajes.foreach(personaje => personaje.iniciarConversacionConMuchos(otrosPersonajes))
  }
}
