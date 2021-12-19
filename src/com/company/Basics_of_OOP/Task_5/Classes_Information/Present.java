package com.company.Basics_of_OOP.Task_5.Classes_Information;

public record Present(Wrap wrap, Candy candy) {

    public double getPresentPrice() {
        return wrap.wrapType().getPrice() + candy.price();
    }

    @Override
    public String toString() {
        return String.format("подарок - вкусняшка: %s в обёртке: %s, стоимостью: %.2f", candy.productName(),
                wrap.wrapType().getName(), getPresentPrice());
    }
}

