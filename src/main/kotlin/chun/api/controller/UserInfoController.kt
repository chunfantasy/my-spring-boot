package chun.api.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserInfoController() {

	@RequestMapping("/add")
	fun add(model: Model): String {
		model["name"] = "chun"
		println("lala")
		return "blog"
	}

}