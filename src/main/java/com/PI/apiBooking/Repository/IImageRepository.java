package com.PI.apiBooking.Repository;

import com.PI.apiBooking.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {

    @Query("SELECT i FROM Image i where i.product.id= ?1")
    Set<Image> findImagesByProductId(Long productId);

    @Query("SELECT i FROM Image i where i.product.id= ?1 AND i.profile =true ")
    Image findProfileImageByProductId(Long productId);
}
