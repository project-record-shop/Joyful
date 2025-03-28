package com.recordshop.dto;

import com.recordshop.entity.CartItem;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartDetailDto {

    private Long cartItemId;        // 장바구니 상품 아이디

    private String itemNm;          // 상품명

    private int price;              // 상품 금액

    private int count;              // 수량

    private String imgUrl;          // 상품 이미지 경로

    public CartDetailDto(Long cartItemId, String itemNm, int price, int count, String imgUrl) {

        this.cartItemId = cartItemId;
        this.itemNm = itemNm;
        this.price = price;
        this.count = count;
        this.imgUrl = imgUrl;

    }

    @Override
    public String toString() {
        return "CartDetailDto{cartItemId=" + cartItemId + ", itemNm='" + itemNm + "', count=" + count + ", price=" + price + '}';
    }

}
