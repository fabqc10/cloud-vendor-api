package com.thinkconstructiove.RESTdemo.repository;

import com.thinkconstructiove.RESTdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor,String> {
}
