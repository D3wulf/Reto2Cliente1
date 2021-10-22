package reto2.reto2Cliente1.controladores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RetoController {
	
	@Value("${some.value}")
	private String myValue;
	
	@Value("${info.app}")
	private String otroValor;
	
	@GetMapping(path="/verValor")
	public String myValue() {
		return this.myValue;
	}
	
	@GetMapping(path="/verColor")
	public String otroValor() {
		return this.otroValor;
	}
	

}
