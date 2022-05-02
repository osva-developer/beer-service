package guru.springframework.msscbeerservice.events;

import java.io.Serializable;

import groovy.transform.builder.Builder;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable{
	

	 static final long serialVersionUID = 8220993829850031692L;
	private  BeerDto beerDto;


}
