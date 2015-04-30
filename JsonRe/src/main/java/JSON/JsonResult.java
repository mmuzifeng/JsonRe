package JSON;

import java.util.HashMap;

public class JsonResult extends HashMap<String,Object> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setId(long id) {
		this.put("id", id);
	}
	
	public void setContent(String content) {
		this.put("content", content);
	}

}
