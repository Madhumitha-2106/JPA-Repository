package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.StudentModel;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

	
	@Query(value="select * from STUDENT", nativeQuery = true)
	public List<StudentModel> getAllData();
	
	@Query(value="select * from STUDENT where id=:id",nativeQuery=true)
	public List<StudentModel>byid(@Param("id")int id);
	
	@Query(value="select * from STUDENT where id between :start and :end",nativeQuery=true)
    public List<StudentModel> startEnd(@Param("start") int start,@Param("end")int end);
    
    @Modifying
    @Transactional
    @Query(value="delete from STUDENT where id=?1 and name=?2",nativeQuery = true)
    Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
    
    @Modifying
    @Transactional
    @Query(value="update STUDENT set id=:pid where name=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
    
    @Query(value="select s from StudentModel s")
    List<StudentModel> jpqlQ();
    
    @Query(value="select s from StudentModel s where s.id=?1")
    public List<StudentModel> jqBYCon(@Param("id")int Id);
}
