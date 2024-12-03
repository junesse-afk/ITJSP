package jsp10_jdbc;
/*
[ product 테이블 정의 ]
상품번호 : product_id(정수형, PK)
상품명 : product_name(문자 100자, NN)
상품가격 : product_price(정수, NN)
상품수량 : product_qty(정수, NN)
상품이미지 : product_img(문자 50자, NN)
----------------------------------------
CREATE TABLE product (
	product_id INT PRIMARY KEY,
	product_name VARCHAR(100) NOT NULL,
	product_price INT NOT NULL,
	product_qty INT NOT NULL,
	product_img VARCHAR(50) NOT NULL
);
*/
public class ProductDTO {

}
