package com.example.EurekaSamsungClient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EurekaSamsungClient.model.Device;
import com.example.EurekaSamsungClient.model.Devices;



@RestController
@RequestMapping("/apple")
public class AppleController {
	@RequestMapping("/devices")
	public Devices getDevices()
	{
		List<Device> devices=new ArrayList<>();
		devices.add(new Device("Iphone11","Smart Phone"));
		devices.add(new Device("Ipad","handy laptop"));
		devices.add(new Device("Ipod","for music lover"));
		devices.add(new Device("Iphone13","Smart phone with good camera"));
		Devices list=new Devices(devices);
		return list;
	}
	@GetMapping
	public String getDevices1()
	{
		return "iphone"; // 
	}
}
