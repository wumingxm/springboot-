package com.springboot.dubbo.service;

import java.util.List;

import com.springboot.dubbo.vo.StudentVO;
/**
 * 学生信息管理服务
 * @author Administrator
 *
 */
public interface StudentService {
	/**
	 * 查询学生的信息
	 * @param stu
	 * @return
	 */
	public  List<StudentVO> findStudentList(StudentVO stu);
	
	
	/**
	 * 根据学号查询学生信息
	 * @param studentNo
	 * @return
	 */
	public  StudentVO findStudentById(Integer id);
	
	
	/**
	 * 添加学生信息
	 * @param studentVO
	 */
	void addStudent(StudentVO studentVO);
	
	/**
	 * 更新学生信息
	 * @param studentVO
	 */
    void updateStudent(StudentVO studentVO);
    
    /**
            * 删除学生信息
     * @param studentVO
     */
    void deleteStudent(StudentVO studentVO);
}
