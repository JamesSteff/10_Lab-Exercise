package com.appdev.resq.legaspinog4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.resq.legaspinog4.entity.Hotline;
import com.appdev.resq.legaspinog4.service.HotlineService;

@RestController
@RequestMapping("/hotlines")
@CrossOrigin(origins = "*")
public class HotlineController {

    private final HotlineService hotlineService;

    public HotlineController(HotlineService hotlineService) {
        this.hotlineService = hotlineService;
    }

    @GetMapping
    public List<Hotline> getAllHotlines() {
        return hotlineService.getAllHotlines();
    }

    @GetMapping("/{id}")
    public Hotline getHotlineById(@PathVariable Long id) {
        return hotlineService.getHotlineById(id);
    }

    @PostMapping
    public Hotline createHotline(@RequestBody Hotline hotline) {
        return hotlineService.createHotline(hotline);
    }

    @PutMapping("/{id}")
    public Hotline updateHotline(@PathVariable Long id, @RequestBody Hotline hotlineDetails) {
        return hotlineService.updateHotline(id, hotlineDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteHotline(@PathVariable Long id) {
        hotlineService.deleteHotline(id);
    }
}
