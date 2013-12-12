package com.startuphouse.booking.persistence.mybatis.mappers;

import com.startuphouse.booking.model.File;

public interface FileMapper {
	public Integer insert(File file);
	public Integer update(File file);
	public Integer delete(Integer id);
	public File find(Integer id);

}
