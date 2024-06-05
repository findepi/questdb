/*******************************************************************************
 *     ___                  _   ____  ____
 *    / _ \ _   _  ___  ___| |_|  _ \| __ )
 *   | | | | | | |/ _ \/ __| __| | | |  _ \
 *   | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *    \__\_\\__,_|\___||___/\__|____/|____/
 *
 *  Copyright (c) 2014-2019 Appsicle
 *  Copyright (c) 2019-2024 QuestDB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/

package io.questdb.std.filewatch;

public class LinuxAccessorFacadeImpl implements LinuxAccessorFacade {
    public static final LinuxAccessorFacadeImpl INSTANCE = new LinuxAccessorFacadeImpl();

    @Override
    public int inotifyAddWatch(int fd, long pathPtr, int flags) {
        return LinuxAccessor.inotifyAddWatch(fd, pathPtr, flags);
    }

    @Override
    public int inotifyInit() {
        return LinuxAccessor.inotifyInit();
    }

    @Override
    public short inotifyRmWatch(int fd, int wd) {
        return LinuxAccessor.inotifyRmWatch(fd, wd);
    }

    @Override
    public long pipe() {
        return LinuxAccessor.pipe();
    }

    @Override
    public int readEvent(int fd, long buf, int bufSize) {
        return LinuxAccessor.readEvent(fd, buf, bufSize);
    }

    @Override
    public int readPipe(int fd) {
        return LinuxAccessor.readPipe(fd);
    }

    @Override
    public int writePipe(int fd) {
        return LinuxAccessor.writePipe(fd);
    }
}
