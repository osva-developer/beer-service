package guru.sfg.brewery.model.events;

import java.io.Serializable;

import groovy.transform.builder.Builder;
import guru.sfg.brewery.model.BeerDto;
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
