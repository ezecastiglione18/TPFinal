package  escenario
import personaje.Personaje

trait EscenarioBase
{
  def extra() = 0
  def visita = {}
  def evolucionar() :EscenarioBase
}

class Escenario (val nombre :String, var tipo :EscenarioBase)
{
  def nivelDeFama() = 100 + tipo.extra()
  def teVisita(alguien :Personaje): Unit =
  {
    alguien.perderEnergia(nivelDeFama())
    tipo.visita
  }
  def evolucionar() =
  {
    tipo = tipo.evolucionar()
  }

}

class BajoCoste(val nombre :String, val zona :String) extends EscenarioBase
{
  override def extra() = zona.length
  override def evolucionar(): EscenarioBase = new Estandar(nombre)
}

class Estandar(val nombre :String)  extends EscenarioBase
{
  override def extra() = 10
  override def evolucionar(): EscenarioBase = new DeLujo(nombre,0)
}

class DeLujo(val nombre :String, var cantidadDeVisitas :Int)  extends EscenarioBase
{
  override def extra() = cantidadDeVisitas
  override def visita() = cantidadDeVisitas += 1

  override def evolucionar(): EscenarioBase =
    {
      throw new ExceptionInInitializerError("no puede evolucionar")
    }
}