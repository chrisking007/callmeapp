package com.demo.call;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/call")
@Api(tags = "Call Me Controller")
@CrossOrigin
public class CallMeController {

	@GetMapping(value = "/get")
	@ApiOperation("Call Me Get Request")
	public ResponseEntity<String> sayHelloGet() {
		String str = "GET : Hello Call Me !!";
		
		ResponseEntity<String> res = new ResponseEntity<String>(str, HttpStatus.OK);
		return res;
	}
	
	@PostMapping(value = "/post")
	@ApiOperation("Call Me Post Request")
	public ResponseEntity<String> sayHelloPost() {	
		String str = "POST : Hello Call Me !!";		
		ResponseEntity<String> res = new ResponseEntity<String>(str, HttpStatus.OK);
		return res;
	}
	
	@PostMapping(value = "/postwithoutbody/{id}")
    @ApiOperation("Call Me Post Request")
    public ResponseEntity<String> sayHelloPostWithOutBody(@PathVariable String id) {  
        String str = "POST without body with id = " + id;
        ResponseEntity<String> res = new ResponseEntity<String>(str, HttpStatus.OK);
        return res;
    }
}
