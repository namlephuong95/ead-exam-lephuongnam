package com.bezkoder.spring.datajpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestDto implements Serializable {
    private final String content;

    public TestDto(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto entity = (TestDto) o;
        return Objects.equals(this.content, entity.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "content = " + content + ")";
    }
}
