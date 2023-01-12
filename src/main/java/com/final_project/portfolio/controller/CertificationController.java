package com.final_project.portfolio.controller;


import com.final_project.portfolio.model.Certification;
import com.final_project.portfolio.service.certification.ICertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CertificationController {
    @Autowired
    private ICertificationService certificationService;

    @GetMapping("/certifications")
    public List<Certification> getProjects() {
        return certificationService.getProjects();
    }

    @GetMapping("/certifications/{id}")
    public Certification getProject(@PathVariable Long id) {
        return certificationService.getProject(id);
    }

    @PostMapping("/certifications/create")
    public String saveProject(@RequestBody Certification certification) {
        certificationService.saveProject(certification);
        return "Project correctly created";
    }

    @DeleteMapping("/certifications/{id}")
    public String deleteProject(@PathVariable Long id) {
        certificationService.deleteProject(id);
        return "Project correctly deleted";
    }

    @PutMapping("/certifications/edit/{id}")
    public String updateCertification(@PathVariable Long id,
                                      @RequestParam ("url") String newUrl,
                                      @RequestParam ("image") String newImage) {

        Certification certification = certificationService.getProject(id);

        certification.setUrl(newUrl);
        certification.setImage(newImage);

        certificationService.saveProject(certification);
        return "Certification correctly updated";
    }
}
