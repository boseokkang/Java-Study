package airplane;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Items {

	private List<Item> item = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}