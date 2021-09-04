package hello.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    //템플릿 부분 넘겨주기
    @GetMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }

    //템플릿 레이아웃 넘겨주기
    @GetMapping("/layout")
    public String layout() {
        return "template/layout/layoutMain";
    }


    //템플릿 레이아웃 통째로 넘겨주기
    @GetMapping("/layoutExtend")
    public String layoutExtends() {
        return "template/layoutExtend/layoutExtendMain";
    }
}