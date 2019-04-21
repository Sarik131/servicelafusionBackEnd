//package com.gtu.servicelafusion.repository;
//import com.gtu.servicelafusion.entity.Q;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//
//
//@Repository
//public interface QueryStatusRepository extends JpaRepository<Q, Long> {
//
////    @Query("SELECT q FROM Query q WHERE q.category = :cat AND q.status = 0")
////   public List<ServiceProvider> findByCategory(@Param("cat") String category);
//
//    @Query("SELECT q.title FROM Q q WHERE q.id = :var")
//    public String findTitleById(@Param("var") int q_id);
//
//    @Query("SELECT q.description FROM Q q WHERE q.id = :var")
//    public String findDescriptionById(@Param("var") int q_id);
//
//}
