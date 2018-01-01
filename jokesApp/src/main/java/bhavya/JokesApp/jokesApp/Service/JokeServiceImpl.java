package bhavya.JokesApp.jokesApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by barora on 1/1/2018.
 */
@Service
public class JokeServiceImpl implements JokesService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Autowired
	JokeServiceImpl(){
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
