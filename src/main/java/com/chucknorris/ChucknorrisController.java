package com.chucknorris;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChucknorrisController {

  public ChuckFacts chuck = new ChuckFacts();

  @GetMapping("/get-joke")
  @ResponseBody
  public Object getJokeByCategory(@RequestParam(name="category", required=true, defaultValue="Stranger") String category) {
      return chuck.getJokeByCategory(category);
  }

  @GetMapping("/get-categories")
  @ResponseBody
  public Object getJokeCategories() {
    return chuck.getJokeCategories();
  }

}
