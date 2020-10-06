package com.kpjavaspringboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kpjavaspringboot.model.City;
import com.kpjavaspringboot.repository.CityRepository;


//@RestController
@Controller
public class CityController {
	
	@Autowired
	private CityRepository repo;
		
    @Autowired
    public CityController(CityRepository repo) {
    	super();
		this.repo = repo;
	}
            
	@GetMapping("/crud")
	public String retrieve() {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @GetMapping");
		return "HTTP://GET : RETRIEVE : Sri Sita Rama Hanuman";		
	}
	
	@PostMapping("/crud")
	public String create(@RequestBody String city) {	
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @PostMapping : " + city);	
		return "HTTP://POST : UPDATE : " + city;
	}	
   	
	@PutMapping("/crud")
	public String update(@RequestBody String city) {	
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @PutMapping : " + city);	
		return "HTTP://PUT : UPDATE : " + city;
	}	

	@DeleteMapping("/crud")
	public String delete(@RequestBody String city) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @DeleteMapping : " + city);
		return "HTTP://DELETE : DELETE : " + city;
	}
	
	
    @RequestMapping(value = { "/city" }, method = RequestMethod.GET)
    public ModelAndView retrieveCity(@RequestParam("id") Integer id) {
    	System.out.println("KP : @Controller : CityController - @RequestMapping : retrieveCity");
		//Get City Repository
		Optional<City> optionalCity =  repo.findById(id);
		City city = optionalCity.get();
		
		System.out.print(city + "\t");
       	System.out.print(city.getId() + "\t");
        System.out.print(city.getName() + "\t");
        System.out.print(city.getCountryCode() + "\t");
        System.out.print(city.getDisrtict() + "\t");
        System.out.print(city.getPopulation() + "\n");   
        
		ModelAndView map = new ModelAndView("response");
        map.addObject("city", city);
        return map;
    }
          
    
	@GetMapping("/api/city")
	@ResponseBody
	public City retrieveCityAPI(@RequestParam("id") Integer id) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @GetMapping");

		//Get City Repository By Id
		Optional<City> optionalCity =  repo.findById(id);
		City city = optionalCity.get();
		
		System.out.print(city + "\t");
       	System.out.print(city.getId() + "\t");
        System.out.print(city.getName() + "\t");
        System.out.print(city.getCountryCode() + "\t");
        System.out.print(city.getDisrtict() + "\t");
        System.out.print(city.getPopulation() + "\n");            
       	
		//return "HTTP://GET : RETRIEVE : Sri Sita Rama Hanuman";		
        return city;        

	}
    
		
    @RequestMapping(value = { "/cities" }, method = RequestMethod.GET)
    public ModelAndView retrieveAllCities() {
    	System.out.println("KP : KPJavaSpringBootApplication - @Controller : CityController -  @GetMapping : retrieveAllCities()");
    	//Get All Cities - City Repository
		List<City> listCities =  (ArrayList<City>) repo.findAll();
		ModelAndView map = new ModelAndView("response");
        map.addObject("cities", listCities);
        return map;
    }
    

	//@GetMapping(("/api/cities")
	@RequestMapping("/api/cities")
	@ResponseBody
	public List<City> retrieveAllCitiesAPI() {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @GetMapping  : retrieveAllCitiesAPI()");

		List<City> cities =  (ArrayList<City>) repo.findAll();

        for(City city : cities) {
        	System.out.print(city.getId() + "\t");
            System.out.print(city.getName() + "\t");
            System.out.print(city.getCountryCode() + "\t");
            System.out.print(city.getDisrtict() + "\t");
            System.out.print(city.getPopulation() + "\n");            
        }
		
        return cities;
	}
	
	
	@PostMapping("/api/city")
	@ResponseBody
	public City createCityAPI(@RequestBody City city) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @PostMapping ; createCityAPI ");

        //Save cityIn object to City Repository
		City cityOut =  repo.save(city);
       	System.out.print(cityOut.getId() + "\t");
        System.out.print(cityOut.getName() + "\t");
        System.out.print(cityOut.getCountryCode() + "\t");
        System.out.print(cityOut.getDisrtict() + "\t");
        System.out.print(cityOut.getPopulation() + "\n");            
       	             
        return cityOut;

	}
	
		
    @RequestMapping(value = { "/city" }, method = RequestMethod.POST)
    //public ModelAndView createCity(@RequestParam("city") City cityIn) {
    public ModelAndView createCity(
    		@RequestParam("id") Integer id,
    		@RequestParam("name") String name,
    		@RequestParam("countryCode") String countryCode,
    		@RequestParam("disrtict") String ditsrict,
    		@RequestParam("population") Integer population
    		) {
    	System.out.println("KP : @Controller : CityController - @RequestMapping : createCity");
    	
		//Set City In Repository
    	City cityIn = new City();
    	cityIn.setId(id);
    	cityIn.setName(name);
        cityIn.setCountryCode(countryCode);
        cityIn.setDisrtict(ditsrict);
        cityIn.setPopulation(population);

        //Save city object to City Repository
		City city =  repo.save(cityIn);
       	System.out.print(city.getId() + "\t");
        System.out.print(city.getName() + "\t");
        System.out.print(city.getCountryCode() + "\t");
        System.out.print(city.getDisrtict() + "\t");
        System.out.print(city.getPopulation() + "\n");            
       	             
		ModelAndView map = new ModelAndView("response");
        map.addObject("city", city);
        return map;
    }
      
	
	@PutMapping("/api/city")
	@ResponseBody
	public City updateCityAPI(@RequestBody City city) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController - @PutMapping : updateCityAPI ");

        //Save cityIn object to City Repository
		City cityOut =  repo.save(city);
       	System.out.print(city.getId() + "\t");
        System.out.print(city.getName() + "\t");
        System.out.print(city.getCountryCode() + "\t");
        System.out.print(city.getDisrtict() + "\t");
        System.out.print(city.getPopulation() + "\n");            
       	             
        return cityOut;

	}
	
	
	@ResponseBody
    @RequestMapping(value = { "/city/{id}" }, method = RequestMethod.PUT )
    //public ModelAndView createCity(@RequestParam("city") City cityIn) {
    public ModelAndView updateCity(
    		@PathVariable("id") Integer id,
    		@RequestParam("name") String name,
    		@RequestParam("countryCode") String countryCode,
    		@RequestParam("disrtict") String ditsrict,
    		@RequestParam("population") Integer population
    		) {
    	System.out.println("KP : @Controller : CityController - @RequestMapping : updateCity");
    	
		//Set City In Repository
    	City cityIn = new City();
    	cityIn.setId(id);
    	cityIn.setName(name);
        cityIn.setCountryCode(countryCode);
        cityIn.setDisrtict(ditsrict);
        cityIn.setPopulation(population);

        //Save city object to City Repository
		//City city =  repo.save(cityIn);
        //repo.deleteById(id);
        City city = repo.save(cityIn);
        
       	System.out.print(city.getId() + "\t");
        System.out.print(city.getName() + "\t");
        System.out.print(city.getCountryCode() + "\t");
        System.out.print(city.getDisrtict() + "\t");
        System.out.print(city.getPopulation() + "\n");            
       	             
		ModelAndView map = new ModelAndView("response");
        map.addObject("city", city);
        return map;
    }
      

	@DeleteMapping("/api/city")
	@ResponseBody
	public String deletCityAPI(@RequestBody City city) {
		System.out.println("KP : KPJavaSpringBootApplication - @RestController : CityController -  @DeleteMapping : createCityAPI ");

        //Save cityIn object to City Repository
		repo.delete(city);

        return "HTTP://DELETE : DELETED - ID : " + city.getId() + " Name : " + city.getName() ;

	}
	
    @RequestMapping(value = { "/city" }, method = RequestMethod.DELETE)
    //public ModelAndView deleteCity(@RequestParam("city") City cityIn) {
    public ModelAndView deleteCity(
    		@RequestParam("id") Integer id,
    		@RequestParam("name") String name,
    		@RequestParam("countryCode") String countryCode,
    		@RequestParam("disrtict") String ditsrict,
    		@RequestParam("population") Integer population
    		) {
    	System.out.println("KP : @Controller : CityController - @RequestMapping : updateCity");
    	
		//Set City In Repository
    	City city = new City();
    	city.setId(id);
    	city.setName(name);
    	city.setCountryCode(countryCode);
    	city.setDisrtict(ditsrict);
    	city.setPopulation(population);

        //Delete city object from City Repository
		//repo.delete(city);
    	repo.deleteById(id);
       	
		//Set Return Parameter
    	city = null;
		city.setId(id);
		city.setName( name + " Deleted!");
		city.setCountryCode(countryCode + " Deleted!");
		city.setDisrtict(ditsrict + " Deleted!");
		city.setPopulation(0);
		
		
		ModelAndView map = new ModelAndView("response");
        map.addObject("city", city);
        return map;
    }
	
}
