package com.example.service;

import com.example.model.Admin;
import com.example.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AdminService {
    
    private final AdminRepository adminRepository;
    
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
    
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
    
    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }
    
    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
    }
    public Admin updateAdmin(@PathVariable int id,@RequestBody Admin updatedAdmin) {
        Admin existingAdmin = getAdminById(id);
        
        if (existingAdmin == null) {
            // If the admin with the given id doesn't exist, return null or throw an exception
            return null;
        }
        
        // Update the fields of the existing admin with the fields from the updatedAdmin object
        existingAdmin.setPtitle(updatedAdmin.getPtitle());
        existingAdmin.setPprice(updatedAdmin.getPprice());
        existingAdmin.setPlocation(updatedAdmin.getPlocation());
        existingAdmin.setPdetails(updatedAdmin.getPdetails());
        
        // Save the updated admin
        return adminRepository.save(existingAdmin);
    }}
