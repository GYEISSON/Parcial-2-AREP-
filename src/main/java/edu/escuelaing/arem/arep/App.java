package edu.escuelaing.arem.arep;
import static spark.Spark.*;

import java.text.ParseException;
import java.util.Scanner;

import org.eclipse.jetty.util.log.Log;
import org.json.simple.JSONObject;

import spark.Request;
import spark.Response;

import  edu.escuelaing.arem.arep.models.Calculator;
/**
 * Hello Spark!
 *
 *  web app  Heroku using SparkWeb
 *
 * @author daniel
 * modified by @author Yeisson Gualdron
 */
public class App
{
  private static Calculator cal;

  public static void main( String[] args )
  {

      System.out.println( "Hello Math!" );
      port(getPort());
      cal = new Calculator();
      get("/atan", (req, res) -> inputDataPage(req, res,"atan"));
      get("/exp", (req, res) -> inputDataPage(req, res,"exp"));


  }
  private static JSONObject inputDataPage(Request req, Response res, String operation)  {
      double number = Double.parseDouble(req.queryParams("value"));
      JSONObject obj=new JSONObject();   
      obj.put("output",(operation.equals("atan"))? cal.arcTangent(number) : cal.eulerTo(number));      
      obj.put("input", number);    
      obj.put("operation",operation);
      return obj;
  }

  public static  int getPort(){
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }

      return 4567;
  }
}
