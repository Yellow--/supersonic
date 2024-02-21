package com.tencent.supersonic.headless.server.service;

import com.tencent.supersonic.auth.api.authentication.pojo.User;
import com.tencent.supersonic.headless.api.pojo.request.TagReq;
import com.tencent.supersonic.headless.api.pojo.response.TagResp;
import com.tencent.supersonic.headless.server.pojo.TagFilter;
import java.util.List;

public interface TagService {

    TagResp create(TagReq tagReq, User user) throws Exception;

    TagResp update(TagReq tagReq, User user) throws Exception;

    void delete(Long id, User user) throws Exception;

    TagResp getMetric(Long id);

    List<TagResp> query(TagFilter tagFilter);
}