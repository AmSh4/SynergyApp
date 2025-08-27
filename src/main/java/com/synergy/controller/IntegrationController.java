package com.synergy.controller;

import com.synergy.model.Integration;
import com.synergy.service.ApiService;
import com.synergy.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IntegrationController {

    private final IntegrationService integrationService;
    private final ApiService apiService;

    @Autowired
    public IntegrationController(IntegrationService integrationService, ApiService apiService) {
        this.integrationService = integrationService;
        this.apiService = apiService;
    }

    @GetMapping("/integrations")
    public String listIntegrations(Model model) {
        model.addAttribute("integrations", integrationService.findAll());
        return "integrations";
    }

    @GetMapping("/integrations/new")
    public String createIntegrationForm(Model model) {
        model.addAttribute("integration", new Integration());
        return "integration-form";
    }

    @PostMapping("/integrations")
    public String saveIntegration(@ModelAttribute Integration integration) {
        integrationService.save(integration);
        return "redirect:/integrations";
    }

    @GetMapping("/integrations/edit/{id}")
    public String editIntegrationForm(@PathVariable Long id, Model model) {
        model.addAttribute("integration", integrationService.findById(id));
        return "integration-form";
    }

    @GetMapping("/integrations/delete/{id}")
    public String deleteIntegration(@PathVariable Long id) {
        integrationService.delete(id);
        return "redirect:/integrations";
    }

    @GetMapping("/integrations/run/{id}")
    public String runIntegration(@PathVariable Long id, Model model) {
        Integration integration = integrationService.findById(id);
        if (integration != null) {
            String data = apiService.fetchDataFromApi(integration.getApiUrl());
            model.addAttribute("data", data);
            model.addAttribute("integration", integration);
        }
        return "integration-result";
    }
}