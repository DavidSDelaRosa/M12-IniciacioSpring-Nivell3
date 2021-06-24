package es.david.itacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/holaNivell3")
	public String saludo(@RequestParam(value="nombre", defaultValue="ITAcademy")String nombre) {
		return String.format("Hola %s", nombre);
	}

}
