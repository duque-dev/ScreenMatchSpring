package com.alurapractica.screenmatch.v20.service;

public interface IDataConverter {

    <T> T getData(String json, Class<T> tclass);
}
