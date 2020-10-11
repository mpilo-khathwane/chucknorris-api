package com.chucknorris;

import org.springframework.web.client.RestTemplate;

public class ChuckFacts {
  public RestTemplate restTemplate = new RestTemplate();
  
  public Object getJokeByCategory(String category){
    final String uri = String.format("https://api.chucknorris.io/jokes/random?category=%s", category);

    Object result = this.restTemplate.getForObject(uri, Object.class);
    return result;
  }

  public Object getJokeCategories(){
    final String uri = "https://api.chucknorris.io/jokes/categories";

    Object result = this.restTemplate.getForObject(uri, Object.class);

    return result;
  }

}
