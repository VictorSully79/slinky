package com.victorsully79.songr;

/*
This never needs to be connected via import
"ANNOTATION" will connect them
The controller tells SPRING to use this class as a controller file.
*/

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Locale;

@Controller
public class SongrToolsController {
    @Autowired
    //      Routes are ANNOTATED to with 'METHODMapping' "ANNOTATIONS"
    static ArrayList<Album> displayedAlbums = new ArrayList<>();

    static {
        //Returning a string tells Spring : the file name will be a string
        //Now pass the data to Thymeleaf (TEMPLATING engine)
        displayedAlbums.add( new Album("Back In Black", "AC/DC",
                "https://static.billboard.com/files/media/acdc-back-in-black-album-cover-650-compressed.jpg",
                10, 42));
        // m.addAttribute("album", backInBlack);

        displayedAlbums.add( new Album("Soundsystem", "311",
                "https://upload.wikimedia.org/wikipedia/en/6/66/Soundsystem.jpg",
                13, 48));
        //m.addAttribute("album", soundSystem);

        displayedAlbums.add( new Album("Mosaic", "311",
                "https://upload.wikimedia.org/wikipedia/en/thumb/c/cb/311_Mosaic_2017.jpg/220px-311_Mosaic_2017.jpg;",
                17, 60));
        // m.addAttribute("album", mosaic);
//       splayedAlbums.add(backInBlack);
//        displayedAlbums.add(soundSystem);
//        displayedAlbums.add(mosaic);
//        System.out.println("= di========" + displayedAlbums);
    }

    @GetMapping("/hello")
    public String showHelloWorldPage() {
// The String returned by the method is the filename that is shown in templates
        return "hello.html";

    }


    @GetMapping("/albums")      //Model is from MVC it shapes data into the TEMPLATE
    public String getAlbumsPage(Model m) {
        m.addAttribute("displayedAlbums", displayedAlbums  );


        return "albums.html";
    }


    @GetMapping("/")
    public String showHomePage(){


        return "welcome-home.html";
        }



    @GetMapping("/capitalize/{phrase}")
    public String getCapitalizedPage(Model m, @PathVariable String phrase){
        m.addAttribute("phrase", phrase.toUpperCase(Locale.ROOT));
        return "capitalize.html";
    }
}

