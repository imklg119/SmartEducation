package com.hhit.service;

import java.util.List;

import com.hhit.entity.Chapter;
import com.hhit.entity.Course;
import com.hhit.base.IDaoSupport;

public interface IChapterService extends IDaoSupport<Chapter>{

	//根据课程查找章节
	List<Chapter> findByCourse(Course courseFind);	
	//根据章节模糊查找
	Chapter findByCourseAndLikeChapterName(Course courseFind,String string);
}
