package lk.harvestsellingsystem.sellcloud.sellui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableOAuth2Sso
public class SellUiApplication extends WebSecurityConfigurerAdapter {

	//when put the UiController doesn't work- START
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
	//when put the UiController doesn't work- END

	public static void main(String[] args) {
		SpringApplication.run(SellUiApplication.class, args);
	}

}
