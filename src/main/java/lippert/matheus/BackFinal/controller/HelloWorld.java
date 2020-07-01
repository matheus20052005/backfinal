package lippert.matheus.BackFinal.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author matheus
 * @version 1.0
 * @since 27/06/2020
 * @category Controller
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorld {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("olá server!", new HttpHeaders(), HttpStatus.CREATED);
    }
}
