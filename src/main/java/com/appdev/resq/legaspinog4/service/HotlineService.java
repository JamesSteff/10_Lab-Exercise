package com.appdev.resq.legaspinog4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appdev.resq.legaspinog4.entity.Hotline;
import com.appdev.resq.legaspinog4.repository.HotlineRepository;

@Service
public class HotlineService {
    private final HotlineRepository hotlineRepository;

    public HotlineService(HotlineRepository hotlineRepository) {
        this.hotlineRepository = hotlineRepository;
    }

    public List<Hotline> getAllHotlines() {
        return hotlineRepository.findAll();
    }

    public Hotline getHotlineById(Long id) {
        return hotlineRepository.findById(id).orElse(null);
    }

    public Hotline createHotline(Hotline hotline) {
        return hotlineRepository.save(hotline);
    }

    public Hotline updateHotline(Long id, Hotline hotlineDetails) {
        Hotline hotline = hotlineRepository.findById(id).orElse(null);
        if (hotline != null) {
            hotline.setHotlineName(hotlineDetails.getHotlineName());
            hotline.setHotlineNumber(hotlineDetails.getHotlineNumber());
            hotline.setHotlineDescription(hotlineDetails.getHotlineDescription());
            return hotlineRepository.save(hotline);
        }
        return null;
    }

    public void deleteHotline(Long id) {
        hotlineRepository.deleteById(id);
    }
}
