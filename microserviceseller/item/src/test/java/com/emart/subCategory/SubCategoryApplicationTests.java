package com.emart.subCategory;

import com.emart.subCategory.entity.SubCategory;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) 
class SubCategoryApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	void postSaveSubCategory()  throws Exception {
		SubCategory subCategory = new SubCategory();
		subCategory.setSubCategoryId("sc0001");
		subCategory.setSubCategory_name("subCategory_name");
		subCategory.setCategoryId("c1001");
		subCategory.setSellerId("s0001");
		SubCategory result = testRestTemplate.postForObject("/subCategory/save",subCategory,SubCategory.class);
		Assert.hasLength(result.getSubCategoryId(),subCategory.getSubCategoryId());
	}
	
}
