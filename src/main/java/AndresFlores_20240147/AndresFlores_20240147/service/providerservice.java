package AndresFlores_20240147.AndresFlores_20240147.service;


import AndresFlores_20240147.AndresFlores_20240147.Entities.providerEntity;
import AndresFlores_20240147.AndresFlores_20240147.Repositories.providerReporitory;
import AndresFlores_20240147.AndresFlores_20240147.models.DTO.providerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class providerservice {
    @Autowired
    private providerReporitory repo;

    public List<providerDTO> getAllProviders(){
        List<providerEntity> provedores = repo.findAll();
        return provedores.stream()
                .map(this::convertirAproviderDTO)
                .collect(Collectors.toList());
    }

    private providerDTO convertirAproviderDTO(providerEntity proveedor) {
        providerDTO dto = new providerDTO();
        dto.setProviderID(proveedor.getProviderID());
        dto.setProviderName(proveedor.getProviderName());
        dto.setProviderPhone(proveedor.getProviderPhone());
        dto.setProviderAddress(proveedor.getProviderAddress());
        dto.setProviderEmail(proveedor.getProviderEmail());
        dto.setProviderCode(proveedor.getProviderCode());
        dto.setProviderStatus(proveedor.getProviderStatus());
        dto.setProviderComments(proveedor.getProviderComments());
        return dto;
    }

}
