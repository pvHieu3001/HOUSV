package com.housv.domains.dtos;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IdDTO implements Serializable {
    private Long id;
}

