package mypack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author param
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import javax.json.*;

public class Parse {
    
    public Object getData() throws IOException{

//        FileInputStream is = new FileInputStream("/home/param/data.json");
        URL youtubeVideos = new URL("https://www.googleapis.com/youtube/v3/search?q=maps&key=AIzaSyCinYeacgtAvA5NDzs14NR6kyFvAOfllKY&part=snippet");
        InputStream is = youtubeVideos.openStream();
        JsonReader rdr = Json.createReader(is);
        JsonObject o = rdr.readObject();       
        return o;
        
        
    }
    
    public String showData() throws IOException{
        String s = "";
            JsonObject o = (JsonObject)getData();
            JsonArray items =  o.getJsonArray("items");
  
            for (Object item : items){
                          
                JsonObject i = (JsonObject) item;               
                JsonObject snippet = i.getJsonObject("snippet");
                s = s +"<li><div class='title'>"+ snippet.getString("title")+"</div><img src='"+snippet.getJsonObject("thumbnails").getJsonObject("medium").getString("url")+"'/></li>" ;
                System.out.println(""+s);
            }
            
        return s;
    
    }
    
}
