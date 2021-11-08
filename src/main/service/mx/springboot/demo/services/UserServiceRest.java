package mx.springboot.demo.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mx.springboot.demo.model.*;

@RestController
public class UserServiceRest {
	
	/**
	 * Lista de ejemplo de usuarios
	 */
	
	private static List<User> listaUsuarios = new ArrayList<User>() {
		{
			add(new User("Rosa", "Marfil"));
			add(new User("Antonio", "Tono"));
			add(new User("Marcos", "March"));
			add(new User("Samuel", "Samu"));
		}
		
	};
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getUsers(){
		return listaUsuarios;
	}

}
