package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {

  private static final double ROTATE_45 = 45;
  private static final double ROTATE_90 = 90;
  private static final double ROTATE_180 = 180;
  private static final double ROTATE_135 = 135;
  private static final double DELKA_TELA = 250;
  private static final double VYSKA_TELA = 120;
  private static final double DELKA_NOZKY = 25;
  private static final double DELKA_HLAVY = 85;
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    nakresliPrasatko();
  }

  public void nakresliPrasatko() {
    // Začneme tělem (obdélník)
    turnRight(ROTATE_180, VYSKA_TELA); // otočíme se dolu

    turnLeft(ROTATE_90, DELKA_TELA); // otočíme se doprava

    turnLeft(ROTATE_90, VYSKA_TELA); // nahoru

    turnLeft(ROTATE_90, DELKA_TELA); // doleva

    // Přesun na hlavu
    turnLeft(ROTATE_45, DELKA_HLAVY);
    turnLeft(ROTATE_90, DELKA_HLAVY);

    // Nakreslíme levou nožičku
    nakresliLevouNozicku();

    // Přesun na pravou nožičku
    turnRight(ROTATE_135, DELKA_TELA);
    zofka.penDown();

    // Nakreslíme pravou nožičku
    nakresliPravouNozicku();
  }

  private void turnRight(double uhel, double delka) {
    zofka.turnRight(uhel);
    zofka.move(delka);
  }

  private void turnLeft(double uhel, double delka) {
    zofka.turnLeft(uhel);
    zofka.move(delka);
  }

  private void nakresliLevouNozicku() {
    turnRight(ROTATE_90, DELKA_NOZKY);
    turnLeft(ROTATE_180, DELKA_NOZKY);
    turnRight(ROTATE_90, DELKA_NOZKY);
    turnLeft(ROTATE_180, DELKA_NOZKY);
  }

  private void nakresliPravouNozicku() {
    turnRight(ROTATE_135, DELKA_NOZKY);
    turnLeft(ROTATE_180, DELKA_NOZKY);
    turnRight(ROTATE_90, DELKA_NOZKY);
  }

}
