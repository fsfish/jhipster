/*
 * Copyright 2016-2020 the original author or authors from the JHipster project.
 *
 * This file is part of the JHipster project, see https://www.jhipster.tech/
 * for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jhipster.service.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LocalDateFilterTest {

    private LocalDateFilter filter;

    private LocalDate value = LocalDate.now();

    @BeforeEach
    public void setup() {
        filter = new LocalDateFilter();
    }

    @Test
    public void testConstructor() {
        assertThat(filter.getEquals()).isNull();
        assertThat(filter.getGreaterThan()).isNull();
        assertThat(filter.getGreaterThanOrEqual()).isNull();
        assertThat(filter.getLessThan()).isNull();
        assertThat(filter.getLessThanOrEqual()).isNull();
        assertThat(filter.getSpecified()).isNull();
        assertThat(filter.getIn()).isNull();
        assertThat(filter.toString()).isEqualTo("LocalDateFilter []");
    }

    @Test
    public void testSetEquals() {
        Filter<LocalDate> chain = filter.setEquals(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getEquals()).isEqualTo(value);
    }

    @Test
    public void testSetLessThan() {
        Filter<LocalDate> chain = filter.setLessThan(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getLessThan()).isEqualTo(value);
    }

    @Test
    public void testSetLessThanOrEqual() {
        Filter<LocalDate> chain = filter.setLessThanOrEqual(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getLessThanOrEqual()).isEqualTo(value);
    }

    @Test
    public void testSetGreaterThan() {
        Filter<LocalDate> chain = filter.setGreaterThan(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getGreaterThan()).isEqualTo(value);
    }

    @Test
    public void testSetGreaterThanOrEqual() {
        Filter<LocalDate> chain = filter.setGreaterThanOrEqual(value);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getGreaterThanOrEqual()).isEqualTo(value);
    }

    @Test
    public void testSetSpecified() {
        Filter<LocalDate> chain = filter.setSpecified(true);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getSpecified()).isEqualTo(true);
    }

    @Test
    public void testSetIn() {
        List<LocalDate> list = new LinkedList<>();
        Filter<LocalDate> chain = filter.setIn(list);
        assertThat(chain).isEqualTo(filter);
        assertThat(filter.getIn()).isEqualTo(list);
    }

    @Test
    public void testToString() {
        filter.setEquals(value);
        filter.setLessThan(value);
        filter.setLessThanOrEqual(value);
        filter.setGreaterThan(value);
        filter.setGreaterThanOrEqual(value);
        filter.setSpecified(true);
        filter.setIn(new LinkedList<>());
        String str = value.toString();
        assertThat(filter.toString()).isEqualTo("LocalDateFilter "
            + "[greaterThan=" + str + ", greaterThanOrEqual=" + str + ", lessThan=" + str + ", "
            + "lessThanOrEqual=" + str + ", equals=" + str + ", specified=true, in=[]]");
    }
}
