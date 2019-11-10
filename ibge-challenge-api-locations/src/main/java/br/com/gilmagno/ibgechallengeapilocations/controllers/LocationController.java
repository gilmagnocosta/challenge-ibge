package br.com.gilmagno.ibgechallengeapilocations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gilmagno.ibgechallengeapilocations.models.UF;
import br.com.gilmagno.ibgechallengeapilocations.services.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

	private final LocationService locationService;
	
	@Autowired
	public LocationController(LocationService locationService) {
		this.locationService = locationService;
	}
	
	@GetMapping
	public ResponseEntity<UF[]> getAllLocations(){
		
		UF[] locations = this.locationService.getAllLocations();
		
		if (locations != null) {
			return ResponseEntity.ok().body(locations);	
		}else {
			return ResponseEntity.badRequest().build();
		}
		
	}
}
