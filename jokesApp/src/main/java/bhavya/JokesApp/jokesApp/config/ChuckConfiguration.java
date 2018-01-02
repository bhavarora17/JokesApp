package bhavya.JokesApp.jokesApp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by barora on 1/1/2018.
 */
@Configuration
public class ChuckConfiguration {
	
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes(){
		return new ChuckNorrisQuotes();
	}
}
