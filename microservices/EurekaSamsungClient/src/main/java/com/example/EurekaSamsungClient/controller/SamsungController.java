package com.example.EurekaSamsungClient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EurekaSamsungClient.model.Device;
import com.example.EurekaSamsungClient.model.Devices;

@RestController
@RequestMapping("/samsung")
public class SamsungController {
	@RequestMapping("/devices")
	public Devices getDevices()
	{
		List<Device> devices=new ArrayList<>();
		devices.add(new Device("Note 11","Smart Phone"));
		devices.add(new Device("J11","small touch phone"));
		devices.add(new Device("S21 ultra","fold phone"));
		devices.add(new Device("Galaxy tab","Smart tab"));
		Devices list=new Devices(devices);
		return list;
	}

	public String getDevices1()
	{
		return "note 12"; 
	}
}
