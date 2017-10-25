package br.com.spark2.main;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.jtwig.JtwigTemplateEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        get("/hello", (req, res) -> "Hello World");
        
        
        
        Map map = new HashMap();
        map.put("name", "Teste");

        // hello.twig file is in resources/templates directory
        get("/teste", (rq, rs) -> new ModelAndView(map, "hello.twig"), new JtwigTemplateEngine());
        
    }
}
