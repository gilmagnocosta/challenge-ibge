package br.com.gilmagno.ibgechallengeapilocations.services;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.gilmagno.ibgechallengeapilocations.models.UF;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public UF[] getAllLocations() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		ResponseEntity<UF[]> response = restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados", UF[].class);
		
		UF[] states = response.getBody();
		
		return states;
	}

	@Override
	public String getCityByName(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
