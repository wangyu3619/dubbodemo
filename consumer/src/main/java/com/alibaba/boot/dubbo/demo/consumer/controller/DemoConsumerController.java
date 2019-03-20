/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.boot.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.hello.service.ProductService;
import com.deepexi.util.constant.ContentType;
import org.springframework.stereotype.Service;
import com.deepexi.util.config.Payload;

import javax.ws.rs.*;

/**
 * @author wangyu
 */
@Service
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Path("/consumer")
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    private ProductService productService;

    @GET
    @Path(("/getById"))
    public Payload test(@QueryParam("id") String id){
        return new Payload(productService.getProductById(id));
    }
}
