import org.scalatest.{FreeSpec, Matchers}
import animales.{Perro, Gato}

class EjemploTest extends FreeSpec with Matchers
{
  val garfield = new Gato(anios = 10)
  "Animales" -
    {
      "Gatos" -
        {
          "Garfield debería tener 10 años" in
            {
              garfield.anios shouldBe 10
            }
          "Garfield cumple años y pasa a tener 11 años" in
            {
              garfield.cumplirAnios()
              garfield.anios shouldBe 11
            }
        }
     }
}