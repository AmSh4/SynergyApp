package com.synergy.service;

import com.synergy.model.Integration;
import com.synergy.repository.IntegrationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class IntegrationServiceTest {

    @Mock
    private IntegrationRepository repository;

    @InjectMocks
    private IntegrationService service;

    @Test
    void findAll_returnsEmptyList_whenNoIntegrations() {
        List<Integration> emptyList = new ArrayList<>();
        when(repository.findAll()).thenReturn(emptyList);

        List<Integration> result = service.findAll();

        assertThat(result).isEmpty();
    }

    @Test
    void findById_returnsIntegration_whenExists() {
        Integration integration = new Integration();
        integration.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(integration));

        Integration result = service.findById(1L);

        assertThat(result).isNotNull();
        assertThat(result.getId()).isEqualTo(1L);
    }

    @Test
    void save_savesIntegration() {
        Integration integration = new Integration();
        when(repository.save(integration)).thenReturn(integration);

        Integration result = service.save(integration);

        assertThat(result).isEqualTo(integration);
        verify(repository, times(1)).save(integration);
    }

    @Test
    void delete_deletesById() {
        doNothing().when(repository).deleteById(1L);

        service.delete(1L);

        verify(repository, times(1)).deleteById(1L);
    }
}