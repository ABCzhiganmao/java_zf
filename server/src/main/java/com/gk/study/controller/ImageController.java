package com.gk.study.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/staticfiles/image")
public class ImageController {

    @RequestMapping(value = "/{imageName}", method = RequestMethod.GET)
    public ResponseEntity<Resource> getImage(@PathVariable String imageName) {
        // 设置图片路径
        String imagePath = "server/upload/image/" + imageName;
        try {
            // 创建图片资源
            Path path = Paths.get(imagePath);
            Resource resource = new UrlResource(path.toUri());

            // 检查资源是否存在并且可读
            if (resource.exists() && resource.isReadable()) {
                // 返回图片资源
                return ResponseEntity.ok()
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(resource);
            } else {
                // 如果资源不存在，返回404 Not Found
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (MalformedURLException e) {
            // 处理URL格式错误的异常
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }

    }
}