package org.corona.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private String name;
    private String age;
    // тип медицины которой он хочет чтоб его лечили, народная или традиционная
    private String method;

}
