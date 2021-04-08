/*
 * Copyright (C) 2021 Wigo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moara.docker.file.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author macle
 */
public class ContainerRun {


    private static final Logger logger = LoggerFactory.getLogger(ContainerRun.class);

    public void run(String code, int webPort, int restPort){
        //network 생성
        List<String> commandList =  new ArrayList<>();






        //wigo data 생성

        //wigo engine 생성

        //wigo console 생성

        //코드와 접속정보 기록
    }


    void command(List<String> list){
        List<String> commandList =  new ArrayList<>();
        commandList.add("sudo");
        commandList.add("docker");
        commandList.addAll(list);

    }

    
}
