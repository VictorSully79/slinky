package com.victorsully79.songr;

/*
This never needs to be connected via import
"ANNOTATION" will connect them
The controller tells SPRING to use this class as a controller file.
*/

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class SongrToolsController {
    //      Routes are ANNOTATED to with 'METHODMapping' "ANNOTATIONS"
    @GetMapping("/hello")
    public String showHelloWorldPage(){
// The String returned by the method is the filename that is shown in templates
        return "hello.html";

    }


    @GetMapping("/albums")      //Model is from MVC it shapes data into the TEMPLATE
    public String renderAlbumList(Model m){
        //Returning a string tells Spring : the file name will be a string
        //Now pass the data to Thymeleaf (TEMPLATING engine)
        Album backInBlack = new Album("Back In Black", "AC/DC", "https://static.billboard.com/files/media/acdc-back-in-black-album-cover-650-compressed.jpg", 10, 42);
        m.addAttribute("album", backInBlack);


      //  Album soundSystem = new Album("Soundsystem", "311", 13, 48);
      //  Album mosaic = new Album("Mosaic", "311", 17, 60);
        return "albums.html";
    }


    }
