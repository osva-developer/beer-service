package guru.springframework.msscbeerservice.events;

import java.io.Serializable;

import groovy.transform.builder.Builder;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable{
	

	private static final long serialVersionUID = 8220993829850031692L;
	private final BeerDto beerDto;


}
