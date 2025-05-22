package ar.edu.unq.poo2.tpTemplateWikipedia;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {

	public String getTittle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String, List<WikipediaPage>> getInfoBox();
}
