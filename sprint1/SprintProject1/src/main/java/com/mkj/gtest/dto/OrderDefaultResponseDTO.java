package com.mkj.gtest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderDefaultResponseDTO  implements MyDTO{
	private String userName;
	private String bookName;
	private String orderDate;

}
