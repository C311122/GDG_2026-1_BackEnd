백엔드 개발의 기초를 배웠다.
웹은 클라이언트가 요청을 보내고 서버가 응답하는 구조로 동작함 이때 데이터를 주고받기 위한 통신 규칙이 HTTP이다.
프론트엔드는 사용자에게 보여지는 UI를 담당, 백엔드는 사용자의 요청을 받아 DB를 통해 처리한다.
한 프로그램이 다른 프로그램의 기능과 데이터를 사용하기 위한 악속을 API라 한다.
HTTP의 장점을 살려 만든 API를 REST API라 한다.
Spring Boot는 복잡한 초기 설정 없이도 자바의 장점을 살려 백엔드 서버를 만들 수 있는 프레임워크이다.

![alt text](<스크린샷 2026-03-25 230406.png>)

상품 기능

    상품 정보 등록
    HTTP Method : POST
    URI : /products

    상품 목록 조회
    HTTP Method : GET
    URI : /products

    개별 상품 정보 상세 조회
    HTTP Method : GET
    URI : /products/{productId}

    상품 정보 수정
    HTTP Method : PATCH
    URI : /products/{productId}

    상품 삭제
    HTTP Method : DELETE
    URI : /products/{productId}

주문 기능

    주문 정보 생성
    HTTP Method : POST
    URI : /orders

    주문 목록 조회
    HTTP Method : GET
    URI : /orders

    개별 주문 정보 상세 조회
    HTTP Method : GET
    URI : /orders/{productId}

    주문 취소
    HTTP Method : DELETE
    URI : /orders/{productId}