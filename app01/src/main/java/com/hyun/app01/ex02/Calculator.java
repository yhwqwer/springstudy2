package com.hyun.app01.ex02;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Calculator {
  private String maker;
  private int price;
  private Adder adder;
  private Subtractor subtractor;
  private Date buied;
}
