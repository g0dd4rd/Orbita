public class Orbita {

  String[] notes = {"B# / C, ", "C# / Db, ", "D, ", "D# / Eb, ",  "E, ", "E# / F, ", "F# / Gb, ", "G, ", "G# / Ab, ", "A, ", "A# / Bb, ", "B, "};

  void ionian(String key) {
    int[] ionian = {0, 2, 2, 1, 2, 2, 2};
  }

  public static void main(String... args) {
    Orbita orb = new Orbita();
    for(var note : orb.notes) {
      System.out.print(note);
    }
  }
}

