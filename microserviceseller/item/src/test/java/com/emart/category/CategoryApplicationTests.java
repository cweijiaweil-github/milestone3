package com.emart.category;

import com.emart.category.entity.Category;
import com.emart.subCategory.entity.SubCategory;
import com.emart.transactions.entity.Transactions;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) 
class CategoryApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	void postSaveCategory()  throws Exception {
		Category category = new Category();
		category.setCategory_name("category_name");
		category.setCategoryId("c1001");
		category.setSellerId("s0001");
		Category result = testRestTemplate.postForObject("/category/save",category,Category.class);
		Assert.hasLength(result.getCategoryId(),category.getCategoryId());
	}

}
