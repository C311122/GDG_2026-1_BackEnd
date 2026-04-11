아하, JpaRepository 인터페이스를 상속받는 방식이 아니라, 처음에 작성하셨던 EntityManager를 직접 다루는 리포지토리 방식을 유지하면서 서비스 계층에 @Transactional만 추가하는 형태를 원하셨군요!

올려주신 MemberService의 스타일에 정확히 맞춰서 Product와 Order의 Service와 Repository 총 4개 파일을 다시 작성해 드립니다.

        (참고: 올려주신 코드의 @Transactional(readonly = True) 부분은 자바 문법에 맞게 @Transactional(readOnly = true)로 소문자/대문자를 수정하여 반영했습니다.)

        1. ProductRepository.java
        Java
package com.example.shop.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Product product) {
        if (product.getId() == null) {
            em.persist(product);
        } else {
            em.merge(product);
        }
    }

    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p", Product.class)
                .getResultList();
    }

    public Product findById(Long id) {
        return em.find(Product.class, id);
    }

    public void deleteById(Long id) {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }
}