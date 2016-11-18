/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package jbatch.jsf;


import jbatch.model.Person;
import jbatch.service.PersonService;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Properties;


@RequestScoped
@Named(value = "batchBean")
public class BatchBean {

    @Inject
    private PersonService personService;

    public String runBatch() {
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        jobOperator.start("bigbangjob", new Properties());
        System.out.println("CLICK EN BoTON");
        return"success";
    }

    public List<Person> getPersonList(){
        return personService.getPersonList();
    }
}