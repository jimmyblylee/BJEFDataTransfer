/* ***************************************************************************
 * EZ.JWAF/EZ.JCWAP: Easy series Production.
 * Including JWAF(Java-based Web Application Framework)
 * and JCWAP(Java-based Customized Web Application Platform).
 * Copyright (C) 2016-2017 the original author or authors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of MIT License as published by
 * the Free Software Foundation;
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the MIT License for more details.
 *
 * You should have received a copy of the MIT License along
 * with this library; if not, write to the Free Software Foundation.
 * ***************************************************************************/

package com.founder.bj.ef.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: 主程序.<br>
 * Created by Jimmybly Lee on 2017/9/21.
 *
 * @author Jimmybly Lee
 */
public final class Main {
    /** Logger. */
    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 主构造器.
     */
    private Main() {
    }

    /**
     * Do some log.
     */
    private void doLog() {
        log.info("hello");
    }

    /**
     * 程序入口.
     * @param args foo
     */
    public static void main(String[] args) {
        new Main().doLog();

    }
}
