package elements.module.component.output;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import elements.module.component.ComponentElement;

@JacksonXmlRootElement(localName = "output")
public class Output implements ComponentElement
{
	@JacksonXmlProperty(isAttribute = true)
	String url;
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
}
