package br.com.azi.patrimoniointangivel.utils;

import java.text.Normalizer;

public class AcetuacaoUtils {
    public static String retiraAcentuacao(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
            .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
