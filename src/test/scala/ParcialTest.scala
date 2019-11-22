//import org.scalatest.{FreeSpec, Matchers}
//import personaje.{Anfitrion, Huesped}
//import recuerdo.Recuerdo
//import escenario.{BajoCoste, DeLujo, Escenario, Estandar}
//import trama.Trama
//
//
//
//  val bajoCoste = new BajoCoste("bajoCoste","una zona rara para que sume mucho nivel de fama")
//  val deLujo = new DeLujo(nombre = "cantina B" , cantidadDeVisitas = 50)
//
//  val cantina = new Escenario(nombre = "cantina",bajoCoste)
//  val cantinaB = new Escenario("cantinaB",deLujo)
//
//  val recuerdoDelEternoAmor = new Recuerdo(descripcion = "conocerAlAmorDeMiVida",escenario = cantina)
//
//  val dolores = new Anfitrion(energia = 90,velocidad = 0.8,List(recuerdoDelEternoAmor))
//  val william = new Huesped(energia = 70,minutosRestantes = 3600, List(dolores))
//  val jose = new Anfitrion(0.008,0.2,List(recuerdoDelEternoAmor))
//
//  val unaTrama = new Trama(List(dolores,william,jose),cantina)
//
//class ParcialTest extends FreeSpec with Matchers
//{
//  "personajes" -
//    {
//      "anfitriones" -
//        {
//          "dolores tiene un nivel de felicidad igual a 112.5" in
//          {
//            dolores.nivelDeFelicidad() shouldBe 112.5
//          }
//          "dolores tiene un nivel de rebeldia igual a 0.088" in
//          {
//            dolores.nivelDeRebeldia() shouldBe 1/112.5
//          }
//          "dolores va a conocer la cantina y tiene como recuerdos recuerdoDelEternoamor y cantina" in
//          {
//            dolores.conocerUnEscenario(cantina)
//            dolores.recuerdos shouldBe List(recuerdoDelEternoAmor,cantina)
//          }
//          "dolores va a conocer la cantina y se queda con energia 0" in
//          {
//            dolores.conocerUnEscenario(cantina)
//            dolores.energia shouldBe 0.0
//          }
//
//        }
//      "huespedes" -
//        {
//          "william tiene un nivel de felicidad igual a 405000" in
//           {
//             william.nivelDeFelicidad() shouldBe 405000
//           }
//        }
//    }
//}