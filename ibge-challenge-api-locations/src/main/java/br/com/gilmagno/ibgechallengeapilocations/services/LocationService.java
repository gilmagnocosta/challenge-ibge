package br.com.gilmagno.ibgechallengeapilocations.services;

import br.com.gilmagno.ibgechallengeapilocations.models.UF;

public interface LocationService {
	UF[] getAllLocations();
	String getCityByName(String cityName);
}
