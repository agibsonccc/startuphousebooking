package com.startuphouse.booking.service;


import org.springframework.transaction.annotation.Transactional;

import com.startuphouse.booking.model.File;

@Transactional
public interface FileService {
	
	public Integer insert(File file);
	public Integer update(File file);
	public Integer delete(Integer id);
	public Integer deleteByIdImage(Integer id);
	public File findById(Integer id);

}
