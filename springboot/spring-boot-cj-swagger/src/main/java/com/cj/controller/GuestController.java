package com.cj.controller;

import com.cj.domain.Guest;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guest")
@Tag(name = "GuestController", description = "嘉宾管理")
public class GuestController {

    @Operation(summary= "获取嘉宾列表")
    @GetMapping
    public String getList(Model model) {
        // 查数据，将数据传递给视图∂
        return "index";
    }


    // 添加信息
    @Operation(summary= "添加一个嘉宾", requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "嘉宾信息",
            required = true,
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Guest.class)
                    )
            }
    ))
    @PostMapping
    public String add(@RequestBody Guest guest) {
        return "redirect:/guest";
    }

    // 删除
    @Operation(summary= "删除一个嘉宾")
    @Parameter(name = "name", description = "嘉宾姓名")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) {
        return "redirect:/guest";
    }

    // 去修改页面
    @Hidden
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name, Model model) {
        return "update";
    }

    // 更改
    @Operation(summary= "修改一个嘉宾")
    @PutMapping
    public String update(Guest guest) {
        return "redirect:/guest";
    }

}
