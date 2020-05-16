package com.emart.order;


import java.util.List;
import java.util.Map;

import com.emart.purchaseHistory.entity.PurchaseHistory;

import org.apache.tomcat.util.http.fileupload.MultipartStream.ItemInputStream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import net.sf.json.JSONArray;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrderApplicationTests {

	@Test
	void contextLoads() {
	}

}
