package com.projects.ewallet.domain.result;


import java.util.Optional;

public record Failure<T>(DomainError error) implements Result<T> {


    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public Optional<T> getValue() {
        return Optional.empty();
    }

    @Override
    public Optional<DomainError> getError() {
        return Optional.of(error);
    }
}
