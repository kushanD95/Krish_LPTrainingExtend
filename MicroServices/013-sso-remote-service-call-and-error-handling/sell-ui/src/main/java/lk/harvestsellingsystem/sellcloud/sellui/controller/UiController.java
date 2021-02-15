package lk.harvestsellingsystem.sellcloud.sellui.controller;

import lk.harvestsellingsystem.sellcloud.commons.model.Item;
import lk.harvestsellingsystem.sellcloud.sellui.config.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Controller
@EnableOAuth2Sso
public class UiController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/")
    public String loadUi() {
        return "home";
    }

    @RequestMapping(value = "/secure")
    public String loadSecuredUi() {
        return "secure";
    }

    @RequestMapping(value = "/getItems")
    public String loadItems(Model model) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", AccessToken.getAccessToken());
        HttpEntity<Item> itemHttpEntity = new HttpEntity<>(httpHeaders);
        try {
            ResponseEntity<Item[]> itemResponseEntity = restTemplate.exchange("http://localhost:8283/items", HttpMethod.GET, itemHttpEntity, Item[].class);
            model.addAttribute("items", itemResponseEntity.getBody());
            System.out.println(itemResponseEntity.getBody().length + "--------------");
        }catch (HttpStatusCodeException e) {
            ResponseEntity responseEntity = ResponseEntity.status(e.getRawStatusCode())
                    .header(String.valueOf(e.getResponseHeaders()))
                    .body(e.getResponseBodyAsString());
            model.addAttribute("error",responseEntity);
        }
        return "secure";
    }

}
