package JSON;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonResultController {
	
	public final AtomicLong counter = new AtomicLong();
	
	JsonResult json = new JsonResult();
	
	@RequestMapping("/jsonresult")
	public JsonResult jsonRseult(@RequestParam(value="content", defaultValue="hello,liujiboy")String content) {
		json.setId(counter.incrementAndGet());
		json.setContent(content);
		return json;
	}

}
