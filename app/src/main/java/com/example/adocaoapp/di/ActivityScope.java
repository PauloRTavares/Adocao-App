package com.example.adocaoapp.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME);
public @interface ActivityScope {
}
