package br.com.fatecjobs.fatecjobsbackend.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDTO {

    private String campo;
    private String erro;
}
