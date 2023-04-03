package com.training.ambulanceservice.service;

import com.training.ambulanceservice.exception.AmbulanceNotFoundException;
import com.training.ambulanceservice.model.Address;
import com.training.ambulanceservice.model.Ambulance;
import com.training.ambulanceservice.model.dto.AmbulanceDTO;
import com.training.ambulanceservice.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepository;

    public List<Ambulance> getListOfAmbulance(){
        return ambulanceRepository.findAll();
    }

    public Ambulance saveAmbulance(AmbulanceDTO ambulanceDTO){
        Ambulance ambulance = new Ambulance();
        ambulance.setPhoneNumber(ambulanceDTO.getPhoneNumber());
        ambulance.setHospitalName(ambulanceDTO.getHospitalName());
        ambulance.setLocation(ambulanceDTO.getLocation());
        Ambulance savedAmbulance = ambulanceRepository.save(ambulance);
        return savedAmbulance;
    }

    public Ambulance updateAmbulanceData(Long ambulanceId, AmbulanceDTO ambulanceDTO) {
        Optional<Ambulance> ambulanceOptional = ambulanceRepository.findById(ambulanceId);
        if(ambulanceOptional.isPresent()){
            Ambulance availableAmbulance = ambulanceOptional.get();
            availableAmbulance.setHospitalName(ambulanceDTO.getHospitalName());
            availableAmbulance.setLocation(ambulanceDTO.getLocation());
            availableAmbulance.setPhoneNumber(ambulanceDTO.getPhoneNumber());

            return ambulanceRepository.save(availableAmbulance);
        }else{
            throw new AmbulanceNotFoundException("The ambulance with the provided id was not found");
        }
    }

    public Ambulance getAmbulanceDetail(Long ambulanceId){
        Optional<Ambulance> ambulanceOptional = ambulanceRepository.findById(ambulanceId);
        if(ambulanceOptional.isPresent()){
            return  ambulanceOptional.get();
        }else{
            throw new AmbulanceNotFoundException("The ambulance with the provided id was not found");
        }
    }

    public void deleteAmbulance(Long ambulanceId){
        ambulanceRepository.deleteById(ambulanceId);
    }
}