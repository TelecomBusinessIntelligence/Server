package org.tbi.server.entity;

public interface ErrorCode {
    int NONE = 9200;
    int INVALID_PARAM = 9400;
    int UNAUTHORIZED_ERROR = 9401;
    int FORBIDDEN_ERROR = 9403;
    int PERSIST_ERROR = 9500;
}
