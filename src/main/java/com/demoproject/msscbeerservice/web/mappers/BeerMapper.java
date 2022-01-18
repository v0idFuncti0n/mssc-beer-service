package com.demoproject.msscbeerservice.web.mappers;

import com.demoproject.msscbeerservice.domain.Beer;
import com.demoproject.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
