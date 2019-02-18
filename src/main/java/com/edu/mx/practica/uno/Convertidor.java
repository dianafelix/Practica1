package com.edu.mx.practica.uno;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;


public class Convertidor {

    /*
     *Metodo para convertir Clase a JSON
     * @param clase texto en formato clase para convertir
     * @return Clase convertida a JSON
     */
    public String convertirClaseToJson(Object alumno){
        Gson gson = new Gson();
        String JSON = gson.toJson(alumno);

        return JSON;
    }

    /*
     *Metodo para convertir XML a JSON
     * @param XML texto en formato clase para convertir
     * @return XML convertida a JSON
     */
    public String convertirXmlToJson(String xml){

        JSONObject parse = XML.toJSONObject(xml);
        String json = parse.toString();

        return json;
    }

}

