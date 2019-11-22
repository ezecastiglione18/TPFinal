package recuerdo

import escenario.{Escenario,DeLujo,Estandar,BajoCoste}

class Recuerdo (val descripcion :String , val escenario :Escenario)
{
  def nivelDeEmotividad() :Double = descripcion.length * escenario.nivelDeFama()
}
