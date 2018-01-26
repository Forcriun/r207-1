import java.util.ArrayList;

class EjercicioR207
{
  public String devolverEnOrden(ArrayList<String> palabras)
  {
    // Escribe tu código a continuación...
    String resultado = "";
    
    while (palabras.size() > 0) {
      String palabraMasLarga = "";
      int posicionPalabraMasLarga = -1;
      int i = 0;
      while (i < palabras.size()) {
        if (palabras.get(i).length() >= palabraMasLarga.length()) {
          palabraMasLarga = palabras.get(i);
          posicionPalabraMasLarga = i;
        }
        i++;
      }
      resultado += "," + palabraMasLarga;
      palabras.remove(posicionPalabraMasLarga);
    }
    
    if (resultado.length() > 0) {
      resultado = resultado.substring(1, resultado.length());
    }
    
    System.out.println(resultado);
    return resultado;

  }

  // A continuación puedes escribir otros métodos si lo necesitas...
}